/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOFactory;
import dao.UsuarioDAO;
import java.util.List;
import model.Usuario;

/**
 *
 * @author orope
 */
public class test {
    
    public static void main(String args[]){
        System.out.println("hola");
        List<Usuario> lista = null;
        DAOFactory factory=DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        UsuarioDAO usuarioDao=factory.createUsuarioDAO();
        lista = usuarioDao.findAll();
//        usuarioDao.obtenerNombreRolesUsuario(6);
    }
    
}
