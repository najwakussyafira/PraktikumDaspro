package Praktikum09;

import java.util.Scanner;

public class ArrayNilai14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc14.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
            System.out.println("Nilai akhir ke-"+i+" lulus ");
        } else {
            System.out.println("Mahasiswa ke-"+ i + "tidak lulus! ");
        }
        sc14.close();
    }
    }
}

