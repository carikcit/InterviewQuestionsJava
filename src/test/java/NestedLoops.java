public class   NestedLoops {
    public static void main(String[] args)
    {
        int k=1;
        for(int i=0; i<4; i++)
        {
           // System.out.println("Outer loop");
            for(int j=1; j<=4-i; j++)
            {
                System.out.print("\t" + k);
                k++;
            }
            System.out.println(" ");
        }
    }
    /*
    1234
    567
    89
    10
     */

}
