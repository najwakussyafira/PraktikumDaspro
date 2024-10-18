package Praktikum07;

import java.util.Scanner;

public class TugasPenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        int hargaTiket = 50000;
        double diskon = 0, totalHarga, totalTiket, jumlahTiket, totalBayar;
        
            for (int i = 0; i >= 0; i ++) {

                System.out.print("Masukkan jumlah tiket yang dibeli (atau ketik -1 untuk keluar): ");
                jumlahTiket = sc14.nextInt();

            if (jumlahTiket == 4) {
                hargaTiket = 50000;
                totalHarga = jumlahTiket * hargaTiket;
                System.out.println("Total harga sebelum diskon 10%: " + totalHarga);
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang valid.");
                continue; 
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85; 
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; 
            }

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHarga);
        }

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);

        sc14.close();
    }
}
    
