<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" ng-app="bindExample">
<head>
  <title>Maven + Spring MVC</title>

  <spring:url value="/resources/core/css/hello.css" var="coreCss" />
  <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
  <spring:url value="/resources/core/js/angular.min1.js" var="angular"/>

  <link href="${bootstrapCss}" rel="stylesheet" />
  <link href="${coreCss}" rel="stylesheet" />
  <script src="${angular}"></script>
</head>
<body class="c">



<div ng-controller="ExampleController">
  <label>Enter name: <input type="text" ng-model="name"></label><br>
  Hello <span ng-bind="name" ></span>!
 <h1>{{name}}</h1>
</div>
<script>
  angular.module('bindExample', [])
          .controller('ExampleController', ['$scope', function($scope) {
            $scope.name = 'Whirled';
          }]);
</script>

<spring:url value="/resources/core/js/hello.js" var="coreJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/resources/core/js/jquery-2.1.4.min.js" var="jquery"/>




<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="${jquery}"></script>


</body>
</html>