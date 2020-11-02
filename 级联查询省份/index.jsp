
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>省市级联查询</title>
      <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
      <script type="text/javascript">
          $(function(){
              $("#btnload").click(function(){
                  $.ajax({
                      url:"/query/province",
                      dataType:"json",
                      success:function (resp){
                          $("#province").empty();
                          $.each(function (i,n){
                            $("#province").append("<option value='"+n.id +"'>" + n.name + "</option>");
                          })
                      }
                  })
              })
            $("#province").change(function (){
              var obj = $("#province>option:selected");
              var provincedId = obj.val();

            })
          })
      </script>
  </head>
  <body>
  <div>
       <table>
          <tr>
            <td>省份名称</td>
            <td>
              <select id="province">
                  <option value="0">请选择...</option>
              </select>
            </td>
              <td><input type="button" value="载入数据" id="btnload"></td>
          </tr>
         <tr>
           <td>城市名称</td>
           <td>
             <select id="city">
               <option value="0">请选择...</option>
             </select>
           </td>
         </tr>
       </table>
  </div>
  </body>
</html>
