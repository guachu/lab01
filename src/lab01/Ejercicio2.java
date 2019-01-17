/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2124203
 */
public class Ejercicio2 {
    
    
    public void Start() {
        
       List frases = new ArrayList();
       Scanner scanner = new Scanner(System.in);
       String line;
       while (!(line = scanner.nextLine()).isEmpty()){
           frases.add(line);
       } 
       scanner.close();
       for (int i = 0; i < frases.size(); i++){
           int valor = i+1;
           System.out.println(valor + " " + frases.get(i));
       }
        
    }
}
