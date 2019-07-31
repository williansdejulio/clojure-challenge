(ns clojure-challenge.core
  (:require [cheshire.core :refer :all]))

(def response (slurp "https://raw.githubusercontent.com/joakimskoog/AnApiOfIceAndFire/master/data/books.json"))