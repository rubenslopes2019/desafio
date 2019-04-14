angular.module('alurapic').controller('DesafioController', function($scope, $http) {
	
bairro: string;
    constructor(http: Http){

        http.get('http://viacep.com.br/ws/81350000/json')
        .subscribe(res => {
           this.bairro = res.json().bairro;
           console.log(this.bairro);
           // Cidade Industrial
        });
    }
});
