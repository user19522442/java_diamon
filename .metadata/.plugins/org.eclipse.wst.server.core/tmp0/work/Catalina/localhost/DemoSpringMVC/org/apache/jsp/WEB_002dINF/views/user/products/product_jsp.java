/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-05-13 08:55:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/ADMIN/Desktop/java_diamon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DemoSpringMVC/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/views/layouts/user/taglib.jsp", Long.valueOf(1683583485371L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1682604001805L));
    _jspx_dependants.put("jar:file:/C:/Users/ADMIN/Desktop/java_diamon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DemoSpringMVC/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Chi tiết sản phẩm</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.product-content{\r\n");
      out.write("		overflow-x: hidden; \r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- \r\n");
      out.write("Body Section \r\n");
      out.write("-->\r\n");
      out.write("	<div class=\"row product-content\">\r\n");
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
      out.write("					<li><a class=\"totalInCart\" href=\"cart.html\"><strong>Total\r\n");
      out.write("								Amount <span class=\"badge badge-warning pull-right\"\r\n");
      out.write("								style=\"line-height: 18px;\">$448.42</span>\r\n");
      out.write("						</strong></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"well well-small alert alert-warning cntr\">\r\n");
      out.write("				<h2>50% Discount</h2>\r\n");
      out.write("				<p>\r\n");
      out.write("					only valid for online order. <br>\r\n");
      out.write("					<br>\r\n");
      out.write("					<a class=\"defaultBtn\" href=\"#\">Click here </a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"well well-small\">\r\n");
      out.write("				<a href=\"#\"><img src=\"assets/img/paypal.jpg\"\r\n");
      out.write("					alt=\"payment method paypal\"></a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<a class=\"shopBtn btn-block\" href=\"#\">Upcoming products <br>\r\n");
      out.write("			<small>Click to view</small></a> <br> <br>\r\n");
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
      out.write("							VIEW</a> <img src=\"assets/img/bootstrap-template.png\"\r\n");
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
      out.write("				<li><a href=\"index.html\">Trang chủ</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("				<li><a href=\"products.html\">Sản phẩm</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("				<li class=\"active\">Chi tiết sản phẩm</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<div class=\"well well-small\">\r\n");
      out.write("				<div class=\"row-fluid\">\r\n");
      out.write("					<div class=\"span5\">\r\n");
      out.write("						<div id=\"myCarousel\" class=\"carousel slide cntr\">\r\n");
      out.write("							<div class=\"carousel-inner\">\r\n");
      out.write("								<div class=\"item active\">\r\n");
      out.write("									<a href=\"#\"> <img src=\"assets/img/a.jpg\" alt=\"\"\r\n");
      out.write("										style=\"width: 100%\"></a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"item\">\r\n");
      out.write("									<a href=\"#\"> <img src=\"assets/img/b.jpg\" alt=\"\"\r\n");
      out.write("										style=\"width: 100%\"></a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"item\">\r\n");
      out.write("									<a href=\"#\"> <img src=\"assets/img/e.jpg\" alt=\"\"\r\n");
      out.write("										style=\"width: 100%\"></a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<a class=\"left carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("								data-slide=\"prev\">‹</a> <a class=\"right carousel-control\"\r\n");
      out.write("								href=\"#myCarousel\" data-slide=\"next\">›</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"span7\">\r\n");
      out.write("						<h3>Name of the Item [$140.00]</h3>\r\n");
      out.write("						<hr class=\"soft\" />\r\n");
      out.write("\r\n");
      out.write("						<form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("							<div class=\"control-group\">\r\n");
      out.write("								<label class=\"control-label\"><span>$140.00</span></label>\r\n");
      out.write("								<div class=\"controls\">\r\n");
      out.write("									<input type=\"number\" min =\"0\" value=\"0\" class=\"span6\" >\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"control-group\">\r\n");
      out.write("								<label class=\"control-label\"><span>Color</span></label>\r\n");
      out.write("								<div class=\"controls\">\r\n");
      out.write("									<select class=\"span11\">\r\n");
      out.write("										<option>Red</option>\r\n");
      out.write("										<option>Purple</option>\r\n");
      out.write("										<option>Pink</option>\r\n");
      out.write("										<option>Red</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<h4>100 items in stock</h4>\r\n");
      out.write("							<p>Nowadays the lingerie industry is one of the most\r\n");
      out.write("								successful business spheres. Nowadays the lingerie industry is\r\n");
      out.write("								one of ...\r\n");
      out.write("							<p>\r\n");
      out.write("								<button type=\"submit\" class=\"shopBtn\">\r\n");
      out.write("									<span class=\" icon-shopping-cart\"></span> Add to cart\r\n");
      out.write("								</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<hr class=\"softn clr\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<ul id=\"productDetail\" class=\"nav nav-tabs\">\r\n");
      out.write("					<li class=\"active\"><a href=\"#home\" data-toggle=\"tab\">Product\r\n");
      out.write("							Details</a></li>\r\n");
      out.write("					<li class=\"\"><a href=\"#profile\" data-toggle=\"tab\">Related\r\n");
      out.write("							Products </a></li>\r\n");
      out.write("					\r\n");
      out.write("				</ul>\r\n");
      out.write("				<div id=\"myTabContent\" class=\"tab-content tabWrapper\">\r\n");
      out.write("					<div class=\"tab-pane fade active in\" id=\"home\">\r\n");
      out.write("						<h4>Product Information</h4>\r\n");
      out.write("						<table class=\"table table-striped\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr class=\"techSpecRow\">\r\n");
      out.write("									<td class=\"techSpecTD1\">Color:</td>\r\n");
      out.write("									<td class=\"techSpecTD2\">Black</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr class=\"techSpecRow\">\r\n");
      out.write("									<td class=\"techSpecTD1\">Style:</td>\r\n");
      out.write("									<td class=\"techSpecTD2\">Apparel,Sports</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr class=\"techSpecRow\">\r\n");
      out.write("									<td class=\"techSpecTD1\">Season:</td>\r\n");
      out.write("									<td class=\"techSpecTD2\">spring/summer</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr class=\"techSpecRow\">\r\n");
      out.write("									<td class=\"techSpecTD1\">Usage:</td>\r\n");
      out.write("									<td class=\"techSpecTD2\">fitness</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr class=\"techSpecRow\">\r\n");
      out.write("									<td class=\"techSpecTD1\">Sport:</td>\r\n");
      out.write("									<td class=\"techSpecTD2\">122855031</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr class=\"techSpecRow\">\r\n");
      out.write("									<td class=\"techSpecTD1\">Brand:</td>\r\n");
      out.write("									<td class=\"techSpecTD2\">Shock Absorber</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("						<p>Raw denim you probably haven't heard of them jean shorts\r\n");
      out.write("							Austin. Nesciunt tofu stumptown aliqua, retro synth master\r\n");
      out.write("							cleanse. Mustache cliche tempor, williamsburg carles vegan\r\n");
      out.write("							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher\r\n");
      out.write("							synth. Cosby sweater eu banh mi, qui irure terry richardson ex\r\n");
      out.write("							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis\r\n");
      out.write("							cardigan american apparel, butcher voluptate nisi qui.</p>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"tab-pane fade\" id=\"profile\">\r\n");
      out.write("						<div class=\"row-fluid\">\r\n");
      out.write("							<div class=\"span2\">\r\n");
      out.write("								<img src=\"assets/img/d.jpg\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span6\">\r\n");
      out.write("								<h5>Product Name</h5>\r\n");
      out.write("								<p>Nowadays the lingerie industry is one of the most\r\n");
      out.write("									successful business spheres. We always stay in touch with the\r\n");
      out.write("									latest fashion tendencies - that is why our goods are so\r\n");
      out.write("									popular..</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span4 alignR\">\r\n");
      out.write("								<form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("									<h3>$140.00</h3>\r\n");
      out.write("									<label class=\"checkbox\"> <input type=\"checkbox\">\r\n");
      out.write("										Adds product to compair\r\n");
      out.write("									</label><br>\r\n");
      out.write("									<div class=\"btn-group\">\r\n");
      out.write("										<a href=\"product_details.html\" class=\"defaultBtn\"><span\r\n");
      out.write("											class=\" icon-shopping-cart\"></span> Add to cart</a> <a\r\n");
      out.write("											href=\"product_details.html\" class=\"shopBtn\">VIEW</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr class=\"soft\">\r\n");
      out.write("						<div class=\"row-fluid\">\r\n");
      out.write("							<div class=\"span2\">\r\n");
      out.write("								<img src=\"assets/img/d.jpg\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span6\">\r\n");
      out.write("								<h5>Product Name</h5>\r\n");
      out.write("								<p>Nowadays the lingerie industry is one of the most\r\n");
      out.write("									successful business spheres. We always stay in touch with the\r\n");
      out.write("									latest fashion tendencies - that is why our goods are so\r\n");
      out.write("									popular..</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span4 alignR\">\r\n");
      out.write("								<form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("									<h3>$140.00</h3>\r\n");
      out.write("									<label class=\"checkbox\"> <input type=\"checkbox\">\r\n");
      out.write("										Adds product to compair\r\n");
      out.write("									</label><br>\r\n");
      out.write("									<div class=\"btn-group\">\r\n");
      out.write("										<a href=\"product_details.html\" class=\"defaultBtn\"><span\r\n");
      out.write("											class=\" icon-shopping-cart\"></span> Add to cart</a> <a\r\n");
      out.write("											href=\"product_details.html\" class=\"shopBtn\">VIEW</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr class=\"soft\" />\r\n");
      out.write("						<div class=\"row-fluid\">\r\n");
      out.write("							<div class=\"span2\">\r\n");
      out.write("								<img src=\"assets/img/d.jpg\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span6\">\r\n");
      out.write("								<h5>Product Name</h5>\r\n");
      out.write("								<p>Nowadays the lingerie industry is one of the most\r\n");
      out.write("									successful business spheres. We always stay in touch with the\r\n");
      out.write("									latest fashion tendencies - that is why our goods are so\r\n");
      out.write("									popular..</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span4 alignR\">\r\n");
      out.write("								<form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("									<h3>$140.00</h3>\r\n");
      out.write("									<label class=\"checkbox\"> <input type=\"checkbox\">\r\n");
      out.write("										Adds product to compair\r\n");
      out.write("									</label><br>\r\n");
      out.write("									<div class=\"btn-group\">\r\n");
      out.write("										<a href=\"product_details.html\" class=\"defaultBtn\"><span\r\n");
      out.write("											class=\" icon-shopping-cart\"></span> Add to cart</a> <a\r\n");
      out.write("											href=\"product_details.html\" class=\"shopBtn\">VIEW</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr class=\"soft\" />\r\n");
      out.write("						<div class=\"row-fluid\">\r\n");
      out.write("							<div class=\"span2\">\r\n");
      out.write("								<img src=\"assets/img/d.jpg\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span6\">\r\n");
      out.write("								<h5>Product Name</h5>\r\n");
      out.write("								<p>Nowadays the lingerie industry is one of the most\r\n");
      out.write("									successful business spheres. We always stay in touch with the\r\n");
      out.write("									latest fashion tendencies - that is why our goods are so\r\n");
      out.write("									popular..</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span4 alignR\">\r\n");
      out.write("								<form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("									<h3>$140.00</h3>\r\n");
      out.write("									<label class=\"checkbox\"> <input type=\"checkbox\">\r\n");
      out.write("										Adds product to compair\r\n");
      out.write("									</label><br>\r\n");
      out.write("									<div class=\"btn-group\">\r\n");
      out.write("										<a href=\"product_details.html\" class=\"defaultBtn\"><span\r\n");
      out.write("											class=\" icon-shopping-cart\"></span> Add to cart</a> <a\r\n");
      out.write("											href=\"product_details.html\" class=\"shopBtn\">VIEW</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr class=\"soften\" />\r\n");
      out.write("						<div class=\"row-fluid\">\r\n");
      out.write("							<div class=\"span2\">\r\n");
      out.write("								<img src=\"assets/img/d.jpg\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span6\">\r\n");
      out.write("								<h5>Product Name</h5>\r\n");
      out.write("								<p>Nowadays the lingerie industry is one of the most\r\n");
      out.write("									successful business spheres. We always stay in touch with the\r\n");
      out.write("									latest fashion tendencies - that is why our goods are so\r\n");
      out.write("									popular..</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"span4 alignR\">\r\n");
      out.write("								<form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("									<h3>$140.00</h3>\r\n");
      out.write("									<label class=\"checkbox\"> <input type=\"checkbox\">\r\n");
      out.write("										Adds product to compair\r\n");
      out.write("									</label><br>\r\n");
      out.write("									<div class=\"btn-group\">\r\n");
      out.write("										<a href=\"product_details.html\" class=\"defaultBtn\"><span\r\n");
      out.write("											class=\" icon-shopping-cart\"></span> Add to cart</a> <a\r\n");
      out.write("											href=\"product_details.html\" class=\"shopBtn\">VIEW</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Body wrapper -->\r\n");
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
}
