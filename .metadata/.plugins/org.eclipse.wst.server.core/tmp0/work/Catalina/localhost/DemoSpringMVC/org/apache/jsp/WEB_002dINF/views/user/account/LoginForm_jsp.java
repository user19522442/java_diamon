/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-06-03 18:29:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fgroupingUsed_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fgroupingUsed_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fgroupingUsed_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.release();
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Đăng nhập tài khoản</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div id=\"sidebar\" class=\"span3\">\r\n");
      out.write("			<div class=\"well well-small\">\r\n");
      out.write("				<ul class=\"nav nav-list\">\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Fashion</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Watches</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Fine Jewelry</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Fashion Jewelry</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Engagement & Wedding</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Men's Jewelry</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Vintage & Antique</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Loose Diamonds </a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>Loose Beads</a></li>\r\n");
      out.write("					<li><a href=\"products.html\"><span\r\n");
      out.write("							class=\"icon-chevron-right\"></span>See All Jewelry & Watches</a></li>\r\n");
      out.write("					<li style=\"border: 0\">&nbsp;</li>\r\n");
      out.write("					<li><a class=\"totalInCart\" href=\"gio-hang\"><strong>Total\r\n");
      out.write("								Amount <span class=\"badge badge-warning pull-right\"\r\n");
      out.write("								style=\"line-height: 18px;\">");
      if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("												đ</span>\r\n");
      out.write("						</strong></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"well well-small alert alert-warning cntr\">\r\n");
      out.write("				<h2>50% Discount</h2>\r\n");
      out.write("				<p>\r\n");
      out.write("					only valid for online order. <br> <br> <a\r\n");
      out.write("						class=\"defaultBtn\" href=\"#\">Click here </a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"well well-small\">\r\n");
      out.write("				<a href=\"#\"><img src=\"assets/img/paypal.jpg\"\r\n");
      out.write("					alt=\"payment method paypal\"></a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<a class=\"shopBtn btn-block\" href=\"#\">Upcoming products <br>\r\n");
      out.write("				<small>Click to view</small></a> <br> <br>\r\n");
      out.write("			<ul class=\"nav nav-list promowrapper\">\r\n");
      out.write("				<li>\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a class=\"zoomTool\" href=\"product_details.html\"\r\n");
      out.write("							title=\"add to cart\"><span class=\"icon-search\"></span> QUICK\r\n");
      out.write("							VIEW</a> <img src=\"assets/img/bootstrap-ecommerce-templates.png\"\r\n");
      out.write("							alt=\"bootstrap ecommerce templates\">\r\n");
      out.write("						<div class=\"caption\">\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"defaultBtn\" href=\"product_details.html\">VIEW</a> <span\r\n");
      out.write("									class=\"pull-right\">$22.00</span>\r\n");
      out.write("							</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li style=\"border: 0\">&nbsp;</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a class=\"zoomTool\" href=\"product_details.html\"\r\n");
      out.write("							title=\"add to cart\"><span class=\"icon-search\"></span> QUICK\r\n");
      out.write("							VIEW</a> <img src=\"assets/img/shopping-cart-template.png\"\r\n");
      out.write("							alt=\"shopping cart template\">\r\n");
      out.write("						<div class=\"caption\">\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"defaultBtn\" href=\"product_details.html\">VIEW</a> <span\r\n");
      out.write("									class=\"pull-right\">$22.00</span>\r\n");
      out.write("							</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li style=\"border: 0\">&nbsp;</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a class=\"zoomTool\" href=\"product_details.html\"\r\n");
      out.write("							title=\"add to cart\"><span class=\"icon-search\"></span> QUICK\r\n");
      out.write("							VIEW</a> <img src=\"assets/user/img/bootstrap-template.png\"\r\n");
      out.write("							alt=\"bootstrap template\">\r\n");
      out.write("						<div class=\"caption\">\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"defaultBtn\" href=\"product_details.html\">VIEW</a> <span\r\n");
      out.write("									class=\"pull-right\">$22.00</span>\r\n");
      out.write("							</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"span9\">\r\n");
      out.write("			<ul class=\"breadcrumb\">\r\n");
      out.write("				<li><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Trang chủ</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("				<li class=\"active\">Người dùng</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<h3>Người dùng</h3>\r\n");
      out.write("			<hr class=\"soft\" />\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"span1\">&nbsp;</div>\r\n");
      out.write("				<div class=\"span4\">\r\n");
      out.write("					<div class=\"well\">\r\n");
      out.write("						<h5>Đăng nhập vào hệ thống</h5>\r\n");
      out.write("\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fgroupingUsed_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f0.setParent(null);
      // /WEB-INF/views/user/account/LoginForm.jsp(36,35) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setType("number");
      // /WEB-INF/views/user/account/LoginForm.jsp(36,35) name = groupingUsed type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setGroupingUsed(true);
      // /WEB-INF/views/user/account/LoginForm.jsp(36,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ TotalPriceCart }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fgroupingUsed_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      _jspx_th_fmt_005fformatNumber_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/user/account/LoginForm.jsp(107,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
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
      // /WEB-INF/views/user/account/LoginForm.jsp(120,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ check }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							<h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ LoginVariable }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h1>\r\n");
          out.write("						");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/user/account/LoginForm.jsp(123,6) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("dang-nhap");
      // /WEB-INF/views/user/account/LoginForm.jsp(123,6) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/views/user/account/LoginForm.jsp(123,6) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("user");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("							<div class=\"control-group\">\r\n");
            out.write("								<label class=\"control-label\" for=\"inputEmail\">Email</label>\r\n");
            out.write("								<div class=\"controls\">\r\n");
            out.write("									");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("								</div>\r\n");
            out.write("							</div>\r\n");
            out.write("\r\n");
            out.write("							<div class=\"control-group\">\r\n");
            out.write("								<label class=\"control-label\" for=\"inputEmail\">Mật khẩu</label>\r\n");
            out.write("								<div class=\"controls\">\r\n");
            out.write("									");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("								</div>\r\n");
            out.write("							</div>\r\n");
            out.write("\r\n");
            out.write("							<div class=\"control-group\">\r\n");
            out.write("								<div class=\"controls\">\r\n");
            out.write("									<button type=\"submit\" class=\"defaultBtn\">Đăng nhập</button>\r\n");
            out.write("									<a href=\"#\">Quên mật khẩu?</a>\r\n");
            out.write("								</div>\r\n");
            out.write("							</div>\r\n");
            out.write("						");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f0_reused = false;
    try {
      _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/user/account/LoginForm.jsp(128,9) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "span3");
      // /WEB-INF/views/user/account/LoginForm.jsp(128,9) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "email");
      // /WEB-INF/views/user/account/LoginForm.jsp(128,9) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("user");
      // /WEB-INF/views/user/account/LoginForm.jsp(128,9) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", "Mời nhập email");
      int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
        if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
      _jspx_th_form_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f1_reused = false;
    try {
      _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/user/account/LoginForm.jsp(136,9) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", "span3");
      // /WEB-INF/views/user/account/LoginForm.jsp(136,9) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", "password");
      // /WEB-INF/views/user/account/LoginForm.jsp(136,9) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f1.setPath("password");
      // /WEB-INF/views/user/account/LoginForm.jsp(136,9) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "placeholder", "Mời nhập mật khẩu");
      int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
        if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
      _jspx_th_form_005finput_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f1, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f1_reused);
    }
    return false;
  }
}