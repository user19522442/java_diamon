/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-06-03 04:59:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.layouts.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/java_diamon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DemoSpringMVC/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/java_diamon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DemoSpringMVC/WEB-INF/lib/spring-webmvc-5.2.2.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1575337710000L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/java_diamon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DemoSpringMVC/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/views/layouts/user/taglib.jsp", Long.valueOf(1684248319859L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1682046340358L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.2.RELEASE.jar", Long.valueOf(1680958091482L));
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- \r\n");
      out.write("Body Section \r\n");
      out.write("-->\r\n");
      out.write("	<hr class=\"soften\">\r\n");
      out.write("	<div class=\"well well-small\">\r\n");
      out.write("	<h1>Visit us</h1>\r\n");
      out.write("	<hr class=\"soften\"/>	\r\n");
      out.write("	<div class=\"row-fluid\">\r\n");
      out.write("		<div class=\"span8 relative\">\r\n");
      out.write("		<iframe style=\"width:100%; height:350px\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"http://maps.google.co.uk/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Newbury+Street,+Boston,+MA,+United+States&amp;aq=1&amp;oq=NewBoston,+MA,+United+States&amp;sll=42.347238,-71.084011&amp;sspn=0.014099,0.033023&amp;ie=UTF8&amp;hq=Newbury+Street,+Boston,+MA,+United+States&amp;t=m&amp;ll=42.348994,-71.088248&amp;spn=0.001388,0.006276&amp;z=18&amp;iwloc=A&amp;output=embed\"></iframe>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"absoluteBlk\">\r\n");
      out.write("		<div class=\"well wellsmall\">\r\n");
      out.write("		<h4>Contact Details</h4>\r\n");
      out.write("		<h5>\r\n");
      out.write("			2601 Mission St.<br/>\r\n");
      out.write("			San Francisco, CA 94110<br/><br/>\r\n");
      out.write("			 \r\n");
      out.write("			info@mysite.com<br/>\r\n");
      out.write("			﻿Tel 123-456-6780<br/>\r\n");
      out.write("			Fax 123-456-5679<br/>\r\n");
      out.write("			web:wwwmysitedomain.com\r\n");
      out.write("		</h5>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"span4\">\r\n");
      out.write("		<h4>Email Us</h4>\r\n");
      out.write("		<form class=\"form-horizontal\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("           \r\n");
      out.write("              <input type=\"text\" placeholder=\"name\" class=\"input-xlarge\"/>\r\n");
      out.write("           \r\n");
      out.write("          </div>\r\n");
      out.write("		   <div class=\"control-group\">\r\n");
      out.write("           \r\n");
      out.write("              <input type=\"text\" placeholder=\"email\" class=\"input-xlarge\"/>\r\n");
      out.write("           \r\n");
      out.write("          </div>\r\n");
      out.write("		   <div class=\"control-group\">\r\n");
      out.write("           \r\n");
      out.write("              <input type=\"text\" placeholder=\"subject\" class=\"input-xlarge\"/>\r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("              <textarea rows=\"3\" id=\"textarea\" class=\"input-xlarge\"></textarea>\r\n");
      out.write("           \r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("            <button class=\"shopBtn\" type=\"submit\">Send email</button>\r\n");
      out.write("\r\n");
      out.write("        </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</div>\r\n");
      out.write("<!-- \r\n");
      out.write("Clients \r\n");
      out.write("-->");
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