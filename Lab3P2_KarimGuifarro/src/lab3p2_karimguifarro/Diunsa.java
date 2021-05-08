package lab3p2_karimguifarro;

import java.util.ArrayList;


public class Diunsa {
   private String id;
   private String ubicacion;
   private int cant_emp;
   private int cant_cpa;
   private String prod_vend;
   private int cant_prod;
   private ArrayList<empleado> emple;
   private ArrayList<producto> produ;

    public Diunsa(String id, String ubicacion, int cant_emp, int cant_cpa, String prod_vend, int cant_prod, ArrayList<empleado> emple, ArrayList<producto> produ) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.cant_emp = cant_emp;
        this.cant_cpa = cant_cpa;
        this.prod_vend = prod_vend;
        this.cant_prod = cant_prod;
        this.emple = emple;
        this.produ = produ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCant_emp() {
        return cant_emp;
    }

    public void setCant_emp(int cant_emp) {
        this.cant_emp = cant_emp;
    }

    public int getCant_cpa() {
        return cant_cpa;
    }

    public void setCant_cpa(int cant_cpa) {
        this.cant_cpa = cant_cpa;
    }

    public String getProd_vend() {
        return prod_vend;
    }

    public void setProd_vend(String prod_vend) {
        this.prod_vend = prod_vend;
    }

    public int getCant_prod() {
        return cant_prod;
    }

    public void setCant_prod(int cant_prod) {
        this.cant_prod = cant_prod;
    }

    public ArrayList<empleado> getEmple() {
        return emple;
    }

    public void setEmple(ArrayList<empleado> emple) {
        this.emple = emple;
    }

    public ArrayList<producto> getProdu() {
        return produ;
    }

    public void setProdu(ArrayList<producto> produ) {
        this.produ = produ;
    }

    @Override
    public String toString() {
        return  id + ubicacion +  cant_emp +  cant_cpa +  prod_vend +  cant_prod +  emple +  produ;
    }
   
}
