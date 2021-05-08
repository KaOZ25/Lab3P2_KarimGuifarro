/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Equipo_sonido extends producto{
    private int cant_altavoces;
    private int potencia;
    private int cant_puertosaux;
    private int cant_discos;
    private int cant_puertosUSB;

    public Equipo_sonido(String num_serie, int precio, String color, String info) {
        super(num_serie, precio, color, info);
    }

    public Equipo_sonido(int cant_altavoces, int potencia, int cant_puertosaux, int cant_discos, int cant_puertosUSB, String num_serie, int precio, String color, String info) {
        super(num_serie, precio, color, info);
        this.cant_altavoces = cant_altavoces;
        this.potencia = potencia;
        this.cant_puertosaux = cant_puertosaux;
        this.cant_discos = cant_discos;
        this.cant_puertosUSB = cant_puertosUSB;
    }

    public int getCant_altavoces() {
        return cant_altavoces;
    }

    public void setCant_altavoces(int cant_altavoces) {
        this.cant_altavoces = cant_altavoces;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCant_puertosaux() {
        return cant_puertosaux;
    }

    public void setCant_puertosaux(int cant_puertosaux) {
        this.cant_puertosaux = cant_puertosaux;
    }

    public int getCant_discos() {
        return cant_discos;
    }

    public void setCant_discos(int cant_discos) {
        this.cant_discos = cant_discos;
    }

    public int getCant_puertosUSB() {
        return cant_puertosUSB;
    }

    public void setCant_puertosUSB(int cant_puertosUSB) {
        this.cant_puertosUSB = cant_puertosUSB;
    }

    @Override
    public String toString() {
        return "Equipo_sonido{" + "cant_altavoces=" + cant_altavoces + ", potencia=" + potencia + ", cant_puertosaux=" + cant_puertosaux + ", cant_discos=" + cant_discos + ", cant_puertosUSB=" + cant_puertosUSB + super.toString()+'}';
    }

   
}
