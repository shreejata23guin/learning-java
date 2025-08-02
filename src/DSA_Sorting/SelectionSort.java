package DSA_Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr={29,10,14,37,13};

        for (int i=0;i< arr.length-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print("Sorted array:");
        for (int num: arr){
            System.out.print(num+" ");


        }
    }
}


//public class SelectionSort {
//➡️ Creates a class named SelectionSort
//📌 In Java, every program must be inside a class.
//
//public static void main(String[] args) {
//➡️ This is the main method — where Java starts running your program.
//
//int[] arr = {29, 10, 14, 37, 13};
//➡️ This creates an array of integers.
//💡 The array we want to sort.
//
//for (int i = 0; i < arr.length - 1; i++) {
//➡️ Outer loop: Runs from index 0 to second last index.
//✅ It picks one index at a time to fill with the minimum value.
//
//int minIndex = i;
//➡️ Assume the current index i has the smallest value.
//
//for (int j = i + 1; j < arr.length; j++) {
//➡️ Inner loop: Starts from next element to the right of i.
//✅ It searches for the actual smallest value in the unsorted part.
//
//if (arr[j] < arr[minIndex]) {
//➡️ If the current value is smaller than the one we assumed to be minimum...
//
//minIndex = j;
//➡️ ...then update minIndex to j, because we found a smaller value.
//
//int temp = arr[i];
//➡️ Store the value at index i in a temporary variable temp.
//📌 Used for swapping values.
//
//arr[i] = arr[minIndex];
//➡️ Replace the value at i with the minimum value.
//
//arr[minIndex] = temp;
//➡️ Replace the value at minIndex with the original value at i.
//✅ Swapping complete!
//
//System.out.print("Sorted array: ");
//➡️ Print label to the console.
//
//for (int num : arr) {
//➡️ Enhanced for-loop: Goes through each element in array arr.
//
//System.out.print(num + " ");
//➡️ Prints each number followed by a space.
//
//}
//Closes all the loops and class.
