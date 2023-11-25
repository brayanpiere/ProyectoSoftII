/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import conexion.Conexion;
import dao.MensajeDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Mensaje;

/**
 *
 * @author chibo
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

}
