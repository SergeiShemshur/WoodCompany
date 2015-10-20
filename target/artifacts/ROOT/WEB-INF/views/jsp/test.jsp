<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Maven + Spring MVC</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 <body>

<sf:form  modelAttribute="employ" >
<sf:input path="id"/>
 <sf:input path="name"/>
 <sf:input path="lastName" cssClass="after" />
 <sf:button>submit</sf:button>
</sf:form>




 <h1 class="change"> hello</h1>
 <button onclick="cnage()">cnage</button>
 <script>
 function cnage() {
  $(".change").html("i work");
 }

 </script>
 
<spring:url value="/resources/core/js/hello.js" var="coreJs"  />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/resources/core/js/jquery-2.1.4.min.js" var="jquery"/>
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="${jquery}"></script>
 
</body>
</html>