/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eslo;

import java.util.Scanner;

/**
 *
 * @author jager.balazs
 */
public class Eslo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Kecske");
        System.out.print("Retek");
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("Kerek egy egesz szamot: ");
        int szam = console.nextInt();
        
        System.out.println("Kerek egy nevet is : ");
        String nev = console.next();
        
        
        System.out.println("Udv "+nev+" a szam amit valasztottal : "+ szam);
        
        
        
    }
    
}
