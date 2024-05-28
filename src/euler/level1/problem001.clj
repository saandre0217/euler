(ns euler.level1.problem001)                                ;
;;If we list all the natural numbers below 10
;; that are multiples of 3 or 5, we get 3,5, 6 and 9.
;;The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple-of-3-or-5? [n]
      (and (> n 2)
           (or (zero? (mod n 5)) (zero? (mod n 3)))))

(defn find-multiples-of-3-or-5 [n]
      (filter multiple-of-3-or-5? (range n)))

(defn euler-1 [n]
      (apply + (find-multiples-of-3-or-5 n)) )
