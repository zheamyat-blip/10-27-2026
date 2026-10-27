/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeatedly;

import java.util.Scanner;

/**
 *
 * @author ADOLFO_CPE113
 */
public class Repeatedly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        while (option <= 0) {
            System.out.println("Avisala zhee");
            String choice = input.next();
            if (choice.equals("a")) {
                System.out.println("Enter a String");
                String name1 = input.next();
                System.out.println("Enter a String");
                String name2 = input.next();
                String ans = name1 + name2;
                System.out.println( ans + "dili, sa salog");
            } else if (choice.equals("b")) {
                System.out.println("sure oi!");
            } else if (choice.equals("c")) {
                System.out.println("ayaw ko tubaga ug sure oi!");
            } else if (choice.equals("d")) {
                System.out.println("ayunnnn!");
            } else if (choice.equals("e")) {
                System.out.println("rene ug adili!");
            } else if (choice.equals("Exit")) {
                break;
            }
        }

    }

}
