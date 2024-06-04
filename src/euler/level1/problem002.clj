(ns euler.level1.problem002)

(defn perfect-square? [n]
      (let [sqrt-n (Math/sqrt n)
            int-sqrt-n (int sqrt-n)]
           (== (* int-sqrt-n int-sqrt-n) n)))

(defn is-fibonacci? [n]
      (or (perfect-square? (+ (* 5 (* n n)) 4))
          (perfect-square? (- (* 5(* n n)) 4))))

(defn find-fibonacci [n]
      (filter is-fibonacci? (range n)))

(defn euler-2 [n]
      (apply + (filter even? (find-fibonacci n))) )