$(document).ready(function () {
   //Customers
    $('#jdbcQueryAllCustomers').click(function () {
        $.ajax({
            type: 'POST',
            url: 'index',
            success: function (result) {
                $('#resultDiv').html(result);
            }
        });
    });

    $('#btn1').click(function () {
        $.ajax({
            type: 'POST',
            url: 'index',
            success: function (result) {
                $('#resultDiv').html(result);
            }
        });
    });

    $('#jdbcQueryAllGifts').click(function () {
        $.ajax({
            type: 'POST',
            url: 'index',
            success: function (result) {
                $('#resultDiv').html(result);
            }
        });
    });

    $('#jdbcQueryAllOrders').click(function () {
        $.ajax({
            type: 'POST',
            url: 'index',
            success: function (result) {
                $('#resultDiv').html(result);
            }
        });
    });

});
        