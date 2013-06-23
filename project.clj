(defproject cc.qbits/grease "0.2.2"
  :description "Lubricate all the things"
  :url "https://github.com/mpenet/grease"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
    :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :dev  {:dependencies []}
             :test  {:dependencies []}}
  :source-paths      ["src/clj"]
  :java-source-paths ["src/java"]
  :javac-options     ["-target" "1.6" "-source" "1.6"])
