import java.util.Scanner;
public class method {
    public static void bot(){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Order Confirmed");
                break;
            case 2:
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try Again");
                break;

        }

    }

    public static void main(String[] args) {
        bot();
    }

}
