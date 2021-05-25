/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benja
 */
public class Pelicula {
    
    
    private String nombre;
    private String genero;
    private int anio;
    private int id;
    private String poster;

    /**
     * @return the nombre
     */
    
    public void setPoster(String poster){
        this.poster=poster;
    }
    
    public String getPoster(){
    return poster;
    }
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getId(){
    return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
}