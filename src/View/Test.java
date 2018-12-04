package View;


import Model.Stack;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack test = new Stack();
        System.out.println("Masukkan =");
        String push1 = in.next();
        test.push(push1);
        test.push("hai");
        test.pop();
        test.push("72626");
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
       
    }
    
}
