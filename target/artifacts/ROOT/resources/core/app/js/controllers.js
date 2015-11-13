'use strict';

/* Controllers */

angular.module('myApp.controllers', [])
    .controller('employList', ['$scope', '$http', function ($scope, $http) {
    $http.get('employList').success(function (data) {
        $scope.employs = data;
    });


}])
    .controller('employInfoCtrl', ['$scope', '$routeParams', '$http',
    function($scope, $routeParams, $http) {
        $http.get('employ/detail/' + $routeParams.employId).success(function(data) {
            $scope.employ = data;
        });
    }])
    .controller('employAdd', ['$scope',
    function($scope) {
        $scope.update = function(){
console.log("add");
        };
    }])


    .controller('AppCtrl', ['$scope', '$location', function ($scope, $location) {
        $scope.isActive = function (viewLocation) {
            return viewLocation === $location.path();
        };

        $scope.title = "My company";
        $scope.subNav1 = 0;
        $scope.showTopToggle = false;
    }]);
