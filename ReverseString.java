/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author collincampbell
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            for (int i = word.length(); i > 0; i--) {
                System.out.print(word.charAt(i - 1));
                if (i == 1) {
                    System.out.println("");
                }
            }
        }
        
        
    }
    
}
