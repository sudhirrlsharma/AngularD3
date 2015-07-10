var myApp  = angular.module('myApp', ['ngRoute']);

myApp.config(function($routeProvider){

    $routeProvider
    
    .when ('/', {
    
        templateUrl: 'templates/main.htm',
        controller: 'myAppController'
    })

    .when ('/', {
    
        templateUrl: 'templates/second.htm',
        controller: 'secondController'
    }) ;

})



myAppController = myApp.controller('myAppController', ['$scope', '$log', '$location', function($scope, $log, $location) {

   // console.log($scope);    
    $scope.name = "John Doe";
    
    $log.info($location.path());

}]);


secondController = myApp.controller('secondController', ['$scope', '$log', '$location', function($scope, $log, $location) {

   // console.log($scope);    
    $scope.name = "John Doe";
    
    $log.info($location.path());

}]);



