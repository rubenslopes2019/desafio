angular.module('alurapic', ['ngAnimate', 'ngRoute'])
.config(function($routeProvider, $locationProvider) {

	$routeProvider.when('/', {
		controller: 'DesafioController',
	});
}); 
