import java.util.Scanner;
public class quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Angka Pertama :");
        int a = sc.nextInt();
        System.out.println("Masukan Angka Kedua :");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("Angka Pertama Besar");
        }
        else if (a<b){
            System.out.println("Angka Kedua Besar");
        }
        else if (a==b){
            System.out.println("Angka Sama Besar");
        }
        else{
            System.out.println("Tidak Manuk Akal");
        }
    }
}