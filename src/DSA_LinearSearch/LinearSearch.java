package DSA_LinearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={4,7,2,9,5};
        int key=9;
        boolean found=false;

        for (int i=0;i< arr.length;i++){
            if (arr[i]==key){
                found = true;
                System.out.println("Found at index:"+i);
                break;
            }
        }
        if (! found){
            System.out.println("Not found");
        }
    }
}
//| Line                 | Meaning              |
//| -------------------- | -------------------- |
//| `int[] arr = {...}`  | Array of numbers     |
//| `int key = 9`        | Number to find       |
//| `for loop`           | Checks every element |
//| `if (arr[i] == key)` | Match found          |
//| `break`              | Exit early if found  |