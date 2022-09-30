/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarsendiri;
import java.util.Scanner;
        ;
/**
 *
 * @author Roihan
 */
public class Bank2 {
    public static void main(String[] args) {
        int saldo = 100000;
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di bank unan");
        System.out.println("Saldo saat ini " + saldo);
        System.out.print("Simpan uang: ");
        
        saldo += input.nextInt();
        System.out.println("Saldo saat ini " + saldo);
        System.out.println("Ambil uang " );
        
        saldo -= input.nextInt();
        System.out.println("Saldo saat ini " + saldo);
        
        
        
        
    }
    
}
