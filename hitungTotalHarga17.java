import java.util.Scanner;

public class hitungTotalHarga17 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

            System.out.print("Total harga untuk pesanan anda Rp "+ totalHarga);

    }
}

