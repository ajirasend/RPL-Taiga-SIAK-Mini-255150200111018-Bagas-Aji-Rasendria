import java.util.Scanner;

public class Matriks {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=== PROGRAM PERHITUNGAN MATRIKS ===");
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        System.out.println("\n--- Input Matriks A ---");
        int[][] matriksA = inputMatriks(baris, kolom);
        System.out.println("\n--- Input Matriks B ---");
        int[][] matriksB = inputMatriks(baris, kolom);
        System.out.println("\n--- Matriks A ---");
        tampilkanMatriks(matriksA);
        System.out.println("\n--- Matriks B ---");
        tampilkanMatriks(matriksB);
        System.out.println("\n--- Hasil Penjumlahan (A + B) ---");
        int[][] hasilTambah = penjumlahanMatriks(matriksA, matriksB);
        tampilkanMatriks(hasilTambah);
        System.out.println("\n--- Hasil Pengurangan (A - B) ---");
        int[][] hasilKurang = penguranganMatriks(matriksA, matriksB);
        tampilkanMatriks(hasilKurang);
        System.out.println("\n--- Hasil Perkalian (A × B) ---");
        int[][] hasilKali = perkalianMatriks(matriksA, matriksB);
        if (hasilKali != null) {
            tampilkanMatriks(hasilKali);
        }   
        input.close();
    }
    static int[][] inputMatriks(int baris, int kolom) {
        int[][] matriks = new int[baris][kolom];
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }
        return matriks;
    }
    static int[][] penjumlahanMatriks(int[][] matriksA, int[][] matriksB) {
        int baris = matriksA.length;
        int kolom = matriksA[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        return hasil;
    }
    static int[][] penguranganMatriks(int[][] matriksA, int[][] matriksB) {
        int baris = matriksA.length;
        int kolom = matriksA[0].length;
        int[][] hasil = new int[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] - matriksB[i][j];
            }
        }
        return hasil;
    }
    static int[][] perkalianMatriks(int[][] matriksA, int[][] matriksB) {
        int barisA = matriksA.length;
        int kolomA = matriksA[0].length;
        int barisB = matriksB.length;
        int kolomB = matriksB[0].length;
        if (kolomA != barisB) {
            System.out.println("Perkalian matriks tidak bisa dilakukan!");
            System.out.println("Kolom matriks A (" + kolomA + ") harus sama dengan baris matriks B (" + barisB + ")");
            return null;
        }
        int[][] hasil = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < kolomA; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        return hasil;
    }
    static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}