/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

/**
 *
 * @author osagieomon
 */
public class BasicEncryptionDecryption {

    public static void main(String[] args) {
        String plainText = "COUSANT";

        String cipherText = encryptText(plainText);

        System.out.println("Encrypt Text: " + cipherText);

        String plainText2 = decryptText(cipherText);

        System.out.println("Decrypt Text: " + plainText2);
    }

    private static String encryptText(String plainText) {
        String cipherText = "";

        char[] myArray = plainText.toCharArray();

        for (char c : myArray) {
            int position = letterToAlphabetPos(c);

            if (position % 2 == 0) {
                cipherText += "e" + ((int) position / 2);
            } else {
                cipherText += "o" + ((position * 3) + 1);
            }
        }

        return cipherText;
    }

    private static String decryptText(String cipherText) {
        String plainText = "";

        cipherText += 'q';
        char[] myArray = cipherText.toCharArray();

        String var = "";
        
        for (char c : myArray) {

            if (c == 'o' || c == 'e' || c == 'q') {
                if (!var.isEmpty()) {
                    plainText += doDecryptMethod(var);
                }
                
                var = ""+c;
            } else {
                var += c;
            }
        }
        
        return plainText;
    }
    
    private static char doDecryptMethod(String var) {
        if (var.startsWith("o")) {
            String subString = var.substring(1, var.length());
            int num = Integer.parseInt(subString);
            
            num--;
            
            int divisor = num / 3;
            
            return aplhaToLetterText(divisor);
        } else {
            String subString = var.substring(1, var.length());
            
            int num = Integer.parseInt(subString);
            
            int divisor = num * 2;
            
            return aplhaToLetterText(divisor);
        }
    }

    private static int letterToAlphabetPos(char letter) {
        return Character.toUpperCase(letter) - 64;
    }
    
    private static char aplhaToLetterText(int position) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        return alphabet.charAt(position - 1);
    }

}