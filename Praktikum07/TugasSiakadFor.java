package Praktikum07;

import java.util.Scanner;

public class TugasSiakadFor {
    public static void main(String[] args) {
         
        Scanner sc14 = new Scanner(System.in);
 
        double nilai, tertinggi, terendah;
            nilai = 0;
            tertinggi = 0;
            terendah = 100;
        int lulus = 0, tidakLulus = 0; 

        for (int i = 1; i <= 10; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc14.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
    
            if (nilai >= 60) {
                lulus++;
                
            }
            else {
                tidakLulus++;
                
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi); 
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah lulus: " + lulus);
        System.out.println("jumlah tidak lulus: " + tidakLulus);
        sc14.close();
    }
}