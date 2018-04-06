/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.time;

/**
 *
 * @author osagieomon
 */

// SCORE = 83%
public class TapeEquilibrium {
    
    static int solution(int[] A) {
        int n = A.length;
        
        int sumTotal = 0;
        for (int num : A) {
            sumTotal += num;
        }
        
        int minimal = Integer.MAX_VALUE;
        int previous = 0;
        
        for (int num : A) {
            previous += num;
            int num2 = sumTotal - previous;
            
            minimal = Math.min(minimal, Math.abs(previous - num2));
        }
        
        return minimal;
    }
    
    public static void main(String[] args) {
        int num = solution(new int[]{3, 1, 2, 4, 3});

        System.out.println(num);
        
    }
}
