package lab3p2_karimguifarro;

import java.util.*;

public class Lab3P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<Diunsa> diun = new ArrayList();

    public static void main(String[] args) {
        String admin = "admin", contra = "1234", user, con;
        char q = 'c';
        while (q == 'c') {
            System.out.println("Ingrese el usuario");
            user = KaOz.nextLine();
            System.out.println("Ingrese la contraseña");
            con = KaOz.nextLine();
            if (user.equals(admin) && con.equals(contra)) {
                System.out.println("*****MENU*******\n"
                        + "1) Crear\n"
                        + "2) Listar\n"
                        + "3) Modificar\n"
                        + "4) Eliminar\n"
                        + "5) Salir");
                int p = KaOz.nextInt();
                switch (p) {
                    case 1: {
                        String id, ubicacion, prod_vend;
                        int cant_emp, cant_cpa, cant_prod;
                        ArrayList<empleado> emple = new ArrayList();
                        ArrayList<producto> produ = new ArrayList();
                        System.out.println("Ingrese la identificacion del local:");
                        id = KaOz.nextLine();
                        if (diun.size() < 0) {
                            String[] o;
                            String h;
                            for (int i = 0; i < diun.size(); i++) {
                                o = diun.get(i).toString().split("\\s");
                                h = o[0];
                                while (h.equals(id)) {
                                    System.out.println("esta ID ya existe favor ingresar otra:");
                                    id = KaOz.nextLine();
                                }
                            }
                        }
                            System.out.println("Ingrese su ubicacion:");
                            ubicacion = KaOz.nextLine();
                            System.out.println("Ingrese la cantidad de empleados:");
                            cant_emp = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de cajas de pago:");
                            cant_cpa = KaOz.nextInt();
                            System.out.println("Ingrese el producto mas vendido:");
                            prod_vend = KaOz.next();
                            System.out.println("Ingrese la cantidad de productos que puede albergar la tienda:");
                            cant_prod = KaOz.nextInt();
                            for (int i = 0; i < cant_emp; i++) {
                                System.out.println("1) Cajero,2)Supervisor,3)Asesor Financiero ");
                                int rango = KaOz.nextInt();
                                switch (rango) {
                                    case 1: {
                                        String nombre, apellido, nacionalidad, horario, almuerzo, cant_emple;
                                        int salario, tiempo_labor, meta_venta;

                                        System.out.println("Cajero:");
                                        System.out.println("Ingrese el nombre:");
                                        nombre = KaOz.nextLine();
                                        System.out.println("Ingresa el apellido:");
                                        apellido = KaOz.next();
                                        System.out.println("Ingresa su salario");
                                        salario = KaOz.nextInt();
                                        System.out.println("Ingrese su nacionalidad:");
                                        nacionalidad = KaOz.nextLine();
                                        System.out.println("Ingrese su tiempo en la empresa:");
                                        tiempo_labor = KaOz.nextInt();
                                        System.out.println("Ingrese su horario:");
                                        horario = KaOz.nextLine();
                                        System.out.println("Ingrese su hora de almuerzo:");
                                        almuerzo = KaOz.nextLine();
                                        System.out.println("Ingrese su meta a vender:");
                                        meta_venta = KaOz.nextInt();
                                        System.out.println("Ingrese Cantidad de empleados atendidos:");
                                        cant_emple = KaOz.nextLine();
                                        emple.add(new Cajero(tiempo_labor, horario, almuerzo, meta_venta, cant_emple, nombre, apellido, salario, nacionalidad));
                                    }
                                    case 2: {
                                        String nombre, apellido, nacionalidad;
                                        int salario, salario_promedioemple, meta_promedio;
                                        System.out.println("Supervisor:");
                                        System.out.println("Ingrese el nombre:");
                                        nombre = KaOz.nextLine();
                                        System.out.println("Ingresa el apellido:");
                                        apellido = KaOz.next();
                                        System.out.println("Ingresa su salario");
                                        salario = KaOz.nextInt();
                                        System.out.println("Ingrese su nacionalidad:");
                                        nacionalidad = KaOz.nextLine();
                                        System.out.println("Ingrese el salario promedio de los empelados supervisados:");
                                        salario_promedioemple = KaOz.nextInt();
                                        System.out.println("Ingrese el promedio de la meta de ventas:");
                                        meta_promedio = KaOz.nextInt();
                                        emple.add(new Supervisor(salario_promedioemple, meta_promedio, nombre, apellido, salario, nacionalidad));
                                    }
                                    break;
                                    case 3: {
                                        String nombre, apellido, nacionalidad, clientes_atendidos, cantproductos_comprado;
                                        int salario, total_créditos;
                                        System.out.println("Asesor Financiero:");
                                        System.out.println("Ingrese el nombre:");
                                        nombre = KaOz.nextLine();
                                        System.out.println("Ingresa el apellido:");
                                        apellido = KaOz.next();
                                        System.out.println("Ingresa su salario");
                                        salario = KaOz.nextInt();
                                        System.out.println("Ingrese su nacionalidad:");
                                        nacionalidad = KaOz.nextLine();
                                        System.out.println("Clientes atedidos:");
                                        clientes_atendidos = KaOz.nextLine();
                                        System.out.println("Numero total de creditos concedidos:");
                                        total_créditos = KaOz.nextInt();
                                        System.out.println("Cantidad de productos que han comprado los clientes");
                                        cantproductos_comprado = KaOz.nextLine();
                                        emple.add(new Asesor_Fincanciero(clientes_atendidos, cantproductos_comprado, total_créditos, nombre, apellido, salario, nacionalidad));
                                    }
                                }
                            }
                            for (int j = 0; j < cant_prod; j++) {
                                System.out.println("1)Tv,2)Consola,3)Equipo de Sonido,4)Teatro en casa");
                                int rango = KaOz.nextInt();
                                switch (rango) {
                                    case 1: {
                                        System.out.println("TV");
                                        String num_serie, color, info, marca;
                                        int precio, tamaño, cantidad_conexiones, grosor;
                                        boolean Smart=false;
                                        System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese la marca:");
                                        marca = KaOz.nextLine();
                                        System.out.println("Ingrese el tamaño:");
                                        tamaño = KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de conexiones auxiliares:");
                                        cantidad_conexiones = KaOz.nextInt();
                                        System.out.println("Ingrese el grosor:");
                                        grosor = KaOz.nextInt();
                                        System.out.println("es SmarTv?");
                                        String sin = KaOz.nextLine();
                                        sin.toUpperCase();
                                        if (sin.equals("SI")) {
                                            Smart = true;
                                        } else if (sin.equals("NO")) {
                                            Smart = false;
                                        }
                                        produ.add(new Tv( tamaño,  Smart,  marca,  cantidad_conexiones, grosor,  num_serie,  precio, color, info));
                                    }
                                    break;
                                    case 2:{
                                        System.out.println("Consola");
                                        String num_serie,color,info,marca,tarjeta_video;
                                        int precio,almacenamiento,cant_controles,accesorios;
                                        System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese la marca:");
                                        marca=KaOz.next();
                                        System.out.println("Ingrese el tipo de tarjeta de video:");
                                        tarjeta_video=KaOz.nextLine();
                                        System.out.println("Ingrese el almacenamieto:");
                                        almacenamiento=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de controles:");
                                        cant_controles=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de accesorios:");
                                        accesorios=KaOz.nextInt();
                                        produ.add(new Consola( marca,almacenamiento, cant_controles, accesorios,tarjeta_video, num_serie,  precio, color, info));
                                    }
                                    break;
                                    case 3:{
                                        System.out.println("Equipo de sonido");
                                        String num_serie,color,info;
                                        int precio,cant_altavoces,potencia,cant_puertosaux,cant_discos,  cant_puertosUSB;
                                         System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese Cantidad de alta voces");
                                        cant_altavoces=KaOz.nextInt();
                                        System.out.println("Ingrese la potencia:");
                                        potencia=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de puerto auxiliares:");
                                                cant_puertosaux=KaOz.nextInt();
                                                System.out.println("Ingrese la canitda de entradas de discos:");
                                                cant_discos=KaOz.nextInt();
                                                System.out.println("Ingrese la cantidad de puertos USB:");
                                                cant_puertosUSB=KaOz.nextInt();
                                        produ.add(new Equipo_sonido( cant_altavoces, potencia, cant_puertosaux, cant_discos, cant_puertosUSB,num_serie,  precio, color, info));
                                    }
                                    break;
                                    case 4:{
                                        System.out.println("Teatro en casa");
                                        String num_serie,color,info,info_limpieza,info_lectordisco;
                                        int precio,cant_altavoces,cantidad_discBluRay;
                                         System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese la informacion de limpieza:");
                                        info_limpieza=KaOz.nextLine();
                                        System.out.println("Ingrese la cantidad de altavoces:");
                                        cant_altavoces=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de discos Blu-Ray:");
                                        cantidad_discBluRay=KaOz.nextInt();
                                        System.out.println("Ingrese la informacion sobre el lector de discos:");
                                        info_lectordisco=KaOz.nextLine();
                                        produ.add(new Teatro(cant_altavoces, cantidad_discBluRay, info_limpieza, info_lectordisco ,num_serie,  precio, color, info));
                                    }
                                }
                            }
                            diun.add(new Diunsa(id, ubicacion,cant_emp, cant_cpa,prod_vend, cant_prod,emple,produ));
                        }
                    break;
                    case 2: {
                        list();
                    }
                    break;
                    case 3: {
                         list();
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > diun.size()) {
                                  String id, ubicacion, prod_vend;
                        int cant_emp, cant_cpa, cant_prod;
                        ArrayList<empleado> emple = new ArrayList();
                        ArrayList<producto> produ = new ArrayList();
                        System.out.println("Ingrese la identificacion del local:");
                        id = KaOz.nextLine();
                        if (diun.size() < 0) {
                            String[] o;
                            String h;
                            for (int i = 0; i < diun.size(); i++) {
                                o = diun.get(i).toString().split("\\s");
                                h = o[0];
                                while (h.equals(id)) {
                                    System.out.println("esta ID ya existe favor ingresar otra:");
                                    id = KaOz.nextLine();
                                }
                            }
                        }
                            System.out.println("Ingrese su ubicacion:");
                            ubicacion = KaOz.nextLine();
                            System.out.println("Ingrese la cantidad de empleados:");
                            cant_emp = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de cajas de pago:");
                            cant_cpa = KaOz.nextInt();
                            System.out.println("Ingrese el producto mas vendido:");
                            prod_vend = KaOz.next();
                            System.out.println("Ingrese la cantidad de productos que puede albergar la tienda:");
                            cant_prod = KaOz.nextInt();
                            for (int i = 0; i < cant_emp; i++) {
                                System.out.println("1) Cajero,2)Supervisor,3)Asesor Financiero ");
                                int rango = KaOz.nextInt();
                                switch (rango) {
                                    case 1: {
                                        String nombre, apellido, nacionalidad, horario, almuerzo, cant_emple;
                                        int salario, tiempo_labor, meta_venta;

                                        System.out.println("Cajero:");
                                        System.out.println("Ingrese el nombre:");
                                        nombre = KaOz.nextLine();
                                        System.out.println("Ingresa el apellido:");
                                        apellido = KaOz.next();
                                        System.out.println("Ingresa su salario");
                                        salario = KaOz.nextInt();
                                        System.out.println("Ingrese su nacionalidad:");
                                        nacionalidad = KaOz.nextLine();
                                        System.out.println("Ingrese su tiempo en la empresa:");
                                        tiempo_labor = KaOz.nextInt();
                                        System.out.println("Ingrese su horario:");
                                        horario = KaOz.nextLine();
                                        System.out.println("Ingrese su hora de almuerzo:");
                                        almuerzo = KaOz.nextLine();
                                        System.out.println("Ingrese su meta a vender:");
                                        meta_venta = KaOz.nextInt();
                                        System.out.println("Ingrese Cantidad de empleados atendidos:");
                                        cant_emple = KaOz.nextLine();
                                        emple.add(new Cajero(tiempo_labor, horario, almuerzo, meta_venta, cant_emple, nombre, apellido, salario, nacionalidad));
                                    }
                                    case 2: {
                                        String nombre, apellido, nacionalidad;
                                        int salario, salario_promedioemple, meta_promedio;
                                        System.out.println("Supervisor:");
                                        System.out.println("Ingrese el nombre:");
                                        nombre = KaOz.nextLine();
                                        System.out.println("Ingresa el apellido:");
                                        apellido = KaOz.next();
                                        System.out.println("Ingresa su salario");
                                        salario = KaOz.nextInt();
                                        System.out.println("Ingrese su nacionalidad:");
                                        nacionalidad = KaOz.nextLine();
                                        System.out.println("Ingrese el salario promedio de los empelados supervisados:");
                                        salario_promedioemple = KaOz.nextInt();
                                        System.out.println("Ingrese el promedio de la meta de ventas:");
                                        meta_promedio = KaOz.nextInt();
                                        emple.add(new Supervisor(salario_promedioemple, meta_promedio, nombre, apellido, salario, nacionalidad));
                                    }
                                    break;
                                    case 3: {
                                        String nombre, apellido, nacionalidad, clientes_atendidos, cantproductos_comprado;
                                        int salario, total_créditos;
                                        System.out.println("Asesor Financiero:");
                                        System.out.println("Ingrese el nombre:");
                                        nombre = KaOz.nextLine();
                                        System.out.println("Ingresa el apellido:");
                                        apellido = KaOz.next();
                                        System.out.println("Ingresa su salario");
                                        salario = KaOz.nextInt();
                                        System.out.println("Ingrese su nacionalidad:");
                                        nacionalidad = KaOz.nextLine();
                                        System.out.println("Clientes atedidos:");
                                        clientes_atendidos = KaOz.nextLine();
                                        System.out.println("Numero total de creditos concedidos:");
                                        total_créditos = KaOz.nextInt();
                                        System.out.println("Cantidad de productos que han comprado los clientes");
                                        cantproductos_comprado = KaOz.nextLine();
                                        emple.add(new Asesor_Fincanciero(clientes_atendidos, cantproductos_comprado, total_créditos, nombre, apellido, salario, nacionalidad));
                                    }
                                }
                            }
                            for (int j = 0; j < cant_prod; j++) {
                                System.out.println("1)Tv,2)Consola,3)Equipo de Sonido,4)Teatro en casa");
                                int rango = KaOz.nextInt();
                                switch (rango) {
                                    case 1: {
                                        System.out.println("TV");
                                        String num_serie, color, info, marca;
                                        int precio, tamaño, cantidad_conexiones, grosor;
                                        boolean Smart=false;
                                        System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese la marca:");
                                        marca = KaOz.nextLine();
                                        System.out.println("Ingrese el tamaño:");
                                        tamaño = KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de conexiones auxiliares:");
                                        cantidad_conexiones = KaOz.nextInt();
                                        System.out.println("Ingrese el grosor:");
                                        grosor = KaOz.nextInt();
                                        System.out.println("es SmarTv?");
                                        String sin = KaOz.nextLine();
                                        sin.toUpperCase();
                                        if (sin.equals("SI")) {
                                            Smart = true;
                                        } else if (sin.equals("NO")) {
                                            Smart = false;
                                        }
                                        produ.add(new Tv( tamaño,  Smart,  marca,  cantidad_conexiones, grosor,  num_serie,  precio, color, info));
                                    }
                                    break;
                                    case 2:{
                                        System.out.println("Consola");
                                        String num_serie,color,info,marca,tarjeta_video;
                                        int precio,almacenamiento,cant_controles,accesorios;
                                        System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese la marca:");
                                        marca=KaOz.next();
                                        System.out.println("Ingrese el tipo de tarjeta de video:");
                                        tarjeta_video=KaOz.nextLine();
                                        System.out.println("Ingrese el almacenamieto:");
                                        almacenamiento=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de controles:");
                                        cant_controles=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de accesorios:");
                                        accesorios=KaOz.nextInt();
                                        produ.add(new Consola( marca,almacenamiento, cant_controles, accesorios,tarjeta_video, num_serie,  precio, color, info));
                                    }
                                    break;
                                    case 3:{
                                        System.out.println("Equipo de sonido");
                                        String num_serie,color,info;
                                        int precio,cant_altavoces,potencia,cant_puertosaux,cant_discos,  cant_puertosUSB;
                                         System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese Cantidad de alta voces");
                                        cant_altavoces=KaOz.nextInt();
                                        System.out.println("Ingrese la potencia:");
                                        potencia=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de puerto auxiliares:");
                                                cant_puertosaux=KaOz.nextInt();
                                                System.out.println("Ingrese la canitda de entradas de discos:");
                                                cant_discos=KaOz.nextInt();
                                                System.out.println("Ingrese la cantidad de puertos USB:");
                                                cant_puertosUSB=KaOz.nextInt();
                                        produ.add(new Equipo_sonido( cant_altavoces, potencia, cant_puertosaux, cant_discos, cant_puertosUSB,num_serie,  precio, color, info));
                                    }
                                    break;
                                    case 4:{
                                        System.out.println("Teatro en casa");
                                        String num_serie,color,info,info_limpieza,info_lectordisco;
                                        int precio,cant_altavoces,cantidad_discBluRay;
                                         System.out.println("Ingrese el numero de serie:");
                                        num_serie = KaOz.nextLine();
                                        System.out.println("Ingrese el color:");
                                        color = KaOz.nextLine();
                                        System.out.println("Ingrese informacion del producto:");
                                        info = KaOz.nextLine();
                                        System.out.println("Ingrese el precio del producto:");
                                        precio = KaOz.nextInt();
                                        System.out.println("Ingrese la informacion de limpieza:");
                                        info_limpieza=KaOz.nextLine();
                                        System.out.println("Ingrese la cantidad de altavoces:");
                                        cant_altavoces=KaOz.nextInt();
                                        System.out.println("Ingrese la cantidad de discos Blu-Ray:");
                                        cantidad_discBluRay=KaOz.nextInt();
                                        System.out.println("Ingrese la informacion sobre el lector de discos:");
                                        info_lectordisco=KaOz.nextLine();
                                        produ.add(new Teatro(cant_altavoces, cantidad_discBluRay, info_limpieza, info_lectordisco ,num_serie,  precio, color, info));
                                    }
                                    diun.get(mod).setCant_cpa(cant_cpa);
                                    diun.get(mod).setCant_emp(cant_emp);
                                    diun.get(mod).setCant_prod(cant_prod);
                                    diun.get(mod).setEmple(emple);
                                    diun.get(mod).setId(id);
                                    diun.get(mod).setProd_vend(prod_vend);
                                    diun.get(mod).setProdu(produ);
                                    diun.get(mod).setUbicacion(ubicacion);
                                }
                            }
                            }
                    }
                    break;
                    case 4: {
                         list();
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > diun.size()) {
                                System.out.println("No existe este detective");
                                list();
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            diun.remove(mod);
                        
                    }
                    break;
                    case 5: {

                    }
                    break;
                    default:
                        System.out.println("Ingrese un opcion correcta");
                }
            }
        }
    }
      public static void list() {
        for (int i = 0; i < diun.size(); i++) {
            System.out.println(diun.get(i));
        }
    }
}
