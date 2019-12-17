(ns inclojure-website.data)

(defonce team-list
  [{:name "Aditya Athalye" :github "https://github.com/adityaathalye" :twitter "http://twitter.com/adityaathalye" :avatar "aditya.png"}
   {:name "Akshay Gupta" :github "https://github.com/kitallis" :twitter "http://twitter.com/kitallis" :avatar "kitallis.png"}
   {:name "Harsh Gupta" :github "https://github.com/hargup" :twitter "https://twitter.com/hargup13" :avatar "harsh.jpg"}
   {:name "Kapil Reddy" :github "https://github.com/kapilreddy" :twitter "https://twitter.com/KapilReddy" :avatar "kapil.png"}
   {:name "Nivedita Priyadarshini" :github "https://github.com/nid90" :twitter "http://twitter.com/nid90" :avatar "nid.png"}
   {:name "Ravindra Jaju" :github "https://github.com/jaju" :twitter "https://twitter.com/jaju" :avatar "jaju.jpg"}
   {:name "Rubal Jabbal" :github "https://github.com/rubalj" :twitter "https://twitter.com/rubaljabbal" :avatar "rubal.png"}
   {:name "Sandilya Jandhyala" :github "https://github.com/jysandy" :twitter "http://twitter.com/jysandilya" :avatar "sandy.png"}
   {:name "Srihari Sriraman" :github "https://github.com/ssrihari" :twitter "http://twitter.com/sriharisriraman" :avatar "srihari.png"}
   {:name "Venkatesh Halli" :github "https://github.com/vhalli" :twitter "https://twitter.com/venkateshhalli" :avatar "vhalli.png"}])

(defonce talk-selectors
  [{:name "Martin Klepsch"
    :bio "Martin is a Clojure/Script consultant who never expected to work on a
documentation platform. Before starting cljdoc he helped run various community
events in Berlin, created CLJSJS and contributed to lots of Clojure OpenSource
projects like Boot, the ClojureScript compiler, re-frame and more. Martin also
recently organised the Heart Of Clojure conference in Europe."
    :twitter "https://twitter.com/martinklepsch"
    :github "https://github.com/martinklepsch"
    :www "https://www.martinklepsch.org"
    :alt "martinklepsch"
    :avatar "martin.jpeg" }

   {:name "Paula Gearon"
    :bio "In her 10th year of Clojure development, Paula is a software engineer
at Cisco Systems who enjoys working in the most technical parts of a system,
building the infrastructure that lets other developers do their jobs.
She has been the technical lead on several commercial and open source projects,
with a focus on data storage and processing, and was a lead editor for the
SPARQL standard for accessing RDF databases. When not coding, she does triathlons,
cooks, helps her children with homework, and mentors and supports young members
of Women Who Code."
    :twitter "https://twitter.com/quoll"
    :github "https://github.com/quoll"
    :www "https://medium.com/@miffedgirl"
    :alt "paulagearon"
    :avatar "paula.jpeg"}

   {:name "Tejas Dinkar"
    :bio "A full stack engineer with over 9 years of experience in multiple domains,
Tejas is a software craftsman who enjoys learning new ways to solve problems. Currently,
Tejas loves to play with Clojure, Ruby, GoLang, ReasonML, and Node.js, and he is
the Head of Technology for Quintype, a builder of products for digital media companies."
    :twitter "https://twitter.com/tdinkar"
    :github "https://github.com/gja"
    :www "http://blog.gja.in"
    :alt "tdinkar"
    :avatar "tejas.jpeg" }])

(defonce previous-editions
  {:bangalore {:map "images/bangalore-map-caption.png"
               :editions [{:year "2019"
                           :talks "https://www.youtube.com/playlist?list=PLlAML-kjpXY6XllFUezz6RYow6hF4zlFV"
                           :schedule "https://inclojure.org/2019/#schedule"}

                          {:year "2018"
                           :talks "https://www.youtube.com/playlist?list=PLlAML-kjpXY4rljddpJ5qMUp-t1Qa-Vfy"
                           :schedule "https://inclojure.org/2018/#schedule"}]}

   :pune {:map "images/bangalore-map-caption.png"
          :editions [{:year "2016"
                      :talks "https://www.youtube.com/playlist?list=PLlAML-kjpXY7kzJp0p1EPJ9eb8B15CCBU"
                      :schedule "https://inclojure.org/2016/#schedule"}]}})

(defonce selected-talks
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
    :title          "You are in a maze of deeply nested maps, all alike"
    :abstract       "People complain a lot about difficulties with
    deeply nested maps in Clojure. I've never had that problem. I
    looked at other people's code to see what they were doing to get
    into trouble. In this talk you'll get a good idea of the wrong
    turns people take and you'll leave with some techniques to find
    your way out and to avoid getting lost in the first place."}

   {:duration       "40m"
    :type           "Full talk"
    :time           "10:20 am"
    :selected-talk? true
    :speakers       [{:name    "Abhinav Sarkar"
                      :link    "http://twitter.com/abhin4v"
                      :picture "images/speakers/abhinav-sarkar.png"
                      :bio     "Abhinav works as a Principal Engineer
                      at Flipkart. Abhinav has worked extensively in
                      Clojure, Go and Java on large distributed
                      systems for past ten years. He has been dabbling
                      in functional programming for past few years and
                      has been exploring Haskell, Erlang and ML. While
                      not programming, you can find him riding his
                      bicycle around the city."}]
    :company        "Flipkart"
    :title          "Introduction to Concurrency"
    :abstract       "Clojure is widely known as a functional
    programming language. But it has a great support for a wide
    variety of concurrency models too. We’ll explore the various
    concurrency models and primitives supported by Clojure including
    threads, agents, STM and core.async goroutines and channels."}

   {:duration "30m" :type "Tea Break" :time "11:00 am" }

   {:duration       "10m"
    :type           "Lightning talk"
    :time           "11:30 am"
    :selected-talk? true
    :speakers       [{:name    "Kapil Reddy"
                      :link    "https://twitter.com/kapilreddy"
                      :picture "images/speakers/kapilreddy.jpg"
                      :bio     "Kapil is a senior backend engineer at Helpshift"}]
    :title          "Creating and evolving contracts with Clojure.spec"
    :company        "Helpshift"}

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
                      :picture "images/speakers/pavithra-shetty.jpeg"
                      :bio     "Pavitra is a backend Clojure developer at Helpshift."}],
    :company        "Helpshift"
    :title          "Using components in production"
    :abstract       "In this talk we introduce the problems faced in
    our current architecture [read - giant monolith architecture] The
    issues with multiple dependencies for a project and problems faced
    when there is no clear boundary."}

   {:duration       "40m"
    :type           "Full talk"
    :time           "12:10 pm"
    :selected-talk? true
    :speakers       [{:name    "Martin Klepsch"
                      :link    "http://twitter.com/martinklepsch"
                      :picture "images/speakers/martin-klepsch.jpg"
                      :bio "Martin is a Clojure/Script consultant who
                      never expected to work on a documentation
                      platform. Before starting cljdoc he helped run
                      various community events in Berlin, created
                      CLJSJS and contributed to lots of Clojure
                      OpenSource projects like Boot, the ClojureScript
                      compiler, re-frame and more. He’s also
                      organising a conference in Europe beginning of
                      August next year, called Heart Of Clojure."}]
    :title          "Cljdoc — Better documentation tooling for the Clojure/Script ecosystem"
    :company        "cljdoc"
    :abstract       "Documentation is a key part of working with open
    source libraries. Good documentation makes programmers more
    productive. It’s what makes simple things easy. In this talk we
    will discuss cljdoc, a website that provides API docs and more
    advanced documentation tooling for the Clojure community."}

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
    :abstract       "How to ensure that in a multi-tenant business on
    the same infrastructure, one big customer will not bottleneck
    every single maintenance task you have to perform on all
    customers’ data? With the help of Clojure’s concurrency and
    core.async, the answer to this question was intuitive and
    effective."}

   {:duration "1h 20m" :type "Lunch" :time "1:20 pm"}


   {:duration       "10m"
    :type           "Lightning talk"
    :time           "2:40 pm"
    :selected-talk? true
    :speakers       [{:name    "Divyansh Prakash"
                      :link    "https://twitter.com/therealdivs1210"
                      :picture "images/speakers/divyansh.jpeg"
                      :bio     "Divyansh is a software developer at nilenso"}]
    :company        "nilenso"
    :title          "async/await in Clojure using conquerant"}

   {:duration       "20m"
    :type           "Crisp talk"
    :time           "2:50 pm"
    :selected-talk? true
    :speakers       [{:name    "Neha Mishra"
                      :link    "https://in.linkedin.com/in/neha-mishra-563674ab"
                      :picture "images/speakers/neha-mishra.jpg"
                      :bio     "Neha is a backend Clojure developer at Helpshift Technologies."}]
    :company        "Helpshift"
    :title          "Chanakya: Building composable logical rules"
    :abstract       "We will discuss our in-house lightweight rule
    engine library. The talk will demonstrate a generic library for
    building and executing a complex rule by composing simple logical
    filters."}

   {:duration       "40m"
    :type           "Full talk"
    :time           "3:15 pm"
    :selected-talk? true
    :speakers       [{:name    "Shantanu Kumar"
                      :link    "http://twitter.com/kumarshantanu"
                      :picture "images/speakers/shantanu-kumar.jpg"
                      :bio     "Shantanu is a Principal Engineer at
                      Concur, building the core services platform
                      using Clojure for fault tolerance and
                      scale. Author of the book “Clojure High
                      Performance Programming”, published by Packt
                      publishing. Author of several Open Source
                      Clojure libraries at
                      https://github.com/kumarshantanu. Earlier worked
                      at Runa (acquired by Staples) where he was using
                      Clojure. Lives in Bangalore, India."}]
    :company        "Concur"
    :title          "Bract: A minimal DRY app framework"
    :abstract       "Most Clojure applications have a lot in
    common. While libraries do the heavy lifting for a specific
    purpose, everything still needs to be glued together. I will talk
    about an a-la-carte glue framework that brings uniformity and
    structure to various types of applications."}

   {:duration "40m" :type "Break" :time "4:00 pm"}

   {:duration       "10m"
    :type           "Lightning talk"
    :time           "4:40 pm"
    :selected-talk? true
    :speakers       [{:name    "Aditya Chowdhry"
                      :link    "https://twitter.com/adityachowdhry9"
                      :picture "images/speakers/aditya.jpg"
                      :bio     "Product engineer at Go-Jek"}]
    :company        "Go-Jek"
    :title          "Afraid of Clojure error stacktraces? Fear no more!"}

   {:duration       "40m"
    :type           "Full talk"
    :time           "4:50 pm"
    :speakers       [{:name    "Anirudh Vyas"
                      :link    "http://twitter.com/Anirudh2403"
                      :picture "images/speakers/anirudh-vyas.jpg"}]
    :company        "Go-Jek"
    :selected-talk? true
    :title          "Evolution of a stream processing framework"
    :abstract       "As we move to an event-driven architecture in
    Gojek, Ziggurat, our stream processing framework written in
    clojure acts as the central platform that enables developers to
    rapidly iterate on and develop applications in a day that solve
    problems ranging from processing payments to geofencing."}

   {:duration "60m" :title "BoF (Birds of Feather) sessions" :time "5:30 pm"}
   {:duration "5m" :title "Ending note (10m)" :time "6:30 pm"}
   {:duration "3h" :title "After party sponsored by Helpshift" :time "7:30 pm"}])
