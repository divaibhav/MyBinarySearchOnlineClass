/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Mar-20
 *  Time: 1:27 PM
 */
package seco.recursive;

/*
Algorithm : binarySearch(searchElement, low, high)
Start:
Step1: 		if(low > high) then step 2, else step 3.
Step 2: 		return false;
Step 3: 		mid = (low + high) / 2;
Step 4:		 if(searchElement == arr[mid]) then step 5, else step 6
Step 5:		 return true;
Step 6:		 if(searchElement < arr[mid]) then step 7, else step 8
Step 7:		 return binarySearch(searchElement , low , mid - 1)
Step 8:		 return binarySearch(searchElement, mid + 1, high)
end

 */
public class MyBinarySearchRecursive {
    private int[] arr;

    public MyBinarySearchRecursive(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70};
        int searchElement = 100;
        MyBinarySearchRecursive object = new MyBinarySearchRecursive(sortedArray);
        int low = 0;
        int high = sortedArray.length - 1;
        boolean result = object.binarySearch(searchElement, low, high);

        if (result) {
            System.out.println("element found");
        } else {
            System.out.println("Element not found");
        }
        boolean temp = 2147483647 < 1000000000;
        System.out.println(temp);

    }

    //recursive approach
    public boolean binarySearch(int searchElement, int low, int high) {
        //step 1
        if (low > high) {
            //step 2
            return false;
        }
        //step 3
        int mid = (low + high) / 2;
        //step 4
        if (searchElement == arr[mid]) {
            //step5
            return true;
        }
        //step 6
        else if (searchElement < arr[mid]) {
            //step 7
            // recursive call
            return binarySearch(searchElement, low, mid - 1);
        }
        //step 8
        else {
            return binarySearch(searchElement, mid + 1, high);
        }

    }
}
