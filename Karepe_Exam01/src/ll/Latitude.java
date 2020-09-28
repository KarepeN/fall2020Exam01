/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll;

import java.util.*;

/**
 *
 * @author Nithya Karepe
 */
public class Latitude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x1;
        double x2;
        double y1;
        double y2;
        /**
         *
         * Reads input from user
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        /**
         *
         * Reads input from user
         */
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        double distance;
        /**
         *
         * calculates the distance
         */
        distance = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1))
                * Math.sin(Math.toRadians(x2))
                + (Math.cos(Math.toRadians(x1))
                * Math.cos(Math.toRadians(x2)))
                * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
        /**
         *
         * Prints the calculated distance
         */
        System.out.println("The distance between the two points is " + distance + " km");
    }

}
