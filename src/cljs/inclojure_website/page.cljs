(ns inclojure-website.page
  (:require [inclojure-website.data :as data]
            [inclojure-website.morellet :as morellet]
            [inclojure-website.sundry :as sundry]
            [inclojure-website.talks :as talks]
            [reagent.core :as reagent :refer [atom create-class]]))

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
         [:div.feature-overlay]
         [:a.feature-link {:href "https://gitlab.com/inclojure/inclojure.gitlab.io/blob/redesign/src/cljs/inclojure_website/morellet.cljs"}
          [:div.feature-text "inspired from François Morellet"]]])})))

(defn venue []
  [:section {:id "venue"}
   [:h2 "Venue"]
   [:img
    {:style {:width "100%" :margin "1.5em 0 1.5em 0" :border-radius "2%"}
     :alt "Pune",
     :src "images/bg-pune.jpg"}]
   [:p "We will announce the venue in Pune soon. Follow"
    [:a {:href "https://twitter.com/in_clojure"} " @in_clojure "]
    "to stay up-to-date."]
   [:h2 "Schedule"]
   [:p "IN/Clojure 2020 will happen over two days - 14th and 15th of February, 2020."]
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
      [:td "CFP is open! Submit here"]]]]])

(defn sponsorship []
  [:section {:id "sponsorship"}
   [:h2 "Sponsorship"]
   [:p]
   [:p "Help foster the growing Clojure community in Asia/India"]
   [:p "IN/Clojure is run by volunteers and is a not-for-profit conference."]
   [:p "Over the years, IN/Clojure has helped kick-start a series of
   Clojure workshops and meet-up across the country. It has helped
   organizations hiring Clojurists reach out to a wonderful
   community. And it has helped attendees make a strong case for
   Clojure/Clojurescript adoption in their companies."]
   [:p "With your help, we hope to make IN/Clojure 2020 bigger than
   before and continue our efforts t help foster the growing
   Clojure community in Asia/India."]
   [:p "To sponsor IN/Clojure 2020, review sponsorship details in the
   prospectus"
    [:a {:href "pdf/inclojure-2020-sponsorship-deck.pdf"} " here "]
    "and contact us at"
    [:a {:href "mailto:2020@inclojure.org"} " 2020@inclojure.org."]]])

(defn coc []
  [:section {:id "coc"}
   [:h2 "Code of Conduct"]
   [:p "Our conference is dedicated to providing a harassment-free
   conference experience for everyone, regardless of gender, gender
   identity and expression, age, sexual orientation, disability,
   physical appearance, body size, race, ethnicity, religion (or
   lack thereof), or technology choices."]
   [:p "We do not tolerate harassment of conference participants in any form."]
   [:p "Sexual language and imagery is not appropriate for any
   conference venue, including talks, workshops, parties, Twitter
   and other online media."]
   [:p "Conference participants violating these rules may be
   sanctioned or expelled from the conference without a refund at
   the discretion of the conference organisers."]])

(defn team-member [name twitter-link]
  [:li
   [:a
    {:href twitter-link}
    name
    [:img {:alt name, :src "images/akshaygupta.jpg"}]]
   [:div.small "Freelancer"]])

(defn team []
  [:section {:id "team"}
   [:h2 "Team"]
   [:ul.people
    (for [{:keys [name twitter-link]} data/team-list]
      ^{:key (str (random-uuid))}
      [team-member name twitter-link])]])

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
      [:a {:href "_"} "Bozhidar Batsov"]]
     [:p.article-subtitle "Bozhidar is the maintainer of CIDER, nREPL,
     a dozen related projects, and the editor of the community
     Clojure style guide. Most people would probably describe him as
     an Emacs zealot (and they would be right). He's also quite fond
     of the Lisp family of languages, functional programming in
     general and Clojure in particular. Believe it or not, Bozhidar
     has hobbies and interests outside the realm of computers, but we
     won't bore you with those here."]
     [:div.article-date "https://github.com/bbatsov"]]]])

(defn cfp []
  [:section {:id "cfp"}
   [:h2 "Call For Proposals"]
   [:p "We welcome talk submissions for the 4th edition of
   IN/Clojure 2020. This year, selected speakers will enjoy sharing
   the stage with the perennially effervescent Bozhidar Batsov, and
   other speakers from across the globe."]])

(defn intro []
  [:section {:id "intro"}
   [:p.intro "IN/Clojure is India's annual Clojure and ClojureScript
    conference, and Asia's first."]
   [:p "Our focus is the free exchange of ideas between new and
    experienced Clojure programmers alike. We are volunteer-run, and
    not-for-profit."]])

(defn nav []
  [:nav
   [:h1 [:a {:href "/"}]]
   [:span.nav-links
    [:a.link {:href "#" :on-click #(sundry/goto-link "team")} "Team"]
    [:a.link {:href "#" :on-click #(sundry/goto-link "coc")} "Code of Conduct"]]])

(defn footer []
  [:footer
   [:a
    {:href "https://twitter.com/in_clojure"}
    [:img {:alt "Twitter", :src "images/twitter.png"}]]
   [:a
    {:href "_"}
    [:img {:alt "Flickr", :src "images/flickr.png"}]]])

(defn contents []
  [:div
   [artwork]
   [:div.half
    [:div.contents.en
     [nav]
     [intro]
     [keynote]
     [sponsorship]
     [venue]
     [coc]
     [team]
     [footer]]]])
