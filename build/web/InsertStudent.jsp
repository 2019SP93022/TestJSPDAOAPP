<%@page import="dao.StudentDAO"%>
<!DOCTYPE html>

<%@page import="model.Student"  %>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script  language="javascript">
            
            function validate()
            {
                var rno,name,phy,chem,math;
                rno=document.getElementById("ROLLNO").value;
                name=document.getElementById("NAME").value;
                phy=document.getElementById("PHY").value;
                chem=document.getElementById("CHEM").value;
                math=document.getElementById("MATH").value;
                if(rno=="")
                {    
                    alert("Roll No Can't be left blank");
                    document.getElementById("ROLLNO").focus();
                    return false;
                 }
                 if(rno!="")
                 {
                     var valid="01234567890";
                      var i,ch;
                     for(i=0;i<rno.length;i++)
                     {
                         //alert(rno.charAt(i));
                         ch=rno.charAt(i);
                         if(valid.indexOf(ch)==-1)
                         {
                             alert("Only numbers allowed....");
                             document.getElementById("ROLLNO").focus();
                             document.getElementById("ROLLNO").select();
                           return false;
                         }    
                     }   
                     
                 }    
                if(name=="")
                {    
                    alert("Name Can't be left blank");
                    document.getElementById("NAME").focus();
                    return false;
                }
                if(name!="")
                { 
                    var asc;
                    for(i=0;i<name.length;i++)
                    {
                        asc=name.charCodeAt(i);
                        if(!((asc>=65 && asc<=91)||(asc>=97 && asc<=122)))
                        {
                            alert("Only Characters Allowed");
                            document.getElementById("NAME").focus();
                            return false;
                        }
                    }
                }    
                
                if(phy=="")
                {    
                    alert("Physics Marks Can't be left blank");
                    document.getElementById("PHY").focus();
                    return false;
                }
                
                if(phy>100)
                {    
                    alert("Invalid Physics Marks");
                    document.getElementById("PHY").focus();
                    return false;
                }
                
                
                if(chem=="")
                {    
                    alert("Chem Marks Can't be left blank");
                    document.getElementById("CHEM").focus();
                    return false;
                }
                
                if(phy>100)
                {    
                    alert("Invalid Physics Marks");
                 document.getElementById("PHY").focus();
                 //document.getElementById("PHY").select();
                   return false;
                }
                if(math=="")
                {    
                    alert("Maths Marks Can't be left blank");
                    document.getElementById("MATH").focus();
                    return false;
                }
                
                return true;
            }
            
        </script>
    </head>
    <body>
      <form method="post" action="InsertStudent.jsp">  
      <center>
          <h3>Student Entry Section</h3>
       <table border="1">
           <tr>
           <th>Roll No</th>
           <td><input type="text" name="txtRno" id="ROLLNO"></td> 
          </tr>
          <tr>
           <th>Name</th>
           <td><input type="text" name="txtName" id="NAME"></td> 
          </tr>
          <tr>
           <th>Physics</th>
           <td><input type="text" name="txtPhy" id="PHY"></td> 
          </tr>
          <tr>
           <th>Chem</th>
          <td><input type="text" name="txtChem" id="CHEM"></td> 
          </tr>
          <tr>
           <th>Maths</th>
          <td><input type="text" name="txtMath" id="MATH"></td> 
          </tr>
        <tr>
            <td></td> 
          <td>
              <input type="submit" value="Submit" onclick="return validate();">
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
         if(sd.insertStudent(S))
             out.println("Record Save");
       }   
       }
      catch(Exception e)
      {
       out.println(e);
      }
      
          
          
     %>   
        
    </body>
</html>
