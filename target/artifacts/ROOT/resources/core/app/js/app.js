'use strict';


// Declare app level module which depends on filters, and services
angular.module('myApp', [
    'ngRoute',
    'myApp.filters',
    'myApp.services',
    'myApp.directives',
    'myApp.controllers'
]).
config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/employ/all',{templateUrl:'partials/employAll',controller:'employList'});
    $routeProvider.when('/employ/show/:employId',{templateUrl: 'partials/employInfo', controller: 'employInfoCtrl'});
    $routeProvider.when('/employ/add',{templateUrl:'partials/employAdd',contoller:'employAdd'});

    $routeProvider.otherwise({redirectTo: 'employs'});
}]);



/*
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
    }]);*/
