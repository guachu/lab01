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
public class Ejercicio1 {
    //Atributos
    static List List1 = new ArrayList();
    static List List2 = new ArrayList();
    
    
    public static void Start() {
        System.out.println("Porfavor ingrese las dos palabras");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String anagrama1 = scanner.nextLine();
        String anagrama2 = scanner.nextLine();
        List1 = ListCreation(anagrama1);
        List2 = ListCreation(anagrama2);
        Collections.sort(List1);
        Collections.sort(List2);
        if (List1.size() != List2.size()){
            System.out.println("Not Anagrams");
        }
        else {
            if (CountCharacters(List1, List2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
    
    public static boolean CountCharacters(List L1, List L2){
        L1.removeAll( L2 );
        if (L1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static List ListCreation(String anagrama){
        List charList1 = new ArrayList(); 
        int i = 0;
        for(char ch : anagrama.toCharArray()){
            
            ch = Character.toLowerCase(ch);
            charList1.add(ch); 
            i++;
        }
        return charList1;
    }
}
