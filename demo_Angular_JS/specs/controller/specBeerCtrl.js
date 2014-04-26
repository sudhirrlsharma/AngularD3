describe('Test for BeerCtrl', function() {
	var scope;//we'll use this scope in our tests
	
	var beerServiceMock;
	
	beforeEach(angular.mock.module('beerApp'));
	
	beforeEach(angular.mock.inject(function($rootScope,$controller) {
		 scope = $rootScope.$new();
		 $controller('listBeerCtrl', {$scope: scope});
		});
	);

	it('should populate the list of beer', function() {
		var scope = {}, ctrl = new listBeerCtrl(scope,beerService);
		expect(scope.mainpage).toEqual(someMainPageMock);
	});
});