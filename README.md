# Contributing

* Built using [ClojureScript](https://clojurescript.org) + [reagent](https://reagent-project.github.io)
* The default branch for this repo is `trunk`
* Install [Clojure + lein](https://purelyfunctional.tv/guide/how-to-install-clojure) before starting

# Development

To start the [Figwheel](https://figwheel.org) compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser. Visit `http://localhost:3449` to see the website.

Figwheel also starts `nREPL` using the value of the `:nrepl-port` in the `:figwheel`
config found in `project.clj`. By default the port is set to `7002`.

# Release

* The action [`.github/workflows/pages.yml`](./.github/workflows/pages.yml) is used to host the site over Github Pages
* The action takes care of building the static files, and hence they are `.gitignore`d from the project
* We only keep Github Pages relevant files in the `master` branch, all development happens on `trunk`
* Push to `trunk` for your changes to be picked up for deployment over `master`
* When you push to `trunk`, the action also deploys a commit ti `master`
