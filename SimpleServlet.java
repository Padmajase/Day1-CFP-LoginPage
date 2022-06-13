package com.myservlets;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

@WebServlet ("/Hello")
public class SimpleServlet extends HttpServlet {

    public static int DEFAULT_PORT = 8080;
    public static int port;

    private void start(int port) {
        SimpleServlet.port = port;
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(port), 0);
            System.out.println("Server running at " + port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>Hello World Padmaja Tried Again</h3>");
        out.close();
    }

    public static void main(String[] args) {
        SimpleServlet httpServer = new SimpleServlet();
        httpServer.start(DEFAULT_PORT);
    }
}







