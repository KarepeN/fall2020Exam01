/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssn;

import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class SsnDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * User Input is taken
         */
        System.out.println("Enter a SSN:");
        Scanner scan = new Scanner(System.in);
        String ssn = scan.nextLine();
        /**
         * trim the extra spaces
         */
        String a = ssn.trim();
        /**
         * Enters the loop only if it satisfies the conditions such as length of
         * string and splitting the characters with '-'
         */
        /**
         * Divides the given string after third digits and also after fifth digit
         */
        if (a.length() == 11 && a.charAt(3) == '-' && ssn.charAt(6) == '-') {
            System.out.println(a + " is an valid social security number");
        } else {
            System.out.println(a + "is an invalid social security number");
        }
    }
}
