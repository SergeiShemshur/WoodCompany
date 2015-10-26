



var phonecatApp = angular.module('employApp', [
    'ngRoute',
    'employControllers'
]);





phonecatApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/employ/show/:employId', {
                templateUrl: 'ROOT/partials/employInfo',
                controller: 'employDetailCtrl'
            }).
            when('/employ/add',{
                templateUrl:'ROOT/partials/employAdd'

            }).
            otherwise({
                redirectTo: 'employs'
            });
    }])
