Jawaban Praktikum PBO - Polymorphism
Pertanyaan
1. Apakan upcasting dapat dilakukan dari suatu class terhadap class lain yang tidak memiliki
relasi inheritance?
>tidak, upcasting tidak adapat dilakukan dari satu kelas ke kelas lain yang tidak memiliki relasi inheritance. upcasting berarti mengonversi referensi dari subclass ke superclass dalam hierarki kelas yang sama.

2. Dari 2 baris kode program berikut, manakan proses upcasting yang tepat? Jelaskan
Pegawai pegawai1 = new Dosen();
Pegawai pegawai1 = (Pegawai) new Dosen();
<!-- jawaban: -->
> Keduanya merupakan proses upcasting yang benar, namun dengan perbedaan sebagai berikut:
 >Pada baris pertama, objek pegawai1 diinisialisasi dengan new Dosen(), yang merupakan instance dari kelas Dosen. Karena Dosen adalah subclass dari Pegawai, objek pegawai1 akan otomatis dianggap sebagai objek bertipe Pegawai melalui upcasting. Penulisan upcasting ini dilakukan secara implisit (otomatis), sehingga tidak perlu menambahkan (Pegawai).
 >Pada baris kedua, penulisan (Pegawai) dilakukan secara eksplisit, tetapi hal ini sebenarnya tidak diperlukan karena Java akan melakukan upcasting secara otomatis. Jadi, meskipun keduanya benar, pada baris pertama penulisannya lebih sederhana karena tidak perlu menuliskan (Pegawai) secara eksplisit.

3. Apa fungsi dari keyword instanceOf?
   instanceof adalah operator yang digunakan dalam pemrograman berorientasi objek         untuk memeriksa apakah suatu objek merupakan instansi dari kelas tertentu atau         turunannya.
   **fungsi instanceof:**
   >Pemeriksaan tipe objek: untuk memeriksa apakah objek yang direferensikan oleh           variabel adalah instansi dari kelas tertentu.
   >Mendukung Pewarisan: Operator ini juga memperhatikan hubungan pewarisan. Misalnya,      jika ada kelas Animal dan subclass Cat, maka pemeriksaan cat instanceof Animal         akan mengembalikan true, karena Cat adalah turunan dari Animal.
   >Menghindari Kesalahan: Dengan menggunakan instanceof, dapat menghindari kesalahan       yang mungkin terjadi jika mencoba menggunakan metode yang tidak ada pada tipe          objek tertentu. Ini membantu dalam menulis kode yang lebih aman dan dapat              diandalkan.
   >Penggunaan dalam Kondisi: instanceof sering digunakan dalam pernyataan kondisi,         seperti if, untuk mengambil keputusan berdasarkan tipe objek yang sedang diproses
4. Apa yang dimaksud heterogenous collection?
    >Heterogeneous collection adalah kumpulan atau koleksi data yang dapat menyimpan berbagai tipe data yang berbeda dalam satu struktur.dapat menyimpan objek atau data dengan tipe yang bervariasi, bukan hanya satu tipe data yang sama.

5. Sebuah object diinstansiasi dari class Pegawai. Kemudian dilakukan downcasting menjadi
object bertipe Dosen. Apakah hal ini dapat dilakukan? Lakukan percobaan untuk
membuktikannya.
> jawaban
 Pegawai pegawaiDosen = new Dosen("19940201", "Widia, S.Kom., M.Kom.", "199402");

        // Downcasting yang valid
        if (pegawaiDosen instanceof Dosen) {
            Dosen dosen = (Dosen) pegawaiDosen; // Aman karena sebenarnya adalah Dosen
            System.out.println();
            System.out.println("Downcasting berhasil!");
            dosen.mengajar();
        } else {
            System.out.println();
            System.out.println("Gagal melakukan downcasting!");
        }

        // Instance Pegawai biasa
        Pegawai pegawai = new Pegawai("19750301", "Aida, A.Md.");

        // Downcasting yang tidak valid
        if (pegawai instanceof Dosen) {
            Dosen dosen = (Dosen) pegawai; // Akan menyebabkan ClassCastException
            dosen.mengajar();
        } else {
            System.out.println();
            System.out.println("Gagal melakukan downcasting karena pegawai bukan Dosen!");
        }