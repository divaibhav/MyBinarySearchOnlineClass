/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Mar-20
 *  Time: 12:47 PM
 */
package sech;
/*
Algorithm : binarySearch(searchElement, low, high)
Start:
Step1: 		if(low > high) then step 2, else step 3.
Step 2: 		return false;
Step 3: 		mid = (low + high) / 2;
Step 4:		 if(searchElement == arr[mid]) then step 5, else step 6
Step 5:		 return true;
Step 6:		 if(searchElement < arr[mid]) then step 7, else step 8
Step 7:		 binarySearch(searchElement , low , mid - 1)
Step 8:		 binarySearch(searchElement, mid + 1, high)
end

 */
public class MyBinarySearch {
    private int[] arr;

    public MyBinarySearch(int[] arr) {
        this.arr = arr;
    }
    //recursive approach
    public boolean binarySearch(int searchElement, int low, int high){
        // step 1
        if(low > high){
            //step 2
            return false;
        }
        //step3
        else{
            int mid = (low + high) / 2;
            //step 4
            if(searchElement == arr[mid]){
                //step 5
                return true;
            }
            //step 6
            else if(searchElement < arr[mid]){
                //step 7  - recursive call
                //checking lower half of arry for search element
               return binarySearch(searchElement, low, mid -1 );
            }
            //step 8
            else {
                // recursive call
                //checking the higher half of array for searchElement
                return binarySearch(searchElement, mid + 1, high);
            }

        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70};
        MyBinarySearch object = new MyBinarySearch(sortedArray);
        int searchElement = 190;
        boolean result = object.binarySearch(searchElement, 0, sortedArray.length -1);

        if(result){
            System.out.println("Element found");
        }
        else {
            System.out.println("element not found");
        }
    }
}
