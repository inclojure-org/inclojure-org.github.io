(ns inclojure-website.core
    (:require [accountant.core :as accountant]
              [goog.events :as events]
              [goog.history.EventType :as HistoryEventType]
              [inclojure-website.morellet :as morellet]
              [inclojure-website.page :as page :refer [home layout sub-page]]
              [inclojure-website.talks :as talks]
              [reagent.core :as reagent :refer [atom]]
              [secretary.core :as secretary :include-macros true])
    (:import goog.History))

;; -------------------------
;; Routes

(secretary/defroute "/" []
  (reset! sub-page (home)))

;; -------------------------
;; history
;;
;; Must be called after routes have been defined

(defn hook-browser-navigation! []
  (doto (History.)
        (events/listen
         HistoryEventType/NAVIGATE
         (fn [event]
           (secretary/dispatch! (.-token event))))
        (.setEnabled true)))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reset! sub-page (home))
  (reagent/render-component [layout] (.getElementById js/document "app")))

(defn init! []
  (accountant/configure-navigation!
   {:nav-handler  (fn [path] (secretary/dispatch! path))
    :path-exists? (fn [path] (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))

(init!)
