package Tugas_Program;

public class Tugas_Array {
    public static void main(String[] args) {

        //Tugas No.1

        Object dataArray [] = {1, 2, 4, 10, 20, "Rizwan", "Iko", "Ikok"};

        StringBuilder arrayNumber = new StringBuilder();
        StringBuilder arrayText = new StringBuilder();

        for (Object item : dataArray) {

            if (item instanceof Integer) {
                arrayNumber.append(item).append(" ");
            }

            else if (item instanceof String) {
                arrayText.append(item).append(" ");
            }
        }

        System.out.println("Array Number adalah : " + arrayNumber.toString().trim());
        System.out.println("Array Text adalah : " + arrayText.toString().trim());
        
        //Tugas No.2

        int jumlahMahasiswa [] = {1, 2, 3, 4, 5};
        String namaMahasiswa [] = {"Santi", "Aldi", "Riko", "Rahmi", "Koko"};
        int nilaiMahasiswa [] = {100, 50, 100, 90, 50};
        String statusArray [] = new String[jumlahMahasiswa.length];

        System.out.println("________________________________");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mahasiswa Ke\t: " + jumlahMahasiswa[i]);
            System.out.println("Nama\t\t\t: " + namaMahasiswa[i]);
            System.out.println("Nilai\t\t\t: " + nilaiMahasiswa[i]);
            System.out.println("________________________________");
        }

        double totalNilai = 0;
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");
        System.out.println("================================");

        for (int i = 0; i < 5; i++) {
            totalNilai += nilaiMahasiswa[i];
            statusArray[i] = (nilaiMahasiswa[i] >= 60) ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + "\t" + namaMahasiswa[i] + "\t" + nilaiMahasiswa[i] + "\t\t" + statusArray[i]);
        }

        System.out.println("================================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + (totalNilai / 5));
    


    }
}