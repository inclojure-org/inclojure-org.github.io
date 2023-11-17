(ns inclojure-website.page
  (:require [inclojure-website.data :as data]
            [inclojure-website.links :as links]
            [inclojure-website.morellet :as morellet]
            [inclojure-website.sundry :as sundry]
            [reagent.core :as reagent :refer [atom create-class]]))

(declare home)
(declare workshops)
(defonce sub-page (atom nil))

;;
;; ----------------
;;
;; SIDE-BAR ARTWORK
;;
;; ----------------
;;

(defn artwork []
  (let [dom-node (atom nil)]
    (create-class
     {:component-did-update
      #(morellet/render (.-firstChild @dom-node))

      :component-did-mount
      (fn [this]
        (reset! dom-node (reagent/dom-node this))
        (morellet/render (.-firstChild @dom-node)))

      :reagent-render
      (fn []
        [:div
         [:canvas.feature]
         [:div.feature-overlay]])})))

;;
;; ----------
;;
;; NAVIGATION
;;
;; ----------
;;

(def nav-links {
                "Venue" "venue"
                "Sponsors" "sponsorship"
                "Call For Papers" "talks"}
  #_{"Tickets" "tickets"
                "Talks" "talks"
                "Workshops" "workshops"
                "Sponsors" "sponsorship"
                "Venue" "venue"})

(defn nav []
  [:nav
   [:h1 [:a {:href "/"}]]
   [:div.nav-links
    [:a.link {:href "#" :on-click #(reset! sub-page (home))} "Home"]
    (for [nav-link nav-links]
      ^{:key (str (random-uuid))}
      [:a.link {:href "#" :on-click #(sundry/goto-link (second nav-link))}
       (first nav-link)])]])

;;
;; --------------
;;
;; WORKSHOPS PAGE
;;
;; --------------
;;

(defn workshops []
 [:div
  [:p.intro "Coming Soon!"]]
  #_[:section {:id "workshop-details"}
   [:div
    [:p.intro data/conf-with-year " will have two full-day workshops."]
    [:p "An introductory Clojure workshop and an intermediate Clojure
    workshop. The lessons apply to ClojureScript as well. Note that
    both the workshops will be conducted simultaneously on the same day."]
    [:h3 {:id "introduction"}
     "Introduction to Clojure"]
    [:h4 "Audience"]
    [:p "Practising programmers and/or CS undergrads/grads who are new to Clojure, LISPs or functional programming but not absolute beginners
         at programming. We recommend that attendees be familiar with at least one programming language."]
    [:h4 "Session outline"]
    [:div
     [:p "This will be a day-long hands-on workshop. We will progressively work through a series of exercises by building concept upon concept."]
     [:p "We will try to achieve this with:"]
     [:ul
      [:li "A small set of core ideas,"]
      [:li "a handful of Clojure primitives,"]
      [:li "a few API design techniques, and"]
      [:li "an interactive (REPL-driven) programming workflow."]]
     [:p "We will do the following:"]
     [:ul
      [:li "Model things with pure data,"]
      [:li "design clean functional APIs,"]
      [:li "compose purely functional logic, and"]
      [:li "use the REPL to interactively grow, inspect and debug code."]]
     [:p "By the end of the workshop, attendees should have an understanding of what Clojure has to offer, as well as a basic understanding of
            how to solve problems in Clojure. The workshop should serve as a springboard from which attendees can launch their own exploration
            of the language and its ecosystem. Fully documented workshop material will be available for use at home."]]

    [:h3
     {:id "intermediate"}
     "Intermediate Clojure"]
    [:h4 "Audience"]
    [:p "This workshop is aimed at practising programmers who have some exposure to Clojure, but are looking to accomplish non trivial tasks using Clojure."]
    [:h4 "Session outline"]
    [:p "This will be a day-long hands-on workshop."]
    [:p "The aim of this workshop is to help the attendee work in Clojure more effectively. We will learn about:"]
    [:ul
     [:li "Repl driven development"]
     [:li "Clojure's approach to state and identity"]
     [:li "Laziness & Vars (Benefits & pitfalls)"]
     [:li "Java interop"]
     [:li "Testing"]
     [:li "Debugging Effectively"]
     [:li "Clojure ecosystem"]]
    [:p "To help us illustrate and understand the application of these concepts, we will build a simple web app that will tie all these concepts together."]
    [:p "We will not be covering macros or advanced clojure concurrency primitives in this workshop."]]])

;;
;; ------------------
;;
;; HOME PAGE SECTIONS
;;
;; ------------------
;;

(defn intro []
  [:section {:id "intro"}
   [:p.intro data/conf " is India's annual Clojure and ClojureScript
    conference, and Asia's first."]
   [:p "Our focus: the free exchange of ideas between new and
   experienced Clojure programmers alike. We are volunteer-run, and
    not-for-profit."]])

(defn venue []
  [:section {:id "venue"}
   [:h2 "Venue"]
   [:p "The 5th edition is back in Bengaluru after 5 years!"]
   [:img
    {:style {:width "100%" :border-radius "2%"}
     :alt "Bengaluru",
     :src "images/bg-bangalore.jpg"}]
   [:h3 "The Conference"]
   [:p "Keep an eye out for this space as we finalise the venue and logistics!"]
   [:h3 "The Workshops"]
   [:p "More to come here soon."]])

(defn sponsorship []
  [:section {:id "sponsorship"}
   [:h2 "Sponsorship"]
   [:p]
   [:p "Help foster the growing Clojure community in India/Asia."]
   [:p "Over the years, " data/conf " has helped kick-start a series of
   Clojure workshops and meet-ups across the country. It has helped
   organizations hiring Clojurists to reach out to a wonderful
   community. And has helped attendees make a strong case for
   Clojure/Clojurescript adoption in their companies."]
   [:p "With your help, we hope to make " data/conf-with-year " bigger than
   before and continue our efforts to help foster the growing
   Clojure community in India/Asia."]
   [:p "To sponsor " data/conf-with-year ", review sponsorship details in the"
    [:a {:href links/sponsorship-deck} " prospectus "]
    "and contact us at our mailing list"
    [:a {:href links/email} " " data/email]]

   #_[:div.benefactor-slab.platinum
    [:h3 "Platinum"]

    [:a {:href "https://nilenso.com"}
     [:img {:alt "nilenso", :src "images/sponsors/nilenso.png"}]]]

   #_[:div.benefactor-slab.gold
    [:h3 "Gold"]]

   #_[:div.benefactor-slab.bronze
    [:h3 "Bronze"]]


   #_[:div.benefactor-slab.community
    [:h3 "Community"]]])

(defn coc []
  [:section {:id "coc"}
   [:h2 "Code of Conduct"]
   [:p "We do not tolerate harassment of conference participants in any form."]
   [:p "We are dedicated to providing a harassment-free experience
   for everyone. This is true regardless of gender, gender
   identity and expression, age, sexual orientation, disability,
   physical appearance, race, ethnicity, religion (or
   lack thereof), or technology choices."]
   [:p "Sexual language and imagery is not appropriate for any
   conference venue, including talks, workshops, parties, Twitter
   and other online media."]
   [:p "Participants violating these rules may be
   sanctioned or expelled from the conference without a refund at
   the discretion of the organisers."]])


(defn team-member [name github twitter avatar]
  [:li
   [:a
    {:href twitter}
    name
    [:img {:alt name, :src (str avatar)}]]
   [:div.small.article-fine-print.no-mobile
     [:a
      {:href github}
      [:img {:alt "Github", :src "images/github.png"}]]]])

(defn team []
  [:section {:id "team"}
   [:h2 "Team"]
   [:ul.people
    (for [{:keys [name github twitter avatar]} data/team-list]
      ^{:key (str (random-uuid))}
      [team-member name github twitter avatar])]])

(defn talk-selectors []
  #_[:section {:id "talk-selection"}
   [:h2 "Reviewers"]
   [:ol.article-list
    (for [{:keys [name alt github twitter www avatar bio]} data/talk-selectors]
      ^{:key (str (random-uuid))}
      [:li
       [:a
        {:href "#"}
        [:img.reviewers.article-image.location
         {:alt alt
          :src avatar}]]
       [:h4
        [:a {:href www} name]]
       [:p.article-subtitle bio]
       [:div.article-fine-print.no-mobile
        [:a
         {:href twitter}
         [:img {:alt "Twitter", :src "images/twitter.png"}]]
        [:a
         {:href github}
         [:img {:alt "Github", :src "images/github.png"}]]]])]])

(defn keynote []
  [:section {:id "keynote"}
   [:h2 "Keynote"]
   [:ol.article-list
    [:li
     [:a
      {:href "#"}
      [:img.article-image.keynote
       {:alt "bbatsov",
        :src "images/speakers/bozhidar-batsov.jpg"}]]
     [:h4
      [:a {:href "https://metaredux.com"} "Bozhidar Batsov"]]
     [:p.article-subtitle "Bozhidar is the maintainer of CIDER, nREPL,
     a dozen related projects, and the editor of the community
     Clojure style guide. Most people would probably describe him as
     an Emacs zealot (and they would be right). He's also quite fond
     of the Lisp family of languages, functional programming in
     general and Clojure in particular."]
     [:div.article-fine-print.no-mobile
      [:a
       {:href "https://twitter.com/bbatsov"}
       [:img {:alt "Twitter", :src "images/twitter.png"}]]
      [:a
       {:href "https://github.com/bbatsov"}
       [:img {:alt "Github", :src "images/github.png"}]]]]]])

(defn tickets []
  #_[:section {:id  "tickets"}
   [:h2  "Tickets"]])

(defn action-shots []
  [:section {:id "action-shots"}
   [:h2 "Previous editions"]
   [:div {:style {:overflow "hidden"}}
    [:div.slideshow-container.slide.no-mobile
     [:img {:src "images/previously/action1.jpg"}]
     [:img {:src "images/previously/action4.jpg"}]
     [:img {:src "images/previously/action2.jpg"}]
     [:img {:src "images/previously/action3.jpg"}]]]

   [:ol.article-list
    [:li
     [:img.previously.article-image.location
      {:alt "bangalore"
       :src "images/bangalore-map-caption.jpg"}]

     [:div.previously
      [:strong "2019"]
      [:p.article-subtitle
       [:a.button.city
        {:href "https://www.youtube.com/playlist?list=PLlAML-kjpXY6XllFUezz6RYow6hF4zlFV"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle" :margin-right "10px"}
          :alt ""
          :src links/youtube-png}]
        "Talks"]
       [:a.button.city
        {:href "https://inclojure.org/archive/2019/#schedule"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle" :margin-right "10px"}
          :alt "",
          :src "images/calendar.svg"}]
        "Schedule"]]]

     [:div.previously
      [:strong "2018"]
      [:p.article-subtitle
       [:a.button.city
        {:href "https://www.youtube.com/playlist?list=PLlAML-kjpXY4rljddpJ5qMUp-t1Qa-Vfy"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle", :margin-right "10px"}
          :alt "",
          :src links/youtube-png}]
        "Talks"]
       [:a.button.city
        {:href "https://inclojure.org/archive/2018/#schedule"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle", :margin-right "10px"}
          :alt "",
          :src "images/calendar.svg"}]
        "Schedule"]]]]

    [:li
     [:img.previously.article-image.location
     {:alt "pune",
      :src "images/pune-map-caption.jpg"}]

     [:div.previously
      [:strong "2020"]
      [:p.article-subtitle
       [:a.button.city
        {:href "https://www.youtube.com/watch?v=dZ4xczP5zDI&list=PLlAML-kjpXY7ZGj6anXfKSqN1XGTCEmmw"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle" :margin-right "10px"}
          :alt "",
          :src links/youtube-png}]
        "Talks"]
       [:a.button.city
        {:href "https://inclojure.org/archive/2020/#schedule"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle", :margin-right "10px"}
          :alt "",
          :src "images/calendar.svg"}]
        "Schedule"]]]
     
     [:div.previously
      [:strong "2016"]
      [:p.article-subtitle
       [:a.button.city
        {:href "https://www.youtube.com/playlist?list=PLlAML-kjpXY7kzJp0p1EPJ9eb8B15CCBU"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle" :margin-right "10px"}
          :alt "",
          :src links/youtube-png}]
        "Talks"]
       [:a.button.city
        {:href "https://inclojure.org/archive/2016/#schedule"}
        [:img
         {:style {:height "25px" :width "25px" :vertical-align "middle", :margin-right "10px"}
          :alt "",
          :src "images/calendar.svg"}]
        "Schedule"]]]]]])

(defn workshop-table []
  #_[:table.u-full-width.talk-table
   [:thead
    [:tr [:th "Time"] [:th "Event"]]]
   [:tbody
    [:tr.selected
     [:td "9:30 am"]
     [:td "Registrations"]]

    [:tr
     [:td "10:00 am – 6 pm"]
     [:td "Introductory workshop"]]

    [:tr
     [:td "10:00 am – 6 pm"]
     [:td "Intermediate workshop"]]

    [:tr
     [:td "7 pm onwards"]
     [:td "Pre-conference party"]]]])

(defn talks-table []
  [:p "TBD"])

(defn talks []
  [:section {:id "talks"}
   [:h2 "Talks"]
   [:p "We'll be opening up a call for proposals shortly."]])


(defn schedule []
  [:section {:id "schedule"}
   [:h2 "Schedule"]
   [:p "IN/Clojure 2024 is expected to happen over two days in March 2024."]

   #_[:h6 {:style {:border-bottom "1px dotted"}} [:strong "Day 1"] " | " [:strong "Workshops"]]
   #_(workshop-table)
   #_[:h6 {:style {:border-bottom "1px dotted"}} [:strong "Day 2"] " | " [:strong "Talks"]]
   #_(talks-table)])

(defn ending-ornament []
  [:section {:id "ornament"}
   [:img {:alt "", :src "images/footer-ornament.svg"}]])

(defn footnote []
  [:section {:id "end"}
   [:ul
    [:li "the sidebar artwork is procedurally generated and inspired by"
     [:a {:href
     "https://gitlab.com/inclojure/inclojure.gitlab.io/blob/redesign/src/cljs/inclojure_website/morellet.cljs"}
     " François Morellet."]]

    [:li "source code to this website and other conference
    organizational material is available"
     [:a {:href
          "https://github.com/inclojure-org"} " here."]]

    [:li "the Clojure programming language & the Clojure logo are copyright"
     [:a {:href "https://commons.wikimedia.org/wiki/File:Clojure_logo.svg"} " Rich Hickey."]]]])

(defn footer []
  [:footer
   [:a {:href links/email}
    [:img {:alt "Flickr", :src "images/mailbox.svg"}]]
   [:a
    {:href "https://twitter.com/in_clojure"}
    [:img {:alt "Twitter", :src "images/twitter.png"}]]
   [:a
    {:href "https://www.flickr.com/photos/inclojure/albums/72157711988093001"}
    [:img {:alt "Flickr", :src "images/flickr.png"}]]])

(defn workshops-section []
  [:section {:id "workshops"}
   [:h2 "Workshops"]
   [:div
    [:p data/conf-with-year " will have two full-day workshops."]
    [:p "An introductory Clojure workshop and an intermediate Clojure
    workshop. The lessons apply to ClojureScript as well. Note that
    both the workshops will be conducted simultaneously on the same day."]

    [:ol.article-list
    [:li
     [:img.article-image
      {:alt "introductory"
       :src "images/workshops/introductory.png"}]

     [:h4 {:id "introductory-workshop"}
      [:a {:href "#workshop-details"}
       "Introduction to Clojure"]]

     [:p.article-subtitle "Practising programmers and/or CS
     undergrads/grads who are new to Clojure, LISPs or functional
     programming but not absolute beginners at programming. We
     recommend that attendees be familiar with at least one
     programming language."]

     [:div.article-fine-print.no-mobile
      [:a
       {:href "https://github.com/inclojure-org/clojure-by-example"}
       [:img {:alt "Github", :src "images/github.png"}]]]]

    [:li
     [:img.article-image
      {:alt "intermediate",
       :src "images/workshops/intermediate.png"}]

     [:h4 {:id "intermediate-workshop"}
      [:a  {:href "#"
            :on-click (fn []
                        (reset! sub-page (workshops)))} "Intermediate Clojure"]]

     [:p.article-subtitle "This workshop is aimed at practising
     programmers who have some exposure to Clojure, but are looking to
     accomplish non trivial tasks using Clojure."]

     [:div.article-fine-print.no-mobile
      [:a
       {:href "https://github.com/inclojure-org/intermediate-clojure-workshop"}
       [:img {:alt "Github", :src "images/github.png"}]]]]]]])

;;
;; ---------
;;
;; HOME PAGE
;;
;; ---------
;;

(defn home []
  [:div
   [intro]
   [venue]
   [talks]
   [schedule]
   [talk-selectors]
   [sponsorship]
   #_[workshops-section]
   [tickets]
   [action-shots]
   [coc]
   [team]])

;;
;; -----------
;;
;; PAGE LAYOUT
;;
;; -----------
;;

(defn layout []
  [:div
   [artwork]
   [:div.half
    [:div.contents.en
     [nav]

     [:div @sub-page]

     [ending-ornament]
     [footnote]
     [footer]]]])
