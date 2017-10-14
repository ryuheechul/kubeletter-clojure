(ns hello-http.core
  (:require [ring.adapter.jetty :as jetty]
            [hello-http.sch :as sch]
            [hello-http.sh :as sh]
            ))

(sch/start)
(sh/test_sh)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "hello World"})

(defn -main []
  (jetty/run-jetty handler {:port 3000}))
