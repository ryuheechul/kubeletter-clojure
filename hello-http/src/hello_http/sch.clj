(ns hello-http.sch
  (:require [hara.io.scheduler :as hs]))

(defn start []
  (def sch (hs/scheduler
            {:print-task
             {:handler (fn [t] (println "task!!"))
              :schedule "/1 * * * * * *"
              }}))

  (hs/start! sch)
  )
