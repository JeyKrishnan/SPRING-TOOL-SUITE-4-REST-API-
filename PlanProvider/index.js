$(document).ready(function() {
    $.ajax({
        url: 'http://localhost:9090/jio',
        method: 'GET',
        success: function(data) {
            var tbody = $('#plans_table');
            
            data.forEach(function(plan, index) {
                var row = $('<tr>');
                row.append($('<td>').text(index + 1));
                // row.append($('<td>').text(plan.network));
                row.append($('<td>').text(plan.description));
                row.append($('<td>').text(plan.price));
                row.append($('<td>').text(plan.valid_days));
                row.append($('<td>').text(plan.per_day_cost));
                tbody.append(row);
            });
        },
        error: function(error) {
            console.error('Error fetching data:', error);
        }
    });
});
