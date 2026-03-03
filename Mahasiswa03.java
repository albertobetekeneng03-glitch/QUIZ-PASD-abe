public class Mahasiswa03 {
    String nim;
    String nama;
    int tahunMasuk;
    MataKuliah03[] mataKuliahDiambil;
    int jumlahMK;

    public Mahasiswa03(String nim, String nama, int tahunMasuk, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        mataKuliahDiambil = new MataKuliah03[kapasitasMK];
        jumlahMK = 0;
    }

    public void tambahMataKuliah(MataKuliah03 mk) {
        if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mk;
            jumlahMK++;
        } else {
            System.out.println("Kapasitas mata kuliah penuh!");
        }
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += mataKuliahDiambil[i].getSks();
        }
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMK; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
        }
        System.out.println("Total SKS    : " + hitungTotalSKS());
        System.out.println("=============================");
    }
}