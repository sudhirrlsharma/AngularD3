var myApp  = angular.module('myApp', []);

myAppController = myApp.controller('myAppController', function($scope) {

   // console.log($scope);    
    $scope.name = "John Doe";
    $scope.foo = 0;
    $scope.bar = 0; 
    $scope.firstName = "John";
    $scope.updated = 0
    
    
    $scope.changeName = function() {
        
        $scope.name = "foo";
        console.log($scope.name);
    
    }

    
    $scope.$watch('firstName', function(){
    
    $scope.updated++;
    })
    
});


clickable = myApp.directive('clickable', function() {

  return {
    restrict: "E",
    scope: {
      foo: '=',
      bar: '='
    },
    template: '<ul style="background-color: lightblue"><li>foo count: {{foo}}</li><li>bar count: {{bar}}</li></ul>',
    link: function(scope, element, attrs) {
      element.bind('click', function() {
        scope.foo++;
        scope.bar++;
           
      });
        
       
    }
  }

});


/*var testMethod = function(firstname, lastname, age, employeeid) {

};


console.log(angular.injector().annotate(testMethod));
*/
