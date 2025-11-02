# Proyek SIAK-Mini (Sistem Informasi Akademik Mini)

Ini adalah proyek sederhana yang dibuat untuk memenuhi tugas mata kuliah **Rekayasa Perangkat Lunak (Software Engineering)**.
Nama: Bagas Aji Rasendria
NIM: 255150200111018

## Deskripsi Proyek

Proyek ini merupakan studi kasus implementasi *software development* menggunakan kerangka kerja (framework) **Scrum**. Tujuan utamanya adalah membangun sistem backend sederhana untuk mengelola hubungan bimbingan antara Dosen dan Mahasiswa.

## 📖 Fitur yang Diimplementasikan

Sistem ini didasarkan pada *User Story* yang dikelola dalam beberapa Sprint.

### Sprint 1 (Inisiasi Hubungan)

* **US-001:** Dosen bisa menambahkan Mahasiswa bimbingan.
* **US-002:** Mahasiswa bisa melihat Dosen Pembimbingnya.
* **US-003:** Dosen bisa melihat daftar semua Mahasiswa bimbingan.

### Sprint 2 (Pengelolaan Bimbingan)

* **US-004:** Dosen bisa menghapus Mahasiswa bimbingan.
* **US-005:** Dosen bisa menambahkan catatan bimbingan untuk mahasiswa.
* **US-006:** Mahasiswa bisa melihat catatan bimbingan dari dosennya.
* **US-007:** Dosen bisa mengubah status Mahasiswa bimbingan (cth: "Aktif", "Menunggu Sidang").

## 🛠️ Teknologi yang Digunakan

* **Bahasa:** Java
* **Metodologi:** Scrum (disimulasikan melalui studi kasus dan perencanaan di Taiga)

## 🚀 Cara Menjalankan Demo

Proyek ini dapat dijalankan melalui file `Main.java` yang menyimulasikan skenario penggunaan dari *user story* yang ada.

1.  Pastikan Anda memiliki Java Development Kit (JDK) terinstal.
2.  Kompilasi semua file `.java`:
    ```bash
    javac *.java
    ```
3.  Jalankan file `Main` untuk melihat demo Sprint 1 dan Sprint 2:
    ```bash
    java Main
    ```
