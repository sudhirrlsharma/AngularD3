promiseModule.controller('flightInfoController', function($scope, $q, user, travelService, weatherService, $log) {

    var loadFlight = function(user) {
            return travelService.getDeparture(user.email); // Request #1
        },
        parallelLoad = function(departure) {
            // Execute #2 & #3 in parallel...

            return $q.all([
                    travelService.getFlight(departure.flightID), // Request #2
                    weatherService.getForecast(departure.date) // Reqeust #3
                ])
                .then(function(result) {
                    //console.log('result', result);
                    $scope.departure = departure; // Response Handler #1
                    $scope.flight = result[0]; // Response Handler #2
                    $scope.weather = result[1]; // Response Handler #3
                });
        },
        reportProblems = function(fault) {
            $log.error(String(fault));
        };

    $scope.user = user;
    // 3-easy steps to load all of our information...
    // and now we can include logging for of problems within ANY of the steps

    loadFlight(user)
        .then(parallelLoad)
        .catch(reportProblems);
});