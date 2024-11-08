package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan114{
    public static void main(String[] args) {
       Scanner sc14 = new Scanner(System.in);

        // meminta input pengguna memasukkan tahun
       System.out.print("Masukkan tahun: "); // Membaca tahun yang dimasukkan oleh pengguna
       int tahun = sc14.nextInt();// Membaca tahun yang dimasukkan oleh pengguna
       
        // Memeriksa apakah tahun adalah tahun kabisat
       if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
        // Jika tahun dapat dibagi 4 dan tidak dapat dibagi 100, atau dapat dibagi 400
        System.out.println(tahun + " adalah tahun kabisat."); // Menampilkan bahwa tahun tersebut kabisat
    } else {
        System.out.println(tahun + " bukan tahun kabisat."); // Menampilkan bahwa tahun tersebut bukan kabisat
    }

sc14.close();
    }
}