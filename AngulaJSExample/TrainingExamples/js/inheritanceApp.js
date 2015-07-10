var myApp  = angular.module('myApp', []);



myAppController = myApp.controller('myAppController', function($scope) {

    console.log($scope);    
    $scope.name = "Sachin";
});


myAppSecondController = myApp.controller('myAppSecondController', function($scope) {

    console.log($scope);    
   // $scope.name = "Kohli";
    $scope.secondName = "Kohli";
});

/*var testMethod = function(firstname, lastname, age, employeeid) {

};


console.log(angular.injector().annotate(testMethod));
*/
