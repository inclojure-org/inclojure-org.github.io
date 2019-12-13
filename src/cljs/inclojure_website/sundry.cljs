(ns inclojure-website.sundry)

(defn rotate-vec [v n]
  (let [l   (count v)
        off (mod (+ (mod n l) l) l)]
    (concat (drop off v) (take off v))))

(defn goto-link [id]
  (set! (.-location js/window) (str "/#" id)))

(defn subtract-seconds
  ([s] (subtract-seconds (js/Date.) s))
  ([d s] (js/Date. (- (.getTime d) (* 1000 s)))))
