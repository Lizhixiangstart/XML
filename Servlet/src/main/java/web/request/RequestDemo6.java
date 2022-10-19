package web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "RequestDemo6", value = "/RequestDemo6")
public class RequestDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数

        //根据参数名称获取参数
//        String username = request.getParameter("username");
//        System.out.println("GET");
//        System.out.println(username);
        this.doGet(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post获取请求参数

        //根据参数名称获取参数
        String username = request.getParameter("username");
//        System.out.println("post");
//        System.out.println(username);

        //根据参数名称获取请求值数组
        String[] hobbies = request.getParameterValues("hobby");
//        for(String hobby : hobbies){
//            System.out.println(hobby);
//        }

        //获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            String name = parameterNames.nextElement();
//            System.out.println(name);
//            String value = request.getParameter(name);
//            System.out.println(value);
//            System.out.println("-------------------");
//        }

        //获取所有参数的map集合
        Map<String,String[]> parameterMap = request.getParameterMap();
        //遍历
        //方式一通过keyset遍历
//        Set<String> keySet = parameterMap.keySet();
//        for (String key : keySet){
//            //根据key获取value
//            String[] values = parameterMap.get(key);
//            for(String value :values){
//                System.out.println(value);
//            }
//            System.out.println("-----------");
//        }、

        //方式二通过entryset遍历
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for(Map.Entry<String, String[]> entry : entries){
            String key = entry.getKey();
            String[] values = entry.getValue();
            for (String value : values){
                System.out.println(key+"="+value);
            }
            System.out.println();
        }

    }
}
