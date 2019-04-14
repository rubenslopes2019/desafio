angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get(JSON.parse("lancamento-conta-legado.json"))
	.success(function(lancamentos) {
		$scope.lancamentos = lancamentos;
	})
	.error(function(erro) {
		console.log(erro);
	});
});
