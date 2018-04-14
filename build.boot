(def project 'thedavidmeister/cljc-md5)
(def version "0.0.1")
(def description "Clojure(script) string to md5 hex string")
(def github-url "https://github.com/thedavidmeister/cljc-md5")

(set-env!
 :source-paths #{"src"}
 :dependencies
 '[; scaffolding...
   [org.clojure/clojure "1.10.0-alpha4"]
   [org.clojure/clojurescript "1.10.238"]
   [adzerk/boot-cljs "2.1.4"]
   [crisptrutski/boot-cljs-test "0.3.5-SNAPSHOT"]
   [adzerk/bootlaces "0.1.13"]
   [adzerk/boot-test "1.2.0"]

   ; transitive deps...
   [doo "0.1.8"]])

(task-options!
 pom {:project project
      :version version
      :description description
      :url github-url
      :scm {:url github-url}})

(require
 '[adzerk.boot-cljs :refer [cljs]]
 '[crisptrutski.boot-cljs-test :refer [test-cljs]]
 '[adzerk.bootlaces :refer :all]
 '[adzerk.boot-test :refer :all])

(bootlaces! version)

(def compiler-options
 {})

(deftask deploy-clojars
 []
 (comp
  (build-jar)
  (push-release)))

(deftask deploy
 []
 (comp
  (deploy-clojars)))
