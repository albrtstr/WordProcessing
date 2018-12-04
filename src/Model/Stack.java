package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author basisb23
 */
public class Stack {

    LinkedList tumpukan;

    public Stack(LinkedList tumpukan) {
        this.tumpukan = tumpukan;
    }

    public Stack() {
        tumpukan = new LinkedList();
    }

    public void push(String data) {
        tumpukan.addFirst(data);
    }

    public String pop() {
        return tumpukan.removeFirst();
    }

    public int size() {
        return tumpukan.size();
    }

    public boolean isEmpty() {
        return tumpukan.size() == 0;
    }
    
    
    public int lastIndexOf(Object o, int index){
        if (index >= tumpukan.size()) 
            throw new IndexOutOfBoundsException(index + " >= "+tumpukan.size());

        return 0;
    }
}
