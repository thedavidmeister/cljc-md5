(ns md5.core
 (:require
  goog.crypt
  goog.crypt.Md5))

(defn string->md5-hex
 [s]
 {:pre [(string? s)]
  :post [(string? %)]}
 #?(:cljs
    (goog.crypt/byteArrayToHex
     (let [md5 (goog.crypt.Md5.)]
      (.update md5 (goog.crypt/stringToUtf8ByteArray s))
      (.digest md5)))))
