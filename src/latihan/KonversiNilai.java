/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;
public class KonversiNilai {
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Nilai Web : ");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
          System.out.print("Nilai A");
        else if (nilai >= 75)
          System.out.print("Nilai B");
        else if (nilai >= 50)
          System.out.print("Nilai C");
        else if(nilai >= 35)
          System.out.print("Nilai D");
        else 
            System.out.println("Nilai E");
    }
}
/**
 *
 * @author ASUS
 */
