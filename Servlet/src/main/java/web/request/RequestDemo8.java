package web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RequestDemo8", value = "/RequestDemo8")
public class RequestDemo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8被访问了");
        //转发到demno9资源
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestDemo9");
//        requestDispatcher.forward(request,response);

        //存储数据到request域中
        request.setAttribute("msg","hello");

        request.getRequestDispatcher("/RequestDemo9").forward(request,response);


    }
}
