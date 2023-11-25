/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOFactory;
import dao.MensajeDAO;
import dao.PublicacionDAO;
import dao.TutoriaDAO;
import dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import model.Mensaje;
import model.Publicacion;
import model.Tutoria;
import model.Usuario;

/**
 *
 * @author orope
 */
public class test {
    
    public static void main(String args[]){
//      System.out.println("hola");
//      List<Usuario> lista = null;
        String nombre = "";
//      Mensaje c = new Mensaje(0, "ayuda", "hola", "2023-06-16", 3, 8);
        DAOFactory factory=DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        UsuarioDAO usuarioDAO=factory.createUsuarioDAO();
//      u = usuarioDAO.obtenerNombrePorUsuarioId(1);
//      mensajeDAO.save(c);
//      u = publicacionDao.findAll();
//      for (int i = 0; i < u.size();i++){
//          System.out.println(u.get(i).getTitulo());
//      }
//      lista = usuarioDao.findAll();
        nombre = usuarioDAO.obtenerNombrePorUsuarioId(1);
        System.out.println(nombre);
    }
}
