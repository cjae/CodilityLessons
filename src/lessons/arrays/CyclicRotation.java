/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.arrays;

/**
 *
 * @author osagieomon
 */
public class CyclicRotation {

    static int[] solution(int[] A, int k) {
        int n = A.length;
        int[] newArray = new int[n];

        // Method 1
//        if (n == 1) {
//            return A;
//        } else {
//            for (int i = 0; i < k; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (j + 1 < n) {
//                        newArray[j + 1] = A[j];
//                    } else {
//                        newArray[0] = A[j];
//                    }
//                }
//
//                A = Arrays.copyOf(newArray, n);
//            }
//
//            return newArray;
//        }

        // Method 2
        if (n == 1) {
            return A;
        } else {
            for (int i = 0; i < n; i++) {
                int diff = k - n;

                int newIndex = i + diff;

                if (newIndex < 0) {
                    newArray[n + newIndex] = A[i];
                } else if (newIndex > (n - 1)) {
                    newArray[n - newIndex] = A[i];
                } else {
                    newArray[newIndex] = A[i];
                }
            }

            return newArray;
        }
    }

    public static void main(String[] args) {
        int[] arr = solution(new int[]{3}, 5);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
