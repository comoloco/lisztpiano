/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.41
 * Generated at: 2019-06-25 12:34:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.councel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class councel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/councel/../main/header.jsp", Long.valueOf(1561454147108L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1559572009822L));
    _jspx_dependants.put("jar:file:/C:/Users/YOO/Downloads/board/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/piano/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/YOO/Downloads/board/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/piano/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>리스트피아노-문의상담</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@FONT-FACE {\r\n");
      out.write("\tfont-family: 'HangeulNuriR';\r\n");
      out.write("\tsrc: url(\"/fonts/HangeulNuriR.ttf\") ''\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".councel_container {\r\n");
      out.write("\tdisplay: grid;\r\n");
      out.write("\tgrid-template-columns: 50% 50%;\r\n");
      out.write("\tgrid-template-rows: 100px 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], select {\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tpadding: 10px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"] {\r\n");
      out.write("\tfont-family: '맑은 고딕', 'malgun', Dotum, sans-serif;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tpadding-left: 3px;\r\n");
      out.write("\tborder: 1px solid #ABADB3\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tbackground-color: #4CAF50;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding: 14px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("\tbackground-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mailForm {\r\n");
      out.write("\tfont-size: 1.17em;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea {\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder: 1px solid #ABADB3;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>리스트피아노</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/resources/css/common/common.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- 공통 JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/common/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/common.js\"></script>\r\n");
      out.write("<script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".grid-menu{\r\n");
      out.write("display:grid;\r\n");
      out.write("grid-template-columns:10% 10% 10% 10% 10% 10% 10% 10%;\r\n");
      out.write("margin-left:20%\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h1 style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t<a href=\"/lisztMain\"style=\"font-size:35px;\">리스트 피아노</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"text-align: center\" class=\"grid-menu\" >\r\n");
      out.write("\t\t\t<a href=\"/aboutUs\" style=\"font-size:18px;margin-top: 5%;\">학원소개</a>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/curriculum\">커리큘럼</a>  <a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/admission\">수강신청</a>\r\n");
      out.write("\t\t\t <a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/news/boardList\">새소식</a>  <a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/councel\">문의상담</a>\r\n");
      out.write("\t\t\t <a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/board/boardList\">자료실</a><div style=\"margin-left:40%\" id=\"plusfriend-addfriend-button\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"float:right;\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("  //<![CDATA[\r\n");
      out.write("    // 사용할 앱의 JavaScript 키를 설정해 주세요.\r\n");
      out.write("    Kakao.init('1a64cff5903756cd504b9c57d51b2e1b');\r\n");
      out.write("    // 플러스친구 친구추가 버튼을 생성합니다.\r\n");
      out.write("    Kakao.PlusFriend.createAddFriendButton({\r\n");
      out.write("      container: '#plusfriend-addfriend-button',\r\n");
      out.write("      plusFriendId: '_WuxbTT' // 플러스친구 홈 URL에 명시된 id로 설정합니다.\r\n");
      out.write("    });\r\n");
      out.write("  //]]>\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<div id=\"container\" class=\"councel_container\"\r\n");
      out.write("\t\t\tstyle=\"text-align: center; margin-bottom:5%;\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h3 style=\"text-align: center; font-size: 20px;\">오시는길</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h3 style=\"text-align: center; font-size: 20px;\">상담 및 예약</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"map\"\r\n");
      out.write("\t\t\t\tstyle=\"margin-left: 100px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"mailForm\">\r\n");
      out.write("\t\t\t\t<form name=\"mailForm\" action=\"mailSending.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 제목 -->\r\n");
      out.write("\t\t\t\t\t\t<div>*이름</div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\" size=\"30\" id=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"이름\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 내용 -->\r\n");
      out.write("\t\t\t\t\t\t<div>성별</div>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"gender\" size=\"1\" id=\"gender\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"남성\">남성</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"여성\">여성</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"무관\">무관</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 내용 -->\r\n");
      out.write("\t\t\t\t\t\t<div>*나이</div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"age\" size=\"30\" id=\"age\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"숫자로 입력\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 내용 -->\r\n");
      out.write("\t\t\t\t\t\t<div>*연락처</div>\r\n");
      out.write("\t\t\t\t\t\t<div>('-' 없이 번호만 입력하세요.)</div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"tel\" size=\"30\" id=\"tel\" placeholder=\"연락처\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 내용 -->\r\n");
      out.write("\t\t\t\t\t\t<div>모집분야</div>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"kind\" size=\"1\" id=\"kind\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"입시반\">입시반</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"취미반\">취미반</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"음악치료반\">음악치료반</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"전문반\">전문반</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"주니어반\">주니어반</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 내용 -->\r\n");
      out.write("\t\t\t\t\t\t<div>*상담내용</div>\r\n");
      out.write("\t\t\t\t\t\t<textarea cols=\"30\" rows=\"12\" style=\"resize: none\" name=\"cont\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"cont\" class=\"form-control\"></textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" onclick=\"mail_submit();\" value=\"메일 보내기\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-warning\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\"\r\n");
      out.write("\t\t\tsrc=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=1a64cff5903756cd504b9c57d51b2e1b\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("function mail_submit(){\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar name = document.getElementById(\"name\");\r\n");
      out.write("\tvar name1 = document.getElementById(\"name\").value;\r\n");
      out.write("\tvar age = document.getElementById(\"age\").value;\r\n");
      out.write("\tvar tel = document.getElementById(\"tel\").value;\r\n");
      out.write("\tvar cont = document.getElementById(\"cont\").value;\r\n");
      out.write("\t\r\n");
      out.write("\tvar age1 = document.getElementById(\"age\");\r\n");
      out.write("\tvar tel1 = document.getElementById(\"tel\");\r\n");
      out.write("\tvar cont1 = document.getElementById(\"cont\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(name1==\"\"){\r\n");
      out.write("\t\talert(\"이름을 입력해주세요.\");\r\n");
      out.write("\t\tname.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t} else if(age==\"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"나이를 입력해주세요.\");\r\n");
      out.write("\t\tage1.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\r\n");
      out.write("\t} else if(tel==\"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"연락처를 입력해주세요.\");\r\n");
      out.write("\t\ttel1.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t} else if(cont==\"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"내용을 입력해주세요.\");\r\n");
      out.write("\t\tcont1.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t} else if(name1!=\"\"&&age!=\"\"&&age!=\"\"&&tel!=\"\"&&cont!=\"\"){\r\n");
      out.write("\t\tvar chk = confirm(\"메일을 보내시겠습니까?\");\r\n");
      out.write("\t\tif(chk == true){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#mailForm\").submit();\r\n");
      out.write("\t\t\t} else{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tname.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\t\tvar mapContainer = document.getElementById('map');\r\n");
      out.write("\t\tvar mapOption = {\r\n");
      out.write("\t\t\tcenter: new daum.maps.LatLng(37.590831, 126.905590),\r\n");
      out.write("\t\t\tlevel: 2\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar map = new daum.maps.Map(mapContainer, mapOption); // 지도를 생성합니다\r\n");
      out.write("\r\n");
      out.write("\t\t// 지도를 클릭한 위치에 표출할 마커입니다\r\n");
      out.write("\t\tvar marker = new daum.maps.Marker({ \r\n");
      out.write("\t\t    // 지도 중심좌표에 마커를 생성합니다 \r\n");
      out.write("\t\t    position: map.getCenter() \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t// 지도에 마커를 표시합니다\r\n");
      out.write("\t\tmarker.setMap(map);\r\n");
      out.write("\r\n");
      out.write("\t\t// 지도에 클릭 이벤트를 등록합니다\r\n");
      out.write("\t\t// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다\r\n");
      out.write("\t\tdaum.maps.event.addListener(map, 'click', function(mouseEvent) {        \r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    // 클릭한 위도, 경도 정보를 가져옵니다 \r\n");
      out.write("\t\t    var latlng = mouseEvent.latLng; \r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    // 마커 위치를 클릭한 위치로 옮깁니다\r\n");
      out.write("\t\t    marker.setPosition(latlng);\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';\r\n");
      out.write("\t\t    message += '경도는 ' + latlng.getLng() + ' 입니다';\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var resultDiv = document.getElementById('clickLatlng'); \r\n");
      out.write("\t\t    resultDiv.innerHTML = message;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/footer.jsp", out, true);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/councel/../main/header.jsp(35,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.size() > 0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
      // /WEB-INF/views/councel/../main/header.jsp(36,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.get('uid') eq 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/user/getUserList\">원생관리</a>");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
      // /WEB-INF/views/councel/../main/header.jsp(37,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.get('uid') ne 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"/user/manageUser\">원생관리</a>");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<a style=\"font-size:18px;margin-top: 5%; margin-left:30%\" href=\"#\" onclick=\"alert('로그인이 필요한 페이지 입니다.'); return flase;\">원생관리</a>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f1_reused = false;
    try {
      _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f1.setParent(null);
      int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
      if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      _jspx_th_c_005fchoose_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      // /WEB-INF/views/councel/../main/header.jsp(49,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.size() > 0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.get(\"uid\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님이 로그인 중입니다.\r\n");
          out.write("\t\t<a style=\"font-size:14px;\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/user/logoutTry\" style=\"text-decoration:underline;\">로그아웃</a>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f1_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<a style=\"font-size:14px;\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/login/login\">로그인</a>\r\n");
          out.write("\t\t\t<a style=\"font-size:14px;\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/login/signupForm\">회원가입</a>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      _jspx_th_c_005fotherwise_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f1_reused);
    }
    return false;
  }
}
