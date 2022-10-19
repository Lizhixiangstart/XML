package web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RequestDemo4", value = "/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据：referer
        String referer = request.getHeader("referer");
        System.out.println(referer);//http://localhost:8080/RequestDemo4
        if (referer != null){
            if(referer.contains("/")){
                System.out.println("播放电影");
            }else{
                System.out.println("想看电影吗？来优酷吧");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
