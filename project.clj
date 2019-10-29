(defproject inclojure-website "4.0.0"
  :description "the in/clojure website"
  :url "http://inclojure.org"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring-server "0.5.0"]
                 [reagent "0.8.1"]
                 [reagent-utils "0.3.3"]
                 [ring "1.7.1"]
                 [ring/ring-defaults "0.3.2"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [yogthos/config "1.1.6"]
                 [org.clojure/clojurescript "1.10.520" :scope "provided"]
                 [secretary "1.2.3"]
                 [venantius/accountant "0.2.5" :exclusions [org.clojure/tools.reader]]]

  :plugins [[lein-environ "1.1.0"]
            [lein-cljsbuild "1.1.7"]
            [lein-asset-minifier "0.2.7"
             :exclusions [org.clojure/clojure]]]

  :local-repo ".local-m2"

  :min-lein-version "2.5.0"
  :uberjar-name "inclojure-website.jar"
  :main inclojure-website.server
  :clean-targets ^{:protect false}
  [:target-path
   [:cljsbuild :builds :app :compiler :output-dir]
   [:cljsbuild :builds :app :compiler :output-to]]

  :source-paths ["src/clj" "src/cljc"]
  :resource-paths ["resources" "target/cljsbuild"]

  :minify-assets
  {:assets
   {"resources/public/css/site.min.css" "resources/public/css/site.css"}}

  :cljsbuild
  {:builds {:min
            {:source-paths ["src/cljs" "src/cljc"]
             :compiler
             {:output-to     "resources/public/js/app.js"
              :optimizations :advanced
              :pretty-print  false}}
            :app
            {:source-paths ["src/cljs" "src/cljc"]
             :figwheel     {:on-jsload "inclojure-website.core/mount-root"}
             :compiler
             {:main          "inclojure-website.core"
              :asset-path    "js/figwheel-out"
              :output-to     "resources/public/js/app.js"
              :output-dir    "resources/public/js/figwheel-out"
              :source-map    true
              :optimizations :none
              :pretty-print  true}}}}

  :figwheel
  {:http-server-root "public"
   :server-port      3449
   :nrepl-port       7002
   :nrepl-middleware [cider.piggieback/wrap-cljs-repl]
   :css-dirs         ["resources/public/css"]}

  :profiles {:dev {:repl-options {:init-ns inclojure-website.repl}
                   :dependencies [[cider/piggieback "0.4.2"]
                                  [binaryage/devtools "0.9.10"]
                                  [ring/ring-mock "0.4.0"]
                                  [ring/ring-devel "1.7.1"]
                                  [prone "1.5.2"]
                                  [figwheel-sidecar "0.5.19"]
                                  [nrepl "0.6.0"]
                                  [cider/piggieback "0.4.2"]
                                  [pjstadig/humane-test-output "0.10.0"]]

                   :source-paths ["src/clj" "env/dev/clj"]
                   :ring-handler inclojure-website.handler/app
                   :plugins      [[lein-figwheel "0.5.19"]]

                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]
                   :env        {:dev true}}

             :uberjar {:hooks        [minify-assets.plugin/hooks]
                       :source-paths ["env/prod/clj"]
                       :prep-tasks   ["compile" ["cljsbuild" "once" "min"]]
                       :env          {:production true}
                       :aot          :all
                       :omit-source  true}})
