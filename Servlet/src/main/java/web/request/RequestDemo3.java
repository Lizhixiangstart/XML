package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //演示获取请求头数据：user-agent

        String agent = req.getHeader("user-agent");
        //判断agent的浏览器的版本
        if(agent.contains("Chrome")){
            //谷歌
            System.out.println("Chrome");
        }else if (agent.contains("Firefox")){
            //火狐
            System.out.println("Firefox");
        }else if (agent.contains("Edge")){
            //Edge
            System.out.println("Edge");
        }
    }
}
