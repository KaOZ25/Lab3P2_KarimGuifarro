package lab3p2_karimguifarro;

public class Cajero extends empleado{

   
    private int tiempo_labor;
    private String horario;
    private String almuerzo;
    private int meta_venta;
    private String cant_emple;

    public Cajero(String nombre, String apellido, int salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
    }

    public Cajero(int tiempo_labor, String horario, String almuerzo, int meta_venta, String cant_emple, String nombre, String apellido, int salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.tiempo_labor = tiempo_labor;
        this.horario = horario;
        this.almuerzo = almuerzo;
        this.meta_venta = meta_venta;
        this.cant_emple = cant_emple;
    }

   
    public int getTiempo_labor() {
        return tiempo_labor;
    }

    public void setTiempo_labor(int tiempo_labor) {
        this.tiempo_labor = tiempo_labor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public int getMeta_venta() {
        return meta_venta;
    }

    public void setMeta_venta(int meta_venta) {
        this.meta_venta = meta_venta;
    }

    public String getCant_emple() {
        return cant_emple;
    }

    public void setCant_emple(String cant_emple) {
        this.cant_emple = cant_emple;
    }

    @Override
    public String toString() {
        return "Cajero{" + "tiempo_labor=" + tiempo_labor + ", horario=" + horario + ", almuerzo=" + almuerzo + ", meta_venta=" + meta_venta + ", cant_emple=" + cant_emple + super.toString()+'}';
    }
    
    
}
