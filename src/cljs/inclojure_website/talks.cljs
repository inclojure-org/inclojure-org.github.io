(ns inclojure-website.talks
  (:require [clojure.string :as string]
            [inclojure-website.data :as data]))

(defn talk-id [talk]
  (string/replace (string/lower-case (:name (first (:speakers talk)))) #" " "-"))

(defn speaker-talk [{:keys [speakers title abstract bio] :as talk}]
  [:div.talk
   [:div.speakers
    (for [{:keys [name link picture]} speakers]
      [:div.speaker
       [:img.speaker-img
        {:src picture}]
       [:a.speaker-name {:href link :target "_blank"} name]])]
   [:div.talk-details
    [:a.talk-title
       {:href "#"
        :on-click "_"}
       (:title talk)]
    [:p abstract]
    (for [speaker speakers]
      [:p (:bio speaker)])]])

(defn page []
  [:div
   (for [talk (filter :selected-talk? data/selected-talks)]
     [:div (talk-id talk) (:title talk)
      [speaker-talk talk]])])
