package Praktikum09;

import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc14.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double total = 0;
        double rata2;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc14.nextInt();
        }

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        
        rata2 = total/nilaiMhs.length; 
        double rata2Lulus = (jmlLulus > 0) ? (totalLulus / jmlLulus) : 0;
        double rata2TidakLulus = (jmlTidakLulus > 0) ? (totalTidakLulus / jmlTidakLulus) : 0;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-Rata nilai tidak lulus = " + rata2TidakLulus);
        System.out.println("Rata-rata nilai semua mahasiswa = "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + jmlLulus);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);

        sc14.close();
    }
}