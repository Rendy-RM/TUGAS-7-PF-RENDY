import java.util.Scanner;
public class theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] seats = {
                {0,0,0,1,1,1,0,0,1,1},
                {1,1,0,1,0,1,0,0,0,0},
                {0,0,0,1,1,1,0,0,1,1},
                {0,1,0,1,0,0,0,1,1},
                {0,0,1,1,1,1,0,0,1,1}

        };

        int row = sc.nextInt();
        int col = sc.nextInt();

        if(seats[row][col]==0){
            System.out.println("Free");
        }else {
            System.out.println("Sold");
        }
    }





}
