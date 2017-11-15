/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class PracticaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scF =new Scanner (System.in);
        Scanner scS =new Scanner (System.in);
        String s;
        do{
        System.out.println("Ingresa el radio");
       float r = scF.nextFloat();
        System.out.println("El area del circulo es:  "+ Math.PI*Math.pow(r, 2));
            System.out.println("Presiona s para salir ");
            s = scS.nextLine();
            if(s.equals("s"))
                break;
        }while(true);
      
    }
    
}
