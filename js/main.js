angular.module('alurapic', [])
.config(function($routeProvider, $locationProvider) {

	$locationProvider.html5Mode(true);

	$routeProvider.when('', {
		controller: 'DesafioController',
	});
}); 
