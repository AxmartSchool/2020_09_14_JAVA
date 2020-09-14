/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eslo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jager.balazs
 */
public class Eslo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
//        System.out.println("Kecske");
//        System.out.print("Retek");
//        
//        Scanner console = new Scanner(System.in);
//        
//        System.out.print("Kerek egy egesz szamot: ");
//        int szam = console.nextInt();
//        
//        System.out.println("Kerek egy nevet is : ");
//        String nev = console.nextLine();
//        
//        
//        System.out.println("Udv "+nev+" a szam amit valasztottal : "+ szam);
//        System.out.println("A szam 10 szerese : " + szam*10);
//        double szam2 = console.nextDouble();
//        
//        console.close();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String akarmi = br.readLine();
        
        int szam = Integer.parseInt(br.readLine());
        
        Random rnd = new Random();
        
        int veletlenSzam = rnd.nextInt(5);
        
        
        System.out.println(veletlenSzam);
        
        System.out.println("Koszonom");
    }
    
}
