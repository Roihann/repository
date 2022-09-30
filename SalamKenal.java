/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

/**
 *
 * @author Roihan
 */

import java.util.Scanner;
public class SalamKenal {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Nama Anda");
        String nama = masukan.nextLine();

        System.out.println("Halo,Salam kenal sdr" + nama + "!");
    }

}
