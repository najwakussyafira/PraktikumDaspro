package Praktikum07;

import java.util.Scanner;

public class TugasTiketBioskop {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);

        double hargaTiket = 50000, totalHarga, totalDiskon = 0;
        int totalTiket;
        
        do { 
        System.out.print("masukan jumlah tiket: "); 
        totalTiket = sc14.nextInt(); 
        
        
        if (totalTiket <= 0) {
            System.out.println("Transaksi dibatalkan");
            totalTiket = sc14.nextInt();
            break; 
        }
         
        if (totalTiket > 4){
            totalDiskon = 0.10; 
            System.out.println("Mendapat diskon 10%");
        }
        if (totalTiket > 10){
            totalDiskon = 0.15;
            System.out.println("Mendapat diskon 15%");
            
        }
        else if (totalTiket < 4){
            System.out.println("Tidak mendapatkan diskon");
            
        }
        
        totalHarga = hargaTiket * totalDiskon;
        
        System.out.println("Total jumlah tiket: " + totalTiket);
        System.out.println("Total harga tiket: Rp." + totalHarga); 


        } while (true); // Loop akan terus berjalan sampai input dibatalkan

       sc14.close();
   
    }
}