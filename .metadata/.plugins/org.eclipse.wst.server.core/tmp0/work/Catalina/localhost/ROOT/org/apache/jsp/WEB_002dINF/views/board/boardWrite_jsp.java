/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.41
 * Generated at: 2019-06-17 10:17:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1559572009822L));
    _jspx_dependants.put("jar:file:/C:/Users/YOO/Downloads/board/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/piano/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>리스트피아노-게시글 작성</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/resources/css/common/common.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- 공통 JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/common/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/common/jquery.form.js\"></script>\r\n");
      out.write("<!-- <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js\"></script> \r\n");
      out.write(" --> <!--    <script src=\"http://malsup.github.com/jquery.form.js\"></script>  -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("jQuery(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\tfunction goBoardList(){\r\n");
      out.write("\t\tlocation.href=\"/board/boardList\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction insertBoard(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar boardSubject =jQuery(\"#board_subject\").val();\r\n");
      out.write("\t\tvar boardContent =jQuery(\"#board_content\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(boardSubject ==\"\"){\r\n");
      out.write("\t\t\talert(\"제목을 입력해주세요.\");\r\n");
      out.write("\t\t\tjQuery(\"#board_subject\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(boardContent==\"\"){\r\n");
      out.write("\t\t\talert(\"내용을 입력해주세요.\");\r\n");
      out.write("\t\t\tjQuery(\"#board_content\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar yn=confirm(\"게시글을 등록하시겠습니까?\");\r\n");
      out.write("\t\tif(yn){\r\n");
      out.write("\t\t\tvar filesChk =$(\"input[name='files[0]']\").val();\r\n");
      out.write("\t\t\tif(filesChk==\"\"){\r\n");
      out.write("\t\t\t\t$(\"input[name='files[0]']\").remove();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tjQuery(\"#boardForm\").ajaxForm({\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\turl:\"/board/insertBoard\",\r\n");
      out.write("\t\t\t\tenctype:\"multipart/form-data\",\r\n");
      out.write("\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\tasync:true,\r\n");
      out.write("\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\tsuccess: function(obj){\r\n");
      out.write("\t\t\t\t\tinsertBoardCallback(obj);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror:function(xhr, status, error){}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}).submit();\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction insertBoardCallback(obj){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(obj!=null){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar result=obj.result;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(result==\"SUCCESS\"){\r\n");
      out.write("\t\t\t\talert(\"게시글 등록을 성공하였습니다.\");\r\n");
      out.write("\t\t\t\tgoBoardList();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"게시글 등록을 실패하였습니다.\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t<h2>게시글 작성</h2>\r\n");
      out.write("\t\t\t\t<form id=\"boardForm\" name=\"boardForm\" action=\"/board/insertBoard\" enctype=\"multipart/form-data\" method=\"post\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" class=\"table02\">\r\n");
      out.write("\t\t\t\t\t\t<caption>\r\n");
      out.write("\t\t\t\t\t\t\t<strong><span class=\"t_red\">*</span>표시는 필수 입력 항목입니다.</strong>\r\n");
      out.write("\t\t\t\t\t\t</caption>\r\n");
      out.write("\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"*\">\r\n");
      out.write("\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"tbody\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>제목<span class=\"t_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input id=\"board_subject\" name=\"board_subject\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tbox01\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>작성자<span class=\"t_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input id=\"board_writer\" name=\"board_writer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.get('uid')}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadOnly class=\"tbox01\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>내용<span class=\"t_red\">*</span></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><textarea id=\"board_content\" name=\"board_content\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcols=\"10\" rows=\"5\" class=\"textarea01\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"row\">첨부파일</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"file\" id=\"files[0]\" name=\"files[0]\" value=\"\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"btn_right mt15\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn black mr5\" onclick=\"javascript:goBoardList();\">목록으로</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn black\" onclick=\"javascript:insertBoard();\">등록하기</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write(" \t\r\n");
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
}
