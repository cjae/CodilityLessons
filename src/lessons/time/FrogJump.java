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
public class FrogJump {
    
    static int solution(int X, int Y, int D) {
        int diff = Y - X;
        
        double num = ((double) diff) / D;
        
        double num2 = Math.ceil(num);
        
        return (int) num2;
        
    }
    
    public static void main(String[] args) {
        int num = solution(10, 85, 30);

        System.out.println(num);
        
    }
}
