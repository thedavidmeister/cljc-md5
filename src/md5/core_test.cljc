(ns md5.core-test
 (:require
  md5.core
  [clojure.test :refer [deftest is]]))

(deftest ??string->md5-hex
 (is (= "b48def645758b95537d4424c84d1a9ff" (md5.core/string->md5-hex "foo@example.com"))))
