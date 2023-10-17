<%-- 
    Document   : editarPerfil
    Created on : 15 oct. 2023, 23:15:13
    Author     : orope
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../usuarioServlet">
      <div class="campo">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre">
      </div>
      <div class="campo">
        <label for="apellido">Apellido:</label>
        <input type="text" name="apellido" id="apellido">
      </div>
      <div class="campo">
        <label for="correo">Correo electrónico:</label>
        <input type="email" name="correo" id="correo">
      </div>
      <div class="campo">
        <label for="tipo-estudiante">Tipo de estudiante:</label>
        <select name="tipo-estudiante" id="tipo-estudiante">
          <option value="1">Normal</option>
          <option value="2">Experto</option>
        </select>
      </div>
      <button type="submit" name="accion" value="Guardar">Guardar</button>
    </form>
    </body>
</html>
