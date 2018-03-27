package Challenge;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author osagieomon
 */
public class DemoTest {

    static int solution(int[] A) {
        int n = A.length;

        int groupCounter = 1;
        int temp = A[0];

        ArrayList<Integer> tempArray = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (A[i] > temp) {
                if (tempArray.isEmpty()) {
                    temp = A[i];
                    groupCounter++;
                } else {
                    boolean found = false;
                    for (int num : tempArray) {
                        if (A[i] < num) {
                            found = true;
                        }
                    }

                    if (found) {
                        tempArray.add(A[i]);
                    } else {
                        if ((i + 1) < n) {
                            if (A[i] > A[i + 1]) {
                                tempArray.add(A[i]);
                            } else {
                                tempArray.clear();
                                groupCounter++;
                            }
                        } else {
                            tempArray.clear();
                            groupCounter++;
                        }
                    }

                    temp = A[i];
                }
            } else {
                if (!tempArray.contains(temp)) {
                    tempArray.add(temp);
                }
                tempArray.add(A[i]);
                temp = A[i];

            }
        }

        return groupCounter;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 4, 9, 8, 7, 12, 13, 14};
        int count = solution(arr);

        System.out.println("" + count);
    }
}
