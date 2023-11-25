/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

<<<<<<< HEAD
/**
 *
 * @author chibo
 */
public class Publicacion {
    private int id;
=======
public class Publicacion {
    private int idPublicacion;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    private String titulo;
    private String cuerpo;
    private String fecha;
    private int documento;
    private int idCurso;
    private int idUsuario;

<<<<<<< HEAD
    public Publicacion(int id, String titulo, String cuerpo, String fecha, int documento, int idCurso, int idUsuario) {
        this.id = id;
=======
    public Publicacion(int idPublicacion, String titulo, String cuerpo, String fecha, int documento, int idCurso, int idUsuario) {
        this.idPublicacion = idPublicacion;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.documento = documento;
        this.idCurso = idCurso;
        this.idUsuario = idUsuario;
<<<<<<< HEAD
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
=======
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

<<<<<<< HEAD
=======
    
    

>>>>>>> 3a2fa535a6fb3c7c867c2a6472b12271be176d89
}
