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

        worker[0] = new Comercial("John", new Fecha(23, 2, 1979), 1000, 300, 544);
        worker[1] = new Repartidor("Jane", new Fecha(13, 3, 2000), 1000, 12, "3");

        if (worker[0] instanceof Comercial) {
            System.out.println(worker[0].toString());
        }
        if (worker[1] instanceof Repartidor) {
            System.out.println(worker[1].toString());
        }
    }

}
