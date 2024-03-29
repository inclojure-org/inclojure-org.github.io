(ns inclojure-website.page
  (:require [clojure.string :as string]
            [inclojure-website.data :as data]
            [inclojure-website.links :as links]
            [inclojure-website.morellet :as morellet]
            [inclojure-website.sundry :as sundry]
            [reagent.core :as reagent :refer [atom create-class]]))

(declare home)
(declare workshops)
(declare workshop-table)
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

(def nav-links {"Tickets" "tickets"
                "Venue" "venue"
                "Schedule" "schedule"
                "Talks" "speaker-list"
                "Workshop" "workshops"
                "Sponsors" "sponsorship"})

(def talk-links ["keynote" "amogh" "vedang" "aldo" "akshat" "anuj" "abhinav" "dheeraj" "prabhanshu"])

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
  [:section {:id "workshop-details"}
   [:div
    [:p.intro data/conf-with-year " is co-hosting a free, beginner friendly workshop with ClojureBridge on 22nd March.
              There will be a virtual setup session for this workshop on 21st March."]
    [:p "ClojureBridge is a free, beginner-friendly Clojure programming workshop that aims
         to increase diversity within the Clojure community."]
    [:p "You will learn fundamental programming concepts in Clojure through practical examples
         and exercises. Teachers and assistants will be there to guide you."]
    [:h3 {:id "introduction"}
     "ClojureBridge: Introduction to Clojure"]
    [:h4 "Who can apply?"]
    [:ul [:li "This workshop will be for women and non-binary attendees."]
     [:li "Male attendees may attend as guests of women or non-binary attendees."]]
    [:p "The workshop is open to people who are completely new to programming, as well as existing developers
         new to Clojure."]
    [:h4 "Schedule"]
    (workshop-table)
    [:h4 "What do I need to bring to the workshop?"]
    [:p "Please bring " [:strong "your own laptop"] " for the workshop. Everything else, including WiFi, drinking water,
         lunch and tea will be provided at the venue."]
    [:h4 "Session outline"]
    [:p "The session itself will take place on 22nd March from 10am to 6pm and will be divided into two parts—" [:strong "Learning"] " and " [:strong "Doing"] "."]
    [:div
     [:p "Learning:"]
     [:ul
      [:li "What is programming?"]
      [:li "What is Clojure? Why choose Clojure?"]
      [:li "Understanding the REPL"]
      [:li "Clojure Syntax—the anatomy of an S-expression"]
      [:li "Data types, functions, and sequences"]
      [:li "Context and lexical bindings"]
      [:li "Control flow and logic"]
      [:li "Functional composition"]]
     [:p "Doing (in smaller groups, with assigned guides):"]
     [:ul
      [:li "Land of Wizards"]]
     [:h4 "Register here!"]
     [:p "To register for this workshop, select the ClojureBridge Pass and click proceed."]
     [:div#ticket-widget
      [:iframe {:id "ts-iframe", :src "https://www.townscript.com/v2/widget/inclojure-2024/booking", :frameborder "0", :height "600", :width "100%"}]
      [:link {:rel "stylesheet", :href "https://www.townscript.com/static/Bookingflow/css/ts-iframe.style.css"}]]]]])

;;
;; ------------------
;;
;; HOME PAGE SECTIONS
;;
;; ------------------
;;

(defn intro []
  [:section {:id "intro"}
   [:p.intro data/conf " is India's annual Clojure conference."]
   [:p "Our focus: the free exchange of ideas between new and
   experienced Clojure programmers alike. We are volunteer-run, and
    not-for-profit."]
   [:p "When: 22nd and 23rd March."]])

(defn venue []
  [:section {:id "venue"}
   [:h2 "Venue"]
   [:p "We are back in Namma Bengaluru!"]
   [:img
    {:style {:width "100%" :border-radius "2%"}
     :alt "Bengaluru",
     :src "images/bg-bangalore.jpg"}]
   [:h3 "The Conference"]
   [:p "The conference will be held near the heart of Bengaluru at Bangalore International Center (BIC)."]
   [:address
    "7, 4th Main Road"
    [:br]
    "Domlur II Stage"
    [:br]
    "Bengaluru 560 071"
    [:br]
    "Karnataka, IN"
    [:br]]
   [:iframe
    {:height "450",
     :width "100%",
     :src "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3888.078985580048!2d77.63307921584516!3d12.966797490859014!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae15c2415198a1%3A0x9367b30a9bcd14fe!2sBangalore+International+Centre+(New+Building)!5e0!3m2!1sen!2sin!4v1550159709143"}]
   [:h4 "Getting there"]
   [:p [:strong "By Air:"]
    " Kempegowda International Airport (KIA) is a 1 hour taxi ride from the venue."]
   [:p [:strong "By Train:"]
    " Bengaluru is well connected by train to all major cities of India.
     KSR Station is about 30 minutes from the venue by car."]
   [:h4 "Getting around"]
   [:p "Uber and Ola Cabs are both active in Bengaluru. You should
        have no trouble using these. Local autorickshaws are also easily available."]
   [:p "The venue is adjacent to Indiranagar, which is a vibrant hub for dining and nightlife—
        you will find everything from street food to high-end international cuisine."]])

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
   Clojure community in India and Asia."]
   [:p "To sponsor " data/conf-with-year ", review sponsorship details in the"
    [:a {:href links/sponsorship-deck} " prospectus "]
    "and contact us at our mailing list"
    [:a {:href links/email} " " data/email] "."]

   [:div.benefactor-slab.platinum
    [:h3 "Platinum"]

    [:a {:href "https://nilenso.com"}
     [:img {:alt "nilenso", :src "images/sponsors/nilenso.png"}]]]

   [:div.benefactor-slab.gold
    [:h3 "Gold"]

    [:a {:href "https://nammayatri.in/"}
     [:img {:alt "Namma Yatri" , :src "images/sponsors/namma-yatri.png"}]]

    [:a {:href "https://www.teamohana.com"}
     [:img {:alt "TeamOhana", :src "images/sponsors/team-ohana.png"}]]]

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
  [:section {:id "talk-selection"}
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
       {:alt "deobald",
        :src "images/speakers/steven.jpg"}]]
     [:h4 "The Grift, the Grind, and the " [:span.devanagari "ग्रंथ"]]
     [:p.article-subtitle
      "By " [:a {:href "https://www.deobald.ca/"} "Steven Deobald"]]
     "Programming used to be fun. What happened?"
     [:p.article-subtitle [:strong "About the speaker"] ": Steven helped start nilenso, India's first software
          cooperative. These days he works on Endatabas, the world's first
          immutable HTAP SQL document database. He likes canoeing, bicycles, and
          walkable cities."]
     [:div.article-fine-print.no-mobile
      [:a
       {:href "https://fantastic.earth/@deobald"}
       [:img {:alt "Twitter", :src "images/mastodon.ico"}]]
      [:a
       {:href "https://github.com/deobald"}
       [:img {:alt "Github", :src "images/github.png"}]]]]]])

(defn tickets []
  [:section {:id "tickets"}
   [:h2 "Tickets"]
   [:div#ticket-widget
    [:iframe {:id "ts-iframe", :src "https://www.townscript.com/v2/widget/inclojure-2024/booking", :frameborder "0", :height "600", :width "100%"}]
    [:link {:rel "stylesheet", :href "https://www.townscript.com/static/Bookingflow/css/ts-iframe.style.css"}]]
   [:p "Issues with booking? Try " [:a {:href "https://www.townscript.com/v2/e/inclojure-2024/booking"} "this page"] "."]])

(defn action-shots []
  [:section {:id "action-shots"}
   [:h2 "Previous editions"]
   [:div {:style {:overflow "hidden"}}
    [:div.slideshow-container.slide.no-mobile
     [:img {:src "images/previously/action5.jpg"}]
     [:img {:src "images/previously/action1.jpg"}]
     [:img {:src "images/previously/action4.jpg"}]
     [:img {:src "images/previously/action2.jpg"}]
     [:img {:src "images/previously/action3.jpg"}]]]

   [:ol.archive-list
    [:li
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
        "Schedule"]]]]

    [:li
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
        "Schedule"]]]]

    [:li
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
  [:table.u-full-width
   {:style {:font-size "90%"}}
   [:thead
    [:tr [:th "Date"] [:th "Time"] [:th "Event"]]]
   [:tbody
    [:tr
     [:td "21-03-2024"]
     [:td "6:00 pm – 7:30 pm"]
     [:td [:strong "Online"] " session for installation and editor setup."]]
    [:tr
     [:td "22-03-2024"]
     [:td "10:00 am – 6:00 pm"]
     [:td [:strong "In-person"] " workshop at Bangalore International Centre."]]]])

(defn talks-table []
  [:table.u-full-width.talk-table
   [:thead
    [:tr [:th "Time"] [:th "Event"] [:th "Speaker"]]]
   [:tbody
    [:tr.selected
     [:td "9:30 am"]
     [:td "Registrations"]
     [:td ""]]
    [:tr.selected
     [:td "9:50 am"]
     [:td "Welcome remarks and introductions"]
     [:td ""]]
    [:tr
     [:td "10:00 am"]
     [:td [:a {:href "#keynote"} "Opening Keynote: The Grift, the Grind, and the ग्रंथ"]]
     [:td "Steven Deobald"]]
    [:tr
     [:td "11:05 am"]
     [:td [:a {:href "#amogh"} "Carbon Dating Polymorphism in Clojure"]]
     [:td "Amogh Talpallikar"]]
    [:tr.selected
     [:td "11:25 am"]
     [:td "Chai-Kaapi Break"]
     [:td ""]]
    [:tr
     [:td "11:45 am"]
     [:td [:a {:href "#vedang"} "Developer Tooling for Speed and Productivity in 2024"]]
     [:td "Vedang Manerikar"]]
    [:tr
     [:td "12:30 pm"]
     [:td [:a {:href "#aldo"} "Personal Identity Information (PII) Detection with Clojure"]]
     [:td "Aldo Sujin"]]
    [:tr
     [:td "1:15 pm"]
     [:td [:a {:href "#akshat"} "Architecture and Design of Goose"]]
     [:td "Akshat Shah"]]
    [:tr.selected
     [:td "1:40 pm"]
     [:td "Lunch & Networking"]
     [:td ""]]
    [:tr
     [:td "2:45 pm"]
     [:td [:a {:href "#anuj"} "Navigating Data Models: A Journey into Unified, Scalable, and Composable Data Architecture"]]
     [:td "Anuj Kumar"]]
    [:tr
     [:td "3:30 pm"]
     [:td [:a {:href "#abhinav"} "Functional Programming Patterns"]]
     [:td "Abhinav Sarkar"]]
    [:tr.selected
     [:td "4:15 pm"]
     [:td "Chai-Kaapi Break"]
     [:td ""]]
    [:tr
     [:td "4:35 pm"]
     [:td [:a {:href "#dheeraj"} "Exploring Electric Clojure"]]
     [:td "Dheeraj Kumar"]]
    [:tr
     [:td "5:20 pm"]
     [:td [:a {:href "#prabhanshu"} "Building a spreadsheet from the ground up"]]
     [:td "Prabhanshu Gupta"]]]])

(defn cfp []
  [:section {:id "cfp"}
   [:h2 "Call For Proposals"]
   [:p "We welcome talk submissions for " data/conf-with-year "."]
   [:p [:strong "CFP closes on 30th Jan 2024."]]
   [:p "Talk proposers each receive a complimentary pass for conference day,
   irrespective of selection status."]
   [:p [:strong [:a {:href "https://forms.gle/1eyanrgJypwksoz27"}
                 "Learn more and propose a talk now!"]]]])

(defn schedule []
  [:section {:id "schedule"}
   [:h2 "Schedule"]
   [:p "IN/Clojure 2024 will happen on 22nd and 23rd March, 2024.
        The first day will have the workshops, and the second day will have the talks."]

   [:h6 {:style {:border-bottom "1px dotted"}} [:strong "ClojureBridge"] " | " [:strong "21st - 22nd March"]]
   (workshop-table)
   [:h6 {:style {:border-bottom "1px dotted"}} [:strong "Talks"] " | " [:strong "23rd March"]]
   (talks-table)])

(defn speaker-list []
  [:section {:id "speaker-list"}
   [:h2 "Talks"]
   [:ol.article-list
    (for [{:keys [name talk-title github masto twitter www avatar bio talk-summary]} data/speakers]
      ^{:key (str (random-uuid))}
      [:li {:id (-> name (string/split " ") first str string/lower-case)}
       [:a
        {:href "#"}
        [:img.speakers.article-image.location
         {:src avatar}]]
       [:h4 talk-title]
       [:p.article-subtitle "By " [:a {:href (or www masto twitter github)} name]]
       [:p.article-subtitle [:strong "About the talk"] ": " talk-summary]
       (when (not-empty bio) [:p.article-subtitle [:strong "About the speaker"] ": " bio])
       [:div.article-fine-print.no-mobile
        (cond
          (not-empty twitter) [:a
                               {:href twitter}
                               [:img {:alt "Twitter", :src "images/twitter.png"}]]
          (not-empty masto) [:a
                             {:href masto}
                             [:img {:alt "Mastodon", :src "images/mastodon.ico"}]])
        (when (not-empty github) [:a
                                  {:href github}
                                  [:img {:alt "Github", :src "images/github.png"}]])]])]])

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
   [:h2 "Workshop"]
   [:div
    [:p data/conf-with-year " is co-hosting a free, beginner friendly workshop with ClojureBridge on 22nd March."]

    [:ol.article-list
     [:li
      [:a {:href "#workshop-details"}
       [:img.article-image
        {:alt "introductory"
         :src "images/workshops/clojurebridge-logo.png"}]]

      [:h4 {:id "introductory-workshop"}
       [:a {:href "#workshop-details"}
        "Introduction To Clojure »"]]

      [:p.article-subtitle "ClojureBridge is a free, beginner-friendly Clojure
         programming workshop that aims to increase diversity within the Clojure
         community. You will learn fundamental programming concepts in Clojure
         through practical examples and exercises. This workshop will be for
         women and non-binary attendees. Male attendees may attend as guests
         of women or non-binary attendees."]]]]])

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
   [keynote]
   #_[talks]
   [venue]
   [schedule]
   [tickets]
   #_[cfp]
   [speaker-list]
   [talk-selectors]
   [sponsorship]
   [workshops-section]
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
