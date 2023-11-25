/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Tutoria;

/**
 *
 * @author chibo
 */
public abstract class TutoriaDAO implements CRUD<Tutoria>{
    
    public abstract List<Tutoria> obtenerTutoriasPorEstudiante(int idEstudiante);
}