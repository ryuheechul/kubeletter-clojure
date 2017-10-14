(ns kubeletter.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[kubeletter started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[kubeletter has shut down successfully]=-"))
   :middleware identity})
