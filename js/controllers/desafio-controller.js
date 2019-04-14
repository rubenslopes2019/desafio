angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.fotos = []; 
	$scope.mensagem = '';

	$http.get('lancamento-conta-legado.json')
	.success(function(retorno) {
		console.log(retorno);
		$scope.dados = retorno;
	})
	.error(function(erro) {
		console.log(erro);
	});
