angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('service/').
        then(function(response) {
            $scope.movies = response.data;
        });
});
