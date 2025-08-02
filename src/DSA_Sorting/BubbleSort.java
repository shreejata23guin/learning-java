package DSA_Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={5,3,8,4,2};

        //Outer loop for passes
        for (int i=0;i< arr.length-1;i++){
            //inner loop for comparison
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    //swap if left>right
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                }
            }
        //print sorted array
        System.out.print("Sorted Array:");
        for (int num: arr){
            System.out.print(num+" ");

        }
    }
}


//| Code                     | What it does                  |
//| ------------------------ | ----------------------------- |
//| `int[] arr = {...}`      | The array to sort             |
//| `for (i...)`             | Outer loop: how many passes   |
//| `for (j...)`             | Inner loop: compare elements  |
//| `if (arr[j] > arr[j+1])` | Check if they’re out of order |
//| `temp = arr[j]...`       | Swap the values               |
//| `System.out.print...`    | Show final sorted array       |