/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Apr-20
 *  Time: 10:21 AM
 */
package secd.iterative;

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
        int[] sortedArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        int searchElement = 70;
        MyBinarySearchIterative object = new MyBinarySearchIterative(sortedArray);
        boolean result = object.binarySearch(searchElement);
        if (result) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }

    public boolean binarySearch(int searchElement) {
        // step 1
        int low = 0;
        //step 2
        int high = arr.length - 1;
        //step 3
        while (low <= high) {
            //step 4
            int mid = (low + high) / 2;
            // step 5
            if (searchElement == arr[mid]) {
                //step 6
                return true;
            }
            //step 7
            else if (searchElement < arr[mid]) {
                //step8
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
