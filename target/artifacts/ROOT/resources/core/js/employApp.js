



var phonecatApp = angular.module('employApp', [
    'ngRoute',
    'employControllers'
]);


phonecatApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/employ/show/:employId', {
                templateUrl: 'partials/employInfo',
                controller: 'employInfoCtrl'
            }).
            when('/employ/add',{
                templateUrl:'partials/employAdd'

            }).
            when('/employ/all',{
                templateUrl:'partials/employAll',
                controller:'employList'
            }).
            otherwise({
                redirectTo: 'employs'
            });
    }]);
