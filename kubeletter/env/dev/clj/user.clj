(ns user
  (:require 
            [mount.core :as mount]
            kubeletter.core))

(defn start []
  (mount/start-without #'kubeletter.core/repl-server))

(defn stop []
  (mount/stop-except #'kubeletter.core/repl-server))

(defn restart []
  (stop)
  (start))


