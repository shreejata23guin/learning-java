package DSA_BinarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={2,4,6,8,10,12,14};//sorted array
        int key=10;//number to find

        int low=0; //start index
        int high=arr.length-1;//end index

        boolean found=false;

        while (low<=high){
            int mid=(low+high)/2;//middle index

            if (arr[mid]==key){
                System.out.println("Found at index:"+mid);
                found=true;
                break;
            } else if (arr[mid]<key) {
                low = mid + 1;//search in right half
            }else{
                high=mid-1;//search in left half
            }
        }
        if (! found){
            System.out.println("Not found");
        }
    }
}

//| Line                       | Explanation                         |
//| -------------------------- | ----------------------------------- |
//| `int[] arr = {...}`        | Sorted array (must be sorted!)      |
//| `int key = 10`             | The number we want to find          |
//| `low = 0`                  | Start index of search               |
//| `high = arr.length - 1`    | End index of search                 |
//| `while (low <= high)`      | Keep searching while range is valid |
//| `mid = (low + high) / 2`   | Get the middle element              |
//| `if (arr[mid] == key)`     | Found it! 🎉                        |
//| `else if (arr[mid] < key)` | Search right half                   |
//| `else`                     | Search left half                    |
