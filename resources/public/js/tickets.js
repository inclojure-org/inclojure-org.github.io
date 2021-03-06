$(document).ready(function() {
  var boxofficeUrl = "https://boxoffice.hasgeek.com";
  $.get({
    url: boxofficeUrl + "/api/1/boxoffice.js",
    crossDomain: true,
    timeout: 30000,
    retries: 5,
    retryInterval: 10000,
    success: function(data) {
      var boxofficeScript = document.createElement('script');
      boxofficeScript.innerHTML = data.script;
      document.getElementsByTagName('body')[0].appendChild(boxofficeScript);
    },
    error: function(response) {
      var ajaxLoad = this;
      ajaxLoad.retries -= 1;
      var errorMsg;
      if (response.readyState === 4) {
        errorMsg = "Server error, please try again later.";
        $('#boxoffice-widget pre').html(errorMsg);
      }
      else if (response.readyState === 0) {
        if (ajaxLoad.retries < 0) {
          if(!navigator.onLine) {
            errorMsg = "Unable to connect. There is no network!";
            $('#boxoffice-widget pre').html(errorMsg);
          }
          else {
            errorMsg = "Unable to connect to the HasGeek ticketing portal. If you are behind a firewall or using any script blocking extension (like Privacy Badger), please ensure your browser can load boxoffice.hasgeek.com, api.razorpay.com and checkout.razorpay.com.";
            $('#boxoffice-widget pre').html(errorMsg);
          }
        } else {
          setTimeout(function() {
            $.get(ajaxLoad);
          }, ajaxLoad.retryInterval);
        }
      }
    }
  });
  window.addEventListener('onBoxofficeInit', function (e) {
    window.Boxoffice.init({
      org: "inclojure",
      itemCollection: "8fa14c74-376f-4fc6-b859-8adc823fe6f7",
      paymentDesc: "IN/Clojure 2020",
    });
  }, false);
});
