<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<link>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.17.11/dist/css/uikit.min.css" />
<script src="https://cdn.jsdelivr.net/npm/uikit@3.17.11/dist/js/uikit.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/uikit@3.17.11/dist/js/uikit-icons.min.js"></script>
<link rel="stylesheet" href="main.css">
    <title>Pharmacy "Sady"</title>
    <link rel="icon" type="image/x-icon" href="../img/logo.png">
</head>
<body>
    <nav class="uk-navbar-container">
        <div class="uk-container">
            <div uk-navbar>
                <div class="uk-navbar-center">
                    <div class="uk-navbar-center-left">
                        <ul class="uk-navbar-nav">
                            <li><a href="${pageContext.request.contextPath}/booking">Booking</a></li>
                        </ul>
                    </div>
                    <a class="uk-navbar-item uk-logo" href="${pageContext.request.contextPath}/"><img src="../img/welcome.png" alt="" style="height: 50px;"></a>
                    <div class="uk-navbar-center-right">
                        <ul class="uk-navbar-nav">
                            <li>
                                <a href="#">Profile</a>
                                <div class="uk-navbar-dropdown">
                                    <ul class="uk-nav uk-navbar-dropdown-nav">
                                        <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
                                        <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </nav>
