angular.module('alurapic', ['ngAnimate', 'ngRoute'])
.config(function($routeProvider, $locationProvider) {
	$routeProvider.when('/principal', {
		templateUrl: 'index.html',
		controller: 'DesafioController',
	});
}); 
