/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Apr-20
 *  Time: 4:26 PM
 */
package secb.main;

import secb.iterative.MyBinarySearchIterative;

public class MyMain {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 5, 60, 70, 80, 90, 100};
        int searchElement = 40;
        MyBinarySearchIterative object = new MyBinarySearchIterative(sortedArray);
        boolean result = object.binarySearch(searchElement);

        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("elment not found");
        }
    }
}
