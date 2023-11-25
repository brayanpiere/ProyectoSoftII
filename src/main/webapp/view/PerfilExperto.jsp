<%-- 
    Document   : PerfilExperto
    Created on : 18 oct. 2023, 10:43:16
    Author     : orope
--%>

<%@page import="dao.UsuarioDAO"%>
<%@page import="dao.MensajeDAO"%>
<%@page import="dao.DAOFactory"%>
<%@page import="model.Mensaje"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <!-- Incluye el enlace al archivo CSS de Bootstrap -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <style>
            /* Estilos CSS personalizados */
            .fixed-form {
                position: fixed;
                bottom: 0;
                left: 0;
                width: 25%;
                height: 50%;
                background-color: #f0f0f0;
                padding: 20px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
                overflow-y: scroll; /* Agrega un scroll vertical */
            }

            .form-field {
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <%
            List<Mensaje> mensajes = new ArrayList<>();
            DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            MensajeDAO mensajeDAO = factory.createMensajeDAO();
            mensajes = mensajeDAO.getMensajesXExperto(8);
            UsuarioDAO usuarioDAO = factory.createUsuarioDAO();
        %>
        <div class="fixed-form">
            <h2>Mensajes</h2>
            <form action="../MensajeServlet">
                <div class="form-group">
                    <input type="text" class="form-control" id="mensaje" placeholder="Escribe tu mensaje" name="mensaje">
                </div>
                <button class="btn btn-primary" type="submit" name="accion" value="Agregar">Enviar</button>
                <div class="border border-5 border-primary mt-2">
                    <% for (Mensaje mensaje : mensajes) {%>
                    <div class="media-body">
                        <div class="media-body">
                            <h5 class="mt-0"><%= usuarioDAO.obtenerNombrePorUsuarioId(mensaje.getIdEmisor()) %></h5>
                            <%= mensaje.getContenido() %>
                        </div>
                    </div>
                    <hr>
                    <% }%>

                </div>
            </form>
        </div>

        <!-- Incluye el enlace al archivo JavaScript de Bootstrap y jQuery -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
