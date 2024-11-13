public class Pegawai {
    public String nip;
    public String nama;

    // Constructor default
    public Pegawai() {
    }

    // Constructor dengan parameter
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}
