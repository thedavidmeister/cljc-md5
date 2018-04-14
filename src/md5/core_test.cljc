(ns md5.core-test
 (:require
  md5.core
  [clojure.test :refer [deftest is]]))

(deftest ??string->md5-hex
 (is (= "482c811da5d5b4bc6d497ffa98491e38" (md5.core/string->md5-hex "foo@example.com"))))
