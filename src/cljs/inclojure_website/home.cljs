(ns inclojure-website.home
  (:require [inclojure-website.layout :as layout]))

(defn intro []
  [:div.section
   [:p.section__content
    "IN/Clojure is India's annual Clojure conference. It is also the only Clojure conference in all of Asia. IN/Clojure’s primary focus is the free exchange of ideas between new and experienced Clojure programmers alike. IN/Clojure 2019 is the third edition of Asia's very first Clojure conference, and is scheduled to be held in "
    [:strong "Bengaluru, India in January,  2019."]]])

(defn cfp []
  [layout/section "cfp" "Call for Proposals"
   [:div
    [:p "The CFP is now live! Go to "
     [:a {:href "https://www.papercall.io/cfps/1407/submissions/new"
          :target "_blank"}
      "papercall "]
     "to submit yours."]
    [:h4 "Why propose a talk?"]
    [:p "The first two editions of the conference have served as a platform to kickstart a series of Clojure workshops and meet-ups across the country. It has also helped attendees make a strong case for Clojure, and Clojurescript adoption in their companies. We believe that this edition of the conference, like previous editions, will foster the growing Clojure community in Asia."]
    [:p "A talk at IN/Clojure is an avenue for sharing ideas, experiences, and knowledge with the Clojure community at large. It is an opportunity to bring the community together on interesting problems, and technical challenges, to showcase your work, and to contribute to a worthy cause."]
    [:h4 "What to propose?"]
    [:p
     [:ul
      [:li "Done something cool with Clojure lately? We want to hear from you!"]
      [:li "Maybe you learnt Clojure on weekends and built a small game in ClojureScript? Write in!"]
      [:li "Maybe you re-wrote your old java, or go-lang application into Clojure. We want to hear about it."]
      [:li "Maybe you taught Clojure to your friends, and there were some interesting aha! moments you want to talk about? Write in!"]
      [:li "If you built a wrapper library, a terminal game, a scraper spider, a crud generator, a tflops number cruncher, a distributed messaging platform, or a deep learning thingamajig, yes, you should should submit a talk!"]]
     "You can submit a talk regardless of your experience level with Clojure; all perspectives matter."

     "We’re looking for submissions on a wide range of topics."
     [:ul
      [:li "Full Talks will be 40 mins long - including 5 mins of Q & A."]
      [:li "Crisp Talks will be 20 mins long - including 5 mins of Q & A."]]]

    [:h4 "Speaker reimbursements"]
    [:p "We will reimburse economy-class travel costs for speakers:"]
    [:ul
     [:li "For international travel - up to INR 80K (approx. USD 1100)"]
     [:li "For domestic travel - up to INR 15K"]]
    [:p "Apart from the travel, we will also provide up to 2 nights of stay to speakers whose submissions are accepted."]]])

(defn sponsorship []
  [layout/section "sponsorship" "Sponsorship"
   [:p
    "Sponsorship details are available as a prospectus "
    [:a {:href (layout/resource-link "pdf/inclojure-sponsorship.pdf") :target "_blank"} "here"]
    "."]])

(defn code-of-conduct []
  [layout/section "conduct" "Code Of Conduct"
   [:div
    [:p "Our conference is dedicated to providing a harassment-free conference experience for everyone, regardless of gender, gender identity and expression, age, sexual orientation, disability, physical appearance, body size, race, ethnicity, religion (or lack thereof), or technology choices."]
    [:p "We do not tolerate harassment of conference participants in any form."]
    [:p "Sexual language and imagery is not appropriate for any conference venue, including talks, workshops, parties, Twitter and other online media."]
    [:p "Conference participants violating these rules may be sanctioned or expelled from the conference without a refund at the discretion  of the conference organisers."]]])

(def members
  [{:name "Aditya Athalye"     :twitter-link "http://twitter.com/adityaathalye"}
   {:name "Deepa Venkatraman"  :twitter-link "http://twitter.com/deepa_v"}
   {:name "Kiran Gangadharan"  :twitter-link "http://twitter.com/kirang89"}
   {:name "Shantanu Kumar"     :twitter-link "http://twitter.com/kumarshantanu"}
   {:name "Mohit Thatte"       :twitter-link "http://twitter.com/mohitthatte"}
   {:name "Ravindra Jaju"      :twitter-link "http://twitter.com/jaju "}
   {:name "Sandilya Jandhyala" :twitter-link "http://twitter.com/jysandilya"}
   {:name "Srihari Sriraman"   :twitter-link "http://twitter.com/sriharisriraman"}])

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
    [sponsorship]
    [cfp]
    [code-of-conduct]
    [team]]])
