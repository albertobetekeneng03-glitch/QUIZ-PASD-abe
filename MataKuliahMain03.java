public class MataKuliahMain03 {
    public static void main(String[] args) {

        MataKuliah03 mk1 = new MataKuliah03("2002", "Algoritma", 3);
        MataKuliah03 mk2 = new MataKuliah03("2005", "Struktur Data", 4);

        System.out.println("=== Data Awal ===");
        mk1.tampilkanInfo();
        mk2.tampilkanInfo();

        System.out.println("=== Setelah Perubahan ===");
        mk1.ubahNamaMK("Algoritma dan Pemrograman");
        mk1.ubahSKS(1);
        mk1.ubahSKS(3);

        mk1.tampilkanInfo();
    }
}