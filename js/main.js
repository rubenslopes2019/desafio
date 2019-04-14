var app = angular.module('app', []);
app.controller('HomeCtrl', function($scope, $http) {

    $http.get('mock.json').then(function(response) {
        $scope.data = response.data.alexa.item.children.child;
    });
});
