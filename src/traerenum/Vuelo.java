/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traerenum;

/**
 *
 * @author alexr
 */
public class Vuelo {
 
    private String nombre;
    private Eaero empresa;
    
    public Vuelo(){}
    public Vuelo(String nombre, Eaero empresa ){
        this.nombre=nombre;
        this.empresa=empresa;
        
    }

    /**
     * @return the nombre
     */
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
     * @return the empresa
     */
    public Eaero getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Eaero empresa) {
        this.empresa = empresa;
    }
    
}
