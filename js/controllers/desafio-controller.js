angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get("lancamento-conta-legado.json")
	.success(function(retorno) {
		console.log(retorno);
		$scope.lancamentos = retorno; // não precisa fazer retorno.data
	})
	.error(function(erro) {
		console.log(erro);
	});
});
