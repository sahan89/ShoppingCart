'use strict';

/**
 * @ngdoc function
 * @name demoApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the demoApp
 */
angular.module('demoApp')
    .controller('CartCtrl', ['$scope','shoppingCart', function ($scope, shoppingCart) {
        $scope.shoppingCart = shoppingCart;
        //$scope.itemCounter = 0;

        //$scope.addToCart = function (product, stock) {
        //    $scope.itemCounter += 1;
        //    $scope.shoppingCart = {};
        //    $scope.shoppingCart.productId = product.id;
        //    $scope.shoppingCart.stock = stock;
        //    $scope.shoppingCart.status = "NOT_PURCHASED";
        //    $http.post('http://localhost:8080/shoppingcart/shoppingCart', $scope.shoppingCart);
        //}
    }]);
