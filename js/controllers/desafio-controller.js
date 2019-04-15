angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get("lancamento-conta-legado.json")
	.success(function(lancamentos) {
		$scope.lancamentos = JSON.parse(lancamentos);
	})
	.error(function(erro) {
		console.log(erro);
	});
});
