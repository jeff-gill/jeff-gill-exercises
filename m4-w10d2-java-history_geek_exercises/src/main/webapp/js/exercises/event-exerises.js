/// <reference path="../jquery-3.1.1.js" />

$(document).ready(
		function() {
			var sameShipping = $("#SameShipping");
				sameShipping.on("change", function(event) {
							if (sameShipping.is(':checked')) {
								$("#ShippingAddress1").val($("#BillingAddress1").val());
								$("#ShippingAddress2").val($("#BillingAddress2").val());
								$("#ShippingCity").val($("#BillingCity").val());
								$("#ShippingState").val($("#BillingState").val());
								$("#ShippingPostalCode").val($("#BillingPostalCode").val());
							} else {
								$("#ShippingAddress1").val('').removeAttr('checked').removeAttr('selected');
								$("#ShippingAddress2").val('').removeAttr('checked').removeAttr('selected');
								$("#ShippingCity").val('').removeAttr('checked').removeAttr('selected');
								$("#ShippingState").val('').removeAttr('checked').removeAttr('selected');
								$("#ShippingPostalCode").val('').removeAttr('checked').removeAttr('selected');
							}
				});
				var shippingMethod = $('input[name="ShippingType');
					shippingMethod.on("change", function(event) {
						var shippingCost = parseFloat($(this).attr('data-cost'));
						$('#shipping .price').html('$' + shippingCost);
						var subtotal = parseFloat($('#subtotal .price').html().substring(1));
						$('#grandtotal .price').html('$' + (subtotal + shippingCost));
				});
			});
//
// $(document).keydown(function(e) {
// var iceberg = "Take it easy Titanic. Hit restart and try again.";
// var pirate = "You've been capturrrrrrrrrrrrred by pirates. Hit restart and
// try again.";
// var treasure = "CONGRATULATIONS. You found the hidden treasure. Nice job!"
// switch(e.which) {
// case 37: // left
// break;
//
// case 38: // up
// break;
//
// case 39: // right
// break;
//
// case 40: // down
// break;
//
// default: return; // exit this handler for other keys
// }
// e.preventDefault(); // prevent the default action (scroll / move caret)
// });
