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
public class Teatro extends producto {

    private int cant_altavoces;
    private int cantidad_discBluRay;
    private String info_limpieza;
    private String info_lectordisco;

    public Teatro(String num_serie, int precio, String color, String info) {
        super(num_serie, precio, color, info);
    }

    public Teatro(int cant_altavoces, int cantidad_discBluRay, String info_limpieza, String info_lectordisco, String num_serie, int precio, String color, String info) {
        super(num_serie, precio, color, info);
        this.cant_altavoces = cant_altavoces;
        this.cantidad_discBluRay = cantidad_discBluRay;
        this.info_limpieza = info_limpieza;
        this.info_lectordisco = info_lectordisco;
    }

    public int getCant_altavoces() {
        return cant_altavoces;
    }

    public void setCant_altavoces(int cant_altavoces) {
        this.cant_altavoces = cant_altavoces;
    }

    public int getCantidad_discBluRay() {
        return cantidad_discBluRay;
    }

    public void setCantidad_discBluRay(int cantidad_discBluRay) {
        this.cantidad_discBluRay = cantidad_discBluRay;
    }

    public String getInfo_limpieza() {
        return info_limpieza;
    }

    public void setInfo_limpieza(String info_limpieza) {
        this.info_limpieza = info_limpieza;
    }

    public String getInfo_lectordisco() {
        return info_lectordisco;
    }

    public void setInfo_lectordisco(String info_lectordisco) {
        this.info_lectordisco = info_lectordisco;
    }

    @Override
    public String toString() {
        return "Teatro{" + "cant_altavoces=" + cant_altavoces + ", cantidad_discBluRay=" + cantidad_discBluRay + ", info_limpieza=" + info_limpieza + ", info_lectordisco=" + info_lectordisco + super.toString()+'}';
    }
    
}
