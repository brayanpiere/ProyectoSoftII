/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Tutoria;

/**
 *
<<<<<<< HEAD
 * @author chibo
 */
public abstract class TutoriaDAO implements CRUD<Tutoria>{
    
    public abstract List<Tutoria> obtenerTutoriasPorEstudiante(int idEstudiante);
=======
 * @author orope
 */
public abstract class TutoriaDAO implements CRUD<Tutoria>{
    
    public abstract List<Tutoria> obtenerListaTutoriasXEstudiante(int idEstudiante);
    
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
