<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function (){
                // alert("button click")
                $.ajax({
                    // url:"returnVoid-ajax.do",
                    url:"returnStudentJson.do",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    dataType:"json",
                    success:function (resp){
                        alert(resp.name +"    "+resp.age)
                    }
                })
            })
        })
    </script>
</head>
<body>
<p>处理器方法返回String表示视图名称</p>
<br>
<form action="returnString-view.do" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交参数">
</form>
<button id="btn">发起ajax请求</button>

</body>
</html>
