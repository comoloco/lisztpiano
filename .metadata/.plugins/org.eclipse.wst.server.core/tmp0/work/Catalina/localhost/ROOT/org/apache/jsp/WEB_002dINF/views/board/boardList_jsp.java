/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.41
 * Generated at: 2019-06-17 19:06:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1559572009822L));
    _jspx_dependants.put("jar:file:/C:/Users/YOO/Downloads/board/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/piano/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<title>리스트피아노-자료실</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/resources/css/common/common.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- 공통 JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/common/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tgetBoardList();\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t/* 게시판 - 상세 페이지 이동*/\r\n");
      out.write("\tfunction goBoardDetail(boardSeq) {\r\n");
      out.write("\t\tlocation.href = \"/board/boardDetail?boardSeq=\" + boardSeq;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/* 게시판 - 작성 페이지 이동*/\r\n");
      out.write("\tfunction goBoardWrite() {\r\n");
      out.write("\t\tlocation.href = \"/board/boardWrite\";\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/* 게시판 - 목록 조회 */\r\n");
      out.write("\tfunction getBoardList(currentPageNo) {\r\n");
      out.write("\r\n");
      out.write("\t\tif (currentPageNo === undefined) {\r\n");
      out.write("\t\t\tcurrentPageNo = \"1\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#current_page_no\").val(currentPageNo);\r\n");
      out.write("\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\turl : \"/board/getBoardList\",\r\n");
      out.write("\t\t\tdata : $(\"#boardForm\").serialize(),\r\n");
      out.write("\t\t\tdataType : \"JSON\",\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tasync : true,\r\n");
      out.write("\t\t\tsuccess : function(obj) {\r\n");
      out.write("\t\t\t\tgetBoardListCallback(obj);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(xhr, status, error) {\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction getBoardListCallback(obj) {\r\n");
      out.write("\r\n");
      out.write("\t\tvar state = obj.state;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(state == \"SUCCESS\"){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar data = obj.data;\t\t\t\r\n");
      out.write("\t\t\tvar list = data.list;\r\n");
      out.write("\t\t\tvar listLen = list.length;\t\t\r\n");
      out.write("\t\t\tvar totalCount = data.totalCount;\r\n");
      out.write("\t\t\tvar pagination = data.pagination;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tvar str = \"\";\r\n");
      out.write("\r\n");
      out.write("\t\tif (listLen > 0) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tfor (var a = 0; a < listLen; a++) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar boardSeq = list[a].board_seq;\r\n");
      out.write("\t\t\t\tvar boardReRef = list[a].board_re_ref;\r\n");
      out.write("\t\t\t\tvar boardReLev = list[a].board_re_lev;\r\n");
      out.write("\t\t\t\tvar boardReSeq = list[a].board_re_seq;\r\n");
      out.write("\t\t\t\tvar boardWriter = list[a].board_writer;\r\n");
      out.write("\t\t\t\tvar boardSubject = list[a].board_subject;\r\n");
      out.write("\t\t\t\tvar boardContent = list[a].board_content;\r\n");
      out.write("\t\t\t\tvar boardHits = list[a].board_hits;\r\n");
      out.write("\t\t\t\tvar delYn = list[a].del_yn;\r\n");
      out.write("\t\t\t\tvar insUserId = list[a].ins_user_id;\r\n");
      out.write("\t\t\t\tvar insDate = list[a].ins_date;\r\n");
      out.write("\t\t\t\tvar updUserId = list[a].upd_user_id;\r\n");
      out.write("\t\t\t\tvar updDate = list[a].upd_date;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tstr += \"<tr>\";\r\n");
      out.write("\t\t\t\tstr += \"<td>\" + boardSeq + \"</td>\";\r\n");
      out.write("\t\t\t\tstr += \"<td onclick='javascript:goBoardDetail(\" + boardSeq\r\n");
      out.write("\t\t\t\t\t\t+ \");' style='cursor:Pointer'>\";\r\n");
      out.write("\t\t\t\tif(boardReLev > 0){\r\n");
      out.write("\t\t\t\t\tfor(var b=0; b<boardReLev; b++){\r\n");
      out.write("\t\t\t\t\t\tstr+=\"▶:\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tstr += boardSubject\t+ \"</td>\";\r\n");
      out.write("\t\t\t\tstr += \"<td>\" + boardHits + \"</td>\";\r\n");
      out.write("\t\t\t\tstr += \"<td>\" + boardWriter + \"</td>\";\r\n");
      out.write("\t\t\t\tstr += \"<td>\" + insDate + \"</td>\";\r\n");
      out.write("\t\t\t\tstr += \"</tr>\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\tstr += \"<tr>\";\r\n");
      out.write("\t\t\tstr += \"<td colspan='5'>등록된 글이 존재하지 않습니다.</td>\";\r\n");
      out.write("\t\t\tstr += \"<tr>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#tbody\").html(str);\r\n");
      out.write("\t\t$(\"#total_count\").text(totalCount);\r\n");
      out.write("\t\t$(\"#pagination\").html(pagination);\r\n");
      out.write("\t} else{\r\n");
      out.write("\t\talert(\"관리자에게 문의하세요.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/header.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t<h2 style=\"text-align:center; font-size:30px;\">자료실 목록</h2>\r\n");
      out.write("\t\t\t\t<form id=\"boardForm\" name=\"boardForm\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"function_name\" name=\"function_name\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"getBoardList\" /> <input type=\"hidden\" id=\"current_page_no\"\r\n");
      out.write("\t\t\t\t\t\tname=\"current_page_no\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"page_info\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"total_count\"><strong>전체</strong> : <span\r\n");
      out.write("\t\t\t\t\t\t\tid=\"total_count\" class=\"t_red\">0</span>개</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" class=\"table01\">\r\n");
      out.write("\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"10%\" />\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"25%\" />\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"10%\" />\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"15%\" />\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"20%\" />\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>글번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>제목</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>조회수</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>작성자</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>작성일</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"tbody\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pagination\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/footer.jsp", out, true);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/board/boardList.jsp(160,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.size() > 0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"btn_right mt15\">\r\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"btn black mr5\"\r\n");
          out.write("\t\t\t\t\t\tonclick=\"javascript:goBoardWrite();\">작성하기</button>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
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
}
