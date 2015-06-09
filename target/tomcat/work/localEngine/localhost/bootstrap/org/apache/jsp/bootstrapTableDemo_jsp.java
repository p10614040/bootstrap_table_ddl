package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootstrapTableDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("    \r\n");
      out.write("\t<title>Bootstrap Table</title>\r\n");
      out.write("    \r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("    <link href=\"components/bootstrap-3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap-Table -->\r\n");
      out.write("    <link href=\"components/bootstrap-table/bootstrap-table.css\" rel=\"stylesheet\" >\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap validator -->\r\n");
      out.write("    <link href=\"components/bootstrap-validator/css/bootstrapValidator.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"components/bootstrap-3.3.4/libs/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"components/bootstrap-3.3.4/libs/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 查询条件 -->\r\n");
      out.write("\t<div id=\"bsTableToolbar\">\r\n");
      out.write("        <div class=\"form-inline\" role=\"form\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <span>产品类型: </span>\r\n");
      out.write("                <select class=\"form-control w70\" name=\"type\" id=\"type\">\r\n");
      out.write("\t\t\t         <option>1</option>\r\n");
      out.write("\t\t\t         <option>2</option>\r\n");
      out.write("\t\t\t         <option>3</option>\r\n");
      out.write("\t\t\t         <option>4</option>\r\n");
      out.write("\t\t\t         <option>5</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input name=\"search\" class=\"form-control\" type=\"text\" \r\n");
      out.write("                \tplaceholder=\"名称/版本\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button id=\"ok\" type=\"submit\" class=\"btn btn-default\">OK</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 表格 -->\r\n");
      out.write("    <div>\r\n");
      out.write("    \t<table id=\"bsTable\"></table>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 表单窗口 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" \r\n");
      out.write("\t   aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" data-backdrop=\"false\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t            \t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">\r\n");
      out.write("\t                  &times;\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<!-- 窗口标题 -->\r\n");
      out.write("\t            \t<h4 class=\"modal-title\" id=\"myModalLabel\"> 新增 </h4>\r\n");
      out.write("\t         \t</div>\r\n");
      out.write("\t         \t<!-- 窗口内容 -->\r\n");
      out.write("\t\t         <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" id=\"bsFrom\" role=\"form\"\r\n");
      out.write("\t\t\t\t\t\taction=\"javascript:void(0);\">\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t      \t<label for=\"name\" class=\"col-sm-2 control-label\">产品名称 <sup>*</sup></label>\r\n");
      out.write("\t\t\t\t\t      \t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t         \t<input type=\"text\" class=\"form-control\" id=\"name\" \r\n");
      out.write("\t\t\t\t\t         \t\tplaceholder=\"请输入进程名称（必填项）\" name=\"name\">\r\n");
      out.write("\t\t\t\t\t      \t</div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t      \t<label for=\"type\" class=\"col-sm-2 control-label\">产品类型 <sup>*</sup></label>\r\n");
      out.write("\t\t\t\t\t      \t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" name=\"type\" id=\"type\">\r\n");
      out.write("\t\t\t\t\t\t\t         <option>1</option>\r\n");
      out.write("\t\t\t\t\t\t\t         <option>2</option>\r\n");
      out.write("\t\t\t\t\t\t\t         <option>3</option>\r\n");
      out.write("\t\t\t\t\t\t\t         <option>4</option>\r\n");
      out.write("\t\t\t\t\t\t\t         <option>5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t      \t<label for=\"version\" class=\"col-sm-2 control-label\">版本 <sup>*</sup></label>\r\n");
      out.write("\t\t\t\t\t      \t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t \t<input type=\"text\" class=\"form-control\" id=\"version\" \r\n");
      out.write("\t\t\t\t\t            \tplaceholder=\"\" name=\"version\">\r\n");
      out.write("\t\t\t\t\t      \t</div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t      \t<label for=\"updateTime\" class=\"col-sm-2 control-label\">修改时间</label>\r\n");
      out.write("\t\t\t\t\t      \t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t         \t<input type=\"text\" class=\"form-control\" id=\"updateTime\" \r\n");
      out.write("\t\t\t\t\t            \tplaceholder=\"\" name=\"updateTime\">\r\n");
      out.write("\t\t\t\t\t      \t</div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t      \t<label for=\"pro_log_des\" class=\"col-sm-2 control-label\">描述</label>\r\n");
      out.write("\t\t\t\t\t      \t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t \t<textarea class=\"form-control\" rows=\"2\" id=\"pro_log_des\"\r\n");
      out.write("\t\t\t\t\t             \tplaceholder=\"\" name=\"pro_log_des\"></textarea>\r\n");
      out.write("\t\t\t\t\t      \t</div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t         <div class=\"modal-footer\">\r\n");
      out.write("\t\t         \t<button type=\"button\" class=\"btn btn-default\" id=\"winReset\"\r\n");
      out.write("\t\t               onclick=\"bsFormValid.reset()\">重置\r\n");
      out.write("\t\t            </button>\r\n");
      out.write("\t\t            <button type=\"button\" class=\"btn btn-default\" id=\"winClose\"\r\n");
      out.write("\t\t               data-dismiss=\"modal\">关闭\r\n");
      out.write("\t\t            </button>\r\n");
      out.write("\t\t            <button type=\"button\" class=\"btn btn-primary\" id=\"winSave\">\r\n");
      out.write("\t\t               \t保存\r\n");
      out.write("\t\t            </button>\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t      </div><!-- /.modal-content -->\r\n");
      out.write("\t\t</div><!-- /.modal -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- jQuery (在其它JS之前引用) -->\r\n");
      out.write("    <script src=\"components/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <script src=\"components/bootstrap-3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap table -->\r\n");
      out.write("    <script src=\"components/bootstrap-table/bootstrap-table.js\"></script>\r\n");
      out.write("\t<script src=\"components/bootstrap-table/locale/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Bootstrap validator -->\r\n");
      out.write("    <script src=\"components/bootstrap-validator/js/bootstrapValidator.min.js\"></script>\r\n");
      out.write("    <script src=\"components/bootstrap-validator/js/language/zh_CN.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Bootstrap 自定义插件 -->\r\n");
      out.write("    <script src=\"components/bootstrap-plugin/confirm.js\"></script>\r\n");
      out.write("    <script src=\"components/bootstrap-plugin/message.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap table 公用方法 -->\r\n");
      out.write("\t<script src=\"javascript/common/bsTable/bsTableDefault.js\"></script>\r\n");
      out.write("\t<script src=\"javascript/common/bsTable/bsTableFormatter.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"javascript/app/bootstrapTableDemo/bootstrapTableDemo.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
