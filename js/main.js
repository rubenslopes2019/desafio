angular.module('alurapic', ['minhasDiretivas', 'ngAnimate', 'ngRoute'])
.config(function($routeProvider, $locationProvider) {

	$routeProvider.when('', {
		controller: 'DesafioController',
	});
}); 
