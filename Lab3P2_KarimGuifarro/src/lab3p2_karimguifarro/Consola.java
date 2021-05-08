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
public class Consola extends producto{

    
    private String marca;
    private int almacenamiento;
    private int cant_controles;
    private int accesorios;
    private String tarjeta_video;

    public Consola(String marca, int almacenamiento, int cant_controles, int accesorios, String tarjeta_video, String num_serie, int precio, String color, String info) {
        super(num_serie, precio, color, info);
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.cant_controles = cant_controles;
        this.accesorios = accesorios;
        this.tarjeta_video = tarjeta_video;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCant_controles() {
        return cant_controles;
    }

    public void setCant_controles(int cant_controles) {
        this.cant_controles = cant_controles;
    }

    public int getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(int accesorios) {
        this.accesorios = accesorios;
    }

    public String getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(String tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    @Override
    public String toString() {
        return "Consola{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + ", cant_controles=" + cant_controles + ", accesorios=" + accesorios + ", tarjeta_video=" + tarjeta_video + super.toString()+'}';
    }

   
}
