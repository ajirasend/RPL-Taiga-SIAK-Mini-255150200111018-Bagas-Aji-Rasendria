public class Main {
    public static void main(String[] args) {
        // === SETUP KONDISI AWAL (Hasil Sprint 1) ===
        Dosen pakBudi = new Dosen("Dr. Budi", "112233");
        Mahasiswa ani = new Mahasiswa("Ani", "2024001");
        Mahasiswa tono = new Mahasiswa("Tono", "2024002");
        
        // Dosen menambah bimbingan (US-001)
        pakBudi.tambahMahasiswaBimbingan(ani);
        pakBudi.tambahMahasiswaBimbingan(tono);
        
        System.out.println("\n=== DEMO SPRINT 2 DIMULAI ===");

        // === Skenario US-005: Dosen menambah catatan ===
        System.out.println("\n** Skenario 1: Dosen Menambah Catatan & Status (US-005 & US-007) **");
        pakBudi.tambahCatatanUntukMahasiswa(ani, "Revisi Bab 1: Latar Belakang.");
        pakBudi.tambahCatatanUntukMahasiswa(ani, "ACC Bab 2.");
        
        // === Skenario US-007: Dosen mengubah status ===
        pakBudi.ubahStatusMahasiswa(ani, "Menunggu Sidang Proposal");

        // === Skenario US-006: Mahasiswa melihat catatan ===
        System.out.println("\n** Skenario 2: Mahasiswa Melihat Catatan (US-006) **");
        ani.lihatCatatanBimbingan();

        // === Skenario US-004: Dosen menghapus bimbingan ===
        System.out.println("\n** Skenario 3: Dosen Menghapus Bimbingan (US-004) **");
        System.out.println("Kondisi Awal Bimbingan Pak Budi:");
        pakBudi.lihatDaftarBimbingan(); // Demo US-003
        
        System.out.println("-> Menghapus Tono...");
        pakBudi.hapusMahasiswaBimbingan(tono);

        // === HASIL AKHIR SETELAH SPRINT 2 ===
        System.out.println("\n--- HASIL AKHIR ---");
        System.out.println("Kondisi Akhir Bimbingan Pak Budi:");
        pakBudi.lihatDaftarBimbingan(); // Demo US-003 (ter-update)
        
        System.out.println("\nVerifikasi Tono (US-002 & US-004):");
        tono.lihatDosenPembimbing(); // Demo US-002 (seharusnya sudah null)
    }
}