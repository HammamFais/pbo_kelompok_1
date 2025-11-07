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


### 👤 [Hammam Hidayatullah]

**Momen “Aha!” Terbesar:**
> Momen "klik" terbesar saya adalah saat kami diskusi soal *code smell* "Feature Envy" pada `PCReportGenerator`. Setelah kami pindahkan *method*-nya ke *class* `PC`, desainnya jadi jauh lebih logis. Momen "aha" lainnya adalah soal realitas proyek. Awalnya kami sangat ingin pakai JFrame untuk GUI, tapi setelah melihat beban kerja, kami sadar waktunya tidak akan cukup. Ini jadi pelajaran penting tentang manajemen waktu dan *scoping* proyek.

**Kelemahan Terbesar Saya/Tim:**
> Kelemahan terbesar kami adalah inkonsistensi antara desain UML awal dan implementasi kode. Saat tim *Audit* (Red Team) menyerang, mereka menemukan beberapa perbedaan. Ini terjadi karena kami terlalu antusias *coding* dan lupa memperbarui diagram UML setiap kali ada perubahan. Akibatnya, dokumentasi kami jadi tidak sinkron.

**Skill Baru Paling Berharga:**
> Skill paling berharga adalah gabungan dari pengalaman **audit** (jadi *Red Team*) dan **audite** (jadi *Blue Team*). Saat jadi *Red Team*, kami belajar cara melakukan **audit** kode orang lain dan mencari celah. Saat jadi *Blue Team*, kami harus belajar menjadi **audite** atau mempertahankan argumen desain kami. Melihat dari dua sisi ini adalah skill komunikasi teknis yang sangat berharga.

---

### 👤 [Ardanu Egitya Ash Shafah]

**Momen “Aha!” Terbesar:**
> Momen "aha" saya adalah saat melihat *Polymorphism* bekerja di `calculateTotalPrice()`. Kita bisa memanggil `.getPrice()` di semua `Component` (baik `SSD` maupun `Monitor`) dalam satu *loop*. Itu sangat efisien. Selain itu, kami juga belajar pentingnya *scoping*. Kami sempat diskusi mau pakai JFrame, tapi kami sadar lebih baik membuat *core logic*-nya solid dulu daripada memaksakan GUI tapi waktunya kurang.

**Kelemahan Terbesar Saya/Tim:**
> Kelemahan kami adalah saat menjadi **audite** (Blue Team). Ketika tim *Audit* (Red Team) menunjukkan bahwa diagram UML kami tidak 100% sinkron dengan implementasi kode, kami agak kesulitan berargumen. Ini terjadi karena kami melakukan beberapa perubahan *on-the-fly* di kode tapi lupa meng-update diagram. Itu jadi catatan besar soal pentingnya disiplin mendokumentasikan perubahan.

**Skill Baru Paling Berharga:**
> Skill **audit** kode saat menjadi *Red Team*. Saya tidak menyangka "menyerang" kode teman bisa sangat seru sekaligus mendidik. Kami harus membaca kode mereka, membandingkannya dengan UML, dan mencari inkonsistensi. Skill ini melatih *critical thinking* dan cara membaca kode orang lain, yang pasti sangat berguna di industri.
