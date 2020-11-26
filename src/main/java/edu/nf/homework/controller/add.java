package edu.nf.homework.controller;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;
import edu.nf.homework.dao.Userdao;
import edu.nf.homework.dao.impl.Userdaoimpl;
import edu.nf.homework.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jeanmi
 * @date 2020/11/26
 */
@WebServlet("/add")
public class add extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        System.out.println(name);
        Userdao dao =new Userdaoimpl();
        Users user= new Users();
        user.setStu_name(name);
        try{
            dao.add(name);
            Gson gson=new Gson();
            String json=gson.toJson(200);
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().println(json);
        }catch (RuntimeException e){
            Gson gson=new Gson();
            String json=gson.toJson(500);
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().println(json);
            e.fillInStackTrace();
        }
        
        
        
    }
}
