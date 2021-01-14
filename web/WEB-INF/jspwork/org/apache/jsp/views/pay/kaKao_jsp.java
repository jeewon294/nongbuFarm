/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2021-01-04 05:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.pay;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pay.model.vo.Pay;

public final class kaKao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("pay.model.vo.Pay");
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

	 
	/* Pay pay = (Pay)request.getAttribute("pay"); 
    String productno = pay.getProductNo(); // 상품번호
    String sellerid = pay.getSellerId(); // 판매자아이디
    String product = pay.getSellerProduct(); //상품명
    String address = pay.getUserAddress(); // 구매자 주소
    int price = pay.getPrice(); //상품 가격  
    
    */
   
    String productno = request.getParameter("productno");
    String sellerid = request.getParameter("sellerid");
    String product = request.getParameter("product");
    String address = request.getParameter("user_address");
    int price = Integer.parseInt(request.getParameter("price"));

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>결제하기</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://code.jquery.com/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://cdn.iamport.kr/js/iamport.payment-1.1.5.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("    var IMP = window.IMP; // 생략가능 \r\n");
      out.write("    IMP.init('iamport'); // 'iamport' 대신 부여받은 \"가맹점 식별코드\"를 사용\r\n");
      out.write("    var msg;\r\n");
      out.write("    \r\n");
      out.write("    IMP.request_pay({\r\n");
      out.write("        pg : 'kakaopay', //결제 방식\r\n");
      out.write("        pay_method : 'card', //결제 수단\r\n");
      out.write("        productno : ");
      out.print( productno);
      out.write(", //상품번호 \r\n");
      out.write("        name : '결제내역',\r\n");
      out.write("        seller_id : ");
      out.print( sellerid);
      out.write(", //판매자 아이디\r\n");
      out.write("        sellerproduct: ");
      out.print( product);
      out.write(", // 상품명\t\t\r\n");
      out.write("        address : ");
      out.print( address);
      out.write(", // 구매자 주소\r\n");
      out.write("        price : ");
      out.print( price);
      out.write(", // 상품가격\r\n");
      out.write("        buyer_postcode : '234-556',\r\n");
      out.write("        //m_redirect_url : 'http://www.naver.com'\r\n");
      out.write("    }, function(rsp) {\r\n");
      out.write("        if ( rsp.success ) {\r\n");
      out.write("            //[1] 서버단에서 결제정보 조회를 위해 jQuery ajax로 imp_uid 전달하기\r\n");
      out.write("            jQuery.ajax({\r\n");
      out.write("                url: \"/nongbu/complete\", //cross-domain error가 발생하지 않도록 주의해주세요\r\n");
      out.write("                type: 'doget',\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                data: {\r\n");
      out.write("                    productno : rsp.productno\r\n");
      out.write("                    //기타 필요한 데이터가 있으면 추가 전달\r\n");
      out.write("                }\r\n");
      out.write("            }).done(function(data) {\r\n");
      out.write("                //[2] 서버에서 REST API로 결제정보확인 및 서비스루틴이 정상적인 경우\r\n");
      out.write("                if ( everythings_fine ) {\r\n");
      out.write("                    msg = '결제가 완료되었습니다.';\r\n");
      out.write("                    msg += '\\n상품명 : ' + rsp.productono;\r\n");
      out.write("                    msg += '\\n판매자ID : ' + rsp.seller_id;\r\n");
      out.write("                    msg += '/n구매자주소 : ' + rsp.address;\r\n");
      out.write("                    msg += '결제금액 : ' + rsp.price;\r\n");
      out.write("                    \r\n");
      out.write("                    alert(msg);\r\n");
      out.write("                } else {\r\n");
      out.write("                    //[3] 아직 제대로 결제가 되지 않았습니다.\r\n");
      out.write("                    //[4] 결제된 금액이 요청한 금액과 달라 결제를 자동취소처리하였습니다.\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("           \r\n");
      out.write("              ");
      out.write("\r\n");
      out.write("             ");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3>kakao</h3>\r\n");
      out.write("<form action=\"/nongbu/pay/kaKao.jsp\" method=\"post\">\r\n");
      out.write("상품명 : <input type=\"text\" name=\"pno\" value=\"");
      out.print( productno );
      out.write("\">\r\n");
      out.write("판매자 아이디 : <input type=\"text\" name=\"sid\" value=\"");
      out.print( sellerid );
      out.write("\">\r\n");
      out.write("상품명 : <input type=\"text\" name=\"product\" value=\"");
      out.print( product );
      out.write("\">\r\n");
      out.write("구매자 주소 : <input type=\"text\" name=\"addr\" value=\"");
      out.print( address );
      out.write("\">\r\n");
      out.write("가격 : <input type=\"number\" name=\"price\" value=\"");
      out.print( price );
      out.write("\">\r\n");
      out.write("<input type=\"submit\" value=\"주문하기\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
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
