(ns jepsen.etcdemo
  (:require [jepsen.cli :as cli]
            [jepsen.tests :as j-tests]))

(defn etcd-test
  "Constructs a test map from options"
  [opts]
  (merge j-tests/noop-test
         {:pure-generators true}
         opts))

(defn -main
  [& args]
  (cli/run! (cli/single-test-cmd {:test-fn etcd-test})
            args))
