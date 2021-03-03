/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_if_multiple;

/**
 *
 * @author oxxoxoox
 */
public class Check_if_multiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //whenever a number x is a multiple of some number y,
        //then always x % y equal to 0, which can be used as a check.
        System.out.println(9 % 3==0);
        System.out.println(10 % 2==0);
        System.out.println(555 % 5==0);
        System.out.println(666 % 333==0);
        System.out.println(666 % 33==0);
        System.out.println(10 % 3==0);
        System.out.println(8 % 3==0);
        System.out.println(6 % 5==0);
    }
}