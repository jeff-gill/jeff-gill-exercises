/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {

    $("#form0").validate({

        debug: true,

        rules: {
            email: {
                required: true,
            },
            password: {
                required: true,
                minlength: 8,
                strongpassword: true
            },
            confirmPassword: {
                required: true,
                equalTo: "#password"
            }
        },

        messages: {
            email: {
                required: "You must provide a valid email."
            },
            password: {
                required: "You must provide a password.",
                minlength: "Your password must be at least 8 characters long.",
                strongpassword: "Please enter a strong password (one capital, one lower case, and one number)"
            },
            confirmPassword: {
                required: "You must confirm your password.",
                equalTo: "Your passwords must match."
            }

        },

        errorClass: "field-validation-error",
        validClass: "valid"

    });
});
$("#checkout").validate({
		
    debug: false,
    
    rules: {
        BillingAddress1: {
            required: true,
        },
        BillingCity: {
            required: true,
        },
        BillingState: {
            required: true,
        },
        BillingPostalCode: {
            required: true,
        },
        ShippingAddress1: {
            required: true,
        },
        ShippingCity: {
            required: true,
        },
        ShippingState: {
            required: true,
        },
        ShippingPostalCode: {
            required: true,
        },
        
        ShippingType:{
            required: true,
        },
        
        NameOnCard:{
            required: true,
        },
        
        CreditCardNumber:{
            required: true,
        },
        
        ExpirationDate:{
            required: true,
        }
    },

    messages: {
        BillingAddress1: {
            required: "You must provide a valid billing address."
        },
            BillingCity: {
                required: "You must provide a valid billing city."
            },
            BillingState: {
                required: "You must provide a valid billing state."
            },
            BillingPostalCode: {
                required: "You must provide a valid billing postal code."
            },
            ShippingAddress1: {
                required: "You must provide a valid shipping address."
            },
            ShippingCity: {
                required: "You must provide a valid shipping city."
            },
            ShippingState: {
                required: "You must provide a valid shipping state."
            },
            ShippingPostalCode: {
                required: "You must provide a valid shipping postal code."
            },
            ShippingType: {
                required: "You must choose a shipping type."
            },
            
            NameOnCard:{
                required: "Please enter the name on your credit card."
            },
            
            CreditCardNumber:{
                required: "Please enter your credit card number."
            },
            
            ExpirationDate:{
                required: "Please enter the expiration date on your credit card.",
            }
            
        },
        
        errorClass: "field-validation-error",
    validClass: "valid"
            
});

