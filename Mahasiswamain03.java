public class Mahasiswamain03 {
    public static void main(String[] args) {

        MataKuliah03 mk1 = new MataKuliah03("2002", "Algoritma", 3);
        MataKuliah03 mk2 = new MataKuliah03("2005", "Struktur Data", 4);
        MataKuliah03 mk3 = new MataKuliah03("2007", "Basis Data", 3);

        Mahasiswa03 mhs = new Mahasiswa03("254107060148", "Alberto Gute Betekeneng", 2025, 5);

        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        mhs.tambahMataKuliah(mk3);

        mhs.tampilkanInfo();
    }
}