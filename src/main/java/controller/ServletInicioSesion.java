/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAOFactory;
import dao.UsuarioDAO;
import dao.mysql.UsuarioDAOImplMysql;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;


/**
 *
 * @author orope
 */
@WebServlet(name = "ServletInicioSesion", urlPatterns = {"/ServletInicioSesion"})
public class ServletInicioSesion extends HttpServlet {

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
        // Variables
        String correo = request.getParameter("correo");
        String clave = request.getParameter("clave");
        String direccion = "errorLogUsuario.html";

        // Activamos la sesión
        HttpSession sesion = request.getSession();
        if (sesion.isNew()) {
            sesion = request.getSession(true);
        }

        // Obtener la lista de usuarios desde UsuarioDao
        List<Usuario> lista = null;
        DAOFactory factory=DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        UsuarioDAO usuarioDao=factory.createUsuarioDAO();
        lista = usuarioDao.findAll();

        // Buscar el usuario coincidente en la lista
        Usuario usuario = lista.stream()
                .filter(u -> u.getEmail().equals(correo) && u.getPassword().equals(clave))
                .findFirst()
                .orElse(null);

        if (usuario != null) {
            // Guardamos los datos del cliente en variables de sesión
            sesion.setAttribute("UsuarioCodigo", usuario.getId());
            sesion.setAttribute("UsuarioNombre", usuario.getNombres());
            sesion.setAttribute("UsuarioApellido", usuario.getApellidos());
            sesion.setAttribute("idCursoAux", -1);
            sesion.setAttribute("idExpertoAux", -1);
            // Obtener el rol del usuario
            // Obtener la lista de roles del usuario
            List<String> roles = usuarioDao.obtenerNombreRolesUsuario(usuario.getId());
            sesion.setAttribute("UsuarioRoles", roles);

            if (roles.contains("Alumno")) {
                direccion = "view/PrincipalUsuario.jsp";
            } else if (roles.contains("Tutor")) {
                sesion.setAttribute(clave, roles);
                direccion = "view/PrincipalExperto.jsp";
            }
        }

        // Redirigir a la dirección correspondiente
        response.sendRedirect(direccion);

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
