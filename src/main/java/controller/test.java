/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CursoDAO;
import dao.DAOFactory;
<<<<<<< HEAD
import dao.MensajeDAO;
import dao.PublicacionDAO;
import dao.TutoriaDAO;
import dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import model.Mensaje;
import model.Publicacion;
=======
import dao.PublicacionDAO;
import dao.TipoUsuarioDAO;
import dao.TutoriaDAO;
import dao.UsuarioDAO;
import dao.mysql.UsuarioDAOImplMysql;
import java.util.List;
import model.Publicacion;
import model.TipoUsuario;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
import model.Tutoria;
import model.Usuario;

/**
 *
 * @author orope
 */
public class test {
    
    public static void main(String args[]){
<<<<<<< HEAD
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
=======
//        System.out.println("hola");
        List<TipoUsuario> lista = null;

        DAOFactory factory=DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        TipoUsuarioDAO tipoUsuarioDAO=factory.createTipoUsuarioDAO();
//        String nombre=cursoDAO.NombreCurso(1);
//        System.out.println("holaaaaaaaaaa" + nombre);
        lista=tipoUsuarioDAO.findAll();
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getDescripcion());
        }
        
//        Usuario u=usuarioDao.autentificar("juan@example.com", "123456");
//        System.out.println("hola");
//        System.out.println(u);
//        if (u!=null) {
//            System.out.println(u.getNombres());
//        }
//        lista = usuarioDao.findAll();
//        
//        Usuario u= new Usuario("brayan", "oropeza", "email", "2324", 1);
//        UsuarioDAO usudao=new UsuarioDAOImplMysql();
//        usudao.save(u);
//        usuarioDao.obtenerNombreRolesUsuario(6);
    }
    

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
