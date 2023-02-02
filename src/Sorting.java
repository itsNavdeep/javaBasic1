public class Sorting {
    public static void printArr(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int []arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        printArr(arr);
    }
    public static void selectionSort(int [] arr)
    {
        int min_index=0;
        for(int i=0;i<arr.length-1;i++){
            min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j])
                {
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        System.out.println();
        printArr(arr);
    }
    public static void main(String[] args) {
    int []myarray={10,6,2,4,5,8};
    bubbleSort(myarray);
    selectionSort(myarray);
    }
}
