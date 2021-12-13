(defproject jepsen.etcdemo "0.1.0-SNAPSHOT"
  :description "Jepsen tutorial"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [jepsen "0.2.1-SNAPSHOT"]
                 [verschlimmbesserung "0.1.3"]]
  :main jepsen.etcdemo
  :repl-options {:init-ns jepsen.etcdemo})
