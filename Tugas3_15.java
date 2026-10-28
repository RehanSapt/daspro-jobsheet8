import java.util.Scanner;

public class Tugas3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahBarang = 0, barangTerbanyak = 0, maxBarang = 0;
        String keterangan = "";

        System.out.print("Masukkan jumlah toko: ");
        int toko = sc.nextInt();

        if (toko < 1) {
            System.out.println("Jumlah toko minimal 1");
        } else {
            for(int i = 1; i <= toko; i++) {
                System.out.print("Masukkan jumlah pelanggan toko "+ i +": ");
                int pelanggan = sc.nextInt();

                int barangToko = 0;

                if (pelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negaatif");
                } else {
                    for(int j = 1; j <= pelanggan; j++) {
                        System.out.print("Masukkan jumlah barang pelanggan ke-"+ j +": ");
                        int barang = sc.nextInt();

                        barangToko += barang;
                        jumlahBarang += barang;
                    }

                    if (barangToko > maxBarang){
                        maxBarang = barangToko;
                        barangTerbanyak = i;
                    }

                    keterangan += "Toko " + i + " - pelanggan: " + pelanggan + ", total barang: " + barangToko + "\n";
                }
                System.out.println();
            }
            System.out.println(keterangan);
            System.out.println("Total barang seluruh toko: " + jumlahBarang);
            System.out.println("Toko dengan barang terbanyak: " + barangTerbanyak);
        }
        sc.close();
    }
}
