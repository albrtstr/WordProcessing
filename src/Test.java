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
        Stack test = new Stack();
        test.push("bayu");
        test.push("hai");
        test.push("72626");
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
    }
    
}
