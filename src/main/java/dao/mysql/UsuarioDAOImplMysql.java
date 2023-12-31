/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import conexion.Conexion;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author orope
 */
public class UsuarioDAOImplMysql extends UsuarioDAO {

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();

    @Override
    public List<String> obtenerNombreRolesUsuario(int usuarioId) {
        Connection conn = conexionMysql.getConexion();
        List<String> roles = new ArrayList<>();;
        try {
            String sql = "SELECT t.descripcion FROM tipousuario t JOIN usuario u ON t.idTipousuario = u.idTipo WHERE u.idUsuario = ?";
            // SELECT t.descripcion FROM tipousuario t JOIN usuario u ON t.idTipousuario = u.idTipo WHERE u.idUsuario = ?"
            //"SELECT r.nombre FROM rol r JOIN usuario_rol ur ON r.id = ur.rol_id WHERE ur.usuario_id = ?"

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, usuarioId);

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        String rolNombre = rs.getString("descripcion");
                        roles.add(rolNombre);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roles;
    }

    @Override
    public void save(Usuario entity) {

        Connection conn = conexionMysql.getConexion();
        PreparedStatement stmt;
        String query = "INSERT INTO `tutobox`.`usuario` (`nombre`, `apellidos`, `correo`, `contrasena`, `idTipo`) VALUES (?, ?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getNombres());
            stmt.setString(2, entity.getApellidos());
            stmt.setString(3, entity.getEmail());
            stmt.setString(4, entity.getPassword());
            stmt.setInt(5, entity.getIdTipo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo actualizar el usuario\n" + e.getMessage());
        }
    }

    @Override
    public void update(Usuario entity) {
<<<<<<< HEAD
    Connection conn = conexionMysql.getConexion();
    PreparedStatement ps;
    String query = "UPDATE `tutobox`.`usuario` SET `nombre` = ?, `apellidos` = ?, `correo` = ?, `idTipo` = ? WHERE (`idUsuario` = ?)";

    try {
        ps = conn.prepareStatement(query);
        ps.setString(1, entity.getNombres());
        ps.setString(2, entity.getApellidos());
        ps.setString(3, entity.getEmail());
        ps.setInt(4, entity.getIdTipo());
        ps.setInt(5, entity.getId());

        ps.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error: No se pudo actualizar el usuario\n" + e.getMessage());
    }
=======
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        String query = "UPDATE `tutobox`.`usuario` SET `nombre` = ?, `apellidos` = ?, `correo` = ?, `idTipo` = ? WHERE (`idUsuario` = ?)";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, entity.getNombres());
            ps.setString(2, entity.getApellidos());
            ps.setString(3, entity.getEmail());
            ps.setInt(4, entity.getIdTipo());
            ps.setInt(5, entity.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo actualizar el usuario\n" + e.getMessage());
        }
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

    @Override
    public Usuario findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> findAll() {
        Usuario c = null;
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        List<Usuario> lista = new ArrayList<>();
        try {
            String query = "select * from USUARIO";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                c = new Usuario();
                c.setId(rs.getInt("idUsuario"));
                c.setNombres(rs.getString("nombre"));
                c.setApellidos(rs.getString("apellidos"));
                c.setEmail(rs.getString("correo"));
                c.setPassword(rs.getString("contrasena"));
                c.setIdTipo(rs.getInt("idTipo"));
                lista.add(c);
            }

            //Conexion.cerrarConexion(cn);
        } catch (SQLException e) {
            System.out.println("Error: No se pudo traer la lista de usuarios\n" + e.getMessage());
        } finally {
//            conexionMysql.cerrarConexion();
        }
        return lista;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
<<<<<<< HEAD
    public String obtenerNombrePorUsuarioId(int usuarioId) {
=======
    public Usuario autentificar(String correo, String password) {
        Usuario u = null;
        try {
            Connection cn = conexionMysql.getConexion();
            String sql = "select * from tutobox.usuario where correo=? and contrasena=?;";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt(1));
                u.setNombres(rs.getString(2));
                u.setApellidos(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setPassword(rs.getString(5));
                u.setIdTipo(rs.getInt(6));
            }
            return u;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return u;
    }

    @Override
    public String obtenerNombrePorUsuarioId(int idUsuario) {
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        String query = "SELECT nombre, apellidos FROM tutobox.usuario WHERE idUsuario = ?;";

        String nombreApellido = "";

        try {
            ps = conn.prepareStatement(query);
<<<<<<< HEAD
            ps.setInt(1, usuarioId);
=======
            ps.setInt(1, idUsuario);
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String Nombre = rs.getString("nombre");
                String Apellido = rs.getString("apellidos");
<<<<<<< HEAD
                nombreApellido = Nombre +" "+ Apellido;
=======
                nombreApellido = Nombre + " " + Apellido;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
            }
        } catch (SQLException e) {
            System.out.println("Error: No se pudo obtener el nombre y apellido del usuario\n" + e.getMessage());
        }

        return nombreApellido;
    }

<<<<<<< HEAD
=======
    @Override
    public void updatePassword(String passwordActual, int idUsuario) {
        Connection conn = conexionMysql.getConexion();
        PreparedStatement ps;
        String query = "UPDATE `tutobox`.`usuario` SET `contrasena` = ? WHERE (`idUsuario` = ?);";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, passwordActual);
            ps.setInt(2, idUsuario);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo actualizar el usuario\n" + e.getMessage());
        }
    }

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
