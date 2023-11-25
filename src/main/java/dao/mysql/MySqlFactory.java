/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import dao.CursoDAO;
import dao.DAOFactory;
import dao.MensajeDAO;
import dao.PublicacionDAO;
import dao.RolDAO;
<<<<<<< HEAD
=======
import dao.TipoUsuarioDAO;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
import dao.TutoriaDAO;
import dao.UsuarioDAO;

/**
 *
 * @author orope
 */
public class MySqlFactory extends DAOFactory {

    @Override
    public UsuarioDAO createUsuarioDAO() {
        return new UsuarioDAOImplMysql();
    }

    @Override
    public RolDAO createRolDAO() {
        return new RolDAOImplMysql();
    }

    @Override
<<<<<<< HEAD
=======
    public TutoriaDAO createTutoriaDAO() {
        return new TutoriaDAOImplMysql();
    }

    @Override
    public CursoDAO createCursoDAO() {
        return new CursoDAOImplMysql();
    }

    @Override
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    public PublicacionDAO createPublicacionDAO() {
        return new PublicacionDAOImplMysql();
    }

    @Override
<<<<<<< HEAD
=======
    public TipoUsuarioDAO createTipoUsuarioDAO() {
        return new TipoUsuarioDAOImplMysql();
    }

    @Override
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    public MensajeDAO createMensajeDAO() {
        return new MensajeDAOImplMysql();
    }

<<<<<<< HEAD
    @Override
    public TutoriaDAO createTutoriaDAO() {
        return new TutoriaDAOImplMysql();
    }
    
=======
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
