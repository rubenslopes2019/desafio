angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get('lancamento-conta-legado.json')
	.success(function(retorno) {
		console.log(retorno);
		$scope.lancamentos = retorno; 
	})
	.error(function(erro) {
		console.log(erro);
	});

});
