package Tugas_Program;

import java.util.Scanner;
public class Menghitung_Uang_Pecahan {
    public static void main(String[] args) {
 
        try (Scanner input = new Scanner(System.in)) {
          //input jumlah uang dari keyboard
          System.out.print("Masukan Jumlah Uang : ");
          double jumlah = input.nextDouble();
 
          //menghitung jumlah limapuluh ribu
          int limapuluhRibu = (int)(jumlah / 50000);
          int sisa = (int)(jumlah % 50000);
          //menghitung jumlah duapuluh ribu
          int duapuluhRibu = (sisa / 20000);
          sisa = sisa % 20000;
          //menghitung jumlah sepuluh ribu
          int sepuluhRibu = (sisa / 10000);
          sisa = sisa % 10000;
          //menghitung jumlah lima ribu
          int limaRibu = (sisa / 5000);
          sisa = sisa % 5000;
          //menghitung jumlah dua ribu
          int duaRibu = (sisa / 2000);
          sisa = sisa % 2000;
          //menghitung jumlah seribu
          int seRibu = (sisa / 1000);
          sisa = sisa % 1000;
          //menghitung jumlah lima ratus
          int limaRatus = (sisa / 500);
          sisa = sisa % 500;
          //cetak hasil
          System.out.println("Jumlah Uang = " + jumlah);
          System.out.println("Jumlah Limapuluh Ribuan = " + limapuluhRibu);
          System.out.println("Jumlah duaPuluh Ribuan = " + duapuluhRibu);
          System.out.println("Jumlah SepuluhRibuan = " + sepuluhRibu);
          System.out.println("Jumlah LimaRibuan = " + limaRibu);
          System.out.println("Jumlah DuaRibuan = " + duaRibu);
          System.out.println("Jumlah SeRibuan = " + seRibu);
          System.out.println("Jumlah LimaRatusan = " + limaRatus);
        }
    }
}
