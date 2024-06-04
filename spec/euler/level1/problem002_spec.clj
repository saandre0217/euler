(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

          (it "finds perfect square"
              (should= true (perfect-square? 0))
              (should= true (perfect-square? 1))
              (should= false (perfect-square? 2))
              (should= false (perfect-square? 3))
              (should= true (perfect-square? 4))
              (should= true (perfect-square? 4))
              )
          (it "is fibonachi"
              (should= true (is-fibonacci? 0))
              (should= true (is-fibonacci? 1))
              (should= true (is-fibonacci? 2))
              (should= true (is-fibonacci? 3))
              (should= false (is-fibonacci? 4))
              (should= true (is-fibonacci? 5))
              (should= false (is-fibonacci? 6))
              (should= false (is-fibonacci? 7))
              (should= true (is-fibonacci? 8))
              (should= false (is-fibonacci? 9))
              (should= true (is-fibonacci? 13))
              )
          (it "finds fibonachi"
              (should= [] (find-fibonacci 0))
              (should= [0] (find-fibonacci 1))
              (should= [0 1] (find-fibonacci 2))
              (should= [0 1 2] (find-fibonacci 3))
              (should= [0 1 2 3] (find-fibonacci 4))
              (should= [0 1 2 3] (find-fibonacci 5))
              (should= [0 1 2 3 5] (find-fibonacci 6))
              )

  (it "Solves #2"
    (should= 0 (euler-2 0))
    (should= 0 (euler-2 1))
    (should= 0 (euler-2 2))
    (should= 2 (euler-2 3))
    (should= 2 (euler-2 4))
    (should= 2 (euler-2 5))
    (should= 2 (euler-2 6))
    (should= 2 (euler-2 7))
    (should= 10 (euler-2 9))
    (should= 4613732 (euler-2 4000000))
      )
  )

(run-specs)
