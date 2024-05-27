(ns euler.level1.problem001);
;;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5, 6 and 9.
;;The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
(defn euler-1 [n]
  (let [multiples (for [i (range 1 n)
                        :when (or (zero? (mod i 3))
                                  (zero? (mod i 5)))]
                    i)
        sum (reduce + multiples)]
    sum))

