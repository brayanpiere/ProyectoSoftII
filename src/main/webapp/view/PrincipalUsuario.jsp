<%-- 
    Document   : PrincipalUsuario
    Created on : 25 set. 2023, 20:17:05
    Author     : orope
--%>

<%@page import="dao.UsuarioDAO"%>
<%@page import="dao.CursoDAO"%>
<%@page import="dao.TutoriaDAO"%>
<%@page import="dao.DAOFactory"%>
<%@page import="model.Tutoria"%>
<%@page import="java.util.List"%>
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
                        <center><strong><p class="text-dark">Datos del usuario:</p></strong></center>
                        <center><b>Nombre: <%= session.getAttribute("UsuarioNombre")%> </b></center>
                        <center><b>Apellido: <%= session.getAttribute("UsuarioApellido")%></b></center>
                    </div>

                    &nbsp;
                    <center>
                        <div class="col-12">
                            <button class="btn btn-primary" onclick="redireccionar('ConsultarExpertoJsp.jsp')">Consultar Experto</button>
                        </div>
                        <div class="col-12">
                            <button class="btn btn-primary" onclick="redireccionar('RankingTutores.jsp')">Ranking Tutores</button>
                        </div>
                        <div class="col-12">
                            <button class="btn btn-primary" onclick="redireccionar('ReporteTutoriasJsp.jsp')">Reporte Tutorias</button>
                        </div>
                    </center>
                </div>
                <div class="col-10">

                    <%
                        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                        TutoriaDAO tutoriaDAO = factory.createTutoriaDAO();
                        List<Tutoria> tutorias = tutoriaDAO.obtenerListaTutoriasXEstudiante(Integer.parseInt(String.valueOf(session.getAttribute("UsuarioCodigo"))));
                        
                        DAOFactory factory2 = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                        CursoDAO cursoDAO = factory2.createCursoDAO();
                        
                        DAOFactory factory3 = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                        UsuarioDAO usuarioDAO = factory3.createUsuarioDAO();
                        for (Tutoria t : tutorias) {
                            System.out.println(cursoDAO.NombreCurso(t.getIdCur()));
                            System.out.println(usuarioDAO.obtenerNombrePorUsuarioId(t.getIdTut()));

                        }
                    %>


                    <div class="container overflow-scroll p-3 bg-light" style="height: 700px;">
                        <div class="card">
                            <div class="card-body">

                                <%
                                    for (Tutoria t : tutorias) {
                                        System.out.println("holaaaa3333" + t.getIdCur());
                                        System.out.println("holaaaa3333" + t.getIdTut());
                                %>
                                <div class="row" style="border: 1px solid black; padding: 10px;">
                                    <div class="col-10">
                                        <h5 class="card-title">Curso : <%= cursoDAO.NombreCurso(t.getIdCur())%></h5>
                                        <h6 class="card-subtitle mb-2">Estado: <%= t.getEstado()%></h6>
                                        <h6 class="card-subtitle mb-2">Tutor: <%= usuarioDAO.obtenerNombrePorUsuarioId(t.getIdTut())%></h6>
                                    </div>
                                    <div class="col-2">
                                        <label for="clave">RANKING</label>
                                        <input type="number" class="form-control" name="ranking" id="ranking" value="<%= t.getPuntuacion()%>">
                                        <button class="btn btn-primary btn-sm float-right mt-2">CALIFICAR</button>
                                    </div>
                                    <p class="card-text">FEEDBACK: <%= t.getComentario()%></p>
                                </div>
                                <%
                                    }
                                %>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <div class="footer">
            <strong>Universidad de Lima - Grupo 5</strong>
        </div>
    </body>
</html>
