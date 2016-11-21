(defn tail_factorial_recursion [n & [optional]]
  (if (= n 0)
    (or optional 1)
    (recur (dec n) [(*' (or optional 1) n)])))

(defn tail_factorial_recursion
  ([n]
    (tail_factorial_recursion n 1))
  ([n optional]
   (if (= n 0)
     (or optional 1)
     (recur (dec n) (*' (or optional 1) n)))))