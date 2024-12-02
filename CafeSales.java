import java.util.Scanner;

public class CafeSales {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] dataPenjualan = new int[5][7];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== CAFÉ MANAGEMENT SYSTEM ===");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Seluruh Data Penjualan");
            System.out.println("3. Menu dengan Penjualan Tertinggi");
            System.out.println("4. Rata-rata Penjualan untuk Setiap Menu");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputPenjualan(scanner);
                    break;
                case 2:
                    tampilkanDataPenjualan();
                    break;
                case 3:
                    tampilkanPenjualanTertinggi();
                    break;
                case 4:
                    tampilkanRataRataPenjualan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);

        scanner.close();
    }

    static void inputPenjualan(Scanner scanner) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanDataPenjualan() {
        System.out.println("\n=== Data Penjualan ===");
        System.out.print("Menu/Hari\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari " + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void tampilkanPenjualanTertinggi() {
        int penjualanTertinggi = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi + " dengan total penjualan " + penjualanTertinggi);
    }

    static void tampilkanRataRataPenjualan() {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
}
