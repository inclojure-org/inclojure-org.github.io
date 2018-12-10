(ns inclojure-website.talks
  (:require [inclojure-website.layout :as layout]
            [clojure.string :as string]))

(def selected-talks
  [{:duration "30m" :title "Registrations" :time "8:40 am"}
   {:duration "10m" :title "Welcome" :time "9:20 am"}

   {:duration       "40m"
    :type           "Full talk"
    :time           "9:30 am"
    :selected-talk? true
    :speakers       [{:name    "Eric Normand"
                      :link    "https://twitter.com/ericnormand"
                      :picture "images/speakers/eric-normand.jpg"
                      :bio     "Eric is a writer, trainer, and speaker. He runs purelyfunctional.tv, and organises Clojure SYNC."}]
    :company        "Lispcast"
    :title          "Keynote"
    :abstract       "The subject of this keynote will be announced shortly."}

   {:duration       "40m"
    :type           "Full talk"
    :time           "10:20 am"
    :selected-talk? true
    :speakers       [{:name    "Abhinav Sarkar"
                      :link    "http://twitter.com/abhin4v"
                      :picture "images/speakers/abhinav-sarkar.webp"
                      :bio     "Abhinav works as a Principal Engineer at Flipkart. Abhinav has worked extensively in Clojure, Go and Java on large distributed systems for past ten years. He has been dabbling in functional programming for past few years and has been exploring Haskell, Erlang and ML. While not programming, you can find him riding his bicycle around the city."}]
    :company        "Flipkart"
    :title          "Introduction to Concurrency"
    :abstract       "Clojure is widely known as a functional programming language. But it has a great support for a wide variety of concurrency models too. We’ll explore the various concurrency models and primitives supported by Clojure including threads, agents, STM and core.async goroutines and channels."}

   {:duration "30m" :type "Tea Break" :time "11:00 am" }

   {:duration "10m" :type "Lightning talk" :time "11:30 am"}

   {:duration       "20m"
    :type           "Crisp talk"
    :time           "11:45 am"
    :selected-talk? true
    :speakers       [{:name    "Rubal Jabbal"
                      :link    "https://in.linkedin.com/in/rubal-jabbal-4ba8b99a"
                      :picture "images/speakers/rubal-jabbal.jpeg"
                      :bio     "Rubal loves to code, and loves sharing the knowledge! She is interested in photography, calligraphy and is an avid bathroom singer!"}
                     {:name    "Pavitra Shetty"
                      :link    "https://www.linkedin.com/in/pavitra-shetty-22877418"
                      :picture "images/speakers/pavithra-shetty.jpeg"}],
    :company        "Helpshift"
    :title          "Using components in production"
    :abstract       "In this talk we introduce the problems faced in our current architecture [read - giant monolith architecture] The issues with multiple dependencies for a project and problems faced when there is no clear boundary."}

   {:duration       "40m"
    :type           "Full talk"
    :time           "12:10 am"
    :selected-talk? true
    :speakers       [{:name    "Martin Klepsch"
                      :link    "http://twitter.com/martinklepsch"
                      :picture "images/speakers/martin-klepsch.jpg"
                      :bio     "Martin is a Clojure/Script consultant who never expected to work on a documentation platform. Before starting cljdoc he helped run various community events in Berlin, created CLJSJS and contributed to lots of Clojure OpenSource projects like Boot, the ClojureScript compiler, re-frame and more. He’s also organising a conference in Europe beginning of August next year, called Heart Of Clojure."}]
    :title          "Cljdoc — Better documentation tooling for the Clojure/Script ecosystem"
    :company        "cljdoc"
    :abstract       "Documentation is a key part of working with open source libraries. Good documentation makes programmers more productive. It’s what makes simple things easy. In this talk we will discuss cljdoc, a website that provides API docs and more advanced documentation tooling for the Clojure community."}

   {:duration       "20m"
    :type           "Crisp talk"
    :time           "1:00 pm"
    :selected-talk? true
    :speakers       [{:name    "Mourjo Sen"
                      :link    "http://twitter.com/mourjo_sen"
                      :picture "images/speakers/mourjo-sen.jpg"
                      :bio     "Mourjo is a backend Clojure developer at Helpshift."}]
    :company        "Helpshift"
    :title          "Writing a fair task execution framework"
    :abstract       "How to ensure that in a multi-tenant business on the same infrastructure, one big customer will not bottleneck every single maintenance task you have to perform on all customers’ data? With the help of Clojure’s concurrency and core.async, the answer to this question was intuitive and effective."}

   {:duration "1h 20m" :type "Lunch" :time "1:20 pm"}

   {:duration "10m" :type "Lightning talk" :time "2:40 pm"}
   {:duration "10m" :type "Lightning talk" :time "2:50 pm"}

   {:duration       "20m"
    :type           "Crisp talk"
    :time           "3:10 pm"
    :selected-talk? true
    :speakers       [{:name    "Neha Mishra"
                      :link    "https://in.linkedin.com/in/neha-mishra-563674ab"
                      :picture "images/speakers/neha-mishra.jpg"
                      :bio     "Neha is a backend Clojure developer at Helpshift Technologies."}]
    :company        "Helpshift"
    :title          "Chanakya: Building composable logical rules"
    :abstract       "We will discuss our in-house lightweight rule engine library. The talk will demonstrate a generic library for building and executing a complex rule by composing simple logical filters."}

   {:duration       "40m"
    :type           "Full talk"
    :time           "3:40 pm"
    :selected-talk? true
    :speakers       [{:name    "Shantanu Kumar"
                      :link    "http://twitter.com/kumarshantanu"
                      :picture "images/speakers/shantanu-kumar.jpg"
                      :bio     "Shantanu is a Principal Engineer at Concur, building the core services platform using Clojure for fault tolerance and scale. Author of the book “Clojure High Performance Programming”, published by Packt publishing. Author of several Open Source Clojure libraries at https://github.com/kumarshantanu. Earlier worked at Runa (acquired by Staples) where he was using Clojure. Lives in Bangalore, India."}]
    :company        "Concur"
    :title          "Bract: A minimal DRY app framework"
    :abstract       "Most Clojure applications have a lot in common. While libraries do the heavy lifting for a specific purpose, everything still needs to be glued together. I will talk about an a-la-carte glue framework that brings uniformity and structure to various types of applications."}

   {:duration "30m" :type "Break" :time "4:20 pm"}

   {:duration "10m" :type "Lightning talk" :time "4:50 pm"}

   {:duration       "40m"
    :type           "Full talk"
    :time           "5:00 pm"
    :speakers       [{:name    "Anirudh Vyas"
                      :link    "http://twitter.com/Anirudh2403"
                      :picture "images/speakers/anirudh-vyas.jpg"}]
    :company        "Go-Jek"
    :selected-talk? true
    :title          "Evolution of a stream processing framework"
    :abstract       "As we move to an event-driven architecture in Gojek, Ziggurat, our stream processing framework written in clojure acts as the central platform that enables developers to rapidly iterate on and develop applications in a day that solve problems ranging from processing payments to geofencing."}

   {:duration "10m" :type "Lightning talk" :time "5:40 pm"}
   {:duration "40m" :title "Panel" :time "5:50 pm"}
   {:duration "5m" :title "Ending note" :time "6:30 pm"}])

(defn talk-id [talk]
  (string/replace (string/lower-case (:name (first (:speakers talk)))) #" " "-"))

(defn speaker-talk [{:keys [speakers title abstract bio] :as talk}]
  [layout/section (talk-id talk) title
   [:div.talk
    [:div.speakers
     (for [{:keys [name link picture]} speakers]
       [:div.speaker
        [:img.speaker-img
         {:src picture}]
        [:a.speaker-name {:href link :target "_blank"} name]])]
    [:div.talk-details
     [:p abstract]
     [:p (:bio (first speakers))]]]])

(defn page []
  [layout/page
   [:div
    [layout/header]
    [layout/navigation]
    (for [talk (filter :selected-talk? selected-talks)]
      [speaker-talk talk])]])
