(ns inclojure-website.data)

(defonce team-list
  [{:name "Aditya Athalye"
    :github "https://github.com/adityaathalye"
    :twitter "http://twitter.com/adityaathalye"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Faditya.png?q=85&expires=1590307416&s=5349387ad517280b6ad64acd77befbaf"}

   {:name "Akshay Gupta"
    :github "https://github.com/kitallis"
    :twitter "http://twitter.com/kitallis"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fkitallis.png?q=85&expires=1590307532&s=0c790f4c99c75150724a4c700a650bdd"}

   {:name "Harsh Gupta"
    :github "https://github.com/hargup"
    :twitter "https://twitter.com/hargup13"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fharsh.png?q=85&expires=1590307572&s=b405a8ee71721f10e23488c1201e09ac"}

   {:name "Kapil Reddy"
    :github "https://github.com/kapilreddy"
    :twitter "https://twitter.com/KapilReddy"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fkapil.png?q=85&expires=1590307604&s=9623a911ccbc7da8cb6647aa312251c3"}

   {:name "Nivedita Priyadarshini"
    :github "https://github.com/nid90"
    :twitter "http://twitter.com/nid90"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fnid.png?q=85&expires=1590307667&s=46be45c1f69eec0f5d695bfc6b6ee3c4"}

   {:name "Ravindra Jaju"
    :github "https://github.com/jaju"
    :twitter "https://twitter.com/jaju"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fjaju.jpg?q=85&expires=1590307688&s=68a849245af4984d67ebc582188fc0f8"}

   {:name "Rubal Jabbal"
    :github "https://github.com/rubalj"
    :twitter "https://twitter.com/rubaljabbal"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Frubal.png?q=85&expires=1590307703&s=53a93ae40b6aea448d5d54367977bf95"}

   {:name "Sandilya Jandhyala"
    :github "https://github.com/jysandy"
    :twitter "http://twitter.com/jysandilya"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fsandy.png?q=85&expires=1590307723&s=66cd2b5381cc1d05492616fd3d98233e"}

   {:name "Srihari Sriraman"
    :github "https://github.com/ssrihari"
    :twitter "http://twitter.com/sriharisriraman"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fsrihari.png?q=85&expires=1590307747&s=0ed88ba43c1e4e33d38726da90109268"}

   {:name "Venkatesh Halli"
    :github "https://github.com/vhalli"
    :twitter "https://twitter.com/venkateshhalli"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fteam%2Fvhalli.png?q=85&expires=1590307769&s=67d0eb9fc0556c9ed0dec34267771d92"}])

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
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fcomittee%2Fmartin.jpeg?q=85&expires=1590308360&s=8a37bcc118c54f17846f9ff789c93804"}

   {:name "Paula Gearon"
    :bio "In her 10th year of Clojure development, Paula is a software engineer
at Cisco Systems who enjoys working in the most technical parts of a system,
building the infrastructure that lets other developers do their jobs.
She has been the technical lead on several commercial and open source projects,
with a focus on data storage and processing, and was a lead editor for the
SPARQL standard for accessing RDF databases. When not coding, she does triathlons,
cooks, helps her children with homework, and mentors and supports young members
of Women Who Code. Originally from Australia, she currently lives with her family
in Virginia, in the USA."
    :twitter "https://twitter.com/quoll"
    :github "https://github.com/quoll"
    :www "https://medium.com/@miffedgirl"
    :alt "paulagearon"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fcomittee%2Fpaula.jpeg?q=85&expires=1590310694&s=543c3c3827568e6dc05fc6b6a10d4cbe"}

   {:name "Tejas Dinkar"
    :bio "A full stack engineer with over 9 years of experience in multiple domains,
Tejas is a software craftsman who enjoys learning new ways to solve problems. Currently,
Tejas loves to play with Clojure, Ruby, GoLang, ReasonML, and Node.js, and he is
the Head of Technology for Quintype, a builder of products for digital media companies."
    :twitter "https://twitter.com/tdinkar"
    :github "https://github.com/gja"
    :www "http://blog.gja.in"
    :alt "tdinkar"
    :avatar "https://inclojure.imgix.net/https%3A%2F%2Finclojure.org%2Fimages%2Fcomittee%2Ftejas.jpeg?q=85&expires=1590310716&s=e41e990c93131170b2303bb994d65fc3"}])

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
  [#_{:duration "30m" :title "Registrations" :time "8:40 am"}
   #_{:duration "10m" :title "Welcome" :time "9:20 am"}
   #_{:duration "60m" :title "BoF (Birds of Feather) sessions" :time "5:30 pm"}
   #_{:duration "5m" :title "Ending note (10m)" :time "6:30 pm"}
   #_{:duration "3h" :title "After party sponsored by Helpshift" :time "7:30 pm"}

   {:duration       "40m"
    :type           "Full talk"
    ;:time           "9:30 am"
    :selected-talk? true
    :speakers       [{:name    "Bozhidar Batsov\n"
                      :link    "https://twitter.com/bbatsov"
                      :picture "images/speakers/bozhidar-batsov.jpg"
                      :bio     "Bozhidar is the maintainer of CIDER, nREPL, a dozen related projects, and the editor of the community Clojure style guide. Most people would probably describe him as an Emacs zealot (and they would be right). He's also quite fond of the Lisp family of languages, functional programming in general and Clojure in particular."}]
    :company        "Toptal"
    :title          "The Future of Clojure Tooling"
    :abstract       "Ah, the future! Such an exciting topic! It’s always a lot of fun to speculate on what will follow next, isn’t it? You know what’s twice as exciting (at least for programmers) - discussing the future of Clojure development tools, those underappreciated workhorses that make our lives hacking with Clojure easier, more fun and more productive.\n\nIn this talk we’ll examine the current state of the broader Clojure tooling ecosystem, contrast the approaches taken by the most popular development tools out there, and try to give you a sense of their strengths and weaknesses. We’ll then skip to a discussions of some interesting efforts to improve the existing tool stack, happening right now in the community, and dream about the day they’ll come to fruition. And the day right after it.\n\nIdeally, when all is set and done you’ll have a much better understanding of how popular Clojure development tools are working, and more appreciation for all the efforts that go into them. Perhaps you’ll even get inspired enough to start contributing to some tools. :-)"}

   {:duration       "40m"
    :type           "Full talk"
    ;:time           "10:20 am"
    :selected-talk? true
    :speakers       [{:name    "Pratik Karki"
                      :link    "https://twitter.com/theawesomekarki"
                      :picture "https://pbs.twimg.com/profile_images/885119064011493377/UAGBtWCG_400x400.jpg"
                      :bio     "Hello, I’m Pratik Karki. I’m a programmer, a lifelong learner, Light Table maintainer, open-source contributor and GSoC‘18 student. I love to pop the hood of software and look inside, move a few things and close the hood,(80% of the time, I mess something up.) I’m a polyglot programmer(IOW: Jack of all trades). I love to talk about concurrency, optimizations, language design, editors and algorithms. I work as a Software Engineer at Leapfrog Technology Inc., Nepal. When I’m not programming, I read a lot, to be a better programmer and my favorite super-hero is Ken Thompson. BTW, I ❤ Clojure!\n\n"}]
    :company        "Leapfrog Technology Inc., Nepal"
    :title          "Light Table: The strange and wonderful saga of a pure Clojure editor."
    :abstract       "On a beautiful spring day in 2012, Chris Granger showed a new concept of an IDE which was simple like an editor but, was full-fledged like IDE. This was way before VSCode and Atom, it showed what Clojure/Script can do with less code and was a preferred editor for people coming to Clojure/Script ecosystem for many years. Now, the time has changed and Chris left the project and so did, other core developers who shaped Light Table-the killer Clojure App. Now, years have gone by, without significant improvement in Light Table, so, yours truly volunteered to revive Light Table. Light Table introduced some awesome ideas of BOT architecture(Behavior, Objects, Tag). Getting Clojure book has also used its code for example in its “State” Chapter. The different ideas of adding plugins, docs embedded into the editor, eval feature inside the editor is cool and the code that powers it is in pure Clojure/script. And, this being written in the early days of ClojureScript i.e. before ClojureScript hit version 1.x.x, we can compare the ClojureScript as of today and can understand design changes it took from its early days. This talk will then, describe issues having tightly coupled a lot of functionalities with external libraries. Additionally, I would discuss using much better design to re-write Light Table, design inspired by a new-gen editor like Xi editor and the concepts behind toolings from clojure-emacs.\nLastly, I would like to give a demo and release a new Light Table based on new architectures mentioned earlier but, built on the foundation it stood on."}

   {:duration       "40m"
    :type           "Full talk"
    ;:time           "10:20 am"
    :selected-talk? true
    :speakers       [{:name    "Mayur Jadhav"
                      :link    "https://twitter.com/mayurJ13"
                      :picture "https://pbs.twimg.com/profile_images/477076895716999169/leMTFwOa_400x400.jpeg"
                      :bio     "Hi, I am co-founder of Dataorc, a Data oriented startup based out of Pune. I started my professional journey with Clojure at my previous company Helpshift and have been coding in same for last 6 years. Even at Dataorc, almost every project have some part developed in Clojure. I have used Clojure for architecting automation frameworks, building super scalable backends, distributed crawlers, munching TBs of data with it."}]
    :company        "Dataorc"
    :title          "Building data platforms from business stores using Clojur"
    :abstract       "You have just bootstrapped and is catering thousands(or maybe millions) of happy users. Like most good applications, tech stack starts with a battle-tested RDBMS/NoSQL crud operations. Then, you start looking into user behavior, user’s interaction with the system to provide a customized experience or to deliver the next set of cool features. The ideal way to achieve such analysis is by sending custom events that can derive required metrics. Another hassle free approach is to capture change data of existing databases as an event stream. In this session, I will discuss the latter approach, it’s benefits and kind of use cases we solved with the power of Clojure. Clojure is a core part this architecture which handles spawning/destroying on-demand EMR clusters independent of cloud providers, DAG execution of EMR jobs, etc. Clojure REPL helped to speed up our development by reducing the time required to write and validate adhoc EMR queries."}

   {:duration       "40m"
    :type           "Full talk"
    ;:time           "10:20 am"
    :selected-talk? true
    :speakers       [{:name    "Adam Helinski"
                      :link    "https://twitter.com/dvlopt"
                      :picture "https://pbs.twimg.com/profile_images/1217504173312421888/a85RMokD_400x400.jpg"
                      :bio     "Former illusionist, a bit of a pianist, now a psychologist. Also a hammock philosopher and tamer of electrons. After studying neuroscience, Adam Helinski became a full-time parens whisperer in the kingdom of IoT where his slight sense of scientific madness lead him to the unique choice of using Clojure for prototyping connected devices. After those few years of exile away from psychology, he now expertiments with using Clojure in psychotherapy.\n\n"}]
    :company        ""
    :title          "Clojure of Things"
    :abstract       "You have just bootstrapped and is catering thousands(or maybe millions) of happy users. Like most good applications, tech stack starts with a battle-tested RDBMS/NoSQL crud operations. Then, you start looking into user behavior, user’s interaction with the system to provide a customized experience or to deliver the next set of cool features. The ideal way to achieve such analysis is by sending custom events that can derive required metrics. Another hassle free approach is to capture change data of existing databases as an event stream. In this session, I will discuss the latter approach, it’s benefits and kind of use cases we solved with the power of Clojure. Clojure is a core part this architecture which handles spawning/destroying on-demand EMR clusters independent of cloud providers, DAG execution of EMR jobs, etc. Clojure REPL helped to speed up our development by reducing the time required to write and validate adhoc EMR queries."}

])
