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
 * @author chibo
 */
public class PublicacionDAOImplMysql extends PublicacionDAO {

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();

    @Override
    public Publicacion findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Publicacion> findAll() {
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
    }

    @Override
    public void save(Publicacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Publicacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Publicacion> obtenerPublicacionesPorUsuario(int idUsuario) {
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        String query = "SELECT *, documento, idCurso, idUsuario FROM tutobox.publicacion WHERE idUsuario = ?;";

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
                int documento = rs.getInt(5);
                int idCurso = rs.getInt(6);
                Publicacion p = new Publicacion(id, titulo, cuerpo, fecha, documento, idCurso, idUsuario);
                publicaciones.add(p);
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: No se pudieron obtener las publicaciones\n" + e.getMessage());
        }

        return publicaciones;
    }

}
