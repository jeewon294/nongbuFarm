/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.41
 * Generated at: 2021-01-07 14:44:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.StringTokenizer;
import java.net.URLEncoder;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import member.model.vo.Member;

public final class NaverLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1610014936000L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1609806900000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.HttpURLConnection");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.util.StringTokenizer");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.io.BufferedReader");
    _jspx_imports_classes.add("java.io.InputStreamReader");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- <link rel=\"shortcut icon\" href=\"resources/images/star.png\" type=\"favicon/ico\" /> -->\r\n");
      out.write("\r\n");
      out.write("<title>농부의 텃밭</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/owl.theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/flexslider.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/pricing.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../resources/css/main.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../../resources/js/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../../resources/js/jquery.flexslider.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("\t\t$('.flexslider').flexslider({\r\n");
      out.write("\t\t\tanimation : \"slide\",\r\n");
      out.write("\t\t\tcontrolsContainer : \".flexslider-container\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\"#template-navbar\">\r\n");
      out.write("\r\n");
      out.write("\t<!--== 헤더 ==-->\r\n");
      out.write("\t");
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
      out.write("   <header>\r\n");
      out.write("      <!--== 헤더 ==-->\r\n");
      out.write("      <div class=\"blank\" style=\"background-color:#a4cd73; height:140px;\"></div>\r\n");
      out.write("      \r\n");
      out.write("      <!--== 네비게이션 바 ==-->\r\n");
      out.write("      <div class=\"pricing-filter\">\r\n");
      out.write("            <div class=\"pricing-filter-wrapper\">\r\n");
      out.write("               <div class=\"container\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                     <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <div class=\"section-header\">\r\n");
      out.write("                           <ul id=\"filter-list\" class=\"clearfix\" align= \"middle\">\r\n");
      out.write("                              <li class=\"filter\" data-filter=\"all\"><a href=\"/nongbu/index.jsp\">전체</a></li>\r\n");
      out.write("                              <li class=\"filter\" data-filter=\".fruit\">과일</li>\r\n");
      out.write("                              <li class=\"filter\" data-filter=\".breakfast\">야채/채소</li>\r\n");
      out.write("                              <li class=\"filter\" data-filter=\".special\">곡물</li>\r\n");
      out.write("                              <li class=\"filter\" data-filter=\".breakfast\"><a href=\"/nongbu/veggieList\">상품</a></li>\r\n");
      out.write("                              <li class=\"filter\" data-filter=\".desert\"><a href= \"/nongbu/slist.ad\">할인상품</a></li>\r\n");
      out.write("                              <li class=\"filter\" data-filter=\".dinner\"><a href= \"/nongbu/flist\">나눔의 장</a></li>\r\n");
      out.write("                           </ul>\r\n");
      out.write("                           <!-- @end #filter-list -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("      <nav id=\"template-navbar\"\r\n");
      out.write("         class=\"navbar navbar-default custom-navbar-default navbar-fixed-top\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("               <button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("                  data-toggle=\"collapse\" data-target=\"#Food-fair-toggle\">\r\n");
      out.write("                  <span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("                     class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("                     class=\"icon-bar\"></span>\r\n");
      out.write("               </button>\r\n");
      out.write("               <a class=\"navbar-brand\" href=\"/nongbu/index.jsp\"> <img id=\"logo\"\r\n");
      out.write("                  src=\"/nongbu/resources/images/Logo_main.png\" class=\"logo img-responsive\">\r\n");
      out.write("               </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"Food-fair-toggle\">\r\n");
      out.write("               <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                  <li><a href=\"/nongbu/nlist\">공지사항</a></li>\r\n");
      out.write("                  <li><a href=\"/nongbu/blist?page=1\">고객센터</a></li>\r\n");
      out.write("                  ");

                        if (loginMember == null) { //로그인 안했을 때 보여질 내용
                     
      out.write("\r\n");
      out.write("                     <li><a href=\"/nongbu/views/member/loginPage.jsp\">로그인/회원가입</a></li>\r\n");
      out.write("                     ");

                        } else { //로그인 했다면
                     
      out.write("\r\n");
      out.write("                     <li><a href=\"/nongbu/views/member/memberDetailView.jsp\">마이페이지</a></li>\r\n");
      out.write("                     ");

                        }
                     
      out.write("\r\n");
      out.write("               </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- /.row -->\r\n");
      out.write("      </nav>\r\n");
      out.write("   </header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write(' ');

	String clientId = "XysPfL42COWDFUaWGFO1";// 애플리케이션 클라이언트 아이디값";
	String clientSecret = "7oktQ3IVw7";// 애플리케이션 클라이언트 시크릿값";
	String code = request.getParameter("code");
	String state = request.getParameter("state");
	String redirectURI = URLEncoder.encode("http://localhost:8880/nongbu/views/member/NaverLogin.jsp", "UTF-8");
	String apiURL;
	apiURL = "https://nid.naver.com/oauth2.0/token?grant_type=authorization_code&";
	apiURL += "client_id=" + clientId;
	apiURL += "&client_secret=" + clientSecret;
	apiURL += "&redirect_uri=" + redirectURI;
	apiURL += "&code=" + code;
	apiURL += "&state=" + state;
	String access_token = "";
	String refresh_token = "";
	System.out.println("apiURL=" + apiURL);
	String tokenStr = null;
	try {
		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		BufferedReader br;
		System.out.print("responseCode=" + responseCode);
		if (responseCode == 200) { // 정상 호출
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} else { // 에러 발생
			br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		String inputLine;
		StringBuffer res = new StringBuffer();
		while ((inputLine = br.readLine()) != null) {
			res.append(inputLine);
		}
		br.close();
		
		//토큰 값 추출
		String resStr = res.toString();
		StringTokenizer stok = new StringTokenizer(resStr, ":");
		for (int i=0; i<2; i++) {
			if(i==1) {
				tokenStr = stok.nextToken();
			}else {
				stok.nextToken();
			}
        }
		
		String[] array = tokenStr.split("\"");
		for(int i=1; i<2;i++){
			 tokenStr = array[i];
			 System.out.println(tokenStr);
		}
		
		if (responseCode == 200) {
			System.out.println(resStr);
			System.out.println("토큰값 추출 : " + tokenStr);
			System.out.println("===================NaverLogin.jsp========================");
		}
	} catch (Exception e) {
		System.out.println(e);
	}

 
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>  \r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<form action=\"/nongbu/NaverLogin\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"token\" value=\"");
      out.print( tokenStr );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"네이버 아이디로 로그인하기\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--== 푸터 ==-->\r\n");
      out.write("\t");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"../../resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"../../resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"../../resources/js/jquery.mixitup.min.js\"></script>\r\n");
      out.write("\t<script src=\"../../resources/js/wow.min.js\"></script>\r\n");
      out.write("\t<script src=\"../../resources/js/jquery.validate.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"../../resources/js/jquery.hoverdir.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"../../resources/js/jQuery.scrollSpeed.js\"></script>\r\n");
      out.write("\t<script src=\"../../resources/js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
