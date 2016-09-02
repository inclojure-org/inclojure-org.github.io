const fs = require ("fs");
const gulp = require ("gulp");
const plumber = require ("gulp-plumber");
const sass = require ("gulp-sass");
const autoprefixer = require ("gulp-autoprefixer");
const importOnce = require ("node-sass-import-once");

const PATHS = {
  styles: {
    src: "styles/**/*.scss",
    dest: "static/css"
  }
};

const BROWSER_COMPATIBILITY = [
  "last 3 versions",
  "ie > 10"
];


const SASS_OPTIONS = {
  development: {
    outputStyle: "expanded",
    importer: importOnce,
    importOnce: {
      index: false
    }
  },
  production: {
    errLogToConsole: true,
    outputStyle: "compressed",
    importer: importOnce,
    importOnce: {
      index: false
    }
  }
};


const compileSass = (path, prod = false) => {
  let sassHasErrors = false;

  return gulp.src (path.src)
             .pipe (plumber ())
             .pipe (sass (prod === true ?
                                   SASS_OPTIONS.production : SASS_OPTIONS.development)
                                     .on ("error", sass.logError)
                                     .on ("error", () => {
                                       sassHasErrors = true;
                                     }))
             .pipe (autoprefixer ({
               browsers: BROWSER_COMPATIBILITY
             }))
             .pipe (plumber.stop ())
             .pipe (gulp.dest (path.dest));
};


gulp.task ("sass:styles", () => {
  compileSass (PATHS.styles);
});

gulp.task ("sass:compile", () => {
  compileSass (PATHS.styles, true);
});

gulp.task ("sass:watch", () => {
  gulp.watch ([PATHS.styles.src], ["sass:styles"]);
});
