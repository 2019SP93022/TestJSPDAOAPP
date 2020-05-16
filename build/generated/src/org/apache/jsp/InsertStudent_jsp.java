package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.StudentDAO;
import model.Student;

public final class InsertStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script  language=\"javascript\">\n");
      out.write("            \n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                var rno,name,phy,chem,math;\n");
      out.write("                rno=document.getElementById(\"ROLLNO\").value;\n");
      out.write("                name=document.getElementById(\"NAME\").value;\n");
      out.write("                phy=document.getElementById(\"PHY\").value;\n");
      out.write("                chem=document.getElementById(\"CHEM\").value;\n");
      out.write("                math=document.getElementById(\"MATH\").value;\n");
      out.write("                if(rno==\"\")\n");
      out.write("                {    \n");
      out.write("                    alert(\"Roll No Can't be left blank\");\n");
      out.write("                    document.getElementById(\"ROLLNO\").focus();\n");
      out.write("                    return false;\n");
      out.write("                 }\n");
      out.write("                 if(rno!=\"\")\n");
      out.write("                 {\n");
      out.write("                     var valid=\"01234567890\";\n");
      out.write("                      var i,ch;\n");
      out.write("                     for(i=0;i<rno.length;i++)\n");
      out.write("                     {\n");
      out.write("                         //alert(rno.charAt(i));\n");
      out.write("                         ch=rno.charAt(i);\n");
      out.write("                         if(valid.indexOf(ch)==-1)\n");
      out.write("                         {\n");
      out.write("                             alert(\"Only numbers allowed....\");\n");
      out.write("                             document.getElementById(\"ROLLNO\").focus();\n");
      out.write("                             document.getElementById(\"ROLLNO\").select();\n");
      out.write("                           return false;\n");
      out.write("                         }    \n");
      out.write("                     }   \n");
      out.write("                     \n");
      out.write("                 }    \n");
      out.write("                if(name==\"\")\n");
      out.write("                {    \n");
      out.write("                    alert(\"Name Can't be left blank\");\n");
      out.write("                    document.getElementById(\"NAME\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(name!=\"\")\n");
      out.write("                { \n");
      out.write("                    var asc;\n");
      out.write("                    for(i=0;i<name.length;i++)\n");
      out.write("                    {\n");
      out.write("                        asc=name.charCodeAt(i);\n");
      out.write("                        if(!((asc>=65 && asc<=91)||(asc>=97 && asc<=122)))\n");
      out.write("                        {\n");
      out.write("                            alert(\"Only Characters Allowed\");\n");
      out.write("                            document.getElementById(\"NAME\").focus();\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }    \n");
      out.write("                \n");
      out.write("                if(phy==\"\")\n");
      out.write("                {    \n");
      out.write("                    alert(\"Physics Marks Can't be left blank\");\n");
      out.write("                    document.getElementById(\"PHY\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(phy>100)\n");
      out.write("                {    \n");
      out.write("                    alert(\"Invalid Physics Marks\");\n");
      out.write("                    document.getElementById(\"PHY\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                if(chem==\"\")\n");
      out.write("                {    \n");
      out.write("                    alert(\"Chem Marks Can't be left blank\");\n");
      out.write("                    document.getElementById(\"CHEM\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(phy>100)\n");
      out.write("                {    \n");
      out.write("                    alert(\"Invalid Physics Marks\");\n");
      out.write("                 document.getElementById(\"PHY\").focus();\n");
      out.write("                 //document.getElementById(\"PHY\").select();\n");
      out.write("                   return false;\n");
      out.write("                }\n");
      out.write("                if(math==\"\")\n");
      out.write("                {    \n");
      out.write("                    alert(\"Maths Marks Can't be left blank\");\n");
      out.write("                    document.getElementById(\"MATH\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <form method=\"post\" action=\"InsertStudent.jsp\">  \n");
      out.write("      <center>\n");
      out.write("          <h3>Student Entry Section</h3>\n");
      out.write("       <table border=\"1\">\n");
      out.write("           <tr>\n");
      out.write("           <th>Roll No</th>\n");
      out.write("           <td><input type=\"text\" name=\"txtRno\" id=\"ROLLNO\"></td> \n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("           <th>Name</th>\n");
      out.write("           <td><input type=\"text\" name=\"txtName\" id=\"NAME\"></td> \n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("           <th>Physics</th>\n");
      out.write("           <td><input type=\"text\" name=\"txtPhy\" id=\"PHY\"></td> \n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("           <th>Chem</th>\n");
      out.write("          <td><input type=\"text\" name=\"txtChem\" id=\"CHEM\"></td> \n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("           <th>Maths</th>\n");
      out.write("          <td><input type=\"text\" name=\"txtMath\" id=\"MATH\"></td> \n");
      out.write("          </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td> \n");
      out.write("          <td>\n");
      out.write("              <input type=\"submit\" value=\"Submit\" onclick=\"return validate();\">\n");
      out.write("              <input type=\"reset\" value=\"Reset\">\n");
      out.write("          </td> \n");
      out.write("          </tr>  \n");
      out.write("       </table>\n");
      out.write("      </center>\n");
      out.write("      </form>   \n");
      out.write("     ");
 
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
      
          
          
     
      out.write("   \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
