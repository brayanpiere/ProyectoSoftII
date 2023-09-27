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
import model.Usuario;

/**
 *
 * @author orope
 */
public class UsuarioDAOImplMysql extends UsuarioDAO {

    Conexion conexionMysql = ConexionMysql.obtenerInstancia();

    @Override
    public List<String> obtenerNombreRolesUsuario(int usuarioId) {
        Connection conn=conexionMysql.getConexion();
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Usuario entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            rs.close();
            ps.close();
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

}
