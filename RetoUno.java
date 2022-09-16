/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.retouno;
import java.util.Scanner;

   public class RetoUno {
   private static  Scanner sc = new Scanner(System.in);
    
   public static String read(){
       return sc.nextLine();
   }
    
    public static void main(String[] args) {
       String[] entrada = read().split(" ");
       double peso = Double.parseDouble(entrada[0]);
       double altura = Double.parseDouble(entrada[1]);
       int edad = Integer.parseInt(entrada[2]);
       if (validarDatos(altura,peso,edad)){
           double imc= peso/Math.pow(altura, 2);
           calcularRiesgo(edad, imc);
       }else{
           System.out.println("ERROR");
       }  
    }
    public static boolean validarDatos(double altura, double peso, int edad){
        if (peso>0 && peso<150 && altura>0.1 && altura<2.5 && edad>0 && edad<110 ) {
            return true;
        }else{
            return false;
        }
    }
    public static void calcularRiesgo(int edad, double imc){
        String riesgo = " ";
        if (edad<45 && imc<22) {
            riesgo = "Bajo";
        }
        if (edad<45 && imc>=22) {
            riesgo = "Medio";
        }
        if (edad>= 45 && imc<22) {
            riesgo = "Medio";
        }
        if (edad>=45 && imc>=22) {
            riesgo = "Alto";
        }
        System.out.println(String.format("%.1f",imc)+" "+ riesgo);   
    }
    
}



// sergio.pinilla.mt@usa.edu.co
