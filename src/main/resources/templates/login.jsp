<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
    src="https://code.jquery.com/jquery-3.4.1.js"
    integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
    crossorigin="anonymous"></script>
    
</head>
<body>

<div class="wrapper">

    <div class="wrap">
        <form id = "login form" method="post">
            <div class="logo_wrap">
                <span></span>
            </div>
            <div class="login_wrap">
                <div class="id_wrap">
                        <div class="id_input_box">
                            <input class="id input" name="memberId">
                    </div>
                </div>
                <div class="pw_wrap">
                    <div class="pw_input_box">
                        <input class="pw_input" name="memberPw">
                    </div>
                </div>

                <div class="login_warn">사용자ID 또는 비밀번호를 잘못 입력하셨습니다.</div>

                <div class="login_button_wrap">
                    <input type="button" class="login_button" value="로그인">
                </div>
            </div>
        </form>

    </div>

</div>

<script>
    /* 로그인 버튼 클릭 메서드 */
    $(".login_button").click(function() {

        alert("로그인 버튼 작동");

        /* 로그인 메서드 서버 요청 */
        		$("#login_form").attr("action", "/member/login");
        		$("#login_form").submit();

    });

</script>