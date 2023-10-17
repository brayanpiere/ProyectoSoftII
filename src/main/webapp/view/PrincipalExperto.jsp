<%-- 
    Document   : PrincipalExperto
    Created on : 25 set. 2023, 20:16:48
    Author     : orope
--%>

<%@page import="dao.CursoDAO"%>
<%@page import="dao.PublicacionDAO"%>
<%@page import="model.Publicacion"%>
<%@page import="java.util.List"%>
<%@page import="dao.DAOFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:::Bienvenido al Sistema:::</title>

        <link rel="stylesheet" href="../Recursos/Bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="../Recursos/CSSPropio/newcss.css"/>
        <script src="../Recursos/Bootstrap/js/bootstrap.min.js"></script>
        <script src="../Recursos/JsPropio/ValidaJS.js"></script>
        <style>
            .card {
                margin-bottom: 20px;
            }
            .btn.btn-primary {
                margin-bottom: 20px;
                width: 100%;
            }
        </style>
    </head>
    <body>  
        <div class="header">
            <center><b>Bienvenido</b></center>
        </div>

        <div class="container-fluid">
            <div class="row" style="margin-top: 100px;">
                <div class="col-2" style="align-content: center;">
                    <div style="border: 1px solid black; padding: 10px;">
                        <center><strong><p class="text-dark">Datos del Profesor:</p></strong></center>
                        <center><b>Nombre: <%= session.getAttribute("UsuarioNombre")%> </b></center>
                        <center><b>Apellido: <%= session.getAttribute("UsuarioApellido")%></b></center>
                    </div>
                    &nbsp;
                    <center>
                        <div class="col-12">
                            <button class="btn btn-primary" onclick="redireccionar('CrearPublicacion.jsp')">Crear Publicacion</button>
                        </div>
                        <div class="col-12">
                            <button class="btn btn-primary" onclick="redireccionar('editarPerfil.jsp')">Editar Perfil</button>
                        </div>
                        <div class="col-12">
                            <button class="btn btn-primary" onclick="redireccionar('CrearTutoriaJsp.jsp')">Crear Tutorias</button>
                        </div>
                    </center>
                </div>
                <div class="col-10">
                    <<h1>Publicaciones</h1>>
                    <%

                        int x = Integer.parseInt(String.valueOf(session.getAttribute("UsuarioCodigo")));
                        System.out.println("idUsuario0" + x);
                        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                        PublicacionDAO publicacionDAO = factory.createPublicacionDAO();

                        List<Publicacion> publicaciones = publicacionDAO.obtenerPublicacionesPorUsuario(x);
                        request.setAttribute("publicaciones", publicaciones);

                        DAOFactory factory2 = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                        CursoDAO cursoDAO = factory2.createCursoDAO();
                    %>

                    <div class="container">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Titulo</th>
                                    <th>Cuerpo</th>
                                    <th>Nombre Curso</th>
                                    <th>Fecha de Publicacion</th>
                                    <th>Documento</th>
                                    <th>Accion</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% for (Publicacion publicacion : publicaciones) {%>
                                <tr>
                                    <td><%= publicacion.getTitulo()%></td>
                                    <td><%= publicacion.getCuerpo()%></td>
                                    <td><%= cursoDAO.NombreCurso(publicacion.getIdCurso())%></td>
                                    <td><%= publicacion.getFecha()%></td>
                                    <td></td>
                                    <td>
                                        <a class="btn btn btn-secondary btn_add_tutoria" href="../ServletPublicacion?accion=eliminar&id=<%= publicacion.getIdPublicacion()%>" role="button">Eliminar</a>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <div class="footer">
            <strong>Universidad de Lima - Grupo 2</strong>
        </div>
    </body>
</html>
