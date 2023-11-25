/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Usuario;

/**
 *
 * @author orope
 */
public abstract class UsuarioDAO implements CRUD<Usuario>{

    public abstract List<String> obtenerNombreRolesUsuario(int usuarioId);
<<<<<<< HEAD
    public abstract String obtenerNombrePorUsuarioId(int usuarioId);
=======
    
    public abstract Usuario autentificar(String correo, String password);
    
    public abstract String obtenerNombrePorUsuarioId(int idUsuario);
    
    public abstract void updatePassword(String passwordActual, int id);
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
