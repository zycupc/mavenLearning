package com.zyc.controller;

import redis.clients.jedis.Jedis;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/testServlet")
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf8");
        response.getWriter().write("maven的第一个代码测试");


    }
}
