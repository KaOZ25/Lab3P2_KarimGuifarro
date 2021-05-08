/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_karimguifarro;

public class Tv extends producto{
    
    private int tamaño;
    private boolean Smart;
    private String marca;
    private int cantidad_conexiones;
    private int grosor;

  

    public Tv(int tamaño, boolean Smart, String marca, int cantidad_conexiones, int grosor, String num_serie, int precio, String color, String info) {
        super(num_serie, precio, color, info);
        this.tamaño = tamaño;
        this.Smart = Smart;
        this.marca = marca;
        this.cantidad_conexiones = cantidad_conexiones;
        this.grosor = grosor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isSmart() {
        return Smart;
    }

    public void setSmart(boolean Smart) {
        this.Smart = Smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad_conexiones() {
        return cantidad_conexiones;
    }

    public void setCantidad_conexiones(int cantidad_conexiones) {
        this.cantidad_conexiones = cantidad_conexiones;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Tv{" + "tama\u00f1o=" + tamaño + ", Smart=" + Smart + ", marca=" + marca + ", cantidad_conexiones=" + cantidad_conexiones + ", grosor=" + grosor + super.toString()+'}';
    }

    

    
}
