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
    public abstract String obtenerNombrePorUsuarioId(int usuarioId);
}
