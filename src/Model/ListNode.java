package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author basisb22
 */
public class ListNode {

    private String data;
    private ListNode next;
    private ListNode prev;

    public ListNode() {

    }

    public ListNode(String data) {
        this.data = data;
    }

    public ListNode(String data, ListNode next, ListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

}
