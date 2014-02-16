'use strict';

beerApp.controller('listBeerCtrl', function ($scope, beerService) {
    $scope.beers = beerService.getBeers();

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
