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
public class cliente{

    private String nombre;
    private String apellido;
    private int salario;
    private String nacionalidad;
    private int crédito;
    private String compras;
    private int cantidad_compras;
    private String domicilio;

    public cliente(String nombre, String apellido, int salario, String nacionalidad, int crédito, String compras, int cantidad_compras, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.crédito = crédito;
        this.compras = compras;
        this.cantidad_compras = cantidad_compras;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCrédito() {
        return crédito;
    }

    public void setCrédito(int crédito) {
        this.crédito = crédito;
    }

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }

    public int getCantidad_compras() {
        return cantidad_compras;
    }

    public void setCantidad_compras(int cantidad_compras) {
        this.cantidad_compras = cantidad_compras;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return nombre + apellido +  salario + nacionalidad + crédito +  compras +  cantidad_compras +  domicilio ;
    }
    
}
