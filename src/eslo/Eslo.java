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
        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        String akarmi = br.readLine();
//        
//        int szam = Integer.parseInt(br.readLine());
//        
//        Random rnd = new Random();
//        
//        int veletlenSzam = rnd.nextInt(5);
//        
//        
//        System.out.println(veletlenSzam);
//        
//        System.out.println("Koszonom");
            //Feladatok.feladat5();
            //Feladatok.feladat6();
            //Feladatok.feladat7();
            //Feladatok.feladat8();
            //Feladatok.feladat9();
            //Feladatok.feladat10();
            Feladatok.feladat11();
    }
    
}


        class Feladatok{
            
            static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            static void feladat5() throws IOException{
                System.out.println("Kerem a teglalap a odlalat :");
                int aOldal = Integer.parseInt(br.readLine());
                System.out.println("Kerem a teglalap b oldalat");
                int bOldal = Integer.parseInt(br.readLine());
                System.out.println("A teglalap kerulete : " + (aOldal+bOldal)*2);
                System.out.println("A teglalap terulete : "+ aOldal*bOldal);
                
            }
            
            static void feladat6() throws IOException{
                
                System.out.println("Kerem a kor sugarat");
                double sugar = Double.parseDouble(br.readLine());
                System.out.println("A kor Sugara : " + 2*Math.PI*sugar);
                System.out.println("A kor Terulete : " + Math.PI*Math.pow(sugar, 2));
                
                
            }
            
            
            static void feladat7() throws IOException {
                
                System.out.println("Kerem az egyik befogot :");
                double a = Double.parseDouble(br.readLine());
                double b = Double.parseDouble(br.readLine());
                System.out.println("Kerem a masik befogot :");
                System.out.println("Az atfogo = "+ Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
                
            }
            
            static void feladat8() throws IOException{
                System.out.println("Kerem az ut hosszat meterben: ");
                double hossz = Double.parseDouble(br.readLine());
                System.out.println("Kerem az eltelt idot percben :");
                int ido = Integer.parseInt(br.readLine());
                System.out.println("Az atlagsebesseg = " + (hossz/1000)/ido*60 + " km/h");
                
            }
            
            static void feladat9() throws IOException{
                
                System.out.println("Kerem az auto fogyasztasat 100 km-en");
                double fogyasztas = Double.parseDouble(br.readLine());
                System.out.println("Kerem a benzin literenkenti arat : ");
                double benzinAr = Double.parseDouble(br.readLine());
                System.out.println("Kerem a megtett ut hosszat Km-ben :");
                double megtettUt = Double.parseDouble(br.readLine());
                System.out.println("Az utikoltseg = " + fogyasztas/100*benzinAr*megtettUt);
            }   
            
            static  void feladat10() throws IOException{
                System.out.println("Kerem a magassagot cm-ben :");
                double magassag = Double.parseDouble(br.readLine());
                System.out.println("Kerem a sulyt kg-ban :");
                double suly = Double.parseDouble(br.readLine());
                System.out.println("A testomegindex : " + suly /Math.pow(magassag/100, 2));
                
                
        }       
            static void feladat11() throws IOException{
                int almaAr = 50;
                int szilvaAr = 100;
                int szoloAr = 200;
                System.out.println("Az Alma ara : " + almaAr);
                System.out.println("Az Szilva ara : " + szilvaAr);
                System.out.println("Az Szolo ara : " + szoloAr);
                System.out.println("Kerem a vasarolt alma sulyat: ");
                int vettAlma = Integer.parseInt(br.readLine()) ;
                System.out.println("Kerem a vasarolt szilva sulyat: ");
                int vettSzilva = Integer.parseInt(br.readLine()) ;
                System.out.println("Kerem a vasarolt szolo sulyat: ");
                int vettSzolo = Integer.parseInt(br.readLine()) ;
                
                System.out.println("Alma osszesen : " + vettAlma*almaAr);
                System.out.println("Szilva osszesen : " + vettSzilva*szilvaAr);
                System.out.println("Szolo osszesen : " + vettSzolo*szoloAr);
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Osszeg : \t" + (vettAlma*almaAr+vettSzilva*szilvaAr+vettSzolo*szoloAr));
            }
            
        }