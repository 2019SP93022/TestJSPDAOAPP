<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>
    
    <script type="text/javascript">
	window.history.forward();
	function noBack(){ window.history.forward(); }
</script>
    
    
<% 
   if(session.isNew())
       response.sendRedirect("index.jsp");
%>   
    
<title>Untitled</title>
<meta http-equiv="content-type" content="text/html; charset=iso-8859-1">
<meta name="generator" content="Web Page Maker">
<script language="JavaScript1.4" type="text/javascript">
<!--
function jsPlay(soundobj) {
 var thissound= eval("document."+soundobj);
 try {
     thissound.Play();
 }
 catch (e) {
     thissound.DoPlay();
 }
}
//-->
</script>

<script language="javascript" type="text/javascript">
<!--
function MM_swapImgRestore() {
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() {
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) {
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() {
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

//-->
</script>

</head>
<body  onload="noBack();">
<div id="image1" style="position:absolute; overflow:hidden; left:2px; top:1px; width:132px; height:109px; z-index:0"><img src="images/logo.jpg" alt="" title="" border=0 width=132 height=109></div>

<div id="image2" style="position:absolute; overflow:hidden; left:133px; top:3px; width:534px; height:109px; z-index:1"><img src="images/name.jpg" alt="" title="" border=0 width=534 height=109></div>

<div id="image3" style="position:absolute; overflow:hidden; left:670px; top:0px; width:132px; height:109px; z-index:2"><img src="images/logo.jpg" alt="" title="" border=0 width=132 height=109></div>

<div id="nav10d" style="position:absolute; left:0px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav10','','images/nav10992920a.gif',1)" href="FrontPage.jsp"><img name="nav10" onLoad="MM_preloadImages('images/nav10992920a.gif')" alt="" border=0 src="images/nav10992920i.gif"></a></div>
<div id="nav11d" style="position:absolute; left:138px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav11','','images/nav10992921a.gif',1)" href="InsertStudent.jsp"><img name="nav11" onLoad="MM_preloadImages('images/nav10992921a.gif')" alt="" border=0 src="images/nav10992921i.gif"></a></div>
<div id="nav12d" style="position:absolute; left:276px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav12','','images/nav10992922a.gif',1)" href="DeleteStudent.jsp"><img name="nav12" onLoad="MM_preloadImages('images/nav10992922a.gif')" alt="" border=0 src="images/nav10992922i.gif"></a></div>
<div id="nav13d" style="position:absolute; left:414px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav13','','images/nav10992923a.gif',1)" href="SearchStudent.jsp"><img name="nav13" onLoad="MM_preloadImages('images/nav10992923a.gif')" alt="" border=0 src="images/nav10992923i.gif"></a></div>
<div id="nav14d" style="position:absolute; left:552px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav14','','images/nav10992924a.gif',1)" href="UpdateStudent.jsp"><img name="nav14" onLoad="MM_preloadImages('images/nav10992924a.gif')" alt="" border=0 src="images/nav10992924i.gif"></a></div>
<div id="nav15d" style="position:absolute; left:690px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav15','','images/nav10992925a.gif',1)" href="SearchAll.jsp"><img name="nav15" onLoad="MM_preloadImages('images/nav10992925a.gif')" alt="" border=0 src="images/nav10992925i.gif"></a></div>
<div id="nav16d" style="position:absolute; left:828px; top:111px; z-index:3"><a onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('nav16','','images/nav10992926a.gif',1)" href=""><img name="nav16" onLoad="MM_preloadImages('images/nav10992926a.gif')" alt="" border=0 src="images/nav10992926i.gif"></a></div>
<% 
  for(int i=1;i<=8;i++)
        out.println("<br>");
%>
<A href="signout.jsp">SignOut</A>
</body>

</html>
