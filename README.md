NOTE: This repository has been migrated to https://gitlab.com/inclojure/inclojure.gitlab.io/ because they support HTTPS with LetsEncrypt.

# Contributing

So far we've only created a basic static site with html, css, js. HTML files live
in the root dir, static/ contains css, js and assets. .well-known is a special
directory that is used by lets encrypt to verify ownership with a challenge.

The site is built using .gitlab-ci.yml, so far it just involves copying over all
the static stuff to a public/ dir and sending it off into Gitlab's cloud.

If you just want to edit copy, then you don't need to do anything.

For anything more sophisticated, please dig in to Gitlab's build process.

# Lets Encrypt

The HTTPS cert needs renewal every 90 days.

First install lets encrypt on your OS, then run ./letsencrypt.sh.

Then follow instructions to renew the certificate.

NOTE: This has only been tested on a Mac OS X with certbot 0.21.1

Thanks and happy hacking.

## Development mode

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser. The server will be available at [http://localhost:3449](http://localhost:3449) once Figwheel starts up.

Figwheel also starts `nREPL` using the value of the `:nrepl-port` in the `:figwheel`
config found in `project.clj`. By default the port is set to `7002`.

The figwheel server can have unexpected behaviors in some situations such as when using
websockets. In this case it's recommended to run a standalone instance of a web server as follows:

```
lein do clean, run
```

The application will now be available at [http://localhost:3000](http://localhost:3000).


### Optional development tools

Start the browser REPL:

```
$ lein repl
```
The Jetty server can be started by running:

```clojure
(start-server)
```
and stopped by running:
```clojure
(stop-server)
```


## Building for release

```
lein do clean, uberjar
```

## Deploying to Heroku

Make sure you have [Git](http://git-scm.com/downloads) and [Heroku toolbelt](https://toolbelt.heroku.com/) installed, then simply follow the steps below.

Optionally, test that your application runs locally with foreman by running.

```
foreman start
```

Now, you can initialize your git repo and commit your application.

```
git init
git add .
git commit -m "init"
```
create your app on Heroku

```
heroku create
```

optionally, create a database for the application

```
heroku addons:add heroku-postgresql
```

The connection settings can be found at your [Heroku dashboard](https://dashboard.heroku.com/apps/) under the add-ons for the app.

deploy the application

```
git push heroku master
```

Your application should now be deployed to Heroku!
For further instructions see the [official documentation](https://devcenter.heroku.com/articles/clojure).
