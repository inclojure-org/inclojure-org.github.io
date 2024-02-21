(ns inclojure-website.data)

(defonce conf "IN/Clojure")
(defonce conf-with-year "IN/Clojure 2024")
(defonce email "2024@inclojure.org")

(defonce team-list
  [{:name "Alisha Mohanty"
    :github "https://github.com/alishamohanty"
    :avatar "images/team/alisha.webp"}

   {:name "Akshatha Herle"
    :github "https://github.com/qptr"
    :avatar "images/team/akshatha.webp"}

   {:name "Atharva Raykar"
    :github "https://github.com/tfidfwastaken"
    :twitter "https://twitter.com/AtharvaRaykar"
    :avatar "images/team/atharva.webp"}

   {:name "Deepa Venkatraman"
    :twitter "https://twitter.com/deepa_v"
    :avatar "images/team/deepa.jpg"}

   {:name "Kapil Reddy"
    :github "https://github.com/kapilreddy"
    :twitter "https://twitter.com/KapilReddy"
    :avatar "images/team/kapil.png"}

   {:name "Mitesh Shah"
    :github "https://github.com/oxalorg"
    :twitter "https://twitter.com/oxalorg"
    :avatar "images/team/mitesh.png"}

   {:name "Priyanga P Kini"
    :github "https://github.com/PriyangaPKini"
    :avatar "images/team/kini.jpg"}

   {:name "Ravi Chandra Padmala"
    :github "https://github.com/neenaoffline"
    :twitter "https://twitter.com/neenaoffline"
    :avatar "images/team/neena.webp"}

   {:name "Ravindra Jaju"
    :github "https://github.com/jaju"
    :twitter "https://twitter.com/jaju"
    :avatar "images/team/jaju.jpg"}

   {:name "Somya Maithani"
    :github "https://github.com/msomya"
    :avatar "images/team/somya.png"}

   {:name "Vikram Chintalapati"
    :github "https://github.com/vkrmis"
    :twitter "https://twitter.com/cvikram"
    :avatar "images/team/vkrm.png"}])

(defonce talk-selectors
  [{:name "Carin Meier"
    :alt "gigasquid"
    :github "https://github.com/gigasquid"
    :twitter "https://twitter.com/gigasquid"
    :www "http://gigasquidsoftware.com/"
    :avatar "images/committee/carin.jpeg"
    :bio "Carin Meier spends her time at the intersection of Clojure, Data, and AI.
She works at OneStudyTeam as Director of Data Engineering, is the author of the
O’Reilly book, “Living Clojure”, and PMC member of Apache MxNet."}
   {:name "Nivedita Priyadarshini"
    :alt "nid"
    :github "https://github.com/nid90"
    :twitter "https://twitter.com/nid90"
    :www ""
    :avatar "images/committee/nid.jpeg"
    :bio (list "Nivedita (nid) is a software developer living in Bangalore, India. She
started working with Clojure in 2013 and has been writing production and hobby projects
in Clojure ever since. For most of the last decade, she worked at and ran a software
cooperative called nilenso. Currently, she is building "
               [:a {:href "https://github.com/tramlinehq/tramline" :style {:border-width "1px"}} "Tramline."])}
   {:name "Shantanu Kumar"
    :github "https://github.com/kumarshantanu"
    :twitter "https://twitter.com/kumarshantanu"
    :www "https://kumarshantanu.github.io"
    :avatar "images/committee/shantanu.jpeg"
    :bio "Shantanu Kumar has extensive production experience in Clojure, Java,
distributed systems, databases and fault-tolerant scalable systems. He is the
author of “Clojure High Performance Programming” and organiser of the
Bangalore-Clojure meetup group."}])

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

(defonce talks
  {:rooms
   [{:bgcolor "990000",
     :description
     "<p>Venue for the single-track day of talks.</p>",
     :json_url nil,
     :name
     "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
     :title
     "Crimson Hall (Day of talks at Novotel hotel)",
     :url nil,
     :venue
     "novotel-pune-nagar-road-crimson-hall"}
    {:bgcolor "D04B36",
     :description
     "<p>Introductory To Clojure workshop on the 5<sup>th</sup> Floor.</p>",
     :json_url nil,
     :name
     "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
     :title
     "Classroom 1 (Workshop at MCCIA Trade Tower)",
     :url nil,
     :venue "mccia-trade-tower-icc-complex"}
    {:bgcolor "675997",
     :description
     "<p>Intermediate Clojure workshop on the 5<sup>th</sup> Floor</p>",
     :json_url nil,
     :name
     "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
     :title
     "Classroom 2 (Workshop at MCCIA Trade Tower)",
     :url nil,
     :venue "mccia-trade-tower-icc-complex"}],
   :schedule
   [{:date "2020-02-14",
     :end_at "2020-02-14T18:00:00+05:30",
     :slots
     [{:sessions
       [{:description
         {:html
          "<p>Please be on time. Avoid rush traffic!</p>",
          :text
          "Please be on time. Avoid rush traffic!"},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T09:30:00+05:30",
         :end_at "2020-02-14T10:00:00+05:30",
         :feedback_url nil,
         :title "Registration",
         :is_break false,
         :id 1,
         :json_url nil,
         :url_name_suuid
         "registration-JMHWL7BDM9H5PXb56FbXHH",
         :url_name "1-registration",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/registration-JMHWL7BDM9H5PXb56FbXHH",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T09:30:00+05:30",
         :end_at "2020-02-14T10:00:00+05:30",
         :feedback_url nil,
         :title "Registration",
         :is_break false,
         :id 11,
         :json_url nil,
         :url_name_suuid
         "registration-bvLkTKiZegRMbHfo6RM9SU",
         :url_name "11-registration",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/registration-bvLkTKiZegRMbHfo6RM9SU",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}
        {:description
         {:html
          "<p>14<sup>th</sup> Feb is workshop day, and the workshops are going to happen at MCCIA, Senapati Road, Pune.</p>\n<p>The Novotel venue (Crimson) will see talks happen on the 15<sup>th</sup> of Feb. Submit yours now! <a href=\"https://hasgeek.com/inclojure/2020/proposals#call-for-proposal\" rel=\"nofollow\">https://hasgeek.com/inclojure/2020/proposals#call-for-proposal</a></p>",
          :text
          "14th Feb is workshop day, and the workshops are going to happen at MCCIA, Senapati Road, Pune.\r\n\r\nThe Novotel venue (Crimson) will see talks happen on the 15th of Feb. Submit yours now! https://hasgeek.com/inclojure/2020/proposals#call-for-proposal"},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T09:30:00+05:30",
         :end_at "2020-02-14T18:00:00+05:30",
         :feedback_url nil,
         :title
         "This venue will host talks on the 15th.",
         :is_break true,
         :id 40,
         :json_url nil,
         :url_name_suuid
         "talks-will-happen-on-the-15th-at-novotel-cfp-is-open-https-hasgeek-com-inclojure-2020-proposals-call-for-proposal-Qbqq6iuVoKwBL7hGKFpYWB",
         :url_name
         "40-talks-will-happen-on-the-15th-at-novotel-cfp-is-open-https-hasgeek-com-inclojure-2020-proposals-call-for-proposal",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/talks-will-happen-on-the-15th-at-novotel-cfp-is-open-https-hasgeek-com-inclojure-2020-proposals-call-for-proposal-Qbqq6iuVoKwBL7hGKFpYWB",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "09:30"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T10:00:00+05:30",
         :end_at "2020-02-14T10:30:00+05:30",
         :feedback_url nil,
         :title
         "IDE/repo setup troubleshooting and Introductions",
         :is_break false,
         :id 12,
         :json_url nil,
         :url_name_suuid
         "ide-repo-setup-troubleshooting-and-introductions-CFukZJvNXqEkgjbwRjmuY2",
         :url_name
         "12-ide-repo-setup-troubleshooting-and-introductions",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/ide-repo-setup-troubleshooting-and-introductions-CFukZJvNXqEkgjbwRjmuY2",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T10:00:00+05:30",
         :end_at "2020-02-14T10:30:00+05:30",
         :feedback_url nil,
         :title
         "IDE / repo setup troubleshooting and Introductions",
         :is_break false,
         :id 2,
         :json_url nil,
         :url_name_suuid
         "ide-repo-setup-troubleshooting-and-introductions-NeiwcVrurf7RioAkmVPXqH",
         :url_name
         "2-ide-repo-setup-troubleshooting-and-introductions",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/ide-repo-setup-troubleshooting-and-introductions-NeiwcVrurf7RioAkmVPXqH",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}],
       :slot "10:00"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T10:30:00+05:30",
         :end_at "2020-02-14T11:30:00+05:30",
         :feedback_url nil,
         :title
         "Clojure's approach to state and identity",
         :is_break false,
         :id 13,
         :json_url nil,
         :url_name_suuid
         "clojures-approach-to-state-and-identity-K5TcPtDK6HMnc9sGT7VTBg",
         :url_name
         "13-clojures-approach-to-state-and-identity",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/clojures-approach-to-state-and-identity-K5TcPtDK6HMnc9sGT7VTBg",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T10:30:00+05:30",
         :end_at "2020-02-14T11:30:00+05:30",
         :feedback_url nil,
         :title
         "Basic concepts + warm-up exercises",
         :is_break false,
         :id 3,
         :json_url nil,
         :url_name_suuid
         "basic-concepts-and-simple-warm-up-exercises-E8LoTuZ83y2Z7eXgdDwKPB",
         :url_name
         "3-basic-concepts-and-simple-warm-up-exercises",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/basic-concepts-and-simple-warm-up-exercises-E8LoTuZ83y2Z7eXgdDwKPB",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}],
       :slot "10:30"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T11:30:00+05:30",
         :end_at "2020-02-14T11:45:00+05:30",
         :feedback_url nil,
         :title "Tea / Coffee",
         :is_break true,
         :id 4,
         :json_url nil,
         :url_name_suuid
         "tea-coffee-S9uqBAXZepU75KGEgVu2QJ",
         :url_name "4-tea-coffee",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/tea-coffee-S9uqBAXZepU75KGEgVu2QJ",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T11:30:00+05:30",
         :end_at "2020-02-14T11:45:00+05:30",
         :feedback_url nil,
         :title "Tea / Coffee",
         :is_break true,
         :id 19,
         :json_url nil,
         :url_name_suuid
         "tea-coffee-9xJGy5Jnmx6Dw3kjFEcGwf",
         :url_name "19-tea-coffee",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/tea-coffee-9xJGy5Jnmx6Dw3kjFEcGwf",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}],
       :slot "11:30"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T11:45:00+05:30",
         :end_at "2020-02-14T13:15:00+05:30",
         :feedback_url nil,
         :title "Working with functions",
         :is_break false,
         :id 5,
         :json_url nil,
         :url_name_suuid
         "working-with-functions-ZxFL9d5MScXhMZg3LPFax3",
         :url_name "5-working-with-functions",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/working-with-functions-ZxFL9d5MScXhMZg3LPFax3",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T11:45:00+05:30",
         :end_at "2020-02-14T13:15:00+05:30",
         :feedback_url nil,
         :title
         "Java interop and the Clojure ecosystem",
         :is_break false,
         :id 15,
         :json_url nil,
         :url_name_suuid
         "java-interop-and-the-clojure-ecosystem-Cz8YVbfuS46ceo2jvxrk4o",
         :url_name
         "15-java-interop-and-the-clojure-ecosystem",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/java-interop-and-the-clojure-ecosystem-Cz8YVbfuS46ceo2jvxrk4o",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}],
       :slot "11:45"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T13:15:00+05:30",
         :end_at "2020-02-14T14:00:00+05:30",
         :feedback_url nil,
         :title "Lunch Break",
         :is_break true,
         :id 6,
         :json_url nil,
         :url_name_suuid
         "lunch-break-v6Y4aJffCTKEAXHzMPFAXA",
         :url_name "6-lunch-break",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/lunch-break-v6Y4aJffCTKEAXHzMPFAXA",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T13:15:00+05:30",
         :end_at "2020-02-14T14:00:00+05:30",
         :feedback_url nil,
         :title "Lunch Break",
         :is_break true,
         :id 20,
         :json_url nil,
         :url_name_suuid
         "lunch-break-8GJg8Xnb3Q9e45DNLKPX6o",
         :url_name "20-lunch-break",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/lunch-break-8GJg8Xnb3Q9e45DNLKPX6o",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}],
       :slot "13:15"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T14:00:00+05:30",
         :end_at "2020-02-14T16:00:00+05:30",
         :feedback_url nil,
         :title
         "More work with functions and with collections",
         :is_break false,
         :id 7,
         :json_url nil,
         :url_name_suuid
         "more-work-with-functions-and-with-collections-u52gDjySycVLdJq887FbB6",
         :url_name
         "7-more-work-with-functions-and-with-collections",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/more-work-with-functions-and-with-collections-u52gDjySycVLdJq887FbB6",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T14:00:00+05:30",
         :end_at "2020-02-14T16:00:00+05:30",
         :feedback_url nil,
         :title
         "Effective Testing, Debugging, and REPL-driven-development",
         :is_break false,
         :id 16,
         :json_url nil,
         :url_name_suuid
         "effective-testing-debugging-and-repl-driven-development-uXxUtd9MPasFwht6EBCSEC",
         :url_name
         "16-effective-testing-debugging-and-repl-driven-development",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/effective-testing-debugging-and-repl-driven-development-uXxUtd9MPasFwht6EBCSEC",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}],
       :slot "14:00"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T16:00:00+05:30",
         :end_at "2020-02-14T16:15:00+05:30",
         :feedback_url nil,
         :title "Tea / Coffee",
         :is_break true,
         :id 21,
         :json_url nil,
         :url_name_suuid
         "tea-coffee-zReBeRwxW9E8DLZVRCB8cg",
         :url_name "21-tea-coffee",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/tea-coffee-zReBeRwxW9E8DLZVRCB8cg",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T16:00:00+05:30",
         :end_at "2020-02-14T16:15:00+05:30",
         :feedback_url nil,
         :title "Tea / Coffee",
         :is_break true,
         :id 8,
         :json_url nil,
         :url_name_suuid
         "tea-coffee-p7s6Xy8onpjT3eDZYScue5",
         :url_name "8-tea-coffee",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/tea-coffee-p7s6Xy8onpjT3eDZYScue5",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}],
       :slot "16:00"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T16:15:00+05:30",
         :end_at "2020-02-14T17:45:00+05:30",
         :feedback_url nil,
         :title
         "Advanced work with functions, collections, and function API design",
         :is_break false,
         :id 9,
         :json_url nil,
         :url_name_suuid
         "advanced-work-with-functions-collections-and-function-api-design-Hj9qgXjwkD8VpiHputRvkh",
         :url_name
         "9-advanced-work-with-functions-collections-and-function-api-design",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/advanced-work-with-functions-collections-and-function-api-design-Hj9qgXjwkD8VpiHputRvkh",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T16:15:00+05:30",
         :end_at "2020-02-14T17:45:00+05:30",
         :feedback_url nil,
         :title
         "Laziness & Vars (Benefits & pitfalls)",
         :is_break false,
         :id 17,
         :json_url nil,
         :url_name_suuid
         "laziness-vars-benefits-pitfalls-SEtV2dBtkURcPK8VTv5C9P",
         :url_name
         "17-laziness-vars-benefits-pitfalls",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/laziness-vars-benefits-pitfalls-SEtV2dBtkURcPK8VTv5C9P",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}],
       :slot "16:15"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T17:45:00+05:30",
         :end_at "2020-02-14T18:00:00+05:30",
         :feedback_url nil,
         :title
         "Wrap up, closing remarks, Ask Us Anything!",
         :is_break false,
         :id 18,
         :json_url nil,
         :url_name_suuid
         "wrap-up-closing-remarks-ask-us-anything-dcuCBePs4hjPjmWzBzVvCn",
         :url_name
         "18-wrap-up-closing-remarks-ask-us-anything",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/wrap-up-closing-remarks-ask-us-anything-dcuCBePs4hjPjmWzBzVvCn",
         :room
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower"}
        {:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-14T17:45:00+05:30",
         :end_at "2020-02-14T18:00:00+05:30",
         :feedback_url nil,
         :title
         "Wrap up, closing remarks, Ask Us Anything!",
         :is_break false,
         :id 10,
         :json_url nil,
         :url_name_suuid
         "wrap-up-closing-remarks-ask-us-anything-duKmtkxewZjVuPAZ3twUaJ",
         :url_name
         "10-wrap-up-closing-remarks-ask-us-anything",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/wrap-up-closing-remarks-ask-us-anything-duKmtkxewZjVuPAZ3twUaJ",
         :room
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower"}],
       :slot "17:45"}],
     :start_at "2020-02-14T09:30:00+05:30"}
    {:date "2020-02-15",
     :end_at "2020-02-15T18:00:00+05:30",
     :slots
     [{:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-15T08:45:00+05:30",
         :end_at "2020-02-15T09:15:00+05:30",
         :feedback_url nil,
         :title "Registrations",
         :is_break false,
         :id 22,
         :json_url nil,
         :url_name_suuid
         "registrations-Une5ZD2tt2ZTR4HxeYDNFk",
         :url_name "22-registrations",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/registrations-Une5ZD2tt2ZTR4HxeYDNFk",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "08:45"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-15T09:15:00+05:30",
         :end_at "2020-02-15T09:25:00+05:30",
         :feedback_url nil,
         :title
         "Welcome remarks and Introductions",
         :is_break false,
         :id 23,
         :json_url nil,
         :url_name_suuid
         "welcome-remarks-and-introductions-LdfWu5kzQgsj5Aj5mcCRHn",
         :url_name
         "23-welcome-remarks-and-introductions",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/welcome-remarks-and-introductions-LdfWu5kzQgsj5Aj5mcCRHn",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "09:15"}
      {:sessions
       [{:description
         {:html
          "<p><strong>Abstract</strong></p>\n<p>Ah, the future! Such an exciting topic! It’s always a lot of fun to speculate on what will follow next, isn’t it? You know what’s twice as exciting (at least for programmers) - discussing the future of Clojure development tools, those underappreciated workhorses that make our lives hacking with Clojure easier, more fun and more productive.</p>\n<p>In this talk we’ll examine the current state of the broader Clojure tooling ecosystem, contrast the approaches taken by the most popular development tools out there, and try to give you a sense of their strengths and weaknesses. We’ll then skip to a discussions of some interesting efforts to improve the existing tool stack, happening right now in the community, and dream about the day they’ll come to fruition. And the day right after it.</p>\n<p>Ideally, when all is set and done you’ll have a much better understanding of how popular Clojure development tools are working, and more appreciation for all the efforts that go into them. Perhaps you’ll even get inspired enough to start contributing to some tools. :-)</p>\n<p><strong>Outline</strong></p>\n<p>The spiritual successor to a long line of past talks on CIDER, nREPL, Documentation, and other aspects of Clojure tooling such as:</p>\n<ul>\n<li><a href=\"https://www.youtube.com/watch?v=EU0ScGwKbYI\" rel=\"nofollow\">CIDER Distilled: A Common Foundation for Clojure Tooling | Clojure South 2019</a></li>\n<li><a href=\"https://www.youtube.com/watch?v=WTzzUSw6iaI\" rel=\"nofollow\">nREPL Redux | Dutch Clojure Days 2019</a></li>\n<li><a href=\"https://www.youtube.com/watch?v=nrpsMB2gYI0\" rel=\"nofollow\">Towards Awesome Clojure Documentation | ClojuTRE 2017</a></li>\n<li><a href=\"https://www.youtube.com/watch?v=8wLwbpCxRf0\" rel=\"nofollow\">CIDER Inside the Brewery | Clojure/West 2016</a></li>\n<li><a href=\"https://www.youtube.com/watch?v=4X-1fJm25Ww\" rel=\"nofollow\">The Evolution of the Emacs Tooling for Clojure | Clojure/Conj 2014</a></li>\n</ul>",
          :text
          "**Abstract**\r\n\r\nAh, the future! Such an exciting topic! It’s always a lot of fun to speculate on what will follow next, isn’t it? You know what’s twice as exciting (at least for programmers) - discussing the future of Clojure development tools, those underappreciated workhorses that make our lives hacking with Clojure easier, more fun and more productive.\r\n\r\nIn this talk we’ll examine the current state of the broader Clojure tooling ecosystem, contrast the approaches taken by the most popular development tools out there, and try to give you a sense of their strengths and weaknesses. We’ll then skip to a discussions of some interesting efforts to improve the existing tool stack, happening right now in the community, and dream about the day they’ll come to fruition. And the day right after it.\r\n\r\nIdeally, when all is set and done you’ll have a much better understanding of how popular Clojure development tools are working, and more appreciation for all the efforts that go into them. Perhaps you’ll even get inspired enough to start contributing to some tools. :-)\r\n\r\n**Outline**\r\n\r\nThe spiritual successor to a long line of past talks on CIDER, nREPL, Documentation, and other aspects of Clojure tooling such as:\r\n\r\n  - [CIDER Distilled: A Common Foundation for Clojure Tooling | Clojure South 2019](https://www.youtube.com/watch?v=EU0ScGwKbYI)\r\n  - [nREPL Redux | Dutch Clojure Days 2019](https://www.youtube.com/watch?v=WTzzUSw6iaI)\r\n  - [Towards Awesome Clojure Documentation | ClojuTRE 2017](https://www.youtube.com/watch?v=nrpsMB2gYI0)\r\n  - [CIDER Inside the Brewery | Clojure/West 2016](https://www.youtube.com/watch?v=8wLwbpCxRf0)\r\n  - [The Evolution of the Emacs Tooling for Clojure | Clojure/Conj 2014](https://www.youtube.com/watch?v=4X-1fJm25Ww)"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/the-future-of-clojure-tooling-BbK6Gbk2Ak7HAVgEyNgDsY",
         :start_at "2020-02-15T09:25:00+05:30",
         :end_at "2020-02-15T10:15:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/the-future-of-clojure-tooling-45QekCdxauiFtrjMvsD49k/feedback",
         :title
         "Opening Keynote: The Future of Clojure Tooling",
         :is_break false,
         :id 43,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/the-future-of-clojure-tooling-BbK6Gbk2Ak7HAVgEyNgDsY/json",
         :url_name_suuid
         "the-future-of-clojure-tooling-45QekCdxauiFtrjMvsD49k",
         :url_name
         "43-the-future-of-clojure-tooling",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/the-future-of-clojure-tooling-45QekCdxauiFtrjMvsD49k",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "BbK6Gbk2Ak7HAVgEyNgDsY",
         :proposal_id 5245,
         :speaker "Bozhidar Batsov",
         :speaker_bio
         {:html
          "<p>Bozhidar is the maintainer of CIDER, nREPL, a dozen related projects, and the editor of the community Clojure style guide. Most people would probably describe him as an Emacs zealot (and they would be right). He’s also quite fond of the Lisp family of languages, functional programming in general and Clojure in particular.</p>",
          :text
          "Bozhidar is the maintainer of CIDER, nREPL, a dozen related projects, and the editor of the community Clojure style guide. Most people would probably describe him as an Emacs zealot (and they would be right). He’s also quite fond of the Lisp family of languages, functional programming in general and Clojure in particular."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "09:25"}
      {:sessions
       [{:description
         {:html
          "<ul>\n<li>Introduction</li>\n<li>Use cases</li>\n<li>Building OLAP on top of RDBMS</li>\n<li>Hyper scalable function triggering platform(alternative to RDBMS triggers but scalable)</li>\n<li>Cheaper Point in time backups</li>\n<li>Data replication across multi-variety of databases or across multi versions</li>\n<li>Architecture</li>\n<li>Independent building blocks which include: <ul>\n<li>Log Reader</li>\n<li>Distributed Queue System (For eg Apache Kafka)</li>\n<li>Cloud Storage</li>\n<li>Query services</li>\n<li>Visualization tools</li>\n</ul>\n</li>\n<li>Benefits</li>\n<li>Components Synchronisation</li>\n<li>Power of Clojure</li>\n<li>Writing EMR jobs</li>\n<li>Spawning and destroying Hadoop cluster on-demand</li>\n<li>Support for AWS, GCP</li>\n<li>By-default auto-scaling supported</li>\n<li>DAG Execution</li>\n<li>Development with REPL</li>\n<li>Integration with Spark, Hive, Pig</li>\n<li>Obstacles and Learnings</li>\n<li>Low-cost Scalable platform</li>\n<li>Conclusion</li>\n<li>Demo showing for any operations in DB</li>\n<li>Kafka being populated</li>\n<li>S3 dumps</li>\n<li>Lambda function being triggered</li>\n</ul>\n<p>NOTE: Slides WIP</p>",
          :text
          "* Introduction\r\n* Use cases\r\n  * Building OLAP on top of RDBMS\r\n  * Hyper scalable function triggering platform(alternative to RDBMS triggers but scalable)\r\n  * Cheaper Point in time backups\r\n  * Data replication across multi-variety of databases or across multi versions\r\n* Architecture\r\n  * Independent building blocks which include: \r\n    * Log Reader\r\n    * Distributed Queue System (For eg Apache Kafka)\r\n    * Cloud Storage\r\n    * Query services\r\n    * Visualization tools\r\n  * Benefits\r\n  * Components Synchronisation\r\n* Power of Clojure\r\n  * Writing EMR jobs\r\n  * Spawning and destroying Hadoop cluster on-demand\r\n  * Support for AWS, GCP\r\n  * By-default auto-scaling supported\r\n  * DAG Execution\r\n  * Development with REPL\r\n  * Integration with Spark, Hive, Pig\r\n* Obstacles and Learnings\r\n* Low-cost Scalable platform\r\n* Conclusion\r\n* Demo showing for any operations in DB\r\n  * Kafka being populated\r\n  * S3 dumps\r\n  * Lambda function being triggered\r\n\r\n\r\n\r\nNOTE: Slides WIP"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/building-data-platforms-from-business-stores-using-LoRgCMiZxc8kbyAbKkUKGg",
         :start_at "2020-02-15T10:15:00+05:30",
         :end_at "2020-02-15T11:00:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/building-data-platforms-from-business-stores-using-clojure-LFmfWxY9ZiEdtsCK6vJ2gJ/feedback",
         :title
         "Building  data platforms from business stores using Clojure",
         :is_break false,
         :id 38,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/building-data-platforms-from-business-stores-using-LoRgCMiZxc8kbyAbKkUKGg/json",
         :url_name_suuid
         "building-data-platforms-from-business-stores-using-clojure-LFmfWxY9ZiEdtsCK6vJ2gJ",
         :url_name
         "38-building-data-platforms-from-business-stores-using-clojure",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/building-data-platforms-from-business-stores-using-clojure-LFmfWxY9ZiEdtsCK6vJ2gJ",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "LoRgCMiZxc8kbyAbKkUKGg",
         :proposal_id 5221,
         :speaker "Mayur Jadhav",
         :speaker_bio
         {:html
          "<p>Hi, I am co-founder of <a href=\"https://dataorc.in\" rel=\"nofollow\">Dataorc</a>, a Data oriented startup based out of Pune. I started my professional journey with Clojure at my previous company Helpshift and have been coding in same for last 6 years. Even at Dataorc, almost every project have some part developed in Clojure. I have used Clojure for architecting <a href=\"https://www.youtube.com/watch?v=G-fjpO6nYPQ\" rel=\"nofollow\">automation frameworks</a>, building super scalable backends, <a href=\"https://github.com/mj-jadhav/twitter-crawler\" rel=\"nofollow\">distributed crawlers</a>, munching TBs of data with it.</p>",
          :text
          "Hi, I am co-founder of [Dataorc](https://dataorc.in), a Data oriented startup based out of Pune. I started my professional journey with Clojure at my previous company Helpshift and have been coding in same for last 6 years. Even at Dataorc, almost every project have some part developed in Clojure. I have used Clojure for architecting [automation frameworks](https://www.youtube.com/watch?v=G-fjpO6nYPQ), building super scalable backends, [distributed crawlers](https://github.com/mj-jadhav/twitter-crawler), munching TBs of data with it."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "10:15"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-15T11:00:00+05:30",
         :end_at "2020-02-15T11:30:00+05:30",
         :feedback_url nil,
         :title "Tea / Coffee",
         :is_break true,
         :id 26,
         :json_url nil,
         :url_name_suuid
         "tea-coffee-yeRB7DBGfjzAcDaV22Vc4P",
         :url_name "26-tea-coffee",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/tea-coffee-yeRB7DBGfjzAcDaV22Vc4P",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "11:00"}
      {:sessions
       [{:description
         {:html
          "<ul>\n<li>Introduction</li>\n<li>Context - numberz &amp; what it does </li>\n<li>Business problem</li>\n<li>Iterations - improving the solution <ul>\n<li>Naive implementation using threading macros and core.async</li>\n<li>DAG-based implementation</li>\n<li>DSL to decalaratively express DAGs and compose transformations together</li>\n</ul>\n</li>\n<li>Challenges faced</li>\n<li>Conclusion</li>\n</ul>\n<p>Note: The outline and slides of the talk are very much a work-in-progress. Hopefully, this draft gives the organisers a sense of the flow of the session and some of the high-level concepts that I plan to cover.</p>",
          :text
          "* Introduction\r\n* Context - numberz & what it does \r\n* Business problem\r\n* Iterations - improving the solution \r\n    * Naive implementation using threading macros and core.async\r\n    * DAG-based implementation\r\n    * DSL to decalaratively express DAGs and compose transformations together\r\n* Challenges faced\r\n* Conclusion\r\n\r\nNote: The outline and slides of the talk are very much a work-in-progress. Hopefully, this draft gives the organisers a sense of the flow of the session and some of the high-level concepts that I plan to cover."},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/composable-data-pipelines-for-not-so-big-data-5uBCASZmhNUFGP5Xaf4mtT",
         :start_at "2020-02-15T11:30:00+05:30",
         :end_at "2020-02-15T11:50:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/composable-data-pipelines-for-not-so-big-data-Sst4TX2UnovaGwGez59j3a/feedback",
         :title
         "Composable Data Pipelines for not-so-Big Data",
         :is_break false,
         :id 45,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/composable-data-pipelines-for-not-so-big-data-5uBCASZmhNUFGP5Xaf4mtT/json",
         :url_name_suuid
         "composable-data-pipelines-for-not-so-big-data-Sst4TX2UnovaGwGez59j3a",
         :url_name
         "45-composable-data-pipelines-for-not-so-big-data",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/composable-data-pipelines-for-not-so-big-data-Sst4TX2UnovaGwGez59j3a",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "5uBCASZmhNUFGP5Xaf4mtT",
         :proposal_id 5216,
         :speaker "Akaash Patnaik",
         :speaker_bio
         {:html
          "<p>I’m a web developer, based out of Bangalore, India. I currently work at <a href=\"https://numberz.co\" rel=\"nofollow\">numberz</a>, a financial technology startup where I lead the technology team. Most of my decade-long career in software engineering, has been in the financial technology domain, where I’ve helped build systems for invoicing, payments processing, collections automation, etc.</p>\n<p>My interest in functional programming &amp; music led me to hacking on <a href=\"https://github.com/overtone/overtone\" rel=\"nofollow\">Overtone</a> a few years ago. A few hours into it, I was hooked and this was my gateway into the world of Clojure. Having been something of a hobbyist in Clojure for a few years now, I have lately been involved in introducing Clojure at work, for a business-critical project. It has been a hugely insightful experience and has further reinforced my belief in the benefits of using functional programming and Clojure in real-world business applications. </p>",
          :text
          "I'm a web developer, based out of Bangalore, India. I currently work at [numberz](https://numberz.co), a financial technology startup where I lead the technology team. Most of my decade-long career in software engineering, has been in the financial technology domain, where I've helped build systems for invoicing, payments processing, collections automation, etc.\r\n\r\nMy interest in functional programming & music led me to hacking on [Overtone](https://github.com/overtone/overtone) a few years ago. A few hours into it, I was hooked and this was my gateway into the world of Clojure. Having been something of a hobbyist in Clojure for a few years now, I have lately been involved in introducing Clojure at work, for a business-critical project. It has been a hugely insightful experience and has further reinforced my belief in the benefits of using functional programming and Clojure in real-world business applications. "},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "11:30"}
      {:sessions
       [{:description
         {:html
          "<ul>\n<li>Introduction</li>\n<li>The happy cycle of learning Clojure</li>\n<li>Discovering “macros” - crazy good, or just crazy?</li>\n<li>Writing your first macro</li>\n<li>Writing your second macro</li>\n<li>Wait, the first one is not working?</li>\n<li>Making sense of the “intern”als</li>\n<li>Complicating things, and making it complicated</li>\n<li>Wait, do I really need a macro?</li>\n<li>Conclusion - Thoughts on Alternatives</li>\n</ul>",
          :text
          "- Introduction\r\n- The happy cycle of learning Clojure\r\n- Discovering \"macros\" - crazy good, or just crazy?\r\n- Writing your first macro\r\n- Writing your second macro\r\n- Wait, the first one is not working?\r\n- Making sense of the \"intern\"als\r\n- Complicating things, and making it complicated\r\n- Wait, do I really need a macro?\r\n- Conclusion - Thoughts on Alternatives"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-macros-the-good-the-bad-and-the-messy-RjrkaBeEmvfMiNmtmHTaGJ",
         :start_at "2020-02-15T11:50:00+05:30",
         :end_at "2020-02-15T12:35:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-macros-the-good-the-bad-and-the-messy-bdBZK6j9tFLVjBthHXZSF2/feedback",
         :title
         "Clojure Macros - the good, the bad and the messy",
         :is_break false,
         :id 41,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-macros-the-good-the-bad-and-the-messy-RjrkaBeEmvfMiNmtmHTaGJ/json",
         :url_name_suuid
         "clojure-macros-the-good-the-bad-and-the-messy-bdBZK6j9tFLVjBthHXZSF2",
         :url_name
         "41-clojure-macros-the-good-the-bad-and-the-messy",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-macros-the-good-the-bad-and-the-messy-bdBZK6j9tFLVjBthHXZSF2",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "RjrkaBeEmvfMiNmtmHTaGJ",
         :proposal_id 5258,
         :speaker "Aravind Baskaran",
         :speaker_bio
         {:html
          "<p>Hey there, I am Aravind coming in from Bengaluru, originally from Pondicherry. I work at Swym Corp building (mostly breaking) things that help scale consumer experience globally with a small team. I started on Clojure about 5 years, and have been head-over-heels ever since, with a touch of tough love. Prior to that, I was in Hyderabad building out an enterprise mobile PaaS.</p>\n<p>I have done a few talks behind close doors (nothing that has an online presence), conducting workshops to introduce new tech to college students/graduates.</p>\n<p>A runner, a biker-to-everywhere (read cycle), a lover of puns, small teams and everything that helps us go remote.</p>",
          :text
          "Hey there, I am Aravind coming in from Bengaluru, originally from Pondicherry. I work at Swym Corp building (mostly breaking) things that help scale consumer experience globally with a small team. I started on Clojure about 5 years, and have been head-over-heels ever since, with a touch of tough love. Prior to that, I was in Hyderabad building out an enterprise mobile PaaS.\r\n\r\nI have done a few talks behind close doors (nothing that has an online presence), conducting workshops to introduce new tech to college students/graduates.\r\n\r\nA runner, a biker-to-everywhere (read cycle), a lover of puns, small teams and everything that helps us go remote."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "11:50"}
      {:sessions
       [{:description
         {:html
          "<h1>Clojure as a force multiplier in small companies.</h1>\n<h2>Startups are fast, and Clojure startups are even faster</h2>\n<ul>\n<li>REPL: the best tool for iterative changes in dev and production<ul>\n<li>Fast turn-around on bug fixes makes for impressed customers.</li>\n</ul>\n</li>\n<li>The testing story of Clojure is incredible.<ul>\n<li>The ability to redefine functions means that writing complex tests is simpler than in popular languages like C, Java, Python.</li>\n</ul>\n</li>\n<li>The compatibility story of Clojure is incredible.<ul>\n<li>Upgrading Clojure is often just changing the version number to the latest version number</li>\n</ul>\n</li>\n</ul>\n<h2>Clojure as a language choice</h2>\n<ul>\n<li>Lisp, imposes great constraints, like immutability. Dynamic typing is great for rapid iteration.</li>\n<li>“I bet there’s a Java library for this.” &gt; JVM + interop is a super power.<ul>\n<li>Packaging as a Jar means deployment is an understood and solved problem.</li>\n</ul>\n</li>\n<li>Clojure attracts a certain kind of programmer: opinionated, passionate, experienced.</li>\n<li>It is an easy language to learn <strong>for a new comer</strong>. Blank slate can absorb and get started incredibly fast.</li>\n</ul>\n<h1>The Clojure mess: Going from small to medium - people</h1>\n<ul>\n<li>Going from &lt; 10 Clojure engineers to &gt; 10 Clojure engineers.</li>\n</ul>\n<h2>Onboarding and training</h2>\n<ul>\n<li>For a Clojure company, focusing on onboarding and training is a full-time job.</li>\n<li>How we went from 6 months to 2 months needed for making a new engineer productive.<ul>\n<li>Our mentoring program, what we do in the first month</li>\n</ul>\n</li>\n<li>Personal opinion: Why being forced to do this is a <strong>good thing</strong>.</li>\n</ul>\n<h2>Senior vs Junior talent</h2>\n<ul>\n<li>With a good onboarding program in place, hiring and growing junior talent is easy and rewarding.<ul>\n<li>Junior devs are the best folk to improve your onboarding programs. </li>\n<li>Optimize for self-driven individuals and listen to their feedback.</li>\n</ul>\n</li>\n<li>Hiring senior talent is <strong>hard</strong>.<ul>\n<li>Why? Challenges and dealing with self-doubt, unlearning.</li>\n<li>Improving onboarding for senior engineers.   </li>\n</ul>\n</li>\n</ul>\n<h1>The Clojure mess: Going from small to medium - language</h1>\n<h2>As a small company, build any way you want, just ship fast.</h2>\n<ul>\n<li>Hello macros and DSLs for everything. Sections of code become personal fiefdoms - understandable only to the authors.<ul>\n<li>This works fine for small code-bases and small teams, but starts to be a problem as the team grows.</li>\n</ul>\n</li>\n<li>Clojure is an expressive language, so people have built libraries for everything.<ul>\n<li>core.async, core.spec, core.typed, core.logic</li>\n<li>And this is just the core.</li>\n</ul>\n</li>\n</ul>\n<h2>The medium company brings the reality of the common denominator.</h2>\n<ul>\n<li>Understanding the code can become a challenge. How to deal with this.</li>\n</ul>\n<h2>What can you do to make this better?</h2>\n<ul>\n<li>Process around committing code. </li>\n<li>Dealing with and abstracting common patterns. Each person should do these in the <strong>same</strong> way, via the same libraries.</li>\n<li>Using templates of code in projects<ul>\n<li>A new project should have a predictable layout, with necessary libraries imported and base code written in.</li>\n<li>Reviewers should know <strong>exactly</strong> what they need to review, and should be able to <strong>safely</strong> ignore the rest.</li>\n</ul>\n</li>\n<li>Exploring new / complex features of the core language in a deliberate manner</li>\n</ul>\n<h2>A large Clojure company: an amazing vision</h2>\n<ul>\n<li>What we can do when we have bandwidth to dedicate senior Clojure devs to projects which don’t immediately focus on customers / features.</li>\n</ul>\n<h1>Closing thoughts: Mid-sized companies, Clojure, perspective building</h1>",
          :text
          "# Clojure as a force multiplier in small companies.\r\n## Startups are fast, and Clojure startups are even faster\r\n-   REPL: the best tool for iterative changes in dev and production\r\n    -   Fast turn-around on bug fixes makes for impressed customers.\r\n-   The testing story of Clojure is incredible.\r\n    -   The ability to redefine functions means that writing complex tests is simpler than in popular languages like C, Java, Python.\r\n-   The compatibility story of Clojure is incredible.\r\n    -   Upgrading Clojure is often just changing the version number to the latest version number\r\n## Clojure as a language choice\r\n-   Lisp, imposes great constraints, like immutability. Dynamic typing is great for rapid iteration.\r\n-   \"I bet there's a Java library for this.\" > JVM + interop is a super power.\r\n    -   Packaging as a Jar means deployment is an understood and solved problem.\r\n-   Clojure attracts a certain kind of programmer: opinionated, passionate, experienced.\r\n-   It is an easy language to learn **for a new comer**. Blank slate can absorb and get started incredibly fast.\r\n# The Clojure mess: Going from small to medium - people\r\n-   Going from < 10 Clojure engineers to > 10 Clojure engineers.\r\n## Onboarding and training\r\n-   For a Clojure company, focusing on onboarding and training is a full-time job.\r\n-   How we went from 6 months to 2 months needed for making a new engineer productive.\r\n    -   Our mentoring program, what we do in the first month\r\n-   Personal opinion: Why being forced to do this is a **good thing**.\r\n## Senior vs Junior talent\r\n-   With a good onboarding program in place, hiring and growing junior talent is easy and rewarding.\r\n    -   Junior devs are the best folk to improve your onboarding programs. \r\n    -   Optimize for self-driven individuals and listen to their feedback.\r\n-   Hiring senior talent is **hard**.\r\n    -   Why? Challenges and dealing with self-doubt, unlearning.\r\n    -   Improving onboarding for senior engineers.   \r\n# The Clojure mess: Going from small to medium - language\r\n## As a small company, build any way you want, just ship fast.\r\n-   Hello macros and DSLs for everything. Sections of code become personal fiefdoms - understandable only to the authors.\r\n    -   This works fine for small code-bases and small teams, but starts to be a problem as the team grows.\r\n-   Clojure is an expressive language, so people have built libraries for everything.\r\n    -   core.async, core.spec, core.typed, core.logic\r\n    -   And this is just the core.\r\n## The medium company brings the reality of the common denominator.\r\n-   Understanding the code can become a challenge. How to deal with this.\r\n## What can you do to make this better?\r\n-   Process around committing code. \r\n-   Dealing with and abstracting common patterns. Each person should do these in the **same** way, via the same libraries.\r\n-   Using templates of code in projects\r\n    -   A new project should have a predictable layout, with necessary libraries imported and base code written in.\r\n    -   Reviewers should know **exactly** what they need to review, and should be able to **safely** ignore the rest.\r\n-   Exploring new / complex features of the core language in a deliberate manner\r\n## A large Clojure company: an amazing vision\r\n-   What we can do when we have bandwidth to dedicate senior Clojure devs to projects which don't immediately focus on customers / features.\r\n# Closing thoughts: Mid-sized companies, Clojure, perspective building"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/growing-a-clojure-company-from-small-to-mid-sized-iHFKr7bPEaRqGUnp3aJ2RL",
         :start_at "2020-02-15T12:35:00+05:30",
         :end_at "2020-02-15T13:00:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/growing-a-clojure-company-from-small-to-mid-sized-and-hopefully-beyond-tips-tricks-habits-practices-9rdNTUwnnPZqT5FhSMwaLK/feedback",
         :title
         "Growing a Clojure Company from small to mid-sized (and hopefully beyond): tips, tricks, habits, practices",
         :is_break false,
         :id 49,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/growing-a-clojure-company-from-small-to-mid-sized-iHFKr7bPEaRqGUnp3aJ2RL/json",
         :url_name_suuid
         "growing-a-clojure-company-from-small-to-mid-sized-and-hopefully-beyond-tips-tricks-habits-practices-9rdNTUwnnPZqT5FhSMwaLK",
         :url_name
         "49-growing-a-clojure-company-from-small-to-mid-sized-and-hopefully-beyond-tips-tricks-habits-practices",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/growing-a-clojure-company-from-small-to-mid-sized-and-hopefully-beyond-tips-tricks-habits-practices-9rdNTUwnnPZqT5FhSMwaLK",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "iHFKr7bPEaRqGUnp3aJ2RL",
         :proposal_id 5248,
         :speaker "Vedang Manerikar",
         :speaker_bio
         {:html
          "<p>Hi! I’m Vedang. I live in Pune, India and work at Helpshift. Now-a-days, I head the Helpshift Core backend team and work on improving processes and workflows within the team with the help of my team mates. Previously, I was an individual contributor and helped design and write some of the code that runs Helpshift.</p>\n<p>I’m passionate about programming, and some of my work can be found on GitHub. I use Emacs as my editor-for-everything, and blog about it from time to time.</p>",
          :text
          "Hi! I’m Vedang. I live in Pune, India and work at Helpshift. Now-a-days, I head the Helpshift Core backend team and work on improving processes and workflows within the team with the help of my team mates. Previously, I was an individual contributor and helped design and write some of the code that runs Helpshift.\r\n\r\nI’m passionate about programming, and some of my work can be found on GitHub. I use Emacs as my editor-for-everything, and blog about it from time to time."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "12:35"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-15T13:00:00+05:30",
         :end_at "2020-02-15T13:55:00+05:30",
         :feedback_url nil,
         :title "Lunch",
         :is_break true,
         :id 29,
         :json_url nil,
         :url_name_suuid
         "lunch-D3oT8EXd59UWMrXxE4QMAV",
         :url_name "29-lunch",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/lunch-D3oT8EXd59UWMrXxE4QMAV",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "13:00"}
      {:sessions
       [{:description
         {:html
          "<p>Introduction</p>\n<ul>\n<li>A few words about the kind of devices that will be targeted (ie. Raspberry Pi like nano-computers)</li>\n<li>How using a nano-computer is very different from an Arduino (or any micro-controller)</li>\n<li>How using a managed language for building a device has not always been straightforward, often far from a good idea</li>\n<li>Brief overview of the (bad) Java ecosystem regarding IO (eg. handling GPIO pins for lighting up a LED)</li>\n<li>How Linux is now proposing pretty good standard APIs</li>\n</ul>\n<p>Walkthrough</p>\n<ul>\n<li>How to simply install Clojure on a Raspberry Pi</li>\n<li>How to simply handle LEDs and buttons live at the REPL by merely importing a library</li>\n<li>How to use protocols such as I2C for talking to sensors</li>\n<li>How to talk to micro-controllers such as an Arduino, and why</li>\n<li>Tips about handling complex IOs with core.async</li>\n<li>How communication with your Clojure-powered connected device is just plain old web development</li>\n<li>Few tips about using MQTT from Clojure, a messaging protocol commonly used in IoT</li>\n</ul>\n<p>Conlusion</p>\n<ul>\n<li>Summary of pros and cons of using Clojure for IoT</li>\n<li>Is there any future in all of this besides hobbying ?</li>\n</ul>",
          :text
          "Introduction\r\n\r\n- A few words about the kind of devices that will be targeted (ie. Raspberry Pi like nano-computers)\r\n- How using a nano-computer is very different from an Arduino (or any micro-controller)\r\n- How using a managed language for building a device has not always been straightforward, often far from a good idea\r\n- Brief overview of the (bad) Java ecosystem regarding IO (eg. handling GPIO pins for lighting up a LED)\r\n- How Linux is now proposing pretty good standard APIs\r\n\r\nWalkthrough\r\n\r\n- How to simply install Clojure on a Raspberry Pi\r\n- How to simply handle LEDs and buttons live at the REPL by merely importing a library\r\n- How to use protocols such as I2C for talking to sensors\r\n- How to talk to micro-controllers such as an Arduino, and why\r\n- Tips about handling complex IOs with core.async\r\n- How communication with your Clojure-powered connected device is just plain old web development\r\n- Few tips about using MQTT from Clojure, a messaging protocol commonly used in IoT\r\n\r\nConlusion\r\n\r\n- Summary of pros and cons of using Clojure for IoT\r\n- Is there any future in all of this besides hobbying ?"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-of-things-mrGKbXit9jneDVLZmYs3eA",
         :start_at "2020-02-15T13:55:00+05:30",
         :end_at "2020-02-15T14:40:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-of-things-Y3GSxLJLibSktHWKg4wYvQ/feedback",
         :title "Clojure of Things",
         :is_break false,
         :id 39,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-of-things-mrGKbXit9jneDVLZmYs3eA/json",
         :url_name_suuid
         "clojure-of-things-Y3GSxLJLibSktHWKg4wYvQ",
         :url_name "39-clojure-of-things",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-of-things-Y3GSxLJLibSktHWKg4wYvQ",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "mrGKbXit9jneDVLZmYs3eA",
         :proposal_id 5202,
         :speaker "Adam Helinski",
         :speaker_bio
         {:html
          "<p>Former illusionist, a bit of a pianist, now a psychologist. Also a hammock philosopher and tamer of electrons. After studying neuroscience, Adam Helinski became a full-time parens whisperer in the kingdom of IoT where his slight sense of scientific madness lead him to the unique choice of using Clojure for prototyping connected devices. After those few years of exile away from psychology, he now expertiments with using Clojure in psychotherapy. </p>",
          :text
          "Former illusionist, a bit of a pianist, now a psychologist. Also a hammock philosopher and tamer of electrons. After studying neuroscience, Adam Helinski became a full-time parens whisperer in the kingdom of IoT where his slight sense of scientific madness lead him to the unique choice of using Clojure for prototyping connected devices. After those few years of exile away from psychology, he now expertiments with using Clojure in psychotherapy. "},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "13:55"}
      {:sessions
       [{:description
         {:html
          "<p>Talk will be presented by Madhu (Clojure programmer) and Rashmi (OOPs turned Clojure programmer)</p>\n<p>Discuss the paradigms - Encapsulation of data and methods vs immutable functions acting on input data and outputting new data.</p>\n<p>(Examples of a simple java class vs a Clojure function)</p>\n<p>Talk about how conditioned OOPs programmers are to classes and objects and at first glance it seems we are adopting a messy world of methods, procedures where there is no control over access to data.</p>\n<p>Immutable functions are like mathematical functions unlike the methods, procedures of other programming languages.</p>\n<p>For an OOPS programmer lack of classes meaning lack of structured code - namespaces in Clojure allow for structuring code.</p>\n<p>OOPS requires management of references, their state change, it’s important to follow best practices to control the state change. References also lead to null objects.<br>\nImmutable functions get rid of references, explain persistent data structures for how copies of objects are avoided in Clojure.</p>\n<p>Clojure - built on Java and uses the Lisp paradigm<br>\nAll underlyng Java functionality is available. at the same time the Lisp paradigm enables immutability of code.<br>\n(Give examples of calling a String function the Java way and the Clojure way)</p>\n<p>Seq vs Iterator - Seq follows the interface pattern, mostly all Clojure collections provide the ISeq interface. Stateless compared to Java.</p>\n<p>Defprotocol, defmethod - Underlying OOPs polymorphism concept, how the lisp paradigm makes it immutable. (Give examples of Java and Clojure)</p>\n<p>Clojure allows mutable state using a few data types -<br>\nAtoms - Based on underlying Java atomic variables. Explain.</p>\n<p>Clojure - Ease of making changes by generating JAVA bytecode and testing. </p>\n<p>Conclusion - Possible to have redundant code, not follow best practices in both Java and Clojure. </p>",
          :text
          "Talk will be presented by Madhu (Clojure programmer) and Rashmi (OOPs turned Clojure programmer)\r\n\r\nDiscuss the paradigms - Encapsulation of data and methods vs immutable functions acting on input data and outputting new data.\r\n\r\n(Examples of a simple java class vs a Clojure function)\r\n\r\nTalk about how conditioned OOPs programmers are to classes and objects and at first glance it seems we are adopting a messy world of methods, procedures where there is no control over access to data.\r\n\r\nImmutable functions are like mathematical functions unlike the methods, procedures of other programming languages.\r\n\r\nFor an OOPS programmer lack of classes meaning lack of structured code - namespaces in Clojure allow for structuring code.\r\n\r\nOOPS requires management of references, their state change, it’s important to follow best practices to control the state change. References also lead to null objects.\r\nImmutable functions get rid of references, explain persistent data structures for how copies of objects are avoided in Clojure.\r\n\r\nClojure - built on Java and uses the Lisp paradigm\r\nAll underlyng Java functionality is available. at the same time the Lisp paradigm enables immutability of code.\r\n(Give examples of calling a String function the Java way and the Clojure way)\r\n\r\nSeq vs Iterator - Seq follows the interface pattern, mostly all Clojure collections provide the ISeq interface. Stateless compared to Java.\r\n\r\nDefprotocol, defmethod - Underlying OOPs polymorphism concept, how the lisp paradigm makes it immutable. (Give examples of Java and Clojure)\r\n\r\nClojure allows mutable state using a few data types -\r\nAtoms - Based on underlying Java atomic variables. Explain.\r\n\r\nClojure - Ease of making changes by generating JAVA bytecode and testing. \r\n\r\nConclusion - Possible to have redundant code, not follow best practices in both Java and Clojure. "},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-for-java-oops-programmers-Kv8gtitnKvBuyw5HChgkVb",
         :start_at "2020-02-15T14:40:00+05:30",
         :end_at "2020-02-15T15:25:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-for-java-oops-programmers-QxCUJiZjLUUA6Bd9xUajT6/feedback",
         :title
         "Clojure for Java (OOPS) programmers",
         :is_break false,
         :id 52,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-for-java-oops-programmers-Kv8gtitnKvBuyw5HChgkVb/json",
         :url_name_suuid
         "clojure-for-java-oops-programmers-QxCUJiZjLUUA6Bd9xUajT6",
         :url_name
         "52-clojure-for-java-oops-programmers",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-for-java-oops-programmers-QxCUJiZjLUUA6Bd9xUajT6",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "Kv8gtitnKvBuyw5HChgkVb",
         :proposal_id 5267,
         :speaker
         "Rashmi Mittal, Madhuparna Ghosh",
         :speaker_bio
         {:html
          "<p>Madhuparna is a senior developer at Quintype, she builds digital tools for media publishers. She loves working on backend and frontend technologies, she mostly spends time working with Clojure, NodeJS and Javascript.</p>\n<p>Rashmi has over 20 years of experience in product development in various verticals including 15 years in the Silicon Valley where she primarily worked at Adobe Systems on products like Adobe Illustrator, HTML5 animation and Video Publishing. She is currently the Vice President of Engineering at Quintype.</p>",
          :text
          "Madhuparna is a senior developer at Quintype, she builds digital tools for media publishers. She loves working on backend and frontend technologies, she mostly spends time working with Clojure, NodeJS and Javascript.\r\n\r\nRashmi has over 20 years of experience in product development in various verticals including 15 years in the Silicon Valley where she primarily worked at Adobe Systems on products like Adobe Illustrator, HTML5 animation and Video Publishing. She is currently the Vice President of Engineering at Quintype."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "14:40"}
      {:sessions
       [{:description {:html "", :text ""},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-15T15:25:00+05:30",
         :end_at "2020-02-15T15:55:00+05:30",
         :feedback_url nil,
         :title "Tea / Coffee",
         :is_break true,
         :id 33,
         :json_url nil,
         :url_name_suuid
         "tea-coffee-98iU2GiuHYEwY4tk6mawkn",
         :url_name "33-tea-coffee",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/tea-coffee-98iU2GiuHYEwY4tk6mawkn",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "15:25"}
      {:sessions
       [{:description
         {:html
          "<p>What is Wasm and how does it work internally?<br>\nWhere can you run Wasm?<br>\nHow to run Wasm on top of JVM?<br>\nCalling Wasm code from Clojure.<br>\nCan this be a bridge between Clojure and Rust?</p>",
          :text
          "What is Wasm and how does it work internally?\r\nWhere can you run Wasm?\r\nHow to run Wasm on top of JVM?\r\nCalling Wasm code from Clojure.\r\nCan this be a bridge between Clojure and Rust?"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/wasm-on-clojure-GQLxWZKMUA8GCiWh7TyWW9",
         :start_at "2020-02-15T15:55:00+05:30",
         :end_at "2020-02-15T16:05:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/wasm-on-clojure-zQ9wL9go69kyFxNeh5xczJ/feedback",
         :title "Wasm on Clojure",
         :is_break false,
         :id 50,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/wasm-on-clojure-GQLxWZKMUA8GCiWh7TyWW9/json",
         :url_name_suuid
         "wasm-on-clojure-zQ9wL9go69kyFxNeh5xczJ",
         :url_name "50-wasm-on-clojure",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/wasm-on-clojure-zQ9wL9go69kyFxNeh5xczJ",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "GQLxWZKMUA8GCiWh7TyWW9",
         :proposal_id 5266,
         :speaker "Emmanuel Antony",
         :speaker_bio
         {:html
          "<p>I am a Rust developer, currently pursuing my Bachelor’s degree. I like to tinker with stuff and know how things work internally. Stuff are those engineering marvels that we take for granted these days.</p>",
          :text
          "I am a Rust developer, currently pursuing my Bachelor's degree. I like to tinker with stuff and know how things work internally. Stuff are those engineering marvels that we take for granted these days."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "15:55"}
      {:sessions
       [{:description
         {:html
          "<p>Here is a very brief outline of my presentation:<br>\n- Firstly, I will start of by explaining my failures in understanding bits and pieces of Seqs. Explain with actual function calls.<br>\n- The second part of the presentation is on how Lisp Cons Cells work. A brief explanation of how it is a list with 2 functions ie car and cdr. There will be a lot of examples on how sublists can be created and how they can be modified.<br>\n- A brief explanation of how Lisp Cons Cells analogues to Clojure Lazy Seqs.<br>\n- Concluding with a run through of why Clojure Lazy Seqs are more efficient than normal seqs. This will be majorly talking about how Lazy Seqs does all the heavy lifting with functional computation rather than sitting in memory.</p>\n<p>You can find a very rough outline of the presentation here <a href=\"https://speakerdeck.com/sharangj/lazy-sequences-why-are-they-so-lazy\" rel=\"nofollow\">https://speakerdeck.com/sharangj/lazy-sequences-why-are-they-so-lazy</a>.</p>",
          :text
          "Here is a very brief outline of my presentation:\r\n- Firstly, I will start of by explaining my failures in understanding bits and pieces of Seqs. Explain with actual function calls.\r\n- The second part of the presentation is on how Lisp Cons Cells work. A brief explanation of how it is a list with 2 functions ie car and cdr. There will be a lot of examples on how sublists can be created and how they can be modified.\r\n- A brief explanation of how Lisp Cons Cells analogues to Clojure Lazy Seqs.\r\n- Concluding with a run through of why Clojure Lazy Seqs are more efficient than normal seqs. This will be majorly talking about how Lazy Seqs does all the heavy lifting with functional computation rather than sitting in memory.\r\n\r\nYou can find a very rough outline of the presentation here https://speakerdeck.com/sharangj/lazy-sequences-why-are-they-so-lazy."},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/lazy-seqs-why-are-they-so-lazy-xEB46CHthhEnL42BLVRMk8",
         :start_at "2020-02-15T16:05:00+05:30",
         :end_at "2020-02-15T16:25:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/lazy-seqs-why-are-they-so-lazy-UwWSjgjoNTGXUtrwNGGHwk/feedback",
         :title
         "Lazy Seqs - Why are they so lazy?",
         :is_break false,
         :id 46,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/lazy-seqs-why-are-they-so-lazy-xEB46CHthhEnL42BLVRMk8/json",
         :url_name_suuid
         "lazy-seqs-why-are-they-so-lazy-UwWSjgjoNTGXUtrwNGGHwk",
         :url_name
         "46-lazy-seqs-why-are-they-so-lazy",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/lazy-seqs-why-are-they-so-lazy-UwWSjgjoNTGXUtrwNGGHwk",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "xEB46CHthhEnL42BLVRMk8",
         :proposal_id 5252,
         :speaker "Ramsharan Gorur Jayaraman",
         :speaker_bio
         {:html
          "<p>Ramsharan has built multiple systems across different spectrums like Local Commerce, Content Publishing Space and Health Care. As a tech enthusiast, he is always on the lookout on how tech can solve real world problems. He is a sport lover and a Liverpool FC fanatic. He currently works as the Director Of Engineering at Quintype.</p>",
          :text
          "Ramsharan has built multiple systems across different spectrums like Local Commerce, Content Publishing Space and Health Care. As a tech enthusiast, he is always on the lookout on how tech can solve real world problems. He is a sport lover and a Liverpool FC fanatic. He currently works as the Director Of Engineering at Quintype."},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "16:05"}
      {:sessions
       [{:description
         {:html
          "<p>Parentheses<br>\n  - Not really a problem<br>\n  - Why not<br>\n  - Structural editing<br>\nDebugging<br>\n  - Debugging when every expression is part of a chain of transformations<br>\n  - ‘Print debugging’ not useful<br>\n  - Tools to debug<br>\nFor loops<br>\n  - Not the same as in python/java/c++<br>\n  - List comprehension in math<br>\n  - map/reduce/filter in c++<br>\n  - When to actually use clojure for<br>\nLazy sequences<br>\n  - Errors occuring on not realizing presence of lazy seqs<br>\n  - REPL and how it compounds this issue<br>\n  - Why is map returning a lazy seq<br>\n  - Connection bw immutable data structures and lazy sequences<br>\nLack of examples<br>\n  - Some cases where I wanted examples of Clojure code and it was hard to find. t(Schema, mount etc)<br>\n  - Delving into source code, experimenting etc<br>\nInteraction with db<br>\n  - Only because I was coming from python/django env<br>\n  - ORMs in django vs sql-builders<br>\n  - Lack of seamless integration with external applications forces you to learn more about them<br>\n  - You move up a level in terms of programming skills.. But this make clojure hard<br>\nHon’ mention: Snakes vs Kebabs<br>\n  - Why!!!</p>",
          :text
          "Parentheses  \r\n  - Not really a problem\r\n  - Why not\r\n  - Structural editing  \r\nDebugging  \r\n  - Debugging when every expression is part of a chain of transformations\r\n  - ‘Print debugging’ not useful\r\n  - Tools to debug  \r\nFor loops  \r\n  - Not the same as in python/java/c++\r\n  - List comprehension in math\r\n  - map/reduce/filter in c++\r\n  - When to actually use clojure for\r\nLazy sequences\r\n  - Errors occuring on not realizing presence of lazy seqs\r\n  - REPL and how it compounds this issue\r\n  - Why is map returning a lazy seq\r\n  - Connection bw immutable data structures and lazy sequences\r\nLack of examples  \r\n  - Some cases where I wanted examples of Clojure code and it was hard to find. t(Schema, mount etc)\r\n  - Delving into source code, experimenting etc\r\nInteraction with db\r\n  - Only because I was coming from python/django env\r\n  - ORMs in django vs sql-builders\r\n  - Lack of seamless integration with external applications forces you to learn more about them\r\n  - You move up a level in terms of programming skills.. But this make clojure hard\r\nHon’ mention: Snakes vs Kebabs\r\n  - Why!!!"},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-is-difficult-but-worth-it-7Tbm9Fm9WtXsMWjz5EtmGN",
         :start_at "2020-02-15T16:25:00+05:30",
         :end_at "2020-02-15T16:35:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-is-difficult-but-worth-it-5ecT3pJQRccfQPXY5F933R/feedback",
         :title
         "Clojure is difficult, but worth it",
         :is_break false,
         :id 51,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/clojure-is-difficult-but-worth-it-7Tbm9Fm9WtXsMWjz5EtmGN/json",
         :url_name_suuid
         "clojure-is-difficult-but-worth-it-5ecT3pJQRccfQPXY5F933R",
         :url_name
         "51-clojure-is-difficult-but-worth-it",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/clojure-is-difficult-but-worth-it-5ecT3pJQRccfQPXY5F933R",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "7Tbm9Fm9WtXsMWjz5EtmGN",
         :proposal_id 5264,
         :speaker "sezal jain",
         :speaker_bio
         {:html
          "<p>Currently engineer at nilenso, with a varied history hopping from robotics research at CMU, to greenhouse farming and back to reality with a tech lead role at Care24.<br>\nMostly programmed in python/django and C++ and now clojure!</p>",
          :text
          "Currently engineer at nilenso, with a varied history hopping from robotics research at CMU, to greenhouse farming and back to reality with a tech lead role at Care24.  \r\nMostly programmed in python/django and C++ and now clojure!"},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "16:25"}
      {:sessions
       [{:description
         {:html
          "<ol>\n<li>Introduce Light Table.<br>\n   - Concept, Ideas, Approach</li>\n<li>Clojure/Script ecosystem at that state.</li>\n<li>Light Table’s awesome features:<br>\n   - BOT<br>\n   - Inline Eval, etc.</li>\n<li>Where did it get wrong?</li>\n<li>A new dawn, reviving Light Table.</li>\n<li>Learning from new ideas.</li>\n<li>Embracing already provided Clojure Toolings.</li>\n<li>Demo of new Light Table based on new architectures embracing old foundations. </li>\n</ol>",
          :text
          "1. Introduce Light Table.\r\n   - Concept, Ideas, Approach\r\n2. Clojure/Script ecosystem at that state.\r\n3. Light Table's awesome features:\r\n   - BOT\r\n   - Inline Eval, etc.\r\n4. Where did it get wrong?\r\n5. A new dawn, reviving Light Table.\r\n6. Learning from new ideas.\r\n7. Embracing already provided Clojure Toolings.\r\n8. Demo of new Light Table based on new architectures embracing old foundations. "},
         :timezone "Asia/Kolkata",
         :proposal_url
         "https://hasgeek.com/inclojure/2020/proposals/light-table-the-strange-and-wonderful-saga-of-a-pu-VRPeLAoiVxx9UGrVN55yNd",
         :start_at "2020-02-15T16:35:00+05:30",
         :end_at "2020-02-15T17:20:00+05:30",
         :feedback_url
         "https://hasgeek.com/inclojure/2020/schedule/light-table-the-strange-and-wonderful-saga-of-a-pure-clojure-editor-uMZkEjupyQJEW4tyatco7c/feedback",
         :title
         "Light Table: The strange and wonderful saga of a pure Clojure editor",
         :is_break false,
         :id 42,
         :json_url
         "https://hasgeek.com/inclojure/2020/proposals/light-table-the-strange-and-wonderful-saga-of-a-pu-VRPeLAoiVxx9UGrVN55yNd/json",
         :url_name_suuid
         "light-table-the-strange-and-wonderful-saga-of-a-pure-clojure-editor-uMZkEjupyQJEW4tyatco7c",
         :url_name
         "42-light-table-the-strange-and-wonderful-saga-of-a-pure-clojure-editor",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/light-table-the-strange-and-wonderful-saga-of-a-pure-clojure-editor-uMZkEjupyQJEW4tyatco7c",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal "VRPeLAoiVxx9UGrVN55yNd",
         :proposal_id 5249,
         :speaker "Pratik Karki",
         :speaker_bio
         {:html
          "<p>Hello, I’m Pratik Karki. I’m a programmer, a lifelong learner, Light Table maintainer, open-source contributor and GSoC‘18 student. I love to pop the hood of software and look inside, move a few things and close the hood,(80% of the time, I mess something up.) I’m a polyglot programmer(IOW: Jack of all trades). I love to talk about concurrency, optimizations, language design, editors and algorithms. I work as a Software Engineer at Leapfrog Technology Inc., Nepal. When I’m not programming, I read a lot, to be a better programmer and my favorite super-hero is Ken Thompson. BTW, I ❤ Clojure!</p>",
          :text
          "Hello, I'm Pratik Karki. I'm a programmer, a lifelong learner, Light Table maintainer, open-source contributor and GSoC'18 student. I love to pop the hood of software and look inside, move a few things and close the hood,(80% of the time, I mess something up.) I'm a polyglot programmer(IOW: Jack of all trades). I love to talk about concurrency, optimizations, language design, editors and algorithms. I work as a Software Engineer at Leapfrog Technology Inc., Nepal. When I'm not programming, I read a lot, to be a better programmer and my favorite super-hero is Ken Thompson. BTW, I ❤ Clojure!"},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "16:35"}
      {:sessions
       [{:description
         {:html
          "<p><a href=\"https://en.wikipedia.org/wiki/Birds_of_a_feather_(computing)\" rel=\"nofollow\">https://en.wikipedia.org/wiki/Birds_of_a_feather_(computing)</a></p>",
          :text
          "https://en.wikipedia.org/wiki/Birds_of_a_feather_(computing)"},
         :timezone "Asia/Kolkata",
         :proposal_url nil,
         :start_at "2020-02-15T17:20:00+05:30",
         :end_at "2020-02-15T18:00:00+05:30",
         :feedback_url nil,
         :title "BoF and Closing",
         :is_break false,
         :id 37,
         :json_url nil,
         :url_name_suuid
         "bof-and-closing-UeuTzZ4oi8AtFt8qKNJqSf",
         :url_name "37-bof-and-closing",
         :url
         "https://hasgeek.com/inclojure/2020/schedule/bof-and-closing-UeuTzZ4oi8AtFt8qKNJqSf",
         :room
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
         :proposal nil,
         :proposal_id nil,
         :speaker nil,
         :speaker_bio {:html "", :text ""},
         :room_scoped_name
         "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel"}],
       :slot "17:20"}],
     :start_at "2020-02-15T08:45:00+05:30"}],
   :venues
   [{:description {:html "", :text ""},
     :project_details
     {:name "2020",
      :suuid "pJYaKTaffVnaS9upmTP67F",
      :title "IN/Clojure 2020"},
     :name
     "novotel-pune-nagar-road-crimson-hall",
     :city "Pune",
     :postcode "411014",
     :longitude 73.91076201573014,
     :state "Maharashtra",
     :title
     "Novotel Pune Nagar Road, Crimson Hall",
     :address1 "Nagar Rd, Sakore Nagar",
     :suuid "tK8qMgL34ebiaMttPbvPC9",
     :address2 "Viman Nagar",
     :id 193,
     :huuid "285e03f5c27746dcb5e19ace35f45112",
     :latitude 18.55883089693069,
     :room_list
     [{:description
       {:html
        "<p>Venue for the single-track day of talks.</p>",
        :text
        "Venue for the single-track day of talks."},
       :name
       "crimson-hall-day-of-talks-at-novotel-hotel",
       :bgcolor "990000",
       :title
       "Crimson Hall (Day of talks at Novotel hotel)",
       :suuid "gCFBMV8RukhAfSCN9BY8rP",
       :id 311,
       :huuid "7ac62ec71e6445ce8e5bb06ad132b119",
       :venue_details
       {:name
        "novotel-pune-nagar-road-crimson-hall",
        :suuid "tK8qMgL34ebiaMttPbvPC9",
        :title
        "Novotel Pune Nagar Road, Crimson Hall"},
       :uuid
       "7ac62ec7-1e64-45ce-8e5b-b06ad132b119",
       :seq 1,
       :scoped_name
       "novotel-pune-nagar-road-crimson-hall/crimson-hall-day-of-talks-at-novotel-hotel",
       :buid "esYuxx5kRc6OW7Bq0TKxGQ"}],
     :uuid
     "285e03f5-c277-46dc-b5e1-9ace35f45112",
     :seq 1,
     :country "IN",
     :buid "KF4D9cJ3Rty14ZrONfRREg",
     :has_coordinates true}
    {:description {:html "", :text ""},
     :project_details
     {:name "2020",
      :suuid "pJYaKTaffVnaS9upmTP67F",
      :title "IN/Clojure 2020"},
     :name "mccia-trade-tower-icc-complex",
     :city "Pune",
     :postcode "411016",
     :longitude 73.8544541,
     :state "Maharashtra",
     :title "MCCIA Trade Tower, ICC Complex",
     :address1
     "Senapati Bapat Rd, Laxmi Society, Model Colony",
     :suuid "X2Fubix2WNuxpqtZhbw7b4",
     :address2 "Shivajinagar",
     :id 194,
     :huuid "0e8152a7d89a4203be2fe36dc34c06d0",
     :latitude 18.521428,
     :room_list
     [{:description
       {:html
        "<p>Introductory To Clojure workshop on the 5<sup>th</sup> Floor.</p>",
        :text
        "Introductory To Clojure workshop on the 5th Floor."},
       :name
       "classroom-1-workshop-at-mccia-trade-tower",
       :bgcolor "D04B36",
       :title
       "Classroom 1 (Workshop at MCCIA Trade Tower)",
       :suuid "uziaFicrXhbhQvg4anug6m",
       :id 308,
       :huuid "f22450b2a6d6448ca88d74fb3bad33d4",
       :venue_details
       {:name "mccia-trade-tower-icc-complex",
        :suuid "X2Fubix2WNuxpqtZhbw7b4",
        :title "MCCIA Trade Tower, ICC Complex"},
       :uuid
       "f22450b2-a6d6-448c-a88d-74fb3bad33d4",
       :seq 1,
       :scoped_name
       "mccia-trade-tower-icc-complex/classroom-1-workshop-at-mccia-trade-tower",
       :buid "8iRQsqbWRIyojXT7O60z1A"}
      {:description
       {:html
        "<p>Intermediate Clojure workshop on the 5<sup>th</sup> Floor</p>",
        :text
        "Intermediate Clojure workshop on the 5th Floor"},
       :name
       "classroom-2-workshop-at-mccia-trade-tower",
       :bgcolor "675997",
       :title
       "Classroom 2 (Workshop at MCCIA Trade Tower)",
       :suuid "ktd9SzA98gUkpvQPPANvUd",
       :id 309,
       :huuid "c75ee473f89e4bd2814ccfe6d076cda4",
       :venue_details
       {:name "mccia-trade-tower-icc-complex",
        :suuid "X2Fubix2WNuxpqtZhbw7b4",
        :title "MCCIA Trade Tower, ICC Complex"},
       :uuid
       "c75ee473-f89e-4bd2-814c-cfe6d076cda4",
       :seq 2,
       :scoped_name
       "mccia-trade-tower-icc-complex/classroom-2-workshop-at-mccia-trade-tower",
       :buid "x17kc_ieS9KBTM_m0HbNpA"}],
     :uuid
     "0e8152a7-d89a-4203-be2f-e36dc34c06d0",
     :seq 2,
     :country "IN",
     :buid "DoFSp9iaQgO-L-Ntw0wG0A",
     :has_coordinates true}]})
