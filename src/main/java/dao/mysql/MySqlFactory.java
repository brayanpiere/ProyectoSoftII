/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.mysql;

import dao.DAOFactory;
import dao.MensajeDAO;
import dao.PublicacionDAO;
import dao.RolDAO;
import dao.TutoriaDAO;
import dao.UsuarioDAO;

/**
 *
 * @author orope
 */
public class MySqlFactory extends DAOFactory{

    @Override
    public UsuarioDAO createUsuarioDAO() {
        return new UsuarioDAOImplMysql();
    }

    @Override
    public RolDAO createRolDAO() {
        return new RolDAOImplMysql();
    }

    @Override
    public PublicacionDAO createPublicacionDAO() {
        return new PublicacionDAOImplMysql();
    }

    @Override
    public MensajeDAO createMensajeDAO() {
        return new MensajeDAOImplMysql();
    }

    @Override
    public TutoriaDAO createTutoriaDAO() {
        return new TutoriaDAOImplMysql();
    }
    
}
