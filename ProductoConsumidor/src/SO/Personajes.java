/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SO;

/**
 *
 * @author Dell
 */
public class Personajes {
    public int posicion;
    public int tiempo;

    public Personajes(int posicion, int tiempo) {
        this.posicion = posicion;
        this.tiempo = tiempo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
