var app = angular.module("transcludeApp", []);

app.controller('MainCtrl', function($scope) {
  $scope.name = 'World';
  $scope.hobby='AngularJS';
});

app.directive('outputText',function(){
  return {
    transclude: true,
    scope: {},
    template: '<div ng-transclude></div>'
  }
});

app.directive('transcludeDirective', function() {
  return {
    transclude: 'element',
    scope: {},
    restrict: 'AE',
    replace: true,
    link: function(scope, elem, attrs, ctrl, transclude) {
      transclude(scope, function(clone) {
        clone.css('background-color', 'yellow');
        elem.after(clone);
      });
    },
    template: '<div ng-transclude></div>'
  }
});