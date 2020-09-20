public class SortinArray {
    public static void main(String[] args) {
        int arr []={2,6,1,4,9};
        int temp;
        //sort asc 1,2,4,6,9

        for (int i = 0; i < 5; i++) {
            for (int j =i+1; j <5 ; j++) {
                if(arr[i] > arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] +" ");

        }
    }
}
