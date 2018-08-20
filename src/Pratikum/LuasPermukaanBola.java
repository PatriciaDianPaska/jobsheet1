/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class LuasPermukaanBola {
    public static void main(String[] args){
        System.out.println("Menghitung Luas Permukaan Bola");
        String jari = "";
        jari = JOptionPane.showInputDialog("Masukan Jari - Jarinya : ");
        int r=Integer.parseInt(jari);
        System.out.println("Jari - jari = " + (r));
        System.out.println("Luas Permukaannya =" + ((3.14*r*r)*4));
    }
}
