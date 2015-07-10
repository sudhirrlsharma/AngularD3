var ViewController = routeModule.controller('ViewController', function($scope, $rootScope, $route, $location){
	$rootScope.$on("$routeChangeStart", function(event, current, previous,
			rejection) {
		debugger;
		console.log("$routeChangeStart::",$scope, $rootScope, $route, $location);
	});
	$rootScope.$on("$routeChangeSuccess", function(event, current, previous,
			rejection) {
		debugger;
		console.log("$routeChangeSuccess::",$scope, $rootScope, $route, $location);
	});
	
	$scope.changeRoute = function () {
	    debugger;
		console.log("After change route method::",$scope);
		
	    $location.path("/new");
	};
});

ViewController.loadData = function($q, $timeout) {
	var defer = $q.defer();
	$timeout(function() {
		defer.resolve({
			message : "success"
		});
	}, 2000);
	return defer.promise;
};

routeModule.controller("NewController", function($scope, loadData, $template) {
	debugger;
	console.log("NewController::",$scope, loadData, $template);
});