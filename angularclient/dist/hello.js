angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('/service/movies').
        then(function(response) {
            $scope.movies = response.data;
        });
});
