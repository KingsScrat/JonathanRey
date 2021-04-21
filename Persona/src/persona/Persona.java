/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Scrat
 */
public class Persona {
   
    private String nombre;
    private int cc;
    private String tipo;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona() {
    }

    public Persona(String nombre, int cc, String tipo) {
        
        this.nombre = nombre;
        this.cc = cc;
        this.tipo = tipo;
    }
    
    

}
