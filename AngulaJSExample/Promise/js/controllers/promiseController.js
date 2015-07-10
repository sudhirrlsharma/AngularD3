promiseModule.controller('promiseController', function($scope, $q) {
	
	var defer = $q.defer();
 
	defer.promise.then(function () {
		alert("I promised I would show up");
		$scope.model = {
		message: "This is my app!!!"
	}
	});
 
	defer.resolve();
 
	
    	
});