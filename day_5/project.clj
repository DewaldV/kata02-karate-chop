(defproject kata02 "1.0.0"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot kata02.karate-chop
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
