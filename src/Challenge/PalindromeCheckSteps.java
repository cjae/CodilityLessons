/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class PalindromeCheckSteps {
    
    private static int getPalindromeStep(int n) {
        int steps = 0;
        boolean isfound = false;

        String original = String.valueOf(n);

        while (!isfound) {
            String reverse = "";

            int length = original.length();

            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);
            }

            boolean palin =  original.equals(reverse);

            if (palin) {
                isfound = true;
            } else {
                original = String.valueOf(Integer.parseInt(original) + 
                        Integer.parseInt(reverse));
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(getPalindromeStep(n));
    }
}
