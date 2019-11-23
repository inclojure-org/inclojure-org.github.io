(ns inclojure-website.core
    (:require [accountant.core :as accountant]
              [inclojure-website.morellet :as morellet]
              [inclojure-website.page :as page]
              [inclojure-website.talks :as talks]
              [reagent.core :as reagent :refer [atom]]
              [secretary.core :as secretary :include-macros true]))

;; -------------------------
;; Views

(defn page []
  [page/contents])

;; -------------------------
;; Routes

(defonce current-page (atom #'page))

(secretary/defroute #"/" []
  (reset! current-page #'page))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render-component @current-page (.getElementById js/document "app")))

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
