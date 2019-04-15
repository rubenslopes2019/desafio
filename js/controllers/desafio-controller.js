angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 
	$scope.listaControleLancamento = []; 
	$scope.lancamentoContaCorrenteCliente = [];
	$scope.dadosDomicilioBancario = []; 
	$scope.totalControleLancamento = []; 
	$scope.indice;
	$scope.tamanhoPagina; 
	$scope.totalElements;

	$http.get("lancamento-conta-legado.json")
	.success(function(lancamentos) {
		$scope.lancamentos = JSON.stringify(lancamentos);
		$scope.listaControleLancamento = lancamentos.listaControleLancamento;
		$scope.lancamentoContaCorrenteCliente = listaControleLancamento.lancamentoContaCorrenteCliente;
		$scope.dadosDomicilioBancario = lancamentoContaCorrenteCliente.dadosDomicilioBancario;
		$scope.totalControleLancamento = lancamentos.totalControleLancamento;
		$scope.indice = lancamentos.indice;
		$scope.tamanhoPagina = lancamentos.tamanhoPagina;
		$scope.totalElements = lancamentos.totalElements;
		
	})
	.error(function(erro) {
		console.log(erro);
	});
});
