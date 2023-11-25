/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import conexion.Conexion;
import dao.TutoriaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tutoria;

/**
 *
<<<<<<< HEAD
 * @author chibo
 */
public class TutoriaDAOImplMysql extends TutoriaDAO {

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();

    @Override
    public List<Tutoria> obtenerTutoriasPorEstudiante(int idEstudiante) {
=======
 * @author orope
 */
public class TutoriaDAOImplMysql extends TutoriaDAO{

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();
    
    @Override
    public Tutoria findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tutoria> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(Tutoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Tutoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tutoria> obtenerListaTutoriasXEstudiante(int idEstudiante) {
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        String query = "SELECT * FROM tutobox.tutoria WHERE idEstudiante = ?";

        List<Tutoria> tutorias = new ArrayList<>();

        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, idEstudiante);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String tema = rs.getString(2);
                String estado = rs.getString(3);
                String fecha = rs.getString(4);
                String horaIni = rs.getString(5);
                String horaFin = rs.getString(6);
                String puntuacion = rs.getString(7);
                String comentario = rs.getString(8);
                String estadoPago = rs.getString(9);
                int idTut = rs.getInt(10);
                int idEst = rs.getInt(11);
                int idCur = rs.getInt(12); 
                Tutoria p = new Tutoria(id, tema, estado, fecha, horaIni, horaFin, puntuacion, comentario, estadoPago, idTut, idEst, idCur);

                tutorias.add(p);
            }

<<<<<<< HEAD
            rs.close();
            ps.close();
            conn.close();
=======
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        } catch (SQLException e) {
            System.out.println("Error: No se pudieron obtener las tutorias del estudiante\n" + e.getMessage());
        }

        return tutorias;
    }
<<<<<<< HEAD

    @Override
    public Tutoria findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tutoria> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(Tutoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Tutoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

=======
    
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
