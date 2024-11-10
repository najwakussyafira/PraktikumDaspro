package Praktikum09;

import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");

        int jmlNilai = sc14.nextInt();
        int[] arrNilai = new int[jmlNilai];
        
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = sc14.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");

        int key = sc14.nextInt();
        int hasil = -1;
         for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai "+ key +" ketemu, merupakkan nilai mahasiswa ke-" + hasil);  
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        System.out.println();
        }
        
        sc14.close();
    }
    
}
