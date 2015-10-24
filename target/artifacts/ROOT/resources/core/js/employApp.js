



var phonecatApp = angular.module('employApp', [
    'ngRoute',
    'employControllers'
]);




/*
phonecatApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/employs', {
                templateUrl: 'partials/phone-list.html',
                controller: 'PhoneListCtrl'
            }).
            when('/phones/:phoneId', {
                templateUrl: 'partials/phone-detail.html',
                controller: 'PhoneDetailCtrl'
            }).
            otherwise({
                redirectTo: '/phones'
            });
    }])*/
