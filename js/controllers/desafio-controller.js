const httpOptions = {
   headers: new HttpHeaders({
     'Content-Type': 'application/json'
   })
};

angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$scope.lancamentos = []; 

	$http.get("lancamento-conta-legado.json")
	.success(function(lancamentos) {
		$scope.lancamentos = lancamentos;
	})
	.error(function(erro) {
		console.log(erro);
	});
});
