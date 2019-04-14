var app = angular.module('app', []);
app.controller('HomeCtrl', function($scope, $http) {

     http.get('http://viacep.com.br/ws/81350000/json')
        .map( res => res.json())
        .subscribe(resultados => {
            this.resultado = resultados;
            console.log(this.resultado);
      });
});
