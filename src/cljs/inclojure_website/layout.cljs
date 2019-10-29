(ns inclojure-website.layout)

(defn google-analytics []
  [:script
   "\n      (function (i, s, o, g, r, a, m) {i['GoogleAnalyticsObject'] = r; i[r] = i[r] || function () {  (i[r].q = i[r].q || []).push(arguments)}, i[r].l = 1 * new Date(); a = s.createElement(o),m = s.getElementsByTagName(o)[0]; a.async = 1; a.src = g; m.parentNode.insertBefore(a, m)\n      })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');\n      ga('create', 'UA-84225215-1', 'auto');\n      ga('send', 'pageview');\n    "])

(defn resource-link [s]
  (str "/resources/public/" s))

(defn header []
  [:div.section.header
     [:img.header-logo
      {:alt  "Goto INClojure 2020 home page",
       :src  "images/inclojure-logo-2019.png"
       :href "/"}]
     [:p.date-and-venue
      "February, 2020"
      [:br]
      "Pune, India"]])

(defn footer []
  [:div.section.footer
   [:div.footer-content
    [:div.nav-links
     [:a.nav-link
      {:href "mailto:team@inclojure.org"}
      "    Contact  "]
     #_[:a.nav-link
      {:href "pdf/inclojure-sponsorship.pdf"}
      "    Sponsorship  "]
     [:a.nav-link
      {:href "https://twitter.com/in_clojure"}
      "    @in_clojure  "]]]])

(defn nav-link [id title]
  [:a.nav-link
   {:href "#"
    :on-click #(set! (.-location js/window ) (str "/#" id))}
   title])

(defn goto [id]
  (set! (.-location js/window) (str "/#" id)))

(defn navigation []
  [:div.section.nav-links
   [nav-link "schedule" "Schedule"]
   [nav-link "tickets" "Tickets"]
   [nav-link "venue" "Venue"]
   [nav-link "workshops" "Workshops"]
   [nav-link "talks" "Talks and Speakers"]
   [nav-link "opgrant" "Opportunity Grant"]
   #_[nav-link "sponsorship" "Sponsors"]
   [nav-link "conduct" "Code of Conduct"]
   [nav-link "team" "Team"]] )

(defn section [id title content]
  [:div.section {:id id}
   [:h3.section-title title]
   [:section.section__content
    content]])

(defn page [content]
  [:div
   [:div.content
    content]
   [footer]
   [google-analytics]])
