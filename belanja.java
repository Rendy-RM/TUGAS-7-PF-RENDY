import java.util.Scanner;
public class belanja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []harga = {2500,3000,4000,5000,6000};
        int total1;
        int []jumba = new int[harga.length];

        System.out.println("Input Jumlah Barang Belanja :");

        for (int i=0;i< harga.length;i++){
            System.out.print("Jumlah Belanja Item-"+i+ " Rp "+harga[i]+ ":");
            jumba[i] = sc.nextInt();
        }

        System.out.println("Daftar Belanja Dan Harga :");

        for (int j=0;j< harga.length;j++){
            total1 = harga[j] * jumba[j];
            System.out.println("Harga Barang Ke-" + j + "," + jumba[j] + " Item:" + total1);

        }
        int item = 0;
        for (int i=0;i< harga.length;i++){
            item = item + jumba[i];
        }

        int jumhar=0;

        for (int i=0;i<harga.length;i++){
            jumhar = jumhar+harga[i]*jumba[i];
        }
        System.out.println("Total Item Belanja :"+item);
        System.out.println("Total Belanja : Rp "+jumhar);
    }
}

