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
public class Supervisor extends empleado{
     private int salario_promedioemple;
    private int meta_promedio;

    public Supervisor(String nombre, String apellido, int salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
    }

    public Supervisor(int salario_promedioemple, int meta_promedio, String nombre, String apellido, int salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.salario_promedioemple = salario_promedioemple;
        this.meta_promedio = meta_promedio;
    }

    public int getSalario_promedioemple() {
        return salario_promedioemple;
    }

    public void setSalario_promedioemple(int salario_promedioemple) {
        this.salario_promedioemple = salario_promedioemple;
    }

    public int getMeta_promedio() {
        return meta_promedio;
    }

    public void setMeta_promedio(int meta_promedio) {
        this.meta_promedio = meta_promedio;
    }

    @Override
    public String toString() {
        return "Supervisor{" + "salario_promedioemple=" + salario_promedioemple + ", meta_promedio=" + meta_promedio + super.toString() +'}';
    }
    
}
