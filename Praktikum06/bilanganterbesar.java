package Praktikum06;

import java.util.Scanner;

public class bilanganterbesar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3, terbesar; // Mendeklarasikan variabel untuk menyimpan tiga bilangan dan bilangan terbesar

         // Mengambil input dari pengguna
        System.out.print("Masukkan bilangan1: ");// Menampilkan pesan untuk meminta pengguna memasukkan bilangan pertama
        bilangan1 = sc.nextInt();  // Membaca input dan menyimpannya dalam bilangan1

        System.out.print("Masukkan bilangan2: "); // Menampilkan pesan untuk meminta pengguna memasukkan bilangan kedua
        bilangan2 = sc.nextInt();// Membaca input dan menyimpannya dalam bilangan2

        System.out.print("Masukkan bilangan3: "); // Menampilkan pesan untuk meminta pengguna memasukkan bilangan ketiga
        bilangan3 = sc.nextInt(); // Membaca input dan menyimpannya dalam bilangan3

         // Logika untuk menemukan bilangan terbesar
        if (bilangan1 > bilangan2) {  // Memeriksa apakah bilangan1 adalah yang terbesar
            terbesar = bilangan1; // Jika benar, simpan bilangan1 sebagai terbesar
        }
        else if (bilangan2 > bilangan3) {  // Memeriksa apakah bilangan2 adalah yang terbesar
            terbesar = bilangan2; // Jika benar, simpan bilangan2 sebagai terbesar
        }
        else 
        terbesar = bilangan3; // Jika tidak ada yang lebih besar, berarti bilangan3 adalah yang terbesar

        System.out.println("Nilai terbesar : " + terbesar); // Menampilkan nilai terbesar yang ditemukan


        sc.close();
        



        
    }
}
