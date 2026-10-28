import java.util.Scanner;

public class Tugas1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAngka = 0;
        
        System.out.print("Masukkan jumlah n = ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");

                totalAngka++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
    
}
