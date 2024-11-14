import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Membuat objek dosen
        //Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom., M.Kom.", "199402");
        //Dosen dosen2 = new Dosen("19780165", "Muhammad, S.T., M.T.", "197801");
        //Modifikasi
        /*System.out.println(dosen1.nip);
        System.out.println(dosen1.nama);
        System.out.println(dosen1.nidn);
        dosen1.mengajar();*/
        // Upcasting
        /*Pegawai pegawai1 = dosen1;
        // Modifikasi 2.4
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();*/
        // Downcasting
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom., M.Kom.", "199402");
        Dosen dosen2 = new Dosen("19780165", "Muhammad, S.T., M.T.", "197801");
        Pegawai pegawai1 = dosen1;
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        //TenagaKependidikan test = (TenagaKependidikan) pegawai1;
        Dosen newDosen = (Dosen) pegawai1;
        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();
        // Membuat objek tenaga kependidikan
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");
        /*TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");*/

        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>(); 
        // Menampilkan informasi dosen
        System.out.println("Data Dosen :");
        /*System.out.println("Data Dosen :");
        dosen1.displayInfo();
        System.out.println();
        dosen2.displayInfo();
        System.out.println();
        System.out.println();*/

        // Menampilkan informasi tenaga kependidikan
        System.out.println("Data Tenaga Kependidikan :");
        /*System.out.println("Data Tenaga Kependidikan :");
        tendik1.displayInfo();
        System.out.println();
        tendik2.displayInfo();
        tendik2.displayInfo();*/

        daftarPegawai.add(dosen1);
        /*daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());*/

        System.out.println();
        // 2.4 object casting 1
        System.out.println(dosen1.nip);
        System.out.println(dosen1.nama);
        System.out.println(dosen1.nidn);
        dosen1.mengajar();
        System.out.println();

        // 2.4 object casting 4
        Pegawai pegawai1 = dosen1;

        // 2.4 object casting 5
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        System.out.println(pegawai1.nidn);
        pegawai1.mengajar();

        // 2.4 object casting 5
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        // System.out.println(pegawai1.nidn);
        pegawai1.displayInfo();
        System.out.println();
    }
}