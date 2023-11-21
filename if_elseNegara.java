import java.util.Scanner;
public class if_elseNegara {
    public static void main(String[] args) {

        //If-Else Negara Rendy Maulana
        Scanner sc=new Scanner(System.in);
        String namanegara=null;
        String KodeNegara;


        System.out.println("Masukan Kode Negara :");
        KodeNegara = sc.nextLine();

        if (KodeNegara.equals("ES")) {
            namanegara = "Spain";
        }
        else if(KodeNegara.equals("TN")){
            namanegara = "Tunisia";
        }
        else if(KodeNegara.equals("ID")){
            namanegara = "Indonesia";
        }
        else if(KodeNegara.equals("MM")){
            namanegara = "Myanmar";
        }
        else if(KodeNegara.equals("IN")){
            namanegara = "India";
        }
        else {
            System.out.println("Maaf,Kode Negara Tidak Diketahui");
        }

        System.out.println("Kode Negara : " +KodeNegara);
        System.out.println("Kode Negara : " +namanegara);


    }
}
