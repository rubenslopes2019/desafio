angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
	$http.get('http://viacep.com.br/ws/81350000/json')
    .subscribe(res => {
       this.resultado = res.json()
       console.log(this.resultado);
    });

});
