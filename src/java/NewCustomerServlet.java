/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nedreba
 */
public class NewCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        

      
      //Get Input
      String inputFirstName = request.getParameter("firstName");
      String inputLastName = request.getParameter("lastName");
      String inputPhone = request.getParameter("phone");
      String inputAddress = request.getParameter("address");
      String inputCity = request.getParameter("city");
      String inputState = request.getParameter("state");
      String inputZipcode = request.getParameter("zipcode");
      String inputEmail = request.getParameter("userEmail");
      
      //Pages to be redirected
      String success = "/Success.html";
      String failure = "/New_customer.jsp";
      boolean valid = true;
      
      //Test Input
      //I know there are probably several more efficient ways to code this,
      //such as in just one bit if statement, but this seemed the muchneater
      //and easier to understand
      if (inputFirstName == null || inputFirstName.isEmpty()){
          valid = false;
      }
      if (inputLastName == null || inputLastName.isEmpty()){
          valid = false;
      }
      if (inputPhone == null || inputPhone.isEmpty()){
          valid = false;
      }
      if (inputAddress == null || inputAddress.isEmpty()){
          valid = false;
      }
      if (inputCity == null || inputCity.isEmpty()){
          valid = false;
      }
      if (inputState == null || inputState.isEmpty()){
          valid = false;
      }
      if (inputZipcode == null || inputZipcode.isEmpty()){
          valid = false;
      }
      if (inputEmail == null || inputEmail.isEmpty()){
          valid = false;
      }
      
      
      if (valid) {
          getServletContext().getRequestDispatcher(success).forward(request, response);
      } else {
          request.setAttribute("message", "Please fill out all the form fields");
          getServletContext().getRequestDispatcher(failure).forward(request, response);
      }
      
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
