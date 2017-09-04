(ns kata02.karate-chop-test
  (:require [clojure.test :refer :all]
            [kata02.karate-chop :refer :all]))

(deftest chop-test
  (testing "kata chop"
    (is (= (chop 3 (list  )) -1))
    (is (= (chop 3 (list 1)) -1))
    (is (= (chop 1 (list 1))  0))
    (is (= (chop 1 (list 1 3 5)) 0))
    (is (= (chop 3 (list 1 3 5)) 1))
    (is (= (chop 5 (list 1 3 5)) 2))
    (is (= (chop 0 (list 1 3 5)) -1))
    (is (= (chop 2 (list 1 3 5)) -1))
    (is (= (chop 4 (list 1 3 5)) -1))
    (is (= (chop 6 (list 1 3 5)) -1))
    (is (= (chop 1 (list 1 3 5 7)) 0))
    (is (= (chop 3 (list 1 3 5 7)) 1))
    (is (= (chop 5 (list 1 3 5 7)) 2))
    (is (= (chop 7 (list 1 3 5 7)) 3))
    (is (= (chop 0 (list 1 3 5 7)) -1))
    (is (= (chop 2 (list 1 3 5 7)) -1))
    (is (= (chop 4 (list 1 3 5 7)) -1))
    (is (= (chop 6 (list 1 3 5 7)) -1))
    (is (= (chop 8 (list 1 3 5 7)) -1))
  ))
