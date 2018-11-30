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
public enum Eaero {
    volaris("Volaris"),
    interjet("Interjet"),
    viva("VivAervobus"),;
    
    private final String emvuelo;
    
    
    private Eaero(String emvuelo){
        this.emvuelo=emvuelo;
        
    }

    /**
     * @return the emvuelo
     */
    public String getEmvuelo() {
        return emvuelo;
    }
}
