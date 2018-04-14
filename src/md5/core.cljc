(ns md5.core)

(defn string->md5-hex
 [s]
 {:pre [(string? s)]}
 s)
