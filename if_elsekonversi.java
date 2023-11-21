import java.util.Scanner;
public class if_elsekonversi {
    public static void main(String[] args) {

        //Percabangan IF-ELSE(Rendy Rizqika Maulana)
        char huruf;

        Scanner sc=new Scanner(System.in);

        System.out.println("Inputkan Predikat :");
        huruf=sc.next().charAt(0);

        if(huruf =='A'){
            System.out.println("Nilai Index = 4.0");
        }
        else if (huruf == 'B') {
            System.out.println("Nilai Index = 3.0");

        }
        else if (huruf == 'C') {
            System.out.println("Nilai Index = 2.0");

        }
        else if (huruf == 'D') {
            System.out.println("Nilai Index = 1.0");

        }
        else if (huruf == 'E') {
            System.out.println("Nilai Index = 0");

        }
        else {
            System.out.println("Maaf,konversi nilai tidak diketahui");
        }

    }
}
