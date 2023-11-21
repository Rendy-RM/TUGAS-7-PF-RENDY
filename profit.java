// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputkan Nilai Modal =");
        int modal = sc.nextInt();
        System.out.println("Inputkan Nilai Persen =");
        int persen = sc.nextInt();
        int profit;

        System.out.println("Jumlah Profit = ");
        profit = modal+(modal*persen);
        System.out.println(profit);



    }
}