import java.util.Scanner;

public class hitungTotalHarga17 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
            System.out.println("Kode promo DISKON50 berlaku. Anda mendapat diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
            System.out.println("Kode promo DISKON30 berlaku. Anda mendapat diskon 30%.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid! Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6) atau 0 untuk selesai: ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item untuk menu ini: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
    }
}
