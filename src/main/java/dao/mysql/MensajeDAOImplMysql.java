/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import conexion.Conexion;
import dao.MensajeDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
<<<<<<< HEAD
import java.sql.SQLException;
=======
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
import java.util.List;
import model.Mensaje;

/**
 *
<<<<<<< HEAD
 * @author chibo
=======
 * @author orope
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
 */
public class MensajeDAOImplMysql extends MensajeDAO {

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();

    @Override
    public Mensaje findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Mensaje> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(Mensaje entity) {
        Connection conn = conexionMysql.getConexion();
<<<<<<< HEAD
        PreparedStatement ps;
        String query = "INSERT INTO `tutobox`.`mensaje` (`asunto`, `cuerpo`, `fechaEnvio`, `idUsuarioEmisor`, `idUsuarioReceptor`) VALUES (?, ?, ?, ?, ?);";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, entity.getAsunto());
            ps.setString(2, entity.getCuerpo());
            ps.setString(3, entity.getFechaEnvio());
            ps.setInt(4, entity.getIdUsuE());
            ps.setInt(5, entity.getIdUsuR());
            System.out.println("hola");
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo crear el mensaje\n" + e.getMessage());
=======
        PreparedStatement stmt;
        String query = "INSERT INTO `tutobox`.`mensaje` (`asunto`, `cuerpo`, `fechaEnvio`, `idUsuarioEmisor`, `idUsuarioReceptor`) VALUES (?, ?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getAsunto());
            stmt.setString(2, entity.getContenido());
            stmt.setString(3, entity.getFecha());
            stmt.setInt(4, entity.getIdEmisor());
            stmt.setInt(5, entity.getIdReceptor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo guardar mensaje\n" + e.getMessage());
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        }
    }

    @Override
    public void update(Mensaje entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

<<<<<<< HEAD
=======
    @Override
    public List<Mensaje> getMensajesXExperto(int idExperto) {
        Connection conn = conexionMysql.getConexion();
        PreparedStatement stmt;
        String query = "SELECT * FROM tutobox.mensaje where idUsuarioReceptor=? order by idMensaje desc;";
        List<Mensaje> mensajes = new ArrayList();
        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, idExperto);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String asunto = rs.getNString(2);
                String contenido = rs.getString(3);
                String fecha = rs.getString(4);
                int idEmisor = rs.getInt(5);
                int idRecpetor = rs.getInt(6);
                Mensaje mensaje= new Mensaje(id, asunto, contenido, fecha, idEmisor, idRecpetor);
                mensajes.add(mensaje);
            }

        } catch (SQLException e) {
            System.out.println("Error: No se pudo traer los mensajes\n" + e.getMessage());
        }
        return mensajes;
    }

    @Override
    public String getNombreEmisor(int idEmisor) {
        return "";
    }

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
