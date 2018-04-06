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
public class OddOccurrencesInArray {
    
    static int solution(int[] A) {
        int ar_size = A.length;
        int i;
        int res = 0;
        
        for (i = 0; i < ar_size; i++) {
            res = res ^ A[i];
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int num = solution(new int[]{9, 3, 9, 3, 9, 7, 9});

        System.out.println(num);
        
    }
}
