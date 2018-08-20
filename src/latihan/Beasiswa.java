/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;
public class Beasiswa {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan Niali Bahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.print("Siswa dapat Beasiswa");
        else 
            System.out.print("Siswa tidak dapat Beasiswa");
    }
}
/**
 *
 * @author ASUS
 */

