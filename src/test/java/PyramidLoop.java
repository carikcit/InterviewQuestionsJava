public class PyramidLoop {
    public static void main(String[] args) {
        /*
        1
        2 3
        4 5 6
        7 8 9 10
         */
        int k= 1;
        for(int i = 1; i<5; i++)
        {
            System.out.println("");
            for(int j =1; j<=i; j++)
            {
                System.out.print(k+"\t");
                k++;
            }
        }
        System.out.println("");

    }
}
