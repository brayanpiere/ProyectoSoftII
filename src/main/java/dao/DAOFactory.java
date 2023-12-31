/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.mongodb.MongoDBFactory;
import dao.mysql.MySqlFactory;

/**
 *
 * @author orope
 */
public abstract class DAOFactory {

    public static final int MYSQL = 1;
    public static final int MONGODB = 2;
    
    public static DAOFactory getDAOFactory(int factoryYtype){
        switch(factoryYtype){
            case MYSQL:
                return new MySqlFactory();
            case MONGODB:
                return new MongoDBFactory();
            default:
                throw new IllegalArgumentException("tipo de fabrica no valida");
        }
    }

    public abstract UsuarioDAO createUsuarioDAO();
    
    public abstract PublicacionDAO createPublicacionDAO();

    public abstract RolDAO createRolDAO();
    
<<<<<<< HEAD
    public abstract MensajeDAO createMensajeDAO();

    public abstract TutoriaDAO createTutoriaDAO();
=======
    public abstract TutoriaDAO createTutoriaDAO();
    
    public abstract CursoDAO createCursoDAO();
    
    public abstract PublicacionDAO createPublicacionDAO();
    
    public abstract TipoUsuarioDAO createTipoUsuarioDAO();
    
    public abstract MensajeDAO createMensajeDAO();
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89

}
