/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyCon;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.sql.*;
/**
 *
 * @author vivek
 */
@MultipartConfig(maxFileSize = 16177215)  // Max size of Image is 16 MB
public class UploadImage extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UploadImage</title>");            
            out.println("</head>");
            out.println("<body>");
            String fname,lname;
            Part P;
            fname=request.getParameter("txtName");
            lname=request.getParameter("txtLastName");
            P=request.getPart("txtImage");
            Connection con=null;
            PreparedStatement ps=null;
            String sql;
           con=MyCon.getConnection();
           sql="insert into user values(?,?,?)";
           ps=con.prepareStatement(sql);
           ps.setString(1, fname);
           ps.setString(2, lname);
           InputStream is;
           is=P.getInputStream();
           long size;
           size=P.getSize();
           ps.setBinaryStream(3, is, size);
           int temp;
           temp=ps.executeUpdate();
           if(temp>0)
               out.println("Record Saved.............");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
           out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
