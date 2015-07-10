'use strict';

/**
 * The main app module.
 *
 * @type {angular.Module}
 */
var promiseModule = angular.module('promise', ['ngRoute']);

promiseModule.config(function ($routeProvider) {
  $routeProvider
    .when('/promise',{
      templateUrl: "promise.html",
      controller: "promiseController"
    })
	.when('/promiseChain', {
		templateUrl : 'promise.html',
		controller : 'promiseChainController'
	})
	.when('/flightDetails', {
		templateUrl : 'flightDetails.html',
		controller : 'flightDetailsController'
	})
	.when('/flightInfo', {
		templateUrl : 'flightDetails.html',
		controller : 'flightInfoController'
	})
	.otherwise({
        redirectTo:'/promise'
    });
});
