/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rental1;

import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class Rental1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        rental.pilihan();
        System.out.print("Transaksi lagi Ya=1, Tidak=2 : ");
        int hari=input.nextInt();
        if(hari==1){
            rental.pilihan();
        }
    }
    
}