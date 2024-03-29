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
