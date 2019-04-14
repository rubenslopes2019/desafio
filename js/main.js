app.controller("myCtrl", function ($http, $scope) {
    $http.get('http://viacep.com.br/ws/81350000/json').then(function (response) {
        $scope.resultado = response.data;
    });
});
