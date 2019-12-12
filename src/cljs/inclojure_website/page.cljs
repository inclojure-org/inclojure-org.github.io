(ns inclojure-website.page
  (:require [inclojure-website.data :as data]
            [inclojure-website.morellet :as morellet]
            [inclojure-website.sundry :as sundry]
            [inclojure-website.talks :as talks]
            [accountant.core :as accountant]
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

(defn nav []
  [:nav
   [:h1 [:a {:href "/"}]]
   [:span.nav-links
    [:a.link {:href "#" :on-click #(reset! sub-page (home))} "Home"]
    [:a.link {:href "#" :on-click #(reset! sub-page (workshops))} "Workshops"]]])

;;
;; --------------
;;
;; WORKSHOPS PAGE
;;
;; --------------
;;

(defn workshops []
  [:section {:id "workshops"}
   [:div
    [:p.intro "There will be two full-day workshops at IN/Clojure 2020."]
    [:p "An introductory Clojure workshop and an intermediate Clojure
    workshop. The lessons apply to ClojureScript as well. Note that
    both the workshops will be conducted simultaneously on the 14"
    [:sup "th"] " of February, 2020."]
    [:h3 {:id "introductory-workshop"}
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
     {:id "intermediate-workshop"}
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
     [:li "Clojure ecosystem"]
     #_[:li "Polymorphism using Multimethods and Protocols"]
     #_[:li "Laziness"]
     #_[:li "Concurrency in Clojure"
        [:ul
         [:li "Basic: Futures, Promises, Atoms and Agents"]
         [:li "Advanced: Refs and Software Transactional Memory"]]]
     #_[:li "Macros"]
     ]
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
   [:p.intro "IN/Clojure is India's annual Clojure and ClojureScript
    conference, and Asia's first."]
   [:p "Our focus: the free exchange of ideas between new and
   experienced Clojure programmers alike. We are volunteer-run, and
    not-for-profit."]])

(defn venue []
  [:section {:id "venue"}
   [:h2 "Venue"]
   [:p "We've sought to shuttle the conference between Pune and Bangalore and this time its Pune's turn."]
   [:img
    {:style {:width "100%" :border-radius "2%"}
     :alt "Pune",
     :src "images/bg-pune.jpg"}]
   [:h3 "The Conference"]
   [:p "The conference will be held in a relatively centrally and well-connected on Nagar Rd, just 3kms off of the Pune International Airport (PNQ)."]
   [:iframe
    {:height "450",
     :width "100%",
     :src "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3782.3359264715677!2d73.90860541495768!3d18.558887972844822!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2c13f953dc837%3A0xb6782032b34e422e!2sNovotel%20Pune%20Nagar%20Road!5e0!3m2!1sen!2sin!4v1575908729886!5m2!1sen!2sin"}]
   [:address "Crimson Hall, Novotel"
    [:br]
    "Nagar Rd, Sakore Nagar"
    [:br]
    "Viman Nagar"
    [:br]
    "Pune - 411014"
    [:br]
    "Maharashtra, IN"
    [:br]]
   [:h4 "Getting there"]
   [:p [:strong "By Air:"] " Pune International Airport (PNQ) is a 10
   minute taxi ride from the venue."]
   [:p [:strong "By Train:"] " Pune is well connected by train to all
   major cities of India. Pune Station is about 25 minutes from the
   venue by car."]
   [:p [:strong "By Road:"] " Pune is also well connected by bus. If
   you are coming from Mumbai, we highly recommend taking the Shivneri
   bus from Dadar, Chembur, Vashi or Borivali (this is a government
   service)."]
   [:h4 "Getting around"]
   [:p "Uber and Ola Cabs are both active in Pune city. You should
   have no trouble using these. Local autorickshaws are also easily
   available."]
   [:p "There are quite a few restaurants, pubs and small cafes in the
   Koregaon Park neighborhood, which is a 15 minute ride from the
   venue."]
   [:h3 "The Workshops"]
   [:p "The venue for the workshops will will be announced soon!
   Follow"
    [:a {:href "https://twitter.com/in_clojure"} " @in_clojure "]
    "to stay updated."]])

(defn schedule []
  [:section {:id "schedule"}
   [:h2 "Schedule"]
   [:p "IN/Clojure 2020 will happen over two days. On the 14" [:sup "th"] " and the 15" [:sup "th"] " of February."]
   [:table.u-full-width
    [:tbody
     [:tr
      [:td "Introductory Clojure"]
      [:td "Fri, 14th Feb 2020"]]
     [:tr
      [:td "Intermediate Clojure"]
      [:td "Fri, 14th Feb 2020"]]
     [:tr
      [:td "Single-track day of talks"]
      [:td "Sat, 15th Feb 2020"]]]]])

(defn sponsorship []
  [:section {:id "sponsorship"}
   [:h2 "Sponsorship"]
   [:p]
   [:p "Help foster the growing Clojure community in India/Asia."]
   [:p "Over the years, IN/Clojure has helped kick-start a series of
   Clojure workshops and meet-ups across the country. It has helped
   organizations hiring Clojurists to reach out to a wonderful
   community. And has helped attendees make a strong case for
   Clojure/Clojurescript adoption in their companies."]
   [:p "With your help, we hope to make IN/Clojure 2020 bigger than
   before and continue our efforts to help foster the growing
   Clojure community in India/Asia."]
   [:p "To sponsor IN/Clojure 2020, review sponsorship details in the"
    [:a {:href "pdf/inclojure-2020-sponsorship-deck.pdf"} " prospectus "]
    "and contact us at"
    [:a {:href "mailto:2020@inclojure.org"} " 2020@inclojure.org."]]])

(defn coc []
  [:section {:id "coc"}
   [:h2 "Code of Conduct"]
   [:p "We do not tolerate harassment of conference participants in any form."]
   [:p "We're dedicated to providing a harassment-free experience
   for everyone. This is regardless of gender, gender
   identity and expression, age, sexual orientation, disability,
   physical appearance, race, ethnicity, religion (or
   lack thereof), or technology choices."]
   [:p "Sexual language and imagery is not appropriate for any
   conference venue, including talks, workshops, parties, Twitter
   and other online media."]
   [:p "Participants violating these rules may be
   sanctioned or expelled from the conference without a refund at
   the discretion of the organisers."]])

(defn team-member [name twitter-link avatar]
  [:li
   [:a
    {:href twitter-link}
    name
    [:img {:alt name, :src (str "images/team/" avatar)}]]
   [:div.small.article-fine-print.no-mobile
     [:a
      {:href "https://github.com/bbatsov"}
      [:img {:alt "Github", :src "images/github.png"}]]]])

(defn team []
  [:section {:id "team"}
   [:h2 "Team"]
   [:ul.people
    (for [{:keys [name twitter-link avatar]} data/team-list]
      ^{:key (str (random-uuid))}
      [team-member name twitter-link avatar])]])

(defn keynote []
  [:section {:id "keynote"}
   [:h2 "Keynote"]
   [:ol.article-list
    [:li
     [:a
      {:href "#"}
      [:img.article-image
       {:alt "bbatsov",
        :src "images/speakers/bozhidar-batsov.jpg"}]]
     [:h4
      [:a {:href "https://metaredux.com"} "Bozhidar Batsov"]]
     [:p.article-subtitle "Bozhidar is the maintainer of CIDER, nREPL,
     a dozen related projects, and the editor of the community
     Clojure style guide. Most people would probably describe him as
     an Emacs zealot (and they would be right). He's also quite fond
     of the Lisp family of languages, functional programming in
     general and Clojure in particular. Believe it or not, Bozhidar
     has hobbies and interests outside the realm of computers, but we
     won't bore you with those here."]
     [:div.article-fine-print.no-mobile
      [:a
       {:href "https://twitter.com/in_clojure"}
       [:img {:alt "Twitter", :src "images/twitter.png"}]]
      [:a
       {:href "https://github.com/bbatsov"}
       [:img {:alt "Github", :src "images/github.png"}]]]]]])

(defn tickets []
  [:section {:id  "tickets"}
   [:h2  "Tickets"]
   [:div
    [:div#boxoffice-widget [:pre "Loading..."]]]])

(defn cfp []
  [:section {:id "cfp"}
   [:h2 "Call For Proposals"]
   [:p "We welcome talk submissions for the 4th edition of
   IN/Clojure 2020. This year, selected speakers will enjoy sharing
   the stage with the perennially effervescent Bozhidar Batsov, and
   other speakers from across the globe."]])

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

    [:li "this edition of IN/Clojure is organized in partnership with"
     [:a {:href "https://hasgeek.com"} " HasGeek."]]

    [:li "source code to this website and other conference
    organizational material is available"
     [:a {:href
          "https://github.com/inclojure-org"} " here."]]

    [:li "the Clojure programming language & the Clojure logo are copyright"
     [:a {:href "https://commons.wikimedia.org/wiki/File:Clojure_logo.svg"} " Rich Hickey."]]]])

(defn footer []
  [:footer
   [:a
    {:href "https://twitter.com/in_clojure"}
    [:img {:alt "Twitter", :src "images/twitter.png"}]]
   [:a
    {:href "https://www.flickr.com/photos/inclojure/albums/72157711988093001"}
    [:img {:alt "Flickr", :src "images/flickr.png"}]]])

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
   [tickets]
   [sponsorship]
   [venue]
   [schedule]
   [coc]
   [team]
   [ending-ornament]
   [footnote]
   [footer]])

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
     [:div @sub-page]]]])
