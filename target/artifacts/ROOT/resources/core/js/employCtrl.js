var employControllers = angular.module('employControllers', []);

/*
 phonecatControllers.controller('PhoneListCtrl', ['$scope', '$http',
 function($scope, $http) {
 $http.get('phones/phones.json').success(function(data) {
 $scope.phones = data;
 });

 $scope.orderProp = 'age';
 }]);

 phonecatControllers.controller('PhoneDetailCtrl', ['$scope', '$routeParams', '$http',
 function($scope, $routeParams, $http) {
 $http.get('phones/' + $routeParams.phoneId + '.json').success(function(data) {
 $scope.phone = data;
 });
 }]);
 */

employControllers.controller('employList', ['$scope', '$http', function ($scope, $http) {
    $http.get('ROOT/employs').success(function (data) {
        $scope.employs = data;
    });

}]);


employControllers.controller('employDetailCtrl', ['$scope', '$routeParams', '$http',
 function($scope, $routeParams, $http) {
  $http.get('ROOT/employ/show/' + $routeParams.employId).success(function(data) {
   $scope.employ = data;
  });
 }])