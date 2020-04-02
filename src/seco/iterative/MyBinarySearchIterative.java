/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Apr-20
 *  Time: 11:24 AM
 */
package seco.iterative;

/*
algorithm : binarySearch(search element)
//arr is the array in which we search for element
Start
Step 1: 	low= 0
Step 2: 	high = arr.size – 1
Step 3:	while(low <= high) do the following  steps 4, 5, 7
Step 4:	mid = (low + high) / 2
Step 5:	if(searchElement == arr[mid]) then step 6.
Step 6:	return true;
Step 7:	if(searchElement < arr[mid]) then step 8 else step 9.
Step 8:	high = mid – 1;
Step 9: 	low  = mid + 1
Step 10:	return false;
end

 */
public class MyBinarySearchIterative {
    private int[] arr;

    public MyBinarySearchIterative(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int searchElement = 70;
        MyBinarySearchIterative object = new MyBinarySearchIterative(sortedArray);
        boolean result = object.binarySearch(searchElement);
        System.out.println();
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("element not found");
        }
    }

    //iterative approach
    public boolean binarySearch(int searchElement) {
        //step 1
        int low = 0;
        //step 2
        int high = arr.length - 1;
        // step 3
        while (low <= high) {
            //step 4
            int mid = (low + high) / 2;
            //step 5;
            System.out.print(arr[mid] + ",");
            if (searchElement == arr[mid]) {
                //step 6
                return true;
            }
            //step 7
            else if (searchElement < arr[mid]) {
                //step 8
                high = mid - 1;
            }
            //step 9
            else {
                low = mid + 1;
            }


        }
        //step 10
        return false;
    }
}
