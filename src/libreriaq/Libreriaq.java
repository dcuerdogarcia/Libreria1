/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaq;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Libreriaq {

    int numero;
    int devuelve;
   
    
/**
 * @param numero tipo de peticion consola 0 ventana 1
 * @return data introducido por el usuario
 **/
    public int meterDatos(int numero) {
        this.numero = numero;
        if (numero == 0) {

            Scanner dato = new Scanner(System.in);
            devuelve = dato.nextInt();

        } else if (numero == 1) {
            devuelve = Integer.parseInt(JOptionPane.showInputDialog("Que quieres poner?"));

        } else {
            System.out.println("Escriba 0 o 1");
            System.exit(0);

        }
        return devuelve;
    }
}