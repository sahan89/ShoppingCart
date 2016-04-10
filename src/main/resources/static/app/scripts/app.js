'use strict';

/**
 * @ngdoc overview
 * @name demoApp
 * @description
 * # demoApp
 *
 * Main module of the application.
 */
angular
    .module('demoApp', [
        'ngAnimate',
        'ngCookies',
        'ngResource',
        'ngRoute',
        'ngSanitize',
        'ngTouch'
    ])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'app/views/main.html',
                controller: 'MainCtrl',
                controllerAs: 'main',
                resolve: {
                    products: function ($http) {
                        return $http.get("http://localhost:8080/shoppingcart/products").then(function (response) {
                            return response.data;
                        })
                    }
                }
            })

            .when('/cart', {
                templateUrl: 'app/views/cart.html',
                controller: 'AboutCtrl',
                controllerAs: 'cart'
            })
            .otherwise({
                redirectTo: '/'
            });
    });
