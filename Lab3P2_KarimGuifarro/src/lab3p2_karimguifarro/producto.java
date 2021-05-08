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
public class producto {
   private String num_serie;
    private int precio;
    private String color;
    private String info;

    public producto() {
    }

    public producto(String num_serie, int precio, String color, String info) {
        this.num_serie = num_serie;
        this.precio = precio;
        this.color = color;
        this.info = info;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "producto{" + "num_serie=" + num_serie + ", precio=" + precio + ", color=" + color + ", info=" + info + '}';
    }
    
}
