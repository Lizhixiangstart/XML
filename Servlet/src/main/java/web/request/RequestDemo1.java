package web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
*
* 演示request对象获取请求行数据
* */
@WebServlet(name = "RequestDemo1", value = "/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*
    * 				1.获取请求方式:GET
				String getMethod();
				2.获取虚拟目录:/
				String getContextPath();
				3.获取Servlet路径：/demo4
				4.获取get方式请求参数：name=zhangsan
				String getQueryString();
				5.获取请求URI：/demo4
				String getRequestURI():.demo4
				String getRequestURL():http://localhost/demo4
				6.获取协议及版本号：Http/1.1
				String getProtocol()
				7.获取客户IP地址
                String getRemoteAddr()
    * */
        String method = request.getMethod();
        System.out.println("访问方式="+method);
        String contextPath = request.getContextPath();
        System.out.println("虚拟目录="+contextPath);
        String servletPath = request.getServletPath();
        System.out.println("Servlet路径="+servletPath);
        String queryString = request.getQueryString();
        System.out.println("get方式请求参数="+queryString);
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URI="+requestURI);
        System.out.println("URL="+requestURL);
        String protocol = request.getProtocol();
        System.out.println("HTTP协议="+protocol);
        String remoteAddr = request.getRemoteAddr();
        System.out.println("IP="+remoteAddr);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
