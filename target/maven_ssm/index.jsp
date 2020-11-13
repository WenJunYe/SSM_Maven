<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":" +request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh">
    <head>
        <meta charset="utf-8">
        <base href="<%=basePath%>">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
        <title>登录页面 - 光年(Light Year Admin)后台管理系统模板</title>
        <link rel="icon" href="favicon.ico" type="image/ico">
        <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
        <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
        <meta name="author" content="yinqi">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/materialdesignicons.min.css" rel="stylesheet">
        <link href="css/style.min.css" rel="stylesheet">
        <style>
            .lyear-wrapper {
                position: relative;
            }
            .lyear-login {
                display: flex !important;
                min-height: 100vh;
                align-items: center !important;
                justify-content: center !important;
            }
            .lyear-login:after{
                content: '';
                min-height: inherit;
                font-size: 0;
            }
            .login-center {
                background: #fff;
                min-width: 29.25rem;
                padding: 2.14286em 3.57143em;
                border-radius: 3px;
                margin: 2.85714em;
            }
            .login-header {
                margin-bottom: 1.5rem !important;
            }
            .login-center .has-feedback.feedback-left .form-control {
                padding-left: 38px;
                padding-right: 12px;
            }
            .login-center .has-feedback.feedback-left .form-control-feedback {
                left: 0;
                right: auto;
                width: 38px;
                height: 38px;
                line-height: 38px;
                z-index: 4;
                color: #dcdcdc;
            }
            .login-center .has-feedback.feedback-left.row .form-control-feedback {
                left: 15px;
            }
        </style>
    </head>

    <body>
        <div class="row lyear-wrapper" style="background-image: url('images/login_back.jpg'); background-size: 100%;">
            <div class="lyear-login">
                <div class="login-center">
                    <div class="login-header text-center">
                        <p style="font-size: 27px;display: inline-block;padding: 22px 33px;">博客后台管理系统</p>
                    </div>
                    <form action="user/save" method="post">
                        <div class="form-group has-feedback feedback-left">
                            <input type="text" placeholder="请输入您的用户名" class="form-control" name="user_name" id="username" />
                            <span class="mdi mdi-account form-control-feedback" aria-hidden="true"></span>
                        </div>
                        <div class="form-group has-feedback feedback-left">
                            <input type="password" placeholder="请输入密码" class="form-control" id="password" name="user_password" />
                            <span class="mdi mdi-lock form-control-feedback" aria-hidden="true"></span>
                        </div>
                        <!-- onclick="location.href='index.html'" -->
                        <div class="form-group">
                            <input class="btn btn-block btn-primary" value="立即登录" type="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
    </body>
</html>