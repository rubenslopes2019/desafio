angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get("lancamento-conta-legado.json")
	.success(function(lancamentos) {
		var b = JSON.parse(lancamentos);
		$scope.lancamentos = b;
	})
	.error(function(erro) {
		console.log(erro);
	});
});
