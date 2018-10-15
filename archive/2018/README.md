NOTE: This repository has been migrated to https://gitlab.com/inclojure/inclojure.gitlab.io/ because they support HTTPS with LetsEncrypt. Please ping @pastafari if you'd like to be added to the Gitlab organization.

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
