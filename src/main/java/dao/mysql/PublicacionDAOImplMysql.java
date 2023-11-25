/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import conexion.Conexion;
import dao.PublicacionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Publicacion;

/**
 *
<<<<<<< HEAD
 * @author chibo
=======
 * @author orope
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
 */
public class PublicacionDAOImplMysql extends PublicacionDAO {

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();

    @Override
    public Publicacion findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Publicacion> findAll() {
<<<<<<< HEAD
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        List<Publicacion> lista = new ArrayList<>();
        try {
            String query = "SELECT * FROM tutobox.publicacion;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String titulo = rs.getString(2);
                String cuerpo = rs.getString(3);
                String fecha = rs.getString(4);
                int documento = rs.getInt(5);
                int idCurso = rs.getInt(6);
                int idUsuario = rs.getInt(7);
                Publicacion p = new Publicacion(id, titulo, cuerpo, fecha, documento, idCurso, idUsuario);
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: No se pudo traer la lista de publicaciones\n" + e.getMessage());
        } finally {
        }
        return lista;
=======
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

    @Override
    public void save(Publicacion entity) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
        Connection conn = conexionMysql.getConexion();
        PreparedStatement stmt;
        String query = "INSERT INTO `tutobox`.`publicacion` (`titulo`, `cuerpo`, `fecha`, `idCurso`, `idUsuario`) VALUES (?, ?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getTitulo());
            stmt.setString(2, entity.getCuerpo());
            stmt.setString(3, entity.getFecha());
            stmt.setInt(4, entity.getIdCurso());
            stmt.setInt(5, entity.getIdUsuario());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo actualizar el usuario\n" + e.getMessage());
        }
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

    @Override
    public void update(Publicacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
        Connection conn = conexionMysql.getConexion();
        PreparedStatement stmt;
        String query = "DELETE FROM `tutobox`.`publicacion` WHERE (`idPublicacion` = ?);";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo actualizar el usuario\n" + e.getMessage());
        }
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

    @Override
    public List<Publicacion> obtenerPublicacionesPorUsuario(int idUsuario) {
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
<<<<<<< HEAD
        String query = "SELECT *, documento, idCurso, idUsuario FROM tutobox.publicacion WHERE idUsuario = ?;";
=======
        String query = "SELECT * FROM tutobox.publicacion WHERE idUsuario = ?;";
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89

        List<Publicacion> publicaciones = new ArrayList<>();

        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String titulo = rs.getString(2);
                String cuerpo = rs.getString(3);
                String fecha = rs.getString(4);
<<<<<<< HEAD
                int documento = rs.getInt(5);
                int idCurso = rs.getInt(6);
                Publicacion p = new Publicacion(id, titulo, cuerpo, fecha, documento, idCurso, idUsuario);
                publicaciones.add(p);
            }

            rs.close();
            ps.close();
            conn.close();
=======
                //int documento = rs.getInt(5);
                int idCurso = rs.getInt(6);
                Publicacion p = new Publicacion(id, titulo, cuerpo, fecha, 1, idCurso, idUsuario);
                publicaciones.add(p);
            }
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        } catch (SQLException e) {
            System.out.println("Error: No se pudieron obtener las publicaciones\n" + e.getMessage());
        }

        return publicaciones;
<<<<<<< HEAD
=======

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

}
