(ns inclojure-website.home
  (:require [inclojure-website.layout :as layout]
            [reagent.core :as reagent :refer [atom]]
            [clojure.string :as string]
            [inclojure-website.talks :as talks]
            [inclojure-website.morellet :as morellet]))

(defn feature []
  (let [dom-node (reagent/atom nil)]
    (reagent/create-class
     {:component-did-update
      (fn [this]
        (morellet/render (.-firstChild @dom-node)))

      :component-did-mount
      (fn [this]
        (reset! dom-node (reagent/dom-node this)))

      :reagent-render
      (fn []
        [:div
         [:canvas.feature]
         [:div.feature-overlay]])})))

(defn page []
  [:div.half
   [:div.contents.en
    [:nav
     [:h1 [:a {:href "/"}]]
     [:span.nav-links
      [:a.link {:href "https://medium.com/simple-dot-org"} "Team"]
      [:a.link {:href "https://docs.simple.org"} "Code of Conduct"]]]
    [:p.intro
     "\n                IN/Clojure is India's annual Clojure and ClojureScript conference, and Asia's first.\n                "]
    [:p
     "Our focus is the free exchange of ideas between new and experienced Clojure programmers alike. We\n                    are volunteer-run, and not-for-profit."]
    [:h2 "Keynote"]
    [:ol.article-list
     [:li
      [:a
       {:href "#"}
       [:img.article-image
        {:alt "bbatsov", :src "images/speakers/bozhidar-batsov.jpg"}]]
      [:h4
       [:a {:href "/2019/02/22/sarahjones.html"} "Bozhidar Batsov"]]
      [:p.article-subtitle
       "Bozhidar is the maintainer of CIDER, nREPL, a dozen related\n                        projects, and the editor of the community Clojure style guide. Most people would probably\n                        describe him as an Emacs zealot (and they would be right). He's also quite fond of the Lisp\n                        family of languages, functional programming in general and Clojure in particular. Believe\n                        it or not, Bozhidar has hobbies and interests outside the realm of computers, but we won't\n                        bore you with those here."]
      [:div.article-date "https://github.com/bbatsov"]]]
    [:h2 "Call For Proposals"]
    [:p
     "\n                We welcome talk submissions for the 4th edition of IN/Clojure 2020. This year, selected speakers\n                will enjoy sharing the stage with the perennially effervescent Bozhidar Batsov, and other speakers\n                from across the globe.\n            "]
    [:h2 "Sponsorship"]
    [:p]
    [:p "Help foster the growing Clojure community in Asia/India"]
    [:p
     "IN/Clojure is run by volunteers and is a not-for-profit conference."]
    [:p
     "Over the years, IN/Clojure has helped kick-start a series of Clojure workshops and meet-ups\n                    across the country. It has helped organizations hiring Clojurists reach out to a wonderful\n                    community. And it has helped attendees make a strong case for Clojure/Clojurescript adoption in\n                    their companies."]
    [:p
     "With your help, we hope to make IN/Clojure 2020 bigger than before and continue our efforts to\n                    help foster the growing Clojure community in Asia/India."]
    [:p
     "To sponsor IN/Clojure 2020, review sponsorship details in the prospectus here (PDF) and contact\n                    us at 2020@inclojure.org."]
    [:h2 "Venue"]
    [:img
     {:style {:width "100%" :margin "1.5em 0 1.5em 0" :border-radius "2%"}
      :alt "",
      :src "images/bg-pune.jpg"}]
    [:p
     "We will announce the venue in Pune soon. Follow @in_clojure to stay up-to-date."]
    [:h2 "Schedule"]
    [:p
     "IN/Clojure 2020 will happen over two days - 14th and 15th of February, 2020."]
    [:table.u-full-width
     [:tbody
      [:tr
       [:td "Workshop #1"]
       [:td "Fri, 14th Feb 2020"]
       [:td "Introductory Clojure"]]
      [:tr
       [:td "Workshop #2"]
       [:td "Fri, 14th Feb 2020"]
       [:td "Intermediate Clojure"]]
      [:tr
       [:td "Single-track day of talks"]
       [:td "Sat, 15th Feb 2020"]
       [:td "CFP is open! Submit here"]]]]
    [:h2 "Code of Conduct"]
    [:p
     "Our conference is dedicated to providing a harassment-free conference experience for everyone,\n                regardless of gender, gender identity and expression, age, sexual orientation, disability, physical\n                appearance, body size, race, ethnicity, religion (or lack thereof), or technology choices."]
    [:p
     "We do not tolerate harassment of conference participants in any form."]
    [:p
     "Sexual language and imagery is not appropriate for any conference venue, including talks, workshops,\n                parties, Twitter and other online media."]
    [:p
     "Conference participants violating these rules may be sanctioned or expelled from the conference\n                without a refund at the discretion of the conference organisers."]
    [:h2 "Team"]
    [:ul.people
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Aditya Aathalye\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Freelancer"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Akshay Gupta\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Nilenso"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Harsh Gupta\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Helpshit"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Kapil Reddy\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Helpshift"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Nivedita Priyadarshini\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Nilenso"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Prabhanshu Gupta\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Nilenso"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Ravindra Jaju\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Freelancer"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Rubbal Jabbal\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Helpshift"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Sandilya Jandhyala\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Nilenso"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Srihari Sriraman\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Nilenso"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Venkatesh Halli\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Helpshift"]]
     [:li
      [:a
       {:href "https://new.uncommon.is/about/"}
       "\n                        Vikram Chintalapati\n                        "
       [:img
        {:alt "Sanchita Agarwal", :src "images/akshaygupta.jpg"}]]
      [:div.small "Nilenso"]]]
    [:div.clear]
    [:footer
     [:a
      {:href "_"}
      [:img {:alt "Twitter", :src "images/twitter.png"}]]
     [:a
      {:href "_"}
      [:img {:alt "Flickr", :src "images/flickr.png"}]]]]])
