(ns hello-http.core
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "hello World"})

(defn -main []
  (jetty/run-jetty handler {:port 3000}))
