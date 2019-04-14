angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get("lancamento-conta-legado.json")
	.success(function(JSON.parse(lancamentos)) {
		$scope.lancamentos = lancamentos;
	})
	.error(function(erro) {
		console.log(erro);
	});
});
