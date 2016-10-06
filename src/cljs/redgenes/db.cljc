(ns redgenes.db)

(def default-db
  {:name "Intermine"
   :mine-url "http://beta.flymine.org/beta"
   :quicksearch-selected-index -1
   :query-builder
   {
    :query
    {
     :q/select #{}
     :q/where []
     :constraint-paths #{}
     }
    }
   })

(comment
  :q/something is for query builder
  :sd/something is for saved data)
