/**
 * @ngdoc controller
 * @name Employ
 *
 * @description
 * _Please update the description and dependencies._
 *
 * @requires $scope
 * */
var phonecatApp = angular.module('employApp', []);

phonecatApp.controller('employInfo', function ($scope) {
    $scope.phones = [
        {'name': 'Nexus S',
            'snippet': 'Fast just got faster with Nexus S.'},
        {'name': 'Motorola XOOM™ with Wi-Fi',
            'snippet': 'The Next, Next Generation tablet.'},
        {'name': 'MOTOROLA XOOM™',
            'snippet': 'The Next, Next Generation tablet.'}
    ];
});