package edu.nf.homework.controller;

import com.google.gson.Gson;
import edu.nf.homework.dao.impl.Userdaoimpl;
import edu.nf.homework.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Jeanmi
 * @date 2020/11/26
 */
@WebServlet("/servlet")
public class ListCityServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Userdaoimpl dao = new Userdaoimpl();
        List<Users> list =dao.listUsers();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
