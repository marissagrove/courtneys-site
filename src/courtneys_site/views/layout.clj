(ns courtneys-site.views.layout
  (:require [hiccup.page :refer [html5 include-css]]
            [courtneys-site.models.common :as common]))

(defn common [& body]
  (html5
   [:head
    [:title "Courtney Grove"]
    [:link {:href "/css/screen.css", :rel "stylesheet", :type "text/css"}]]
   [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
   [:body common/navbar]
   [:iframe.bot {:src "https://console.api.ai/api-client/demo/embedded/cocobot"}]))
