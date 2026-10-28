import java.util.Scanner;

public class Tugas2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hasil, jumlah = 0;

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                hasil = i * j;
                System.out.print("\t" + hasil);

                jumlah += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}
