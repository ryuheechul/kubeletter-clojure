(ns hello-http.core
  (:require [ring.adapter.jetty :as jetty]
            [hello-http.sch :as sch]
            ))

(sch/start)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "hello World"})

(defn -main []
  (jetty/run-jetty handler {:port 3000}))
