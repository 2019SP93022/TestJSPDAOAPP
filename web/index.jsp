<%@page import="dao.LoginDAO"%>
<%@page session="true" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
       <center>
           <form method="post" action="index.jsp">
           <table border="1">
          <tr>
              <th>User Name</th>
              <td><input type="text" name="txtUser"></td>
          </tr>
          <tr>
              <th>Password</th>
              <td><input type="password" name="txtPass"></td>
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
         String uname=null,upass=null;
         uname=request.getParameter("txtUser");
         upass=request.getParameter("txtPass");
         if(uname!=null)
         {
            if(LoginDAO.checkLogin(uname, upass))
            {   
                session.setAttribute("uname", uname);
                session.setAttribute("upass", upass);
                response.sendRedirect("FrontPage.jsp");
            }   
            else
            {
               out.println("Invalid user name or password");
            }  
            
         }
    
    %>
       
       </center>
       
    
    
    </body>
</html>
