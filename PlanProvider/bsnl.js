$(document).ready(function() {
    fetchBSNLPlans();
});

function fetchBSNLPlans() {
    $.ajax({
        url: 'http://localhost:9090/jio/airtel/bsnl', // Adjust the URL to your API endpoint for BSNL plans
        method: 'GET',
        success: function(data) {
            console.log("Data received from API:", data);
            var tbody = $('#plan_provider_tables tbody');
            
             // Clear existing rows if any

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
}
