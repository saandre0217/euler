(ns euler.level1.problem001-spec
    (:use
     [speclj.core]
     [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

          (it "finds multiples of 3 or 5 below n"
              (should= false (multiple-of-3-or-5? 0))
              (should= false (multiple-of-3-or-5? 1))
              (should= false (multiple-of-3-or-5? 2))
              (should= true (multiple-of-3-or-5? 3))
              (should= false (multiple-of-3-or-5? 4))
              (should= true (multiple-of-3-or-5? 5))
              (should= true (multiple-of-3-or-5? 6))
              (should= false (multiple-of-3-or-5? 7))
              (should= false (multiple-of-3-or-5? 8))
              (should= true (multiple-of-3-or-5? 9))
              (should= true (multiple-of-3-or-5? 10))
              (should= true (multiple-of-3-or-5? 15))
              )

          (it "finds multiples of 3 or 5"
              (should= [] (find-multiples-of-3-or-5 0))
              (should= [] (find-multiples-of-3-or-5 1))
              (should= [] (find-multiples-of-3-or-5 2))
              (should= [] (find-multiples-of-3-or-5 3))
              (should= [3] (find-multiples-of-3-or-5 4))
              (should= [3] (find-multiples-of-3-or-5 5))
              (should= [3 5] (find-multiples-of-3-or-5 6)))


          (it "Solves #1"
              (should= 0 (euler-1 0))
              (should= 0 (euler-1 1))
              (should= 0 (euler-1 2))
              (should= 0 (euler-1 3))
              (should= 3 (euler-1 4))
              (should= 3 (euler-1 5))
              (should= 8 (euler-1 6))
              (should= 23 (euler-1 10))
              (should= 233168 (euler-1 1000)))
          )

(run-specs)