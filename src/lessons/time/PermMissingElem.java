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

// SCORE = 100%
public class PermMissingElem {
    
    static int solution(int[] A) {        
        long n = A.length + 1;
        long total = n * (n + 1) / 2;

        for (int num : A) {

            total -= num;
        }

        return (int)total;
    }
    
    public static void main(String[] args) {
        int num = solution(new int[]{2, 3, 1, 5});

        System.out.println(num);
        
    }
}
