import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Data :");
        int jumda = sc.nextInt();
        int[] angka = new int[jumda];
        System.out.println("Inputkan data :");

        for (int i = 0; i < jumda; i++) {
            System.out.print("Angka ke - " + i+" :");
            angka[i] = sc.nextInt();
        }

        for (int i=0;i<jumda;i++){
            if (angka[i]%2==0){
                System.out.println(angka[i]+" ---->Angka Genap");
            }else {
                System.out.println(angka[i]+" ---->Angka Ganjil");
            }
        }

        int jumto=0;
        for (int i=0;i<jumda;i++){
            jumto = jumto+angka[i];
        }
        System.out.println("Total Penjumlahan: "+jumto);

        double rata=0;
        for (int i=0;i<jumda;i++){
            rata = jumto/angka[i];
        }
        System.out.println("Rata-Rata: "+rata);



    }
}

