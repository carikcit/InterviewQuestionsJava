import java.util.Scanner;

public class Swap2noWithout3rdVar {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter x and y number");
        Scanner sc=  new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        System.out.println("Before Swap "+"x= "+x+", y= "+y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap "+"x= "+x+", y= "+y);

    }
}
