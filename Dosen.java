public class Dosen extends Pegawai {
    public String nidn;

    // Constructor default
    public Dosen() {
    }

    // Constructor dengan parameter
    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    // Method untuk menampilkan informasi
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    // Method mengajar
    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }
}
