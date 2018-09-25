# Contributing

So far we've only created a basic static site with html, css, js. HTML files live
in the root dir, `static/` contains css, js and assets. `.well-known` is a special
directory that is used by lets encrypt to verify ownership with a challenge.

The site is hosted on GitLab pages using `.gitlab-ci.yml`.

# Lets Encrypt

The HTTPS cert needs renewal every 90 days.

First install lets encrypt on your OS, then run ./letsencrypt.sh.

Then follow instructions to renew the certificate.

**NOTE:** This has only been tested on a Mac OS X with certbot 0.21.1

Thanks and happy hacking.

# Development

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser. Visit `http://localhost:3449` to see the website.

Figwheel also starts `nREPL` using the value of the `:nrepl-port` in the `:figwheel`
config found in `project.clj`. By default the port is set to `7002`.

**NOTE:** lein is configured to setup the `.m2` directory within the project as `.local-m2` (as opposed to `~/.m2`) so that it plays well with gitlab and its artefact caching limitations

# Release

The CI pipeline will take care of building the static files for hosting, hence they are `.gitignore`d from the project.
