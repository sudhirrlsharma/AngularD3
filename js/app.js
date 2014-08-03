'use strict';
var greetingApp = angular.module('greetingApp',[]);
var beerApp = angular.module('beerApp', ['ngRoute','ngResource','ngGrid']);

beerApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider
            .when('/addEdit',{
                templateUrl: 'html/EditBeer.html',
                controller: 'editBeerCtrl'
            })
            .when('/beers', {
                templateUrl: 'html/ListBeer.html',
                controller: 'listBeerCtrl'
            })
            .otherwise({
                redirectTo:'/login.html'
            });

    }]);