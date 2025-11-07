# Proyek PBO Kelompok 1: Kalkulator Biaya Rakit PC (CountingCost)

Ini adalah repositori untuk proyek mata kuliah Pemrograman Berorientasi Objek (PBO) oleh Kelompok 1.

## 🧾 Deskripsi Singkat

**CountingCost** adalah aplikasi konsol (command-line) sederhana yang dibangun dengan Java untuk mensimulasikan proses perakitan PC dan menghitung total biayanya.

Aplikasi ini mendemonstrasikan penerapan konsep-konsep inti Pemrograman Berorientasi Objek (PBO) untuk mengelola berbagai jenis komponen komputer dan harganya.

---

## 💻 Konsep PBO yang Digunakan

Proyek ini dirancang untuk menerapkan beberapa pilar utama PBO:

* **Inheritance (Pewarisan):**
    * Sebuah *abstract class* `Component` menjadi dasar, mewarisi properti `nama` dan `price`.
    * Class ini diturunkan menjadi *abstract class* lain yang lebih spesifik: `Core`, `Peripheral`, dan `Storage`.
    * Class-class spesifik seperti `CPU`, `Motherboard`, `RAM`, `Monitor`, `Keyboard`, `Mouse`, dan `SSD` mewarisi sifat dari *parent class* mereka.

* **Polymorphism:**
    * Class `PC` menggunakan `List<Storage>` dan `List<Peripheral>` untuk menyimpan berbagai jenis komponen.
    * Saat metode `calculateTotalPrice()` dipanggil, ia dapat mengiterasi *list* tersebut dan memanggil metode `.getPrice()` pada setiap objek (baik itu `SSD`, `CloudStorage`, `Monitor`, atau `Mouse`) secara seragam, meskipun tipe objeknya berbeda-beda.

* **Composition (Komposisi):**
    * Class `PC` tidak mewarisi dari komponen, melainkan *memiliki* (has-a) komponen.
    * Sebuah objek `PC` "terdiri dari" (`composed of`) objek `Motherboard`, `CPU`, `RAM`, serta `List` dari `Storage` dan `Peripheral`.

---

## 🚀 Cara Menjalankan

Proyek ini dapat dijalankan melalui terminal dari *root folder* proyek (folder `pbo_kelompok_1`).

1.  **Compile (dari root folder):**
    Perintah ini akan meng-compile semua file `.java` dari folder `src` dan menempatkan file `.class` ke dalam folder `bin`.

    ```bash
    javac -d bin src/com/countingcost/App.java
    ```

2.  **Run (dari root folder):**
    Perintah ini akan menjalankan program dengan menggunakan file `.class` yang ada di dalam folder `bin`.

    ```bash
    java -cp bin com.countingcost.App
    ```

---

## 🌀 Personal Reflection

*Bagian ini diisi oleh setiap anggota kelompok secara individu sesuai instruksi Misi 5.*

### 👤 [Hammam Hidayatullah]

**Momen “Aha!” Terbesar:**
> [cite_start]Momen "klik" terbesar saya adalah saat kami diskusi soal *code smell* "Feature Envy" pada `PCReportGenerator`[cite: 3]. [cite_start]Setelah kami pindahkan *method*-nya ke *class* `PC`[cite: 4], desainnya jadi jauh lebih logis. Momen "aha" lainnya adalah soal realitas proyek. Awalnya kami sangat ingin pakai JFrame untuk GUI, tapi setelah melihat beban kerja, kami sadar waktunya tidak akan cukup. [cite_start]Ini jadi pelajaran penting tentang manajemen waktu dan *scoping* proyek[cite: 15].

**Kelemahan Terbesar Saya/Tim:**
> [cite_start]Kelemahan terbesar kami adalah inkonsistensi antara desain UML awal dan implementasi kode[cite: 17]. Saat *Red Team* menyerang, mereka menemukan beberapa perbedaan. [cite_start]Ini terjadi karena kami terlalu antusias *coding* dan lupa memperbarui diagram UML setiap kali ada perubahan[cite: 18]. Akibatnya, dokumentasi kami jadi tidak sinkron.

**Skill Baru Paling Berharga:**
> [cite_start]Skill paling berharga adalah gabungan dari pengalaman audit (jadi *Red Team*) dan defense (jadi *Blue Team*)[cite: 19]. Saat jadi *Red Team*, kami belajar cara "mengaudit" kode orang lain dan mencari celah. Saat jadi *Blue Team*, kami harus belajar "defense" atau mempertahankan argumen desain kami. [cite_start]Melihat dari dua sisi ini adalah skill komunikasi teknis yang sangat berharga[cite: 20].

---

### 👤 [Ardanu Egitya Ash Shafah]

**Momen “Aha!” Terbesar:**
> [cite_start]Momen "aha" saya adalah saat melihat *Polymorphism* bekerja di `calculateTotalPrice()`[cite: 4]. [cite_start]Kita bisa memanggil `.getPrice()` [cite: 4, 5] [cite_start]di semua `Component` [cite: 5] [cite_start](baik `SSD` [cite: 10] [cite_start]maupun `Monitor` [cite: 7][cite_start]) dalam satu *loop*[cite: 4]. Itu sangat efisien. Selain itu, kami juga belajar pentingnya *scoping*. [cite_start]Kami sempat diskusi mau pakai JFrame, tapi kami sadar lebih baik membuat *core logic*-nya solid dulu daripada memaksakan GUI tapi waktunya kurang[cite: 15].

**Kelemahan Terbesar Saya/Tim:**
> [cite_start]Kelemahan kami adalah saat *defense* argumen[cite: 17]. Ketika *Red Team* menunjukkan bahwa diagram UML kami tidak 100% sinkron dengan implementasi kode, kami agak kesulitan berargumen. Ini terjadi karena kami melakukan beberapa perubahan *on-the-fly* di kode tapi lupa meng-update diagram. [cite_start]Itu jadi catatan besar soal pentingnya disiplin mendokumentasikan perubahan[cite: 18].

**Skill Baru Paling Berharga:**
> [cite_start]Skill audit kode saat menjadi *Red Team*[cite: 19]. Saya tidak menyangka "menyerang" kode teman bisa sangat seru sekaligus mendidik. Kami harus membaca kode mereka, membandingkannya dengan UML, dan mencari inkonsistensi. [cite_start]Skill ini melatih *critical thinking* dan cara membaca kode orang lain, yang pasti sangat berguna di industri[cite: 20].
