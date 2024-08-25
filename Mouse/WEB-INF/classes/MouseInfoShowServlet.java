import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

@WebServlet("/MouseInfoShow")
public class MouseInfoShowServlet extends HttpServlet {
    public void doPost (HttpServletRequest req, HttpServletResponse res)
        throws IOException ServletException {
            final String URL = ""
        
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
        }

}