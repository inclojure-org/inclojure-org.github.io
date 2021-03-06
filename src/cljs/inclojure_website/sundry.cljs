(ns inclojure-website.sundry)

(defn rotate-vec [v n]
  (let [l   (count v)
        off (mod (+ (mod n l) l) l)]
    (concat (drop off v) (take off v))))

(defn goto-link [id]
  (set! (.-location js/window) (str "/#" id)))

(defn time-of-day [hour]
  (if (> hour 12)
    {:hour (- hour 12) :period "pm"}
    {:hour hour :period "am"}))

(defn format-minute [the-minute]
  (if (< the-minute 10)
    (str "0" the-minute)
    (str the-minute)))

(defn format-date [date-str]
  (let [date-obj              (js/Date. date-str)
        hour                  (.getHours date-obj)
        minutes               (.getMinutes date-obj)
        {:keys [hour period]} (time-of-day hour)]
    (str hour ":" (format-minute minutes) " " period)))

(comment
  "Some incomplete crap to start showing a countdown for CFP"
  (defn subtract-seconds
    ([s] (subtract-seconds (js/Date.) s))
    ([d s] (js/Date. (- (.getTime d) (* 1000 s)))))
  (defonce cfp-end-date (js/Date. "2020" "01" "11"))
  (defonce timer (atom (- (/ (.getTime cfp-end-date) 1000) (/ (.getTime (js/Date.)) 1000))))
  (defonce time-updater (js/setInterval #(swap! timer (fn [last-sec] (- last-sec 1))) 1000))
  (let [delta @timer
        days (Math/floor (/ delta 86400))
        new-delta (- delta (* days 86400))
        hours (mod (Math/floor (/ new-delta 3600)) 24)]))
