/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
<<<<<<< HEAD
 * @author chibo
 */
public class Mensaje {
    
    private int id;
    private String asunto;
    private String cuerpo;
    private String fechaEnvio;
    private int idUsuE;
    private int idUsuR;

    public Mensaje(int id, String asunto, String cuerpo, String fechaEnvio, int idUsuE, int idUsuR) {
        this.id = id;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fechaEnvio = fechaEnvio;
        this.idUsuE = idUsuE;
        this.idUsuR = idUsuR;
=======
 * @author orope
 */
public class Mensaje {

    private int id;
    private String asunto;
    private String contenido;
    private String fecha;
    private int idEmisor;
    private int idReceptor;

    public Mensaje(int id, String asunto, String contenido, String fecha, int idEmisor, int idReceptor) {
        this.id = id;
        this.asunto = asunto;
        this.contenido = contenido;
        this.fecha = fecha;
        this.idEmisor = idEmisor;
        this.idReceptor = idReceptor;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

<<<<<<< HEAD
    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getIdUsuE() {
        return idUsuE;
    }

    public void setIdUsuE(int idUsuE) {
        this.idUsuE = idUsuE;
    }

    public int getIdUsuR() {
        return idUsuR;
    }

    public void setIdUsuR(int idUsuR) {
        this.idUsuR = idUsuR;
    }
    
    
=======
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }

    public int getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }
    
    

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
