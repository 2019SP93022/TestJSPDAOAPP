package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrontPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("<title>Untitled</title>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("<meta name=\"generator\" content=\"Web Page Maker\">\n");
      out.write("<script language=\"JavaScript1.4\" type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("function jsPlay(soundobj) {\n");
      out.write(" var thissound= eval(\"document.\"+soundobj);\n");
      out.write(" try {\n");
      out.write("     thissound.Play();\n");
      out.write(" }\n");
      out.write(" catch (e) {\n");
      out.write("     thissound.DoPlay();\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("function MM_swapImgRestore() {\n");
      out.write("  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_preloadImages() {\n");
      out.write("  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_findObj(n, d) {\n");
      out.write("  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\n");
      out.write("    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\n");
      out.write("  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\n");
      out.write("  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\n");
      out.write("  if(!x && d.getElementById) x=d.getElementById(n); return x;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_swapImage() {\n");
      out.write("  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)\n");
      out.write("   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}\n");
      out.write("}\n");
      out.write("\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"image1\" style=\"position:absolute; overflow:hidden; left:2px; top:1px; width:132px; height:109px; z-index:0\"><img src=\"images/logo.jpg\" alt=\"\" title=\"\" border=0 width=132 height=109></div>\n");
      out.write("\n");
      out.write("<div id=\"image2\" style=\"position:absolute; overflow:hidden; left:133px; top:3px; width:534px; height:109px; z-index:1\"><img src=\"images/name.jpg\" alt=\"\" title=\"\" border=0 width=534 height=109></div>\n");
      out.write("\n");
      out.write("<div id=\"image3\" style=\"position:absolute; overflow:hidden; left:670px; top:0px; width:132px; height:109px; z-index:2\"><img src=\"images/logo.jpg\" alt=\"\" title=\"\" border=0 width=132 height=109></div>\n");
      out.write("\n");
      out.write("<div id=\"nav10d\" style=\"position:absolute; left:0px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav10','','images/nav10992920a.gif',1)\" href=\"FrontPage.jsp\"><img name=\"nav10\" onLoad=\"MM_preloadImages('images/nav10992920a.gif')\" alt=\"\" border=0 src=\"images/nav10992920i.gif\"></a></div>\n");
      out.write("<div id=\"nav11d\" style=\"position:absolute; left:138px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav11','','images/nav10992921a.gif',1)\" href=\"InsertStudent.jsp\"><img name=\"nav11\" onLoad=\"MM_preloadImages('images/nav10992921a.gif')\" alt=\"\" border=0 src=\"images/nav10992921i.gif\"></a></div>\n");
      out.write("<div id=\"nav12d\" style=\"position:absolute; left:276px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav12','','images/nav10992922a.gif',1)\" href=\"DeleteStudent.jsp\"><img name=\"nav12\" onLoad=\"MM_preloadImages('images/nav10992922a.gif')\" alt=\"\" border=0 src=\"images/nav10992922i.gif\"></a></div>\n");
      out.write("<div id=\"nav13d\" style=\"position:absolute; left:414px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav13','','images/nav10992923a.gif',1)\" href=\"\"><img name=\"nav13\" onLoad=\"MM_preloadImages('images/nav10992923a.gif')\" alt=\"\" border=0 src=\"images/nav10992923i.gif\"></a></div>\n");
      out.write("<div id=\"nav14d\" style=\"position:absolute; left:552px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav14','','images/nav10992924a.gif',1)\" href=\"#\"><img name=\"nav14\" onLoad=\"MM_preloadImages('images/nav10992924a.gif')\" alt=\"\" border=0 src=\"images/nav10992924i.gif\"></a></div>\n");
      out.write("<div id=\"nav15d\" style=\"position:absolute; left:690px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav15','','images/nav10992925a.gif',1)\" href=\"\"><img name=\"nav15\" onLoad=\"MM_preloadImages('images/nav10992925a.gif')\" alt=\"\" border=0 src=\"images/nav10992925i.gif\"></a></div>\n");
      out.write("<div id=\"nav16d\" style=\"position:absolute; left:828px; top:111px; z-index:3\"><a onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('nav16','','images/nav10992926a.gif',1)\" href=\"\"><img name=\"nav16\" onLoad=\"MM_preloadImages('images/nav10992926a.gif')\" alt=\"\" border=0 src=\"images/nav10992926i.gif\"></a></div>\n");
      out.write("\n");
 
  for(int i=1;i<=8;i++)
        out.println("<br>");

      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
