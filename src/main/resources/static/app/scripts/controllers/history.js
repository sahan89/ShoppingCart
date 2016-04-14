'use strict';

/**
 * @ngdoc function
 * @name demoApp.controller:HistoryCtrl
 * @description
 * # HistoryCtrl
 * Controller of the demoApp
 */
angular.module('demoApp')
    .controller('HistoryCtrl', ['$scope', 'history', '$http', function ($scope, history, $http) {
        $scope.history1 = history;
    }]);