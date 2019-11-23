(ns inclojure-website.morellet
  (:require [inclojure-website.sundry :as sundry]))

;;
;; François Morellet
;;
;; a French contemporary painter, sculptor, and light artist. His
;; early work prefigured minimal art and conceptual art, and he played
;; a prominent role in the development of geometrical abstract art.
;;
;; This is a procedurally generated rendition of 'Croix violettes, bleues, vertes, jaunes, orange rouges'
;;

;;
;; Data
;;
(defn get-square
  [[x y] length color]
  {:x      x
   :y      y
   :length length
   :color  color})

(defn offset
  [square [x-percent y-percent] square-length]
  (-> square
      (update :x + (* x-percent square-length))
      (update :y + (* y-percent square-length))))

(defn get-cross
  [[x y] square-length color]
  (let [square (get-square [x y] square-length color)]
    {:top    (offset square [-0.5 -1.5] square-length)
     :left   (offset square [-1.5 -0.5] square-length)
     :bottom (offset square [-0.5 0.5] square-length)
     :right  (offset square [0.5 -0.5] square-length)
     :center (offset square [-0.5 -0.5] square-length)}))

(defn get-row
  [width [start-x y] square-length color-a color-b num-colors]
  (let [cross-gap (* (- num-colors 1) square-length)]
    (map-indexed (fn [i cross-x]
                   (let [color (nth [color-a color-b] (mod i 2))]
                     (get-cross [cross-x y] square-length color)))
                 (range start-x (+ width 100) cross-gap))))


(defn get-painting
  [width height colors square-count]
  (let [square-length (/ width square-count)
        num-colors    (count colors)
        mirror-colors (sundry/rotate-vec colors 3)]
    (reduce-kv (fn [res row-number row-y]
                 (let [color-idx (mod (+ (Math/floor (/ row-number 2)) 1) num-colors)
                       color-a   (nth colors color-idx)
                       color-b   (nth mirror-colors color-idx)
                       row-x     (-> (if (= (mod row-number 2) 0)
                                       (- 1.5 (/ row-number 2))
                                       (- -1 (/ row-number 2)))
                                     (* square-length))]
                   (conj res (vec (get-row width [row-x row-y] square-length color-a color-b num-colors)))))
               []
               (vec (range (* -0.5 square-length) (+ height 100) square-length)))))

;;
;; Drawing
;;
(defn draw-square [ctx {:keys [x y length color]}]
  (.beginPath ctx)
  (.moveTo ctx x y)
  (.lineTo ctx (+ x length) y)
  (.lineTo ctx (+ x length) (+ length y))
  (.lineTo ctx x (+ y length))
  (.lineTo ctx x y)
  (set! (.-strokeStyle ctx) color)
  (set! (.-fillStyle ctx) color)
  (.stroke ctx)
  (.fill ctx)
  (.closePath ctx))

(defn draw-cross [ctx cross]
  (doseq [[_ square] cross]
    (draw-square ctx square)))

(defn draw-row [ctx row]
  (doseq [cross row]
    (draw-cross ctx cross)))

(defn draw-painting [ctx painting]
  (doseq [row painting]
    (draw-row ctx row)))

;;
;; Render & animation
;;
(def square-count [8 16 24 32 64])
(def colors ["#147AAB" "#00B180" "#FFBA00" "#E36511" "#D04B36" "#675997"])

;;
;; This is currently unused due to performance issues
;;
;;
;; (def delay-time 3000)
;; (def then (atom (- (js/Date.now) delay-time)))
;;
;; (defn animate [ctx width height]
;;   (let [elapsed (- (js/Date.now) @then)]
;;     (when (> elapsed delay-time)
;;       (reset! then (- (js/Date.now) (mod elapsed delay-time)))
;;       (draw-painting ctx (get-painting width height (shuffle colors) square-count))))
;;   (js/requestAnimationFrame animate))
;;

(defn render [canvas]
  (doto canvas
    (.setAttribute "width"  (.-scrollWidth canvas))
    (.setAttribute "height" (.-scrollHeight canvas)))

  (let [ctx    (.getContext canvas "2d")
        width  (+ (.-width canvas))
        height (+ (.-height canvas))]

    (draw-painting ctx (get-painting width height (shuffle colors) (first (shuffle square-count))))))
