routeModule.controller( "tourCoordinatorController", function( $scope, myFriendsHotel ) {
  $scope.name = "John Doe";
  $scope.place = "Switzerland";
  $scope.hotel = myFriendsHotel.hotelName( );
  $scope.roomno = myFriendsHotel.roomNo( );
});


