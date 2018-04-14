(ns md5.core-test
 (:require
  md5.core
  [clojure.test :refer [deftest is]]))

(deftest ??string->md5-hex
 ; don't use md5 hashing on shitty passwords...
 (is (= "482c811da5d5b4bc6d497ffa98491e38" (md5.core/string->md5-hex "password123"))))
