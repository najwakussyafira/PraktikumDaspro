package Praktikum06;
import java.util.Scanner;

public class percobaanlaporan1 {

    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

         // Meminta pengguna untuk memasukkan tahun
        System.out.print("Masukkan tahun: ");
        int tahun = sc14.nextInt(); // Membaca tahun yang dimasukkan oleh pengguna

        // Memeriksa apakah tahun adalah tahun kabisat
        if (tahun % 4 == 0) { // Pertama, cek jika tahun dapat dibagi 4
            if (tahun % 100 == 0) { // Jika tahun dapat dibagi 100
                if (tahun % 400 == 0) { // Cek jika tahun juga dapat dibagi 400
                    System.out.println("Tahun Kabisat"); // Jika ya, tahun kabisat
                } else {
                    System.out.println("Bukan Tahun Kabisat"); // Jika tidak, bukan kabisat
                }
            } else {
                System.out.println("Tahun Kabisat"); // Jika tahun tidak dapat dibagi 100, kabisat
            }
        } else {
            System.out.println("Bukan Tahun Kabisat"); // Jika tahun tidak dapat dibagi 4, bukan kabisat
        }

        sc14.close();
        }

     
    }
