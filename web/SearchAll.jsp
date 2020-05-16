
<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@page import="dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="FrontPage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search All</title>
        <%! 
          List<Student>mylist;
        %>
    </head>
    <body>
      <center>  
        <%
           StudentDAO sd=new StudentDAO();
           mylist=sd.searchAll();
        %>
        
        <table border="1">
             <tr><th>Roll No</th><th>Name</th><th>Physics</th><th>Chem</th><th>Maths</th></tr>
          <% 
               for(Student S:mylist)
               {    
          %>
              <tr>
                 <td><%=S.getRno()%></td>
                 <td><%=S.getName()%></td>
                 <td><%=S.getPhy()%></td>
                 <td><%=S.getChem()%></td>
                 <td><%=S.getMath()%></td>
             </tr>
             
           <% 
               }
           %>  
             
        </table>
       </center>      
    </body>
</html>
