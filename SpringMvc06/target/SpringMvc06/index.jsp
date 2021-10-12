<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
</head>
<body>
<h2>Hello World!</h2>

<a href="jsonAction/checkJsonObject">测试testJsonObject方法</a><br>
<a href="jsonAction/checkJsonListObject">测试testJsonListObject方法</a><br>
<script type="text/javascript">

    $(document).ready(



        function(){

            //1.第一个业务处理
            $("#b1").click(

                function()
                {


                    //真实场景下的ajax调用

                    $.ajax(
                        {
                            url: "jsonAction/checkJsonObject",//不带参数
                            cache: false,
                            type: "GET",
                            dataType:"json",
                            async: true,
                            success: function(msg){
                                alert(msg);
                                alert(msg.username+"   "+msg.password+"   "+msg.age+"  "+msg.address.province);
                                $("#div1").html(msg.username+"   "+msg.password+"   "+msg.age+"  "+msg.address.province);
                            },
                            error:function(errordata){
                                alert("wrong!!"+errordata);
                            }

                        }

                    );


                }
            );


            //2.第一个业务处理

            $("#b2").click(
                function()
                {

                    //真实场景下的ajax调用

                    $.ajax(
                        {

                            url: "jsonAction/checkJsonListObject",
                            cache: false,
                            type: "GET",
                            dataType:"json",
                            async: true,
                            success: function(msg){
                                var str="";
                                $.each(msg,function(index,value){
                                        alert(index);
                                        alert(value);
                                        alert(value.username+"   "+value.age+"  "+value.address.province);
                                        str=str+value.username+"   "+value.age+"  "+value.address.province+"<br/>";

                                        //同样可以用这个集合的值取更新当前页面的组件

                                    }
                                );
                                $("#div2").html(str);
                            },

                            error:function(errordata){
                                alert("wrong!!"+errordata);
                            }

                        }

                    );


                }
            );





            //3.第一个业务处理


        }



    )

</script>

<input type="button" value="获取单个对象" id="b1" />
<div id="div1"></div>




<input type="button" value="获取多个对象" id="b2" />
<div id="div2"></div>

</body>
</html>
