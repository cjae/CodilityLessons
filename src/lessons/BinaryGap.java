/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons;

/**
 *
 * @author osagieomon
 */
public class BinaryGap {

    public static int solution(int n) {
        int current = 0;
        int max = 0;
        
        while (n > 0) {
            if (n % 2 == 0) {
                ++current;
            } else {
                max = Math.max(max, current);
                current = 0;
            }
            n /= 2;
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println("" + solution(1041));
    }
}
