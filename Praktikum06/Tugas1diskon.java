package Praktikum06;


import java.util.Scanner;

public class Tugas1diskon {
    
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("...");

        // Meminta input dari pengguna mengenai jenis buku dan jumlah buku
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = scanner.nextLine().toLowerCase(); // Mengubah input menjadi huruf kecil untuk memudahkan perbandingan

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = scanner.nextInt();

        // Inisialisasi diskon
        double diskon = 0;

        // Kondisi diskon berdasarkan jenis buku
        if (jenisBuku.equals("kamus")) {
            // Diskon awal 10%
            diskon = 10;

            // Tambahan diskon jika jumlah buku lebih dari 2
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equals("novel")) {
            // Diskon awal 7%
            diskon = 7;

            // Tambahan diskon jika jumlah buku lebih dari 3
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                // Tambahan diskon jika jumlah buku <= 3
                diskon += 1;
            }
        } else {
            // Diskon 5% jika buku bukan kamus atau novel dan jumlah buku lebih dari 3
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }

        // Tampilkan total diskon yang diberikan
        System.out.println("Total diskon yang diberikan adalah: " + diskon + "%");

        // Menutup scanner
        scanner.close();
}
}
