Jawaban Praktikum PBO - Polymorphism
Pertanyaan
1. Apakan upcasting dapat dilakukan dari suatu class terhadap class lain yang tidak memiliki
relasi inheritance?
2. Dari 2 baris kode program berikut, manakan proses upcasting yang tepat? Jelaskan
Pegawai pegawai1 = new Dosen();
Pegawai pegawai1 = (Pegawai) new Dosen();

jawaban:
Keduanya merupakan proses upcasting yang benar, namun dengan perbedaan sebagai berikut:

1. Pada baris pertama, objek pegawai1 diinisialisasi dengan new Dosen(), yang merupakan instance dari kelas Dosen. Karena Dosen adalah subclass dari Pegawai, objek pegawai1 akan otomatis dianggap sebagai objek bertipe Pegawai melalui upcasting. Penulisan upcasting ini dilakukan secara implisit (otomatis), sehingga tidak perlu menambahkan (Pegawai).

2. Pada baris kedua, penulisan (Pegawai) dilakukan secara eksplisit, tetapi hal ini sebenarnya tidak diperlukan karena Java akan melakukan upcasting secara otomatis. Jadi, meskipun keduanya benar, pada baris pertama penulisannya lebih sederhana karena tidak perlu menuliskan (Pegawai) secara eksplisit.

3. Apa fungsi dari keyword instanceOf?
4. Apa yang dimaksud heterogenous collection?
5. Sebuah object diinstansiasi dari class Pegawai. Kemudian dilakukan downcasting menjadi
object bertipe Dosen. Apakah hal ini dapat dilakukan? Lakukan percobaan untuk
membuktikannya.