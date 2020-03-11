/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;

/**
 *
 * @author Yo
 */
public class valores {
    public int Pueblo=50;
    public int Recursos=50;
    public int Dinero=50;
    public int Ejercito=50;
    public int Seguridad=50;

    public valores() {
    }

    public int getPueblo() {
        return Pueblo;
    }

    public int getRecursos() {
        return Recursos;
        
    }

    public int getDinero() {
        return Dinero;
    }

    public int getEjercito() {
        return Ejercito;
    }

    public void setPueblo(int Pueblo) {
        this.Pueblo = Pueblo;
    }

    public void setSeguridad(int Seguridad) {
        this.Seguridad = Seguridad;
    }

    public void setRecursos(int Recursos) {
        this.Recursos = Recursos;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public void setEjercito(int Ejercito) {
        this.Ejercito = Ejercito;
    }

    @Override
    public String toString() {
        System.out.println("Mi lord el reino esta de esta manera " +
                " Pueblo= " + Pueblo 
                + " Recursos= " + Recursos  
                +" Dinero= " + Dinero 
                + " Ejercito= " + Ejercito
                + "Seguridad " + Seguridad);
        return null;
    }
    
       
}