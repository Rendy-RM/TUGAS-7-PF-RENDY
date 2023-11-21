import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int num = 0;

        while (num <=n){
            sum+=num;
            num++;
        }
        System.out.println(sum);
    }
}
