'use strict';
beerApp.factory('beerService', function($resource,$q) {
    return{
        getBeers: function(){
           return $resource('/js/data/beer.json').query();
        },
        saveBeer: function(beer){
            var deffered = $q.defer();
            $resource('/js/data/').save(beer,
                    function(response){deffered.resolve(response); },
                    function(response){deffered.reject(response);

            });
            console.info(beer);
            return deffered.promise;
        }

    }
});
   