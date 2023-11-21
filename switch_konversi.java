import java.util.Scanner;
public class switch_konversi {
    public static void main(String[] args) {

        //Switch-Case (Rendy Rizqika Maulana)

        String huruf;

        Scanner sc= new Scanner(System.in);

        System.out.println("Masukan Nilai Predikat :");
        huruf= sc.nextLine();

        switch (huruf){
            case "A":
                System.out.println("Nilai Index = 4.0");
                break;

            case "B":
                System.out.println("Nilai Index = 3.0");
                break;

            case "C":
                System.out.println("Nilai Index = 2.0");
                break;

            case "D":
                System.out.println("Nilai Index = 1.0");
                break;

            case "E":
                System.out.println("Nilai Index = 0");
                break;

            default:
                System.out.println("Maaf,Konversi Nilai Tidak Diketahui");
        }
    }
}