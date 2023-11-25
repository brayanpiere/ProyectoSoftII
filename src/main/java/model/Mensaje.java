/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
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
    
    
}
