/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2021-01-07 14:10:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.Board;
import java.util.ArrayList;
import java.sql.Date;
import member.model.vo.Member;

public final class boardListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/footer.jsp", Long.valueOf(1609806900000L));
    _jspx_dependants.put("/views/board/../common/header2.jsp", Long.valueOf(1610013582000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
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

	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>문의하기</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("td {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: #d2e6b9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr th {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: #a4cd73;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #5c9233;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showWriteForm(){\r\n");
      out.write("\tlocation.href = \"/nongbu/views/board/boardWriteForm.jsp?page=");
      out.print( currentPage );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/owl.theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/flexslider.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/pricing.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/nongbu/resources/css/main.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<!--== 헤더 ==-->\r\n");
      out.write("\t\t<div class=\"blank\" style=\"background-color:#a4cd73; height:90px;\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<nav id=\"template-navbar\"\r\n");
      out.write("\t\t\tclass=\"navbar navbar-default custom-navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#Food-fair-toggle\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"/nongbu/index.jsp\"> <img id=\"logo\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/nongbu/resources/images/Logo_main.png\" class=\"logo img-responsive\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"Food-fair-toggle\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/nongbu/nlist\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/nongbu/blist?page=1\">고객센터</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

	                     if (loginMember == null) { //로그인 안했을 때 보여질 내용
	                  
      out.write("\r\n");
      out.write("\t                  <li><a href=\"/nongbu/views/member/loginPage.jsp\">로그인/회원가입</a></li>\r\n");
      out.write("\t                  ");

	                     } else { //로그인 했다면
	                  
      out.write("\r\n");
      out.write("\t                  <li><a href=\"/nongbu/views/member/memberDetailView.jsp\">마이페이지</a></li>\r\n");
      out.write("\t                  ");

	                     }
	                  
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.row -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 네비게이션 바 -->\r\n");
      out.write("\t\t<div class=\"pricing-filter\">\r\n");
      out.write("\t\t\t<div class=\"pricing-filter-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"section-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul id=\"filter-list\" class=\"clearfix\" align=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/nongbu/blist?page=1\">문의하기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/nongbu/falist\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/nongbu/views/callservice/callservice.jsp\">전화상담</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- @end #filter-list -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("<h1 align=\"center\">문의하기</h1>\r\n");
      out.write("<h4 align=\"center\">궁금하신 점이나 불편사항을 알려주세요.</h4>\r\n");
      out.write("<br>\r\n");
      out.write("<table align=\"center\" border=\"1\" width=\"700\" cellspacing=\"0\">\r\n");
      out.write("<tr><th>번호</th><th>분류</th><th>제목</th><th>작성자</th><th>날짜</th><th>조회수</th><th>첨부파일</th></tr>\r\n");
 for(Board board : list){ 
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"center\">");
      out.print( board.getBoardNum() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( board.getBoardCategory() );
      out.write("</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(board.getBoardReplyLev() == 2){  //원글의 댓글일 때 
      out.write("\r\n");
      out.write("\t&nbsp; &nbsp; ▶ \r\n");
      out.write("\t");
 }else if(board.getBoardReplyLev() == 3){ //댓글의 댓글일 때 
      out.write("\r\n");
      out.write("\t&nbsp; &nbsp; &nbsp; &nbsp; ▶▶\r\n");
      out.write("\t");
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("\t<a href=\"/nongbu/bdetail?bnum=");
      out.print( board.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write('"');
      out.write('>');
      out.print( board.getBoardTitle() );
      out.write("</a>\r\n");
      out.write("\t");
 }else{ 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( board.getBoardTitle() );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td align=\"center\">");
      out.print( board.getBoardWriter() );
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\">");
      out.print( board.getBoardDate() );
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\">");
      out.print( board.getBoardReadCount() );
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\">\r\n");
      out.write("\t\t");
 if(board.getBoardOriginalFileName() != null){ 
      out.write("\r\n");
      out.write("\t\t◎\r\n");
      out.write("\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
 } //for each  
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<h4 align=\"center\">총 목록 갯수 : ");
      out.print( listCount );
      out.write("</h4>\r\n");
      out.write("<br>\r\n");
      out.write('\r');
      out.write('\n');
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("<div style=\"align:center; text-align:center;\">\r\n");
      out.write("\t<button onclick=\"showWriteForm();\">글쓰기</button>\r\n");
      out.write("</div>\r\n");
 } 
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align: center;\">\r\n");
      out.write('\r');
      out.write('\n');
 if(currentPage <= 1){ 
      out.write("\r\n");
      out.write("[맨처음]\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<a href=\"/nongbu/blist?page=1\">[맨처음]</a>\r\n");
 } 
      out.write(" &nbsp;\r\n");
      out.write('\r');
      out.write('\n');
 if((currentPage - 10) < startPage && (currentPage - 10) >= 1){ 
      out.write("\r\n");
      out.write("<a href=\"/nongbu/blist?page=");
      out.print( startPage - 10 );
      out.write("\">[이전]</a>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("[이전]\r\n");
 } 
      out.write(" &nbsp;\r\n");
      out.write('\r');
      out.write('\n');
 for(int p = startPage; p <= endPage; p++){ 
		if(p == currentPage){

      out.write("\r\n");
      out.write("<font size=\"4\" color=\"red\">[");
      out.print( p );
      out.write("]</font>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<a href=\"/nongbu/blist?page=");
      out.print( p );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
  } //else 
	} //for 
      out.write(" &nbsp;\r\n");
      out.write('\r');
      out.write('\n');
 if((currentPage + 10) > endPage && (currentPage + 10) < maxPage){ 
      out.write("\r\n");
      out.write("<a href=\"/nongbu/blist?page=");
      out.print( endPage + 10 );
      out.write("\">[다음]</a>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("[다음]\r\n");
 } 
      out.write(" &nbsp;\r\n");
      out.write('\r');
      out.write('\n');
 if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("[맨끝]\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<a href=\"/nongbu/blist?page=");
      out.print( maxPage );
      out.write("\">[맨끝]</a>\r\n");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("<section id=\"contact\" class=\"contact\">\r\n");
      out.write("            <div class=\"container-fluid color-bg\">\r\n");
      out.write("                <div class=\"row dis-table\">\r\n");
      out.write("                    <div class=\"hidden-xs col-sm-6 dis-table-cell\">\r\n");
      out.write("                        <h2 class=\"section-title\">Contact With us</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-6 col-sm-6 dis-table-cell\">\r\n");
      out.write("                        <div class=\"section-content\">\r\n");
      out.write("                            <p>16th Birn street Get Plaza (4th floar) USA</p>\r\n");
      out.write("                            <p>+44 12 213584</p>\r\n");
      out.write("                            <p>example@mail.com </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("                        <div class=\"copyright text-center\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                &copy; Copyright, 2015 <a href=\"#\">Your Website Link.</a> Theme by <a href=\"http://themewagon.com/\"  target=\"_blank\">ThemeWagon</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
