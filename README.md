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

---

## 🌀 Personal Reflection

*Bagian ini diisi oleh setiap anggota kelompok secara individu sesuai instruksi Misi 5.*

### 👤 [Tulis Nama Anggota 1 Di Sini]

* **Momen “Aha!” Terbesar:**
    * *Jelaskan momen "klik" Anda di sini (baik saat mendesain, refactor, menyerang, atau bertahan)...*
* **Kelemahan Terbesar Saya/Tim:**
    * *Jelaskan serangan Red Team yang paling 'menyakitkan' dan mengapa kelemahan itu bisa ada dalam desain awal Anda...*
* **Skill Baru Paling Berharga:**
    * *Jelaskan skill (desain UML, refactoring, audit kode, defense argumen) yang paling berguna untuk kerja nanti dan mengapa...*

### 👤 [Tulis Nama Anggota 2 Di Sini]

* **Momen “Aha!” Terbesar:**
    * *Jelaskan momen "klik" Anda di sini (baik saat mendesain, refactor, menyerang, atau bertahan)...*
* **Kelemahan Terbesar Saya/Tim:**
    * *Jelaskan serangan Red Team yang paling 'menyakitkan' dan mengapa kelemahan itu bisa ada dalam desain awal Anda...*
* **Skill Baru Paling Berharga:**
    * *Jelaskan skill (desain UML, refactoring, audit kode, defense argumen) yang paling berguna untuk kerja nanti dan mengapa...*

### 👤 [Tulis Nama Anggota 3 Di Sini]

* **Momen “Aha!” Terbesar:**
    * *Jelaskan momen "klik" Anda di sini (baik saat mendesain, refactor, menyerang, atau bertahan)...*
* **Kelemahan Terbesar Saya/Tim:**
    * *Jelaskan serangan Red Team yang paling 'menyakitkan' dan mengapa kelemahan itu bisa ada dalam desain awal Anda...*
* **Skill Baru Paling Berharga:**
    * *Jelaskan skill (desain UML, refactoring, audit kode, defense argumen) yang paling berguna untuk kerja nanti dan mengapa...*

*(Silakan salin-tempel blok di atas jika anggota kelompokmu lebih dari 3)*
