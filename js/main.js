var app = angular.module('myApp', []);
app.controller("myCtrl", function ($http, $scope) {
    $http.get('teste.json').then(function (response) {
        $scope.myData = response;
    });
});
