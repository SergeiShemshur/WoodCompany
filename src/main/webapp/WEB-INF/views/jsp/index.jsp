<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!doctype html>
<html lang="en" ng-app="myApp" ng-controller="AppCtrl">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My Theme</title>


    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
    <spring:url value="/resources/core/bower_components/css-toggle-switch/dist/toggle-switch.css" var="toggle" />
    <spring:url value="/resources/core/bower_components/rangeslider/dist/rangeslider.css" var="rangeslider" />
    <spring:url value="/resources/core/css/maverix.css" var="maverix" />

    <!-- Bootstrap -->
    <link href="${bootstrapCss}" rel="stylesheet">
    <link href="${toggle}" rel="stylesheet">
    <link href="${rangeslider}" rel="stylesheet">
    <link href="${maverix}" rel="stylesheet">





    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<div class="sidebar">

    <div class="sidebar-navicontainer">
        <div class="sidebar-headbox">
            <span class="sidebar-header entypo-users  ">Employ</span>
            <a class="sidebar-toggle">Hide</a>
        </div>
        <ul class="nav" ng-controller="employList">
            <li ng-class="{ selected: isActive('/employ/all')}"><a href="#/employ/all"><span class="entypo-user"></span>
                All Employ</a></li>
            <li class="entypo-user" ng-class="{ selected: isActive('/employ/show/{{employ.id}}')}" ng-repeat="employ in employs">
                <a href="#/employ/show/{{employ.id}}">{{employ.lastName}} {{employ.name.substring(0,1)+'.'}} </a>
            </li>
            <li ng-class="{ selected: isActive('/employ/add')}"><a href="#/employ/add"><span class="entypo-plus"></span>
                Add employ</a></li>
        </ul>
    </div>

    <%--<div class="sidebar-navicontainer">
        <div class="sidebar-headbox">
            <span class="sidebar-header">Example Pages</span>
            <a class="sidebar-toggle">Hide</a>
        </div>
        <ul class="nav">
            <li ng-class="{ selected: isActive('/view1')}"><a href="#/view1"><span class="entypo-monitor"></span>
                Maverix</a></li>
            <li ng-class="{ selected: isActive('/view2')}"><a href="#/view2"><span class="entypo-attention"></span>
                Warnings <span class="sidebar-badge">4</span>
            </a></li>
        </ul>
    </div>--%>

    <div class="sidebar-navicontainer">
        <div class="sidebar-headbox">
            <span class="sidebar-header">Store</span>
            <a class="sidebar-toggle">Hide</a>
        </div>
<%--        <ul class="nav">
            <li><span class="entypo-user"></span> Users</li>
            <li><span class="entypo-users"></span> Groups</li>
            <li><span class="entypo-vcard"></span> Certificates</li>
            <li><span class="entypo-doc-text"></span> Protocols</li>
            <li><span class="entypo-chart-bar"></span> Stats</li>
        </ul>--%>
    </div>

    <div class="sidebar-navicontainer">
        <div class="sidebar-headbox">
            <span class="sidebar-header">Tasks</span>
            <a class="sidebar-toggle">Hide</a>
        </div>
     <%--   <ul class="nav">
            <li><a href=""><span class="entypo-archive"></span> Caching</a></li>
            <li><a href=""><span class="entypo-drive"></span> File Sharing</a></li>
            <li><a href=""><span class="entypo-calendar"></span> Calendar</a></li>
            <li><a href=""><span class="entypo-book"></span> Contacts</a></li>
            <li><a href=""><span class="entypo-mail"></span> Mail</a></li>
            <li><a href=""><span class="entypo-chat"></span> Messages <span class="sidebar-badge">1</span></a></li>
            <li><a href=""><span class="entypo-newspaper"></span> Profile Manager</a></li>
            <li><a href=""><span class="entypo-ccw"></span> Backups</a></li>
            <li><a href=""><span class="entypo-lock"></span> VPN</a></li>
            <li><a href=""><span class="entypo-globe"></span> Websites</a></li>
            <li><a href=""><span class="entypo-docs"></span> Wiki</a></li>
            <li><a href=""><span class="entypo-tools"></span> Build</a></li>
        </ul>--%>
    </div>
</div>


<div class="heading-bar">
    <!--<div class="user-bar">
        Hi, Username | <a href="#">Sign out</a>
    </div>-->
    <span class="heading-one"><%--<img ng-src="{{img}}" width="48"
                                   height="48"> --%>{{title}}</span>

    <div id="top-switch" class="osx-switch" ng-if="showTopToggle">
        <span class="osx-switch-label osx-switch-label-active">ON</span>
        <span class="osx-switch-label osx-switch-label-inactive">OFF</span>
        <label class="switch-light switch-candy" onclick="">
            <input type="checkbox">
            <a></a>
        </label>
    </div>
</div>

<div class="content">
    <div class="container" ng-view>
    </div>
</div>


<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/resources/core/js/jquery-2.1.4.min.js" var="jquery"/>
<spring:url value="/resources/core/bower_components/rangeslider/dist/rangeslider.min.js" var="rangesliderJS" />
<spring:url value="/resources/core/bower_components/flot/jquery.flot.js" var="jqueryflot" />
<spring:url value="/resources/core/bower_components/flot/jquery.flot.pie.js" var="flotpie" />
<spring:url value="/resources/core/" var="rangeslider" />
<spring:url value="/resources/core/js/angular.min1.js" var="angular"/>
<spring:url value="/resources/core/js/angular-route.min.js" var="angularRoute"/>


<script src="${jquery}"></script>
<script src="${bootstrapJs}"></script>
<script src="${rangesliderJS}"></script>
<script src="${jqueryflot}"></script>
<script src="${flotpie}"></script>
<script src="${angular}"></script>
<script src="${angularRoute}"></script>


<spring:url value="/resources/core/app/js/app.js" var="app"/>
<spring:url value="/resources/core/app/js/services.js" var="services"/>
<spring:url value="/resources/core/app/js/controllers.js" var="controllers"/>
<spring:url value="/resources/core/app/js/filters.js" var="filters"/>
<spring:url value="/resources/core/app/js/directives.js" var="directives"/>
<spring:url value="/resources/core/app/js/myJS.js" var="myJS"/>
<script src="${app}"></script>
<script src="${services}"></script>
<script src="${controllers}"></script>
<script src="${filters}"></script>
<script src="${directives}"></script>
<script src="${myJS}"></script>




<script>
    $(document).ready(function () {
        // Sidebar Toggle Button Initialization
        $(".sidebar-toggle").click(function (event) {
            var $nextUl = $(event.target).parents().eq(1).find("ul.nav");
            if (event.target.innerText === "Show") {
                event.target.innerText = "Hide";
            } else {
                event.target.innerText = "Show";
            }
            $nextUl.slideToggle("fast", "swing");
        });

        $(document).on("focus", function (e) {
            console.log("Focussed");
        });

        $(window).on('focus', function () {
            $("body").removeClass("blur");
        });

        $(window).on('blur', function () {
            $("body").addClass("blur");
        });

        // Rangeslider
        $('input[type="range"]').rangeslider({
            // Feature detection
            polyfill: false
        });
    });
</script>
</body>
</html>