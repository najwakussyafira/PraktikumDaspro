package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Masukan sebuah tahun");
        int tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun kabisat");
        }   else 
            System.out.println("Bukan Tahun Kabisat");

            sc.close();
         
    }
}
 