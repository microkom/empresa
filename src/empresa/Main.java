/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Calendar;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear una clase con el método main, en el que haya un vector de 10
empleados, y tras calcular su sueldo (si tiene PLUS) mostrar toda la
información de cada uno de ellos
         */
        Calendar cal = Calendar.getInstance();
        int anyo = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        Fecha hoy = new Fecha(dia, mes, anyo);

        Empleados[] worker = new Empleados[10];

        worker[0] = new Comercial("Sandra", new Fecha(23, 2, 1979), 1000, 343, 544);
        worker[1] = new Repartidor("David", new Fecha(28, 6, 1983), 1200, 988, "3");
        worker[2] = new Repartidor("Adrian", new Fecha(15, 3, 1998), 1060, 121, "3");
        worker[3] = new Repartidor("Jaime", new Fecha(13, 8, 1986), 900, 55, "3");
        worker[4] = new Repartidor("Carlos", new Fecha(23, 1, 1993), 2100, 70, "3");
        worker[5] = new Comercial("Jose", new Fecha(18, 2, 1979), 500, 300, 544);
        worker[6] = new Comercial("Juanjo", new Fecha(1, 11, 1988), 1100, 300, 544);
        worker[7] = new Comercial("Luis", new Fecha(23, 7, 1999), 1011, 277, 544);
        worker[8] = new Comercial("Pedro", new Fecha(4, 4, 1973), 2000, 166, 544);
        worker[9] = new Comercial("Jane", new Fecha(23, 1, 1988), 6000, 655, 544);

        Empleados empleadoMayor = null;
        Empleados empleadoMenor = null;
        int comercialesConPlus = 0;
        int repartidorConPlus = 0;
        double salarioTodos=0;
        double plusTodos=0;
        for (int i = 0; i < 10; i++) {

            if (worker[i] != null) {
                
                salarioTodos+=worker[i].getSalario();
                
                
                if (worker[i] instanceof Comercial) {
                    System.out.println(worker[i].toString());//el metodo toString agrega el Plus si le corresponde
                    if (((Comercial) worker[i]).plus()) {
                        comercialesConPlus++;
                    }
                }
                if (worker[i] instanceof Repartidor) {
                    System.out.println(worker[i].toString());//el metodo toString agrega el Plus si le corresponde
                    if (((Repartidor) worker[i]).plus()) {
                        repartidorConPlus++;
                    }
                }
                //se ubica aquí porque antes el metodo tiene que agregar el plus 
                plusTodos+=worker[i].getPlus();

                if (i == 0) {
                    empleadoMayor = worker[i];
                    empleadoMenor = worker[i];
                } else {
                    //busqueda de la fecha mas anterior con el metodo menorQue
                    if (worker[i].getFechaNac().menorQue(empleadoMayor.getFechaNac())) {
                        empleadoMayor = worker[i];
                    }
                    if (worker[i].getFechaNac().mayorQue(empleadoMenor.getFechaNac())) {
                        empleadoMenor = worker[i];
                    }
                }
            }
        }
        System.out.println("\tEl empleado con más edad de la empresa es " + empleadoMayor.getNombre());
        System.out.println("\tEl empleado con menos edad de la empresa es " + empleadoMenor.getNombre());
        System.out.println("\tComerciales con Plus: " + comercialesConPlus);
        System.out.println("\tRepartidores con Plus: " + repartidorConPlus);
        System.out.println("\tEmpleados con Plus: " + (repartidorConPlus + comercialesConPlus));
        System.out.println("\tTotal Salarios: " +salarioTodos);
        System.out.println("\tTotal Pluses: " +plusTodos);
    }

}
