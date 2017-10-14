(ns kubeletter.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [kubeletter.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[kubeletter started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[kubeletter has shut down successfully]=-"))
   :middleware wrap-dev})
