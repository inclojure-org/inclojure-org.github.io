(ns inclojure-website.talks)

(def selected-talks
  [{:duration "30m" :title "Registrations" :time "8:40 am"}
   {:duration "10m" :title "Welcome" :time "9:20 am"}

   {:duration "40m"
    :type     "Keynote"
    :time     "9:30 am"
    :speakers  [{:name "Eric Normand"
                 :link "https://twitter.com/ericnormand"}]
    :company  "Lispcast"
    :title    "TBD"}

   {:duration "40m"
    :type     "Full talk"
    :time     "10:20 am"
    :speakers  [{:name "Abhinav Sarkar"
                 :link "http://twitter.com/abhin4v"}]
    :company  "Flipkart"
    :title    "Introduction to Concurrency"
    :abstract "Clojue is widely known as a functional programming language. But it has a great support for a wide variety of concurrency models too. We’ll explore the various concurrency models and primitives supported by Clojure including threads, agents, STM and core.async goroutines and channels."}

   {:duration "30m" :type "Tea Break" :time "11:00 am" }

   {:duration "10m" :type "Lightning talk" :time "11:30 am"}

   {:duration "20m"
    :type     "Crisp talk"
    :time     "11:45 am"
    :speakers  [{:name "Rubal Jabbal"
                 :link "https://in.linkedin.com/in/rubal-jabbal-4ba8b99a"}
                {:name "Pavitra Shetty"
                 :link "https://www.linkedin.com/in/pavitra-shetty-22877418"}],
    :company  "Helpshift"
    :title    "Using components in production"
    :abstract "In this talk we introduce the problems faced in our current architecture [read - giant monolith architecture] The issues with multiple dependencies for a project and problems faced when there is no clear boundary."}

   {:duration "40m"
    :type     "Full talk"
    :time     "12:10 am"
    :speakers  [{:name "Martin Klepsch"
                 :link "http://twitter.com/martinklepsch"}]
    :title    "Cljdoc — Better documentation tooling for the Clojure/Script ecosystem"
    :company  "cljdoc"
    :abstract "Documentation is a key part of working with open source libraries. Good documentation makes programmers more productive. It’s what makes simple things easy. In this talk we will discuss cljdoc, a website that provides API docs and more advanced documentation tooling for the Clojure community."}

   {:duration "20m"
    :type     "Crisp talk"
    :time     "1:00 pm"
    :speakers  [{:name "Mourjo Sen"
                 :link "http://twitter.com/mourjo_sen"}]
    :company  "Helpshift"
    :title    "Writing a fair task execution framework"
    :abstract "How to ensure that in a multi-tenant business on the same infrastructure, one big customer will not bottleneck every single maintenance task you have to perform on all customers’ data? With the help of Clojure’s concurrency and core.async, the answer to this question was intuitive and effective."}

   {:duration "1h 20m" :type "Lunch" :time "1:20 pm"}

   {:duration "10m" :type "Lightning talk" :time "2:40 pm"}
   {:duration "10m" :type "Lightning talk" :time "2:50 pm"}

   {:duration "20m"
    :type     "Crisp talk"
    :time     "3:10 pm"
    :speakers  [{:name "Neha Mishra"
                 :link "https://in.linkedin.com/in/neha-mishra-563674ab"}]
    :company  "Helpshift"
    :title    "Chanakya: Building composable logical rules"
    :abstract "We will discuss our in-house lightweight rule engine library. The talk will demonstrate a generic library for building and executing a complex rule by composing simple logical filters."}

   {:duration "40m"
    :type     "Full talk"
    :time     "3:40 pm"
    :speakers  [{:name "Shantanu Kumar"
                 :link "http://twitter.com/kumarshantanu"}]
    :company  "Concur"
    :title    "Bract: A minimal DRY app framework"
    :abstract "Most Clojure applications have a lot in common. While libraries do the heavy lifting for a specific purpose, everything still needs to be glued together. I will talk about an a-la-carte glue framework that brings uniformity and structure to various types of applications."}

   {:duration "30m" :type "Break" :time "4:20 pm"}

   {:duration "10m" :type "Lightning talk" :time "4:50 pm"}

   {:duration "40m"
    :type     "Full talk"
    :time     "5:00 pm"
    :speakers  [{:name "Anirudh Vyas"
                 :link "http://twitter.com/Anirudh2403"}]
    :company  "Go-Jek"
    :title    "Evolution of a stream processing framework"
    :abstract "As we move to an event-driven architecture in Gojek, Ziggurat, our stream processing framework written in clojure acts as the central platform that enables developers to rapidly iterate on and develop applications in a day that solve problems ranging from processing payments to geofencing."}

   {:duration "10m" :type "Lightning talk" :time "5:40 pm"}
   {:duration "40m" :title "Panel" :time "5:50 pm"}
   {:duration "5m" :title "Ending note" :time "6:30 pm"}])
