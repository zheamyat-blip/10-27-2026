/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zhee;

import java.util.Scanner;

/**
 *
 * @author ADOLFO_CPE113
 */
public class Zhee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // public static void main - main method
        //void PrintZhee(){} //- example sa method pero waley sulod
        // code sya na pwede nimo tawagon - ang method
        //PrintMe(100);
        // PrintZhee();
            PrintMe(1000);
    }
    // static void PrintZhee(){
    //System.out.println("Love nko sya bai.");
    //System.out.println("Love nko sya bai.");
    //System.out.println("Love nko sya bai.");

    //static void PrintMe(int balon){
    // System.out.println(balon+300);  
    Scanner input = new Scanner(System.in);
    
    static void PrintMe(int balon){   
    
    if (balon <=50)
    {System.out.println("Kulang mani oytch");
    }
    else if (balon >=50 && balon <=100){
    System.out.println("payts na");
    }
    else if (balon >=100 && balon <=1000){
    System.out.println("overtch rapod mamshikels");
    }

}
}
