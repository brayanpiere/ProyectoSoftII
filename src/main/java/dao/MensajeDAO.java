/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

<<<<<<< HEAD
import model.Mensaje;
/**
 *
 * @author chibo
 */
public abstract class MensajeDAO implements CRUD<Mensaje>{
    
=======
import java.util.List;
import model.Mensaje;

/**
 *
 * @author orope
 */
public abstract class MensajeDAO implements CRUD<Mensaje>{
    
    public abstract List<Mensaje> getMensajesXExperto(int idExperto);
    
    public abstract String getNombreEmisor(int idEmisor);
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
