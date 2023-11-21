import java.util.Scanner;

public class fahrenheit {
    static double fahr(double celcius){
        double fahr = 1.8*celcius+32;
        return fahr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}
