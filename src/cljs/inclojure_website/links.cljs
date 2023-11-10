(ns inclojure-website.links
  (:require [inclojure-website.data :as data]))

(defonce email (str "mailto:" data/email))
(defonce sponsorship-deck "pdf/inclojure-2020-sponsorship-deck.pdf")
(defonce youtube-png "/images/youtube.png")