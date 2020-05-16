<%@page import="model.Student"%>
<%@page import="dao.StudentDAO"%>
<%@include  file="FrontPage.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%! 
        String sname;
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP  Update Page</title>
    </head>
    <body>
     
        <form method="post" action="UpdateStudent1.jsp">  
      <center>
          <h3>Update Student Section</h3>
       <table border="1">
           <tr>
           <th>Roll No</th>
           <td><input type="text" name="txtRno" value=<%=session.getAttribute("rno").toString()%> ></td> 
          </tr>
          <tr>
           <th>Name</th>
            <% 
              sname=session.getAttribute("name").toString();
            %>           
          <td><input type="text" name="txtName" value=<%=sname%>></td> 
          </tr>
          <tr>
           <th>Physics</th>
          <td><input type="text" name="txtPhy" value=<%=session.getAttribute("phy").toString()%>></td> 
          </tr>
          <tr>
           <th>Chem</th>
          <td><input type="text" name="txtChem" value=<%=session.getAttribute("chem").toString()%>></td> 
          </tr>
          <tr>
           <th>Maths</th>
          <td><input type="text" name="txtMath" value=<%=session.getAttribute("math").toString()%>></td> 
          </tr>
        <tr>
            <td></td> 
          <td>
              <input type="submit" value="Submit">
              <input type="reset" value="Reset">
          </td> 
          </tr>  
       </table>
      </center>
      </form>   
     <% 
          int rno,phy,chem,math;
          String name,sno=null;
          
       try
     {  
        sno=request.getParameter("txtRno");
        if(sno!=null)
       { 
          rno=Integer.parseInt(sno);
         name=request.getParameter("txtName");
         phy=Integer.parseInt(request.getParameter("txtPhy"));
         chem=Integer.parseInt(request.getParameter("txtChem"));
         math=Integer.parseInt(request.getParameter("txtMath"));
         Student S=new Student();
         S.setRno(rno);
         S.setName(name);
         S.setPhy(phy);
         S.setChem(chem);
         S.setMath(math);
         StudentDAO sd=new StudentDAO();
         if(sd.updateStudent(S))
             out.println("Record Updated.......");
       }   
       }
      catch(Exception e)
      {
       out.println(e);
      }
      
          
          
     %>   
        
    </body>
</html>
