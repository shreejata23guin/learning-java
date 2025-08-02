package DSA_Sorting;

public class InsertionSort {  //Defines the class name. Every Java code needs to be inside a class.
    public static void main(String[] args) {  //The starting point of your program
        int[] arr = {29, 10, 14, 37, 13}; //Creates an array of integers that we want to sort.

        for (int i = 1; i < arr.length; i++) { //Starts from index 1 because the first element (index 0) is already “sorted”.
            int key = arr[i]; //Saves the value to be placed in the correct position.
            int j = i - 1; //Pointer j starts from just before i, used to compare backwards.

            while (j >= 0 && arr[j] > key) { //Checks if previous values are greater than the key. If yes, they need to shift.
                arr[j + 1] = arr[j]; //Shift the bigger value one position right.
                j--; //Move to the left and compare the next element.
            }
            arr[j + 1] = key; //After finding the right place, insert the key.
        }
        System.out.print("Sorted array:"); //Just a label printed before output.
        for (int num : arr) { //for (int num : arr) { System.out.print(num + " "); }


                System.out.print(num + " ");
            }
        }
    }


