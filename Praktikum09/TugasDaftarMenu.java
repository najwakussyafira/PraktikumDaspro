package Praktikum09;

import java.util.Scanner;

public class TugasDaftarMenu {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        int[] daftarPesanan = new int[daftarMenu.length];
        double totalHarga = 0;

        System.out.println("Selamat datang di Kafe!");
        System.out.println("Menu yang tersedia:");
        
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp " + daftarHarga[i]);
        }

        while (true) {
            System.out.print("\nMasukkan nama menu yang ingin dipesan (ketik 'selesai' untuk mengakhiri): ");
            String menuPilih = sc14.nextLine();
            
            if (menuPilih.equalsIgnoreCase("selesai")) {
                break;
            }
            boolean menuDitemukan = false;
            int indexMenu = -1;
            
            for (int i = 0; i < daftarMenu.length; i++) {
                if (daftarMenu[i].equalsIgnoreCase(menuPilih)) {
                    menuDitemukan = true;
                    indexMenu = i;
                    break;
                }
            }
            if (menuDitemukan) {
                System.out.print("Masukkan jumlah pesanan untuk " + menuPilih + ": ");
                int jumlah = sc14.nextInt();
                sc14.nextLine(); 

                daftarPesanan[indexMenu] += jumlah;
                totalHarga += daftarHarga[indexMenu] * jumlah;

                System.out.println(jumlah + " " + menuPilih + " telah ditambahkan ke pesanan.");
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia.");
            }
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarPesanan[i] > 0) {
                System.out.println(daftarPesanan[i] + " x " + daftarMenu[i] + " - Rp " + (daftarPesanan[i] * daftarHarga[i]));
            }
        }

        System.out.println("\nTotal harga yang harus dibayar: Rp " + totalHarga);
        sc14.close();
    }
}

