(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"
 (it "Output a number"
    (should= false (boolean? (euler-1 10)))
    (should= true (number? (euler-1 10)))
    )
  (it "Solves #1"
    (should-not= -1 (euler-1 10))
    (should= 23 (euler-1 10))
	(should= 233168 (euler-1 1000)))
  )

(run-specs)