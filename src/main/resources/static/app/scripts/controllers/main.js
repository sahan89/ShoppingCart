'use strict';

/**
 * @ngdoc function
 * @name demoApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the demoApp
 */
angular.module('demoApp')
    .controller('MainCtrl', ['$scope', 'products', '$http', function ($scope, products, $http) {
        $scope.products = products;
        $scope.itemCounter = 0;

        $scope.addToCart = function (product, stock) {
            $scope.itemCounter += 1;
            $scope.shoppingCart = {};
            $scope.shoppingCart.productId = product.id;
            $scope.shoppingCart.status = "NOT_PURCHASED";

            if(angular.isUndefined(stock)){
                $scope.shoppingCart.stock = 1;
            }else {
                $scope.shoppingCart.stock = stock;
            }
            $http.post('http://localhost:8080/shoppingcart/shoppingCart', $scope.shoppingCart);
        }
    }]);
