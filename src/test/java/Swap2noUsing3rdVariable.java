import java.util.Scanner;

public class Swap2noUsing3rdVariable {
    public static void main(String[] args) {
       // a = 10 ;
       // b = 20;
        //a = 20; and b= 10;
        int first = 10;
        int second = 20;
        System.out.println("Before swap");
        System.out.println("First Value :"+ first);
        System.out.println("second Value :"+ second);

        int temp = first;
        first = second;
        second= temp;
        System.out.println("After swap");
        System.out.println("First Value :"+ first);
        System.out.println("second Value :"+ second);
        //Another way
        int x, y, temp1;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    }
}
