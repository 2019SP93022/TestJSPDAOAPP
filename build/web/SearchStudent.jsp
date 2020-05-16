
<%@page import="model.Student"%>
<%@page import="dao.StudentDAO"%>
<%@include  file="FrontPage.jsp" %>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%! 
       Student S;
     %>
    
    </head>
    <body>
      
         <center>
             <h3>Student Search By Roll No</h3>
        <form method="post" action="SearchStudent.jsp">
            <table border="1">
                
             <tr>
                 <th>Roll No</th>
                 <td><input type="text" name="txtrno"></td>  
             </tr>
             <tr>
                 <td></td>
              <td>
                  <input type="submit" value="Submit">
                  <input type="reset" value="Reset">
              </td>   
             </tr>
             
             </table>   
            
            
        </form>
        
<%
      int rno;
      String rollno=null;
      rollno=request.getParameter("txtrno");
     if(rollno!=null)
     {
        rno=Integer.parseInt(rollno);
         StudentDAO sd=new StudentDAO();
         S=sd.searchByRno(rno);
         if(S==null)
             out.println("<font color=red size=9>Record Not Found</font>");
         else
         {
        %>
         <table border="1">
             <tr><th>Roll No</th><th>Name</th><th>Physics</th><th>Chem</th><th>Maths</th></tr>
             <tr>
                 <td><%=S.getRno()%></td>
                 <td><%=S.getName()%></td>
                 <td><%=S.getPhy()%></td>
                 <td><%=S.getChem()%></td>
                 <td><%=S.getMath()%></td>
             </tr>
         </table>   
    <%
         }
          
     }
      
      
     %>        
        
</center>
    </body>
</html>
