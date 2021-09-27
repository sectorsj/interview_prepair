package ru.sectorsj.interview_preparation.hw6.ee.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorld extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("Hello! Powered by Sector Sj \n");

        resp.getWriter().printf("<html><body>\n");
        for (int i = 0; i < 10; i++) {
            resp.getWriter().printf("<h1>" + i + "</h1>" + "\n");
        }
        resp.getWriter().printf("</html></body>");
    }

    @Override
    public void destroy() {
        logger.debug("Destroy");
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}