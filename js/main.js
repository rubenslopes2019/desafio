angular.module('alurapic', ['ngAnimate', 'ngRoute'])
.config(function($routeProvider, $locationProvider) {
	
	console.log($routeProvider);
	var a  = $routeProvider;
	$routeProvider.when('', {
		templateUrl: 'index.html',
		controller: 'DesafioController',
	});
}); 
