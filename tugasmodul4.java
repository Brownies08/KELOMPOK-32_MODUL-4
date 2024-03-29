import java.util.Scanner;

public class tugasmodul4 {

       static int saldo = 0;
       static Scanner scanner = new Scanner(System.in);

        static int beliminuman(int harga) {
            if (saldo >= harga) {
                saldo -= harga;
                System.out.println("Anda telah membeli minuman.");
                return saldo;
            } else {
                System.out.println("Saldo anda tidak mencukupi untuk melakukan transaksi.");
                return saldo;
            }
        }
        public static void main(String[] args){
                System.out.println("Kelompok 32");
                System.out.println("Anggota kelomppok:");
                System.out.println("1. Anisa Anastasya (21120123130080)");
                System.out.println("2. Aisyah Aulia Azzahra Putri (21120123120041)");
                System.out.println("3. Gyda Marva Adriono (21120123140043)");
                System.out.println("4. Hasnaa' Amalia Qurratu'Aini(21120123140155)");
                String stars = "*".repeat(100);
                System.out.println(stars);
                
                System.out.println("Selamat datang di Vending Machine. Mau minum apa?");
                System.out.print("Masukkan saldo anda: ");
                saldo = scanner.nextInt();
                
                
}
