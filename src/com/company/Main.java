package com.company;

import clases.CapacidadEndedudamiento;
import clases.Mensajes;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CapacidadEndedudamiento capacidad = new CapacidadEndedudamiento();

        int ingMesuales = 0;
        int gastoFijo = 0;
        int gastoVariable = 0;
        int sw = 0;
        String valor = null;

        String entrada = "SI";
        System.out.println(Mensajes.MSG1);
        System.out.println(Mensajes.MSG2);

        while (entrada.equals("SI"))
        {
            if ((entrada.equals("SI") && (sw == 0)) || sw == 1)
            {
                System.out.println(Mensajes.INGRESOS);
                valor = in.nextLine().toUpperCase();
                if (valor.equals("FIN")) {
                    break;
                }
                if (isNumeric(valor))
                {
                    ingMesuales = Integer.parseInt(valor);
                    sw = 0;
                }
                else
                    {
                    sw = 1;
                    System.out.println(Mensajes.NONUMERO);
                    }
            }
            if (sw == 0 || sw == 2){
                System.out.println(Mensajes.GASTOSF);
                valor = in.nextLine().toUpperCase();
                if (valor.equals("FIN")){
                    break;
                }
                if (isNumeric(valor)){
                    gastoFijo = Integer.parseInt(valor);
                    sw = 0;
                }
                else {
                    sw = 2;
                    System.out.println(Mensajes.NONUMERO);
                }
            }
            if (sw == 0 || sw == 3){
                System.out.println(Mensajes.GASTOSV);
                valor = in.nextLine().toUpperCase();
                if (valor.equals("FIN")){
                    break;
                }
                if (isNumeric(valor)){
                    gastoVariable = Integer.parseInt(valor);
                    sw = 0;
                }
                else {
                    sw = 3;
                    System.out.println(Mensajes.NONUMERO);
                }
            }
            if (sw == 0){
                capacidad.setIngresosTotales();
                capacidad.setGastosFijos();
                capacidad.setGastoVaribales();
                System.out.println
                   (Mensajes.CAPACIDAD + capacidad.getCapacidadEndeudamiento(ingMesuales, gastoFijo, gastoVariable));
                System.out.println(Mensajes.MSG3);
                entrada = in.nextLine().toUpperCase();
            }
        }
        in.close();
    }

    public static boolean isNumeric(String value) {
        boolean valorNumerico;
        try {
            Double.parseDouble(value);
            valorNumerico = true;
        }
        catch (NumberFormatException e){
            valorNumerico = false;
        }
        return valorNumerico;

    }
}
