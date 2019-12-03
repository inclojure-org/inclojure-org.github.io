(ns inclojure-website.home
  (:require [inclojure-website.layout :as layout]
            [clojure.string :as string]
            [inclojure-website.talks :as talks]))

(defn intro []
  [:div.section
   [:h3 "About"]
   [:p.section__content
    "IN/Clojure is India's annual Clojure and ClojureScript conference, and Asia's first.

     Our focus is the free exchange of ideas between new and experienced Clojure programmers alike. We are volunteer-run, and not-for-profit."]
   [:p.section__content
    "IN/Clojure 2020, our fourth edition, is happening "
    [:strong "in Pune, on the 14" [:sup "th"] " and 15" [:sup "th"] "of February 2020."]
    " Follow " [:a {:href "https://twitter.com/in_clojure" :target "_blank"} "@in_clojure"] " to stay up-to-date."]
   [:h3 "Previous editions"]
   [:div.previously-section

    [:div.previously
     [:div.previously-content
      [:div {}
       [:img.previously-img
        {:alt "Bangalore 2019", :src "images/bg-bangalore.jpg"}]]
      [:div.previously-about
       [:div {}
        [:p.previously-title [:a {:href "https://www.youtube.com/playlist?list=PLlAML-kjpXY7kzJp0p1EPJ9eb8B15CCBU" :target "_blank"}
                              "Bangalore, 2019"]]]]]]

    [:div.previously
     [:div.previously-content
      [:div {}
       [:img.previously-img
        {:alt "Bangalore 2018", :src "images/bg-bangalore.jpg"}]]
      [:div.previously-about
       [:div {}
        [:p.previously-title [:a {:href "https://www.youtube.com/playlist?list=PLlAML-kjpXY4rljddpJ5qMUp-t1Qa-Vfy" :target "_blank"}
                              "Bangalore, 2018"]]]]]]

    [:div.previously
     [:div.previously-content
      [:div {}
       [:img.previously-img
        {:alt "Pune 2016", :src "images/bg-pune.jpg"}]]
      [:div.previously-about
       [:div {}
        [:p.previously-title [:a {:href
                                  "https://www.youtube.com/playlist?list=PLlAML-kjpXY6XllFUezz6RYow6hF4zlFV" :target "_blank"}
                              "Pune, 2016"]]]]]]
    ]])

(defn event-detail [{:keys [title speakers company] :as talk}]
  [:a {:href "#"
       :on-click #(layout/goto (str "talk-" (talks/talk-id talk)))
       :style {:font-weight "bold"}}
   title
   (when (= "Lightning talk" type) "TBD")])

(defn schedule-speakers [speakers company]
  (when (some? speakers)
    [:div.talk-speakers
     (for [{:keys [name link]} speakers]
       [:span (str name ", " company)])]))

(defn day-2-schedule []
  [:table.schedule-table
   [:thead
    [:tr
     (for [h [:time :event :type]]
       [:th
        {:style {:text-align "left"}}
        (string/capitalize (name h))])]]
   [:tbody
    (for [{:keys [selected-talk? duration type time speakers company title] :as talk} talks/selected-talks]
      [:tr
       {:class (when (and (nil? speakers) (not= "Lightning talk" type)) "non-talk")}
       [:td.td-time time]
       [:td.td-event
        (cond
          selected-talk?            [event-detail talk]
          :else                     title)
        [:br]
        [schedule-speakers speakers company]]
       [:td type]])]])

(def day-1-workshops
  [{:time "Time TBA" :title "Registrations" :duration "30m"}
   {:time "Time TBA" :title "Introductory workshop"
    :selected-talk? true :page-id "introductory-workshop" :duration "8h"}
   {:time "Time TBA" :title "Intermediate workshop"
    :selected-talk? true :page-id "intermediate-workshop" :duration "8h"}])

(defn day-1-schedule []
  [:table.schedule-table
   [:thead
    [:tr
     (for [h [:time :event]]
       [:th
        {:style {:text-align "left"}}
        (string/capitalize (name h))])]]
   [:tbody
    (for [{:keys [selected-talk? duration type time speakers company title page-id] :as talk} day-1-workshops]
      [:tr
       {:class (when-not selected-talk? "non-talk")}
       [:td.td-time time]
       [:td.td-event
        (if selected-talk?
          [:a {:href "#"
               :on-click   #(layout/goto page-id)
               :style {:font-weight "bold"}}
           title
           (when (= "Lightning talk" type) "TBD")]
          title)
        [:br]
        [schedule-speakers speakers company]]])]])

(defn schedule []
  [layout/section "schedule" "Schedule"
   [:div
    [:em "IN/Clojure 2020 will happen over two days - 14" [:sup "th"] " and 15" [:sup "th"] " of February, 2020."]
    [:p [:strong "Day 1: Fri, 14" [:sup "th"] " Feb, 2020"] " | Two full-day workshops. Details coming soon."
     [:ul
      [:li "Workshop 1: Introduction to Clojure, for programmers new to Clojure."]
      [:li "Workshop 2: Intermediate Clojure, for programmers familiar with Clojure."]]
     #_[day-1-schedule]]
    [:p [:strong "Day 2: Sat, 15" [:sup "th"] " Feb, 2020"] " | Single-track day of Talks. "
     "CFP is open. "
     [:a {:href "https://hasgeek.com/inclojure/2020/proposals" :target "_blank"} [:i "Submit your proposal(s) now."]]]
    #_[day-2-schedule]]])

(defn workshops []
  [layout/section "workshops" "Workshops"
   [:div
    [:p "There will be two full-day workshops at IN/Clojure 2020 - an introductory Clojure workshop and an intermediate Clojure workshop. The lessons apply to ClojureScript as well. Note that both the workshops will be
         conducted simultaneously on the 14" [:sup "th"] " of February, 2020."]
    [:h3 {:id "introductory-workshop"}
     "Introductory workshop"]
    [:h4 "Audience"]
    [:p "Practising programmers and/or CS undergrads/grads who are new to Clojure (i.e. not absolute beginners in programming)."]
    ;;[:h4 "Session outline"]
    ;;[:p>em "Details coming soon!"]
    #_[:div
       [:p "This will be a day-long hands-on workshop."]
       [:p "We will progressively grow logic for a little data-processing utility, by building concept upon concept until we have a working application."]
       [:p "We will try to achieve this with:"]
       [:ul
        [:li "A small set of core ideas,"]
        [:li "a handful of Clojure primitives, a few API design techniques, and"]
        [:li "an interactive (REPL-driven) programming workflow."]]
       [:p "We will do the following:"]
       [:ul
        [:li "Model things with pure data,"]
        [:li "design clean functional APIs,"]
        [:li "compose purely functional logic, and"]
        [:li "use the REPL to interactively \"grow\" and introspect code."]]
       [:p "Fully documented workshop material will be available for use at home."]]

    [:h3
     {:id "intermediate-workshop"}
     "Intermediate workshop"]
    [:h4 "Audience"]
    [:p "Working Clojure programmers who are relatively new to the language, but have written some Clojure code, perhaps under someone else's supervision."]
    ;;[:h4 "Session outline"]
    ;;[:p>em "Details coming soon!"]
    #_[:p "This will be a day-long hands-on workshop."]
    #_[:p "The aim of this workshop is to help the attendee work in Clojure more effectively. We will learn about the application of the following concepts:"]
    #_[:ul
       [:li "Java interop"]
       [:li "Polymorphism using Multimethods and Protocols"]
       [:li "Laziness"]
       [:li "Concurrency in Clojure"
        [:ul
         [:li "Basic: Futures, Promises, Atoms and Agents"]
         [:li "Advanced: Refs and Software Transactional Memory"]]]
       [:li "Macros"]
       [:li "Testing"]]
    #_[:p "To help illustrate and understand the application of these concepts, we will build a project that ties all these concepts together."]]])

(defn tickets []
  [layout/section "tickets" "Tickets"
   [:div
    [:div#boxoffice-widget [:p "Loading..."]]
    [:p "For more news, follow " [:a {:href "https://twitter.com/in_clojure" :target "_blank"} "@in_clojure"] " on twitter."]]])

(defn benefactor [benefactor-name site-link logo-src]
  [:li.benefactor
   [:a {:href site-link :target "_blank"}
    [:img.benefactor-logo {:alt benefactor-name,
                           :src logo-src
                           :href "/"}]]])

(defn sponsorship []
  [layout/section "sponsorship" "Sponsorship"
   [:p
    ;; [:div.benefactors.gold
    ;;  [:p.benefactor-slab
    ;;   "Platinum"]
    ;;  [:ul.benefactors-list
    ;;   [benefactor "Go-Jek" "https://www.go-jek.com/" "images/sponsor-logos/go-jek.png"]
    ;;   [benefactor "Helpshift" "https://www.helpshift.com" "images/sponsor-logos/helpshift.png"]]]
    ;; [:div.benefactors.gold
    ;;  [:p.benefactor-slab
    ;;   "Gold"]
    ;;  [:ul.benefactors-list
    ;;   [benefactor "nilenso" "https://nilenso.com" "images/sponsor-logos/nilenso.png"]
    ;;   [benefactor "Thoughtworks" "https://www.thoughtworks.com" "images/sponsor-logos/thoughtworks.png"]]]
    ;; [:div.benefactors.silver
    ;;  [:p.benefactor-slab
    ;;   "Silver"]
    ;;  [:ul.benefactors-list
    ;;   [benefactor "Formcept" "https://www.formcept.com" "images/sponsor-logos/formcept.png"]
    ;;   [benefactor "Concur" "https://www.concur.co.in" "images/sponsor-logos/sap-concur.png"]]]
    [:h3 "Help foster the growing Clojure community in Asia/India"]
    [:div
     [:p "IN/Clojure is run by volunteers and is a not-for-profit conference."]
     [:p "Over the years, IN/Clojure has helped kick-start a series of Clojure workshops and meet-ups across the country. It has helped organizations hiring Clojurists reach out to a wonderful community. And it has helped attendees make a strong case for Clojure/Clojurescript adoption in their companies."]
     [:p "With your help, we hope to make IN/Clojure 2020 bigger than before and continue our efforts to help foster the growing Clojure community in Asia/India."]
     [:p
      "To sponsor IN/Clojure 2020, review sponsorship details in "
      [:a {:href "pdf/inclojure-2020-sponsorship-deck.pdf" :target "_blank"} "the prospectus here (PDF)"]
      " and contact us at "
      [:a {:href "mailto:2020@inclojure.org"} "2020@inclojure.org."]]]
    ]])

(defn code-of-conduct []
  [layout/section "conduct" "Code Of Conduct"
   [:div
    [:p "Our conference is dedicated to providing a harassment-free conference experience for everyone, regardless of gender, gender identity and expression, age, sexual orientation, disability, physical appearance, body size, race, ethnicity, religion (or lack thereof), or technology choices."]
    [:p "We do not tolerate harassment of conference participants in any form."]
    [:p "Sexual language and imagery is not appropriate for any conference venue, including talks, workshops, parties, Twitter and other online media."]
    [:p "Conference participants violating these rules may be sanctioned or expelled from the conference without a refund at the discretion  of the conference organisers."]]])

(defn opportunity-grant []
  [layout/section "opgrant" "Opportunity Grant"
   [:div
    [:p "IN/Clojure aims to be an inclusive conference. We're really glad to announce an opportunity grant for community members who would be unable to attend the conference for financial reasons. The opportunity grant includes a free ticket and travel assistance."]
    [:p "Please watch this space for announcement related to applying for the Opportunity Grant."]
    #_[:p "Please fill out this "
       [:a {:href   "https://goo.gl/forms/QYvM8FRjRV5LC0jn2"
            :target "_blank"}
        "form"]
       " to apply for an opportunity grant. Please do share the link with your friends who might be interested."]
    [:p "We want our conference to have a diverse set of attendees. Ashe Dryden has written a "
     [:a {:href   "https://www.ashedryden.com/blog/increasing-diversity-at-your-conference"
          :target "_blank"}
      "detailed post"]
     " on how to improve diversity at conferences, and it includes a section on what \"diversity\" means. We will try our best to be truly diverse."]
    [:p "Preference will be given to attendees who fall into an under-represented category in tech - women, members of the LGBTQ community, people with physical disabilities, students, and any other under-represented group."]
    [:p "If you are unsure about applying for an opportunity grant because you do not fall into any of these categories, please do apply explaining why you need assistance, and we will try to help you make it to the conference."]
    [:p "Decisions on the opportunity grant will be made by the organizing team. Preference for travel assistance will be given to participants from the Bengaluru region and other cities in India (due to budget constraints). We are open to consider applications from outside India as well."]]])

(def members
  [{:name "Aditya Athalye" :twitter-link "http://twitter.com/adityaathalye"}
   {:name "Akshay Gupta" :twitter-link "http://twitter.com/kitallis"}
   {:name "Harsh Gupta" :twitter-link "https://github.com/hargup"}
   {:name "Kapil Reddy" :twitter-link "https://twitter.com/KapilReddy"}
   {:name "Nivedita Priyadarshini" :twitter-link "http://twitter.com/nid90"}
   {:name "Ravindra Jaju" :twitter-link "https://twitter.com/jaju"}
   {:name "Rubal Jabbal" :twitter-link "https://github.com/rubalj"}
   {:name "Sandilya Jandhyala" :twitter-link "http://twitter.com/jysandilya"}
   {:name "Srihari Sriraman" :twitter-link "http://twitter.com/sriharisriraman"}
   {:name "Venkatesh Halli" :twitter-link "https://github.com/vhalli"}
   {:name "Vikram Chintalapati" :twitter-link "https://github.com/vkrmis"}])

(defn team-member [twitter-link name]
  [:a.team-member
   {:href twitter-link :target "_blank"}
   name])

(defn team []
  [layout/section "team" "Team"
   [:div.team-members
    (for [{:keys [twitter-link name]} members]
      ^{:key (str (random-uuid))}
      [team-member twitter-link name])]])

(defn invited-speakers []
  #_[layout/section "invited-speakers" "Invited Speaker"
   ]
  [:div.speaker
   [:img.speaker-img
    {:alt "Bozhidar Batsov", :src "images/speakers/bozhidar-batsov.jpg"}]
   [:div.speaker-about
    [:p.speaker-name "Bozhidar Batsov"]
    [:p.speaker-desc
     [:a {:href "https://github.com/bbatsov" :target "_blank"}
      "Bozhidar "]
     "is the maintainer of CIDER, nREPL, a dozen related projects, and the editor of the community Clojure style guide. Most people would probably describe him as an Emacs zealot (and they would be right). He's also quite fond of the Lisp family of languages, functional programming in general and Clojure in particular.\n\nBelieve it or not, Bozhidar has hobbies and interests outside the realm of computers, but we won't bore you with those here."]]])

(defn talks []
  [layout/section "talks" "Call For Proposals"
   [:div [:h3 "CFP is open!"]
    "We welcome talk submissions for the 4th edition of IN/Clojure 2020.
     This year, selected speakers will enjoy sharing the stage with the perennially effervescent Bozhidar Batsov, and other speakers from across the globe. "
    [:p [:strong [:a {:href "https://hasgeek.com/inclojure/2020/proposals" :target "_blank"}
                  "Submit your proposal now!"]]]
    [:h3 "Invited Speaker"]
    (invited-speakers)]

   #_(for [talk (filter :selected-talk? talks/selected-talks)]
       [:div.home-page-talk
        {:id (str "talk-" (talks/talk-id talk))}
        [talks/speaker-talk talk]])])

(defn venue []
  [layout/section "venue" "Venue"
   [:div
    [:p "Will be announced soon. Follow " [:a {:href "https://twitter.com/in_clojure" :target "_blank"} "@in_clojure"] " to stay up-to-date."]]
   #_[:div
    [:h3 "Novotel Pune Nagar Road"]
    [:p
     "Address: Novotel Pune Nagar Road, Weikfield IT City Infopark, Viman Nagar, 411014, Pune, India."
     [:br]
     "Contact: "
     [:a.contact-link {:href "tel:+912067056000"}
      "+912067056000"]
     ", "
     [:a.contact-link {:href "https://www.accorhotels.com/gb/hotel-6833-novotel-pune-nagar-road/index.shtml"
                       :target "_blank"}
      "official website"]]
    [:div.contact-map
     [:iframe {:src "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3782.3359264729024!2d73.90860004983779!3d18.558887972784607!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2c13f953dc837%3A0xb6782032b34e422e!2sNovotel%20Pune%20Nagar%20Road!5e0!3m2!1sen!2sin!4v1574325057287!5m2!1sen!2sin" :allowfullscreen ""
               :width "400" :height "300" :frameBorder "0"}]]
    [:h3 "Getting there"]
    [:p
     "By Air: Pune Airport is a 15 minute taxi ride from the venue (3 Km / 2 mi). Those arriving internationally via Mumbai can taxi over in about 4 hours."]
    [:p
     "By Train: Pune is well connected by train to all major cities of India. Pune City Railway Station is about 30 minutes from the venue by car (6.1 Km / 3.8 mi)."]
    [:h3 "Getting around"]
    [:p "Uber and Ola are active in Pune. You should have no trouble using these. Local autorickshaws are also easily available."]
    [:p "Several restaurants, pubs, cafes, and malls are in the vicinity of Novotel, from a short walk away to a short drive away."]]])

(defn page []
  [layout/page
   [:div
    [layout/header]
    [layout/navigation]
    [intro]
    [talks]
    [workshops]
    [sponsorship]
    [venue]
    [schedule]
    [tickets]
    #_[opportunity-grant]
    [code-of-conduct]
    [team]]])
