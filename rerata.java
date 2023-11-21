import java.util.Scanner;
public class rerata {
    public static void main(String[] args) {

        int n1,n2,n3,n4;
        int total;
        double rerata;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Nilai 1 :");
        n1 = sc.nextInt();

        System.out.println("Masukan Nilai 2 :");
        n2 = sc.nextInt();

        System.out.println("Masukan Nilai 3 :");
        n3 = sc.nextInt();

        System.out.println("Masukan Nilai 4 :");
        n4 = sc.nextInt();

        total = n1+n2+n3+n4;
        System.out.println("Total nilai Keseluruhan adalah :" +total);

        rerata = total/4;
        System.out.println("Rata-rata nilai :" +rerata);

    }
}
