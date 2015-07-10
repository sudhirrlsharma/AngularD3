'use strict';

/**
 * The main app module.
 *
 * @type {angular.Module}
 */
var routeModule = angular.module('routeApp', ['ngRoute']);

routeModule.config(function ($routeProvider, $locationProvider) {

  $routeProvider.when( "/visitplace", {
    templateUrl: "placetovisit.html",
    controller: "tourCoordinatorController",
    resolve: {
      "myFriendsHotel": function( ) {
        return {
          hotelName: function( ) {
            return "Marriot";
          },
          roomNo: function( ) {
            return "007";
          }
        };
      }
    }
  })
  .when('/Book/:bookId', {
    templateUrl: 'book.html',
    controller: 'BookController'
  })
  .when('/Book/:bookId/ch/:chapterId', {
    templateUrl: 'chapter.html',
    controller: 'ChapterController'
  })
  .when('/new', {
      templateUrl: "new.html",
      controller: "NewController",
      resolve: {
        loadData: ViewController.loadData
      }
    })
  /*.otherwise({
        redirectTo:'/someDefaultURL'
   })*/;
  
});
