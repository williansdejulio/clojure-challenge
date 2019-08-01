(ns clojure-challenge.core
  (:require [cheshire.core :refer :all]))

(defn parse-json-from-url
  [url]
  (parse-string (slurp url) true))

(def url "https://raw.githubusercontent.com/joakimskoog/AnApiOfIceAndFire/master/data/books.json")
(def data (parse-json-from-url url))

(println (get (first data) :Name))

;; Definir função #1 ;;
(def show-name
  (fn [name]
    (println name)))

(show-name "Definição #1")

;; Definir função #2 ;;
(defn show-name2 [name]
  (println name))

(show-name2 "Teste #2")

;; Primeiro dado da lista ;;
(first data)

;; Todos os nomes dos livros na lista ;;
(map :Name data)

;; Soma o número de páginas de todos os livros da lista ;;
(reduce + (map :NumberOfPages data))

;; Mostra todos os dados únicos dos gêneros dos livros da lista ("distinct") ;;
(set (map :MediaType data))
