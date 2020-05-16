<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@include  file="FrontPage.jsp" %>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
         <center>
             <h3>Student Delete By Roll No</h3>
        <form method="post" action="DeleteStudent">
            <table border="1">
                
             <tr>
                 <th>Roll No</th>
                 <td><input type="text" name="txtRno"></td>  
             </tr>
             <tr>
                 <td></td>
              <td>
                  <input type="submit" value="Submit">
                  <input type="reset" value="Reset">
              </td>   
             </tr>
             
             </table>   
        
    </body>
</html>
