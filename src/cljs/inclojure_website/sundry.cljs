(ns inclojure-website.sundry)

(defn rotate-vec [v n]
  (let [l   (count v)
        off (mod (+ (mod n l) l) l)]
    (concat (drop off v) (take off v))))

(defn goto-link [id]
  (set! (.-location js/window) (str "/#" id)))
