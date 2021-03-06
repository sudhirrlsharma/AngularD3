'use strict';

var eventsApp = angular.module('eventsApp', []);
eventsController = eventsApp.controller('eventsController', function($scope) {
   // console.log($scope);    
    $scope.event = {
        name: "AngulajJS Training",
        date: "10 - Jul -2015",
        time: "2:00 PM",
        address: {
            confRoom: "Santiniketal",
            extention: "5303"
        },
        topics: [
                {title: "Introduction to Angular", author: "Sudhir Sharma", duration: "1.5h",voteCount:0},
                {title: "Directives", author: "Sudhir Sharma", duration: "1h",voteCount:0}
            ]
    };
    
    $scope.increaseVote = function(t){
        t.voteCount = t.voteCount +1;
    }
    
    $scope.decreaseVote = function(t){
        t.voteCount = t.voteCount -1;
        
    }
    
});
