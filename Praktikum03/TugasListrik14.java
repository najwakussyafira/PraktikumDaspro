package Praktikum03;
import java.util.Scanner;
public class TugasListrik14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik, penggunaanListrik, tagihan, listrikLebih;

        listrikLebih = 500;
        tarifListrik = 1500;

        System.out.println("Masukan jumlah penggunaan listrik (kwh): " );
        penggunaanListrik = sc.nextInt();

        tagihan = penggunaanListrik = tarifListrik;
        System.out.println("Berikut merupakan tagihan listrik anda : " + tagihan);

        System.out.println("Apakah listrik lebih dari 500kwh? " + (listrikLebih < penggunaanListrik));

        sc.close();
    }
    
}
