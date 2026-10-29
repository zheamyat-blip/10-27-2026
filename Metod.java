/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metod;

/**
 *
 * @author ADOLFO_CPE113
 */

public class Metod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = PrintMe(111);

        System.out.println(number);

    }

    // Problem No. 1
    static int PrintMe(int number) {

        int res = 1;
        if (number % 2 == 0) {
        } else {
            res = 0;
        }

        return res;
    }
}
    static int PrintSide(int number) {
        Scanner input = new Scanner(System.in);
        
        if (a <=0 || b<=0 || c <=0 || a+b <=c || a+c <= b || b+c <=a){
        return 0;
    }
    if (a==b && b==c){
    return 1;
    }
    if (a==b || a==c || b==c){
    return 2;
    }
    return 3;
    }
