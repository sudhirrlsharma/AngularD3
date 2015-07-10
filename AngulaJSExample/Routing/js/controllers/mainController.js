var mainCTRL = routeModule.controller('MainController', function($scope, $route, $routeParams, $location, $rootScope) {
	$scope.$route = $route;
	$scope.$location = $location;
	$scope.$routeParams = $routeParams;
});

 routeModule.controller('BookController', function($scope, $routeParams) {
     $scope.name = "BookController";
     $scope.params = $routeParams;
 });

 routeModule.controller('ChapterController', function($scope, $routeParams) {
     $scope.name = "ChapterController";
     $scope.params = $routeParams;
 });
 
