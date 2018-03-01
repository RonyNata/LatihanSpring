<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body>

<script>
var app = angular.module("myShoppingList", []); 
app.controller("myCtrl", function($scope, $http) {
    $scope.products = [];

    $http.get("http://localhost:8080/api/get-all-pegawai")
    .then(function(response) {
        $scope.products = response.data;debugger
    });
});
</script>

<div ng-app="myShoppingList" ng-controller="myCtrl">
  <ul>
    <li ng-repeat="x in products">{{x}}</li>
  </ul>
</div>

<p>So far we have made an HTML list based on the items of an array.</p>

</body>
</html>
