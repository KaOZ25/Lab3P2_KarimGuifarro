package lab3p2_karimguifarro;

public class Asesor_Fincanciero extends empleado{

    
    private String clientes_atendidos;
    private String cantproductos_comprado;  
     private int total_créditos;

    public Asesor_Fincanciero(String nombre, String apellido, int salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
    }

    public Asesor_Fincanciero(String clientes_atendidos, String cantproductos_comprado, int total_créditos, String nombre, String apellido, int salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.clientes_atendidos = clientes_atendidos;
        this.cantproductos_comprado = cantproductos_comprado;
        this.total_créditos = total_créditos;
    }

    public String getClientes_atendidos() {
        return clientes_atendidos;
    }

    public void setClientes_atendidos(String clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }

    public String getCantproductos_comprado() {
        return cantproductos_comprado;
    }

    public void setCantproductos_comprado(String cantproductos_comprado) {
        this.cantproductos_comprado = cantproductos_comprado;
    }

    public int getTotal_créditos() {
        return total_créditos;
    }

    public void setTotal_créditos(int total_créditos) {
        this.total_créditos = total_créditos;
    }

    @Override
    public String toString() {
        return "Asesor_Fincanciero{" + "clientes_atendidos=" + clientes_atendidos + ", cantproductos_comprado=" + cantproductos_comprado + ", total_creditos=" + total_créditos + super.toString() +'}';
    }

   

   
  
}
