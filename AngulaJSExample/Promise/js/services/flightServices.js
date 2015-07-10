promiseModule.service('user', function() {
    return {
            name : "John Doe",
			email: "John.doe@abc.com"
    };
});

promiseModule.service( "travelService", function( user, $q ) {
	// Flight API (each returns a promise)
	return {
		getDeparture : function(user)
		{
				// Mock departure information for the user's flight
				var defer = $q.defer();
				defer.resolve ({
					userID   : user.email,
					flightID : "UA_343223",
					date  : "07/01/2014 8:00 AM",
					plane : {
							make  : "Boeing 747 RC",
							model : "TA-889"
					}
				});
				return defer.promise;
		},
		getFlight : function(flightID)
                {
                    var defer = $q.defer();
					defer.resolve ({
                        id    : flightID,
                        pilot : "Captain Morgan",
					    date  : "07/01/2014 8:00 AM",
                        plane : {
                            make  : "Boeing 747 RC",
                            model : "TA-889"
                        },
                        status: "onTime"
                    });
					return defer.promise;
                }
	};
});


promiseModule.service( "weatherService", function( $q ) {
	// Weather API (each returns a promise)
	return {
		getForecast : function( date )
		{
			var defer = $q.defer();
			defer.resolve({
				date     : date,
				forecast : "rain"
			});
			return defer.promise;
		}
	};

});
