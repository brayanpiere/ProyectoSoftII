/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CursoDAO;
import dao.DAOFactory;
import dao.TutoriaDAO;
import dao.UsuarioDAO;
import dao.mysql.UsuarioDAOImplMysql;
import java.util.List;
import model.Tutoria;
import model.Usuario;

/**
 *
 * @author orope
 */
public class test {
    
    public static void main(String args[]){
//        System.out.println("hola");
//        List<Tutoria> lista = null;

        DAOFactory factory=DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        CursoDAO cursoDAO=factory.createCursoDAO();
        String nombre=cursoDAO.NombreCurso(1);
        System.out.println("holaaaaaaaaaa" + nombre);
//        lista=tutoriaDAO.obtenerListaTutoriasXEstudiante(1);
        
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getIdCur());
//        }
        
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
    

}
