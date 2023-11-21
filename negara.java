import java.util.Scanner;
public class negara {
    public static void main(String[] args) {

        //Switch-Case Rendy Rizqika Maulana
        String huruf;
        String namanegara = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inputkan Kode Negara :");
        huruf = sc.nextLine();

        switch (huruf){
            case "ES" :
                namanegara = "Spanyol";
                break;

            case "TN" :
                namanegara = "Tunisia";
                break;

            case "ID" :
                namanegara = "Indonesia";
                break;

            case "MM" :
                namanegara = "Myanmar";
                break;

            case "IN" :
                namanegara = "India";
                break;

            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }
        System.out.println("Kode Negara : " +huruf);
        System.out.println("Nama Negara : " +namanegara);
    }
}
