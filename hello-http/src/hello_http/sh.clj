(ns hello-http.sh
  (:use [clojure.java.shell :only [sh]])
  )

(defn test_sh []
  (let [sh_result (sh "pwd")]
    (let [{out :out exit :exit err :err} sh_result]
      (println "out:" out))
    )
  )
