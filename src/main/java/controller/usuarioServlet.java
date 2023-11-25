/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAOFactory;
import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
<<<<<<< HEAD
 * @author chibo
=======
 * @author orope
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
 */
@WebServlet(name = "usuarioServlet", urlPatterns = {"/usuarioServlet"})
public class usuarioServlet extends HttpServlet {

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
        String action = request.getParameter("accion");
<<<<<<< HEAD
        
=======
        String direccion="";

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        if (action.equalsIgnoreCase("Guardar")) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
<<<<<<< HEAD
            int tipo_estudiante =Integer.parseInt(request.getParameter("tipo-estudiante"));
            Usuario u = new Usuario(nombre, apellido, correo, "", tipo_estudiante);
            u.setId(1);
            DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            UsuarioDAO usuarioDao = factory.createUsuarioDAO();
            usuarioDao.update(u);
        }
=======
            int tipo_estudiante = Integer.parseInt(request.getParameter("tipo-estudiante"));
            Usuario u = new Usuario(nombre, apellido, correo, "", tipo_estudiante);
            
            int x= (Integer.parseInt(String.valueOf(request.getSession().getAttribute("UsuarioCodigo"))));
            u.setId(x);
            DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            UsuarioDAO usuarioDao = factory.createUsuarioDAO();
            usuarioDao.update(u);
            direccion = "view/login.jsp";
        }else if (action.equalsIgnoreCase("Agregar")){
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            String clave = request.getParameter("clave");
            int tipo_estudiante = Integer.parseInt(request.getParameter("idTipoUsuario"));
            Usuario u = new Usuario(nombre, apellido, correo, clave, tipo_estudiante);
           
            DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            UsuarioDAO usuarioDao = factory.createUsuarioDAO();
            usuarioDao.save(u);
            direccion = "view/login.jsp";
        }else if (action.equalsIgnoreCase("UpdatePass")){
            String clave = request.getParameter("passNueva");
            DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            UsuarioDAO usuarioDao = factory.createUsuarioDAO();
            int x= (Integer.parseInt(String.valueOf(request.getSession().getAttribute("UsuarioCodigo"))));
            usuarioDao.updatePassword(clave, x);
            direccion = "view/login.jsp";
        }
        
        response.sendRedirect(direccion);
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
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
