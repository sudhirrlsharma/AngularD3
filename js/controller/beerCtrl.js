'use strict';

beerApp.controller('listBeerCtrl', function ($scope, beerService,$log) {
	 $log.info('I am in controller');
    $scope.beers = beerService.getBeers();
    console.log($scope);
    $scope.gridOptions = { data: 'beers' };

});


beerApp.controller('editBeerCtrl', function ($scope, $log, $location, beerService) {
    $scope.saveBeer = function (beer) {
        $log.info(beer);
        beerService.saveBeer(beer)
            .then(function (response) { $log.info('sucess', response); },
            function (response) { $log.error("fauiluer", response); }
        );
        $location.path('/beers');
    };
});
