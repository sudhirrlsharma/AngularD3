promiseModule.controller('flightDetailsController', function($scope, $q, user, travelService, weatherService) {

    /*var defer = $q.defer();
 
	defer.promise
    .then(function (user) {
      return travelService
					.getDeparture( user.email )                     // Request #1
					.then( function( departure )
					{
						$scope.departure = departure;               // Response Handler #1
						return departure;
					});
    })
    .then(function (departure) {
      return travelService.getFlight( departure.flightID )
                .then( function( flight )
				{
					$scope.flight = flight;               // Response Handler #2
					return flight;
				});
    })
    .then(function (flight) {
      return weatherService.getForecast( flight.date )
                .then( function( weather )
				{
					$scope.weather = weather;               // Response Handler #3
				});
    });
 
    defer.resolve(user);*/



    var loadDeparture = function(user) {
            return travelService
                .getDeparture(user.email) // Request #1
                .then(function(departure) {
                    $scope.departure = departure; // Response Handler #1
                    return departure;
                });
        },
        loadFlight = function(departure) {
            return travelService
                .getFlight(departure.flightID) // Request #2
                .then(function(flight) {
                    $scope.flight = flight; // Response Handler #2
                    return flight;
                });
        },
        loadForecast = function(flight) {
            return weatherService
                .getForecast(flight.date) // Request #3
                .then(function(weather) {
                    $scope.weather = weather; // Response Handler #3
                });
        };


    // 3-easy steps to load all of our information...

    loadDeparture(user)
        .then(loadFlight)
        .then(loadForecast);

    $scope.user = user;
    $scope.departure = null;
    $scope.weather = null;
});