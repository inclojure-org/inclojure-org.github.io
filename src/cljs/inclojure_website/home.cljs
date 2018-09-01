(ns inclojure-website.home
  (:require [inclojure-website.layout :as layout]))

(defn intro []
  [:div.section
   [:p.section__content
    "IN/Clojure is India's annual Clojure conference. It is alsothe only Clojure conference in all of Asia. IN/Clojure’sprimary focus is the free exchange of ideas between new andexperienced Clojure programmers alike. IN/Clojure 2019 isthe third edition of Asia's very first Clojure conference,and is scheduled to be held in "
    [:strong "Bengaluru, India in January,  2019."]]])

(defn cfp []
  [layout/section "cfp" "Call for Proposals"
   [:div
    [:p "IN/Clojure's Call For Proposals will open soon."]
    [:p "We’re looking for submissions on a wide range of topics. Done something cool with Clojure lately? Maybe you learnt Clojure on weekends and built a small game in ClojureScript? We want to hear from you! You can submit a talk regardless of your experience level with Clojure; all perspectives matter."]]])

(defn sponsorship []
  [layout/section "sponsorship" "Sponsorship"
   [:p
    "Details will be up soon. Sponsorship details are available as a prospectus "
    [:a {:href "pdf/inclojure-sponsorship.pdf",:target "_blank"} "here"]
    "."]])

(defn code-of-conduct []
  [layout/section "conduct" "Code Of Conduct"
   [:div
    [:p "Our conference is dedicated to providing a harassment-free conference experience for everyone, regardless of gender, gender identity and expression, age, sexual orientation, disability, physical appearance, body size, race, ethnicity, religion (or lack thereof), or technology choices."]
    [:p "We do not tolerate harassment of conference participants in any form."]
    [:p "Sexual language and imagery is not appropriate for any conference venue, including talks, workshops, parties, Twitter and other online media."]
    [:p "Conference participants violating these rules may be sanctioned or expelled from the conference without a refund at the discretion  of the conference organisers."]]])

(def members
  [{:name "Aditya Athalye"     :twitter "http ://twitter.com/adityaathalye"}
   {:name "Deepa Venkatraman"  :twitter "http ://twitter.com/deepa_v"}
   {:name "Kiran Gangadharan"  :twitter "http ://twitter.com/kirang89"}
   {:name "Shantanu Kumar"     :twitter "http ://twitter.com/kumarshantanu"}
   {:name "Mohit Thatte"       :twitter "http ://twitter.com/mohitthatte"}
   {:name "Ravindra Jaju"      :twitter "http ://twitter.com/jaju "}
   {:name "Sandilya Jandhyala" :twitter "http ://twitter.com/jysandilya"}
   {:name "Srihari Sriraman"   :twitter "http ://twitter.com/sriharisriraman"}])

(defn team-member [twitter-link name]
  [:a.team-member
   {:href twitter-link :target "_blank"}
   name])

(defn team []
  [layout/section "team" "Team"
   [:div.team-members
    (for [{:keys [twitter name]} members]
      ^{:key (str (random-uuid))}
      [team-member twitter name])]])

(defn page []
  [layout/page
   [:div
    [:div.section.header
     [:img.header-logo
      {:alt "Goto INClojure 2019 home page",
       :src (layout/resource-link "images/inclojure-logo-v2.png")}]
     [:p.date-and-venue
      "January 2019"
      [:br]
      " Bengaluru, India"]]
    [layout/navigation]
    [intro]
    [cfp]
    [sponsorship]
    [code-of-conduct]
    [team]]])
