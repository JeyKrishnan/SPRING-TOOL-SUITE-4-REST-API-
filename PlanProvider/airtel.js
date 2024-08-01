$(document).ready(function() {
    $.ajax({
        url: 'http://localhost:9090/jio/airtel',
        method: 'GET',
        success: function(data) {
            var tbody = $('#plan_tables');
            
            data.forEach(function(plan_provider, index) {
                var row = $('<tr>');
                row.append($('<td>').text(index + 1));
                // row.append($('<td>').text(plan_provider.network));
                row.append($('<td>').text(plan_provider.description));
                row.append($('<td>').text(plan_provider.price));
                row.append($('<td>').text(plan_provider.valid_days));
                row.append($('<td>').text(plan_provider.per_day_cost));
                tbody.append(row);
            });
        },
        error: function(error) {
            console.error('Error fetching data:', error);
        }
    });
});
