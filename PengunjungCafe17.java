public class PengunjungCafe17 {

    public static void daftarNama(String... nama) {
        System.out.println("Daftar Nama:");
        for (String n : nama) {
            System.out.println(n);
        }
    }
  
    public static void daftarAngka(int... angka) {
        System.out.println("Daftar Angka:");
        for (int a : angka) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        daftarNama("Ali", "Budi", "Citra");
        daftarAngka(1, 2, 3, 4);
    }
}
