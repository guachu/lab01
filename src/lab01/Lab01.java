/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2124203
 */
public class Lab01 {

    public static void main(String[] args) {
        System.out.println("Este es el menu principal, que ejercicio quiere ver? (1,2)");
        Scanner scanner = new Scanner(System.in);
        int ejercicio = scanner.nextInt();
        if (ejercicio == 1){
            Ejercicio1.Start();
        }
        else{
            Ejercicio2.Start();
        }
        
    }
    
    
}
