package Praktikum11;

import java.util.Scanner;

public class hitungTotalHarga14 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan 1-5: ");
        int pilihanMenu = sc14.nextInt();
        System.out.print("Masukkan jumlah item yang ingin di pesan: ");
        int banyakItem = sc14.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        sc14.nextLine();
        String kodePromo = sc14.nextLine();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        
        sc14.close();
    }
    

    
}
