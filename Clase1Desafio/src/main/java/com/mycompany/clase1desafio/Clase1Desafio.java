/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1desafio;

/**
 *
 * @author Meier
 */
public class Clase1Desafio {

    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        String primeraRespuestaA = "Primera respuesta A:";
        while (numeroInicio <= numeroFin) {
            String resultado = primeraRespuestaA += (numeroInicio + ",");
            numeroInicio++;
            primeraRespuestaA = resultado;
        }
        System.out.println(primeraRespuestaA.substring(0, primeraRespuestaA.length() - 1));

        numeroInicio = 5;
        numeroFin = 14;
        String primeraResupestaB = "Primera respuesta B:";
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                String resultado = primeraResupestaB += (numeroInicio + ",");
                numeroInicio++;
                primeraResupestaB = resultado;
            }
            numeroInicio++;
        }
        System.out.println(primeraResupestaB.substring(0, primeraResupestaB.length() - 1));

        numeroInicio = 5;
        numeroFin = 14;
        boolean mostrarPar = false;
        String primeraResupestaC = "Primera respuesta C:";
        while (numeroInicio <= numeroFin) {
            if (mostrarPar) {
                if (numeroInicio % 2 == 0) {
                    String resultado = primeraResupestaC += (numeroInicio + ",");
                    numeroInicio++;
                    primeraResupestaC = resultado;
                }
                numeroInicio++;
            } else {
                if (numeroInicio % 2 == 1) {
                    String resultado = primeraResupestaC += (numeroInicio + ",");
                    numeroInicio++;
                    primeraResupestaC = resultado;
                }
                numeroInicio++;
            }
        }
        System.out.println(primeraResupestaC.substring(0, primeraResupestaC.length() - 1));

        numeroInicio = 5;
        numeroFin = 14;

        String primeraResupestaD = "Primera respuesta D:";

        for (int i = numeroFin; i > numeroInicio; i--) {
            if (i % 2 == 0) {
                String resultado = primeraResupestaD += (i + ",");
                primeraResupestaD = resultado;
            }
        }
        System.out.println(primeraResupestaD.substring(0, primeraResupestaD.length() - 1));

        float ingresosMensuales = 150000;
        //Con nuevo nos referimos a menor de 5 años de antiguedad
        int cantidadAutosNuevos = 1;
        int cantidadInmuebles = 1;
        boolean embarcacion = false;
        boolean aeronave = false;
        boolean titularActivosSocietarios = false;

        if ((ingresosMensuales >= 489083) || (cantidadAutosNuevos >= 3) || (cantidadInmuebles >= 3) || embarcacion || aeronave || titularActivosSocietarios) {
            System.out.println("Ejercicio 2=Pertenece al segmento de ingresos altos");
        }else{
            System.out.println("Ejercicio 2=Pertenece al segmento de ingresos bajos/medios");
        }
    }
}
// Agregando un comentario desde github

