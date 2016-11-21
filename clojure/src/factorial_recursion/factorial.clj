(ns factorial-recursion.factorial
  (:gen-class))

(defn factorial_recursion [number]
  (cond 
  (< number 0) (throw (Exception. "Value too low"))
  (= number 0) 1
  :else (*' number (factorial_recursion (dec number)))))

(defn tail_factorial_recursion[number]
        ((fn [position factorial]
          (cond 
          (< position 0) (throw (Exception. "Value too low"))
          (= position 0) factorial
          :else (recur (dec position) (*' factorial position)))) number 1))