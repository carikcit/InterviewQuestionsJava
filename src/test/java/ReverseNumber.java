import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[])
    {

//        int n, reverse = 0;
//
//        System.out.println("Enter an integer to reverse");
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
        int num=1234;
        int reverse=0;

        while(num != 0)
        {

            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }
}
