/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;
public class PilihanKondisi {
   public static void main (String[] args){
       Scanner masukan = new Scanner(System.in);
       System.out.print("Silahkan pilih 1-3 :");
       int bil = masukan.nextInt();
       switch (bil) {
           case 1 : System.out.print("Satu");
                break;
           case 2 : System.out.print("Dua");
                break;
           case 3 : System.out.print("Tiga");    
       }
   }
}
/**
 *
 * @author ASUS
 */
