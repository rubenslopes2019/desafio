angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get('http://viacep.com.br/ws/81350000/json', $scope.lancamentos)
	.success(function(retorno) {
		console.log(retorno);
		$scope.lancamentos = retorno; 
	})
	.error(function(erro) {
		console.log(erro);
	});

});
