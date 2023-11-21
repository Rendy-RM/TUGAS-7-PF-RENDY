import java.util.Scanner;

public class pin {
    public static void main(String[] args) {
        int pin = 2023;
        int maksimalbatas = 3;
        int batas = 0;

        Scanner scanner = new Scanner(System.in);
        while (batas < maksimalbatas) {
            System.out.print("Masukkan PIN 4 digit: ");
            pin= scanner.nextInt();

            if (pin == 2023) {
                System.out.println("PIN yang Anda masukkan benar. Akses diberikan.");
                break;

            } else {
                batas++;
                System.out.println("PIN yang Anda masukkan salah. Sisa percobaan: " + (maksimalbatas-batas));
            }
        }

        if (batas >= maksimalbatas) {
            System.out.println("Anda telah melebihi batas maksimal percobaan. Akses ditolak.");
        }   
    }
}
