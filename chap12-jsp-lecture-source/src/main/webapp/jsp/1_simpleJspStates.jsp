
<!-- 지시자 태그 (page, include, taglib) 지시자 태그가 있다. -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP Simple states</h1>]
    <!-- HTML 주석-->
    <%-- jsp --%>

    <!-- 선언(declare) 태그 -->
    <%!
        private String name;
        private int age;
    %>

    <!-- 스크립트릿 태그 -->
    <%
        name = "홍길동";
        age = 20;

        System.out.println("age = " + age);
        System.out.println("name = " + name);

        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    %>

    <!-- 표현(expression)태그 -->
    name : <%= name %>
    <br>
    age : <%= age%>

</body>
</html>
