promiseModule.service('dataService',['$http','$q', function($http, $q) {
    var dataService = {};
    
    dataService.fetchData = function(method, url) {
        var deffered = $q.defer();
        console.log("Method::::" + method + ":::url:::" + url);
        $http({
            method: method,
            url: url
        }).success(function(data, status) {
            deffered.resolve(data);
        }).error(function(data, status) {
            deffered.reject(data || 'Request failed');
        });
        return deffered.promise;
    };
	
    return dataService;
}]);
