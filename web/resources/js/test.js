function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
}

$(document).ready(function () {
    var val = $("#name-input").val();
    console.log(val);

    $("#name-input").focusout(function (e) {
        var val = $("#name-input").val();
        var valid = validateEmail(val);
        console.log(valid);
        if (!valid) {
            // $("#error-span").text("Email not valid");
            $(".js-error-el").show();
            $(".js-success-el").hide();
        } else {
            // $("#error-span").text("");
            $(".js-error-el").hide();
            $(".js-success-el").show();
        }

    });
});