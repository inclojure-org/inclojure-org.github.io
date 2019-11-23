(ns inclojure-website.core
    (:require [reagent.core :as reagent :refer [atom]]
              [secretary.core :as secretary :include-macros true]
              [accountant.core :as accountant]
              [inclojure-website.home :as home]
              [inclojure-website.morellet :as morellet]
              [inclojure-website.talks :as talks]))

;; -------------------------
;; Views

(defn home-page []
  [home/page])

(defn side-bar []
  [home/feature])

;; -------------------------
;; Routes

(defonce page (atom #'home-page))
(defonce feature (atom #'side-bar))

(defn current-page []
  [:div
   [:div [@feature]]
   [:div [@page]]])

(secretary/defroute #"/" []
  (reset! page #'home-page)
  (reset! feature #'side-bar))

(secretary/defroute #"/talks.*" []
  (reset! page #'talks/page))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (accountant/configure-navigation!
    {:nav-handler
     (fn [path]
       (secretary/dispatch! path))
     :path-exists?
     (fn [path]
       (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))

(init!)
