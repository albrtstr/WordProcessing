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
public class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        this.head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size = 0;
    }

    private ListNode addBefore(String data, ListNode node) {
        ListNode baru = new ListNode(data);
        node.getPrev().setNext(baru);
        baru.setPrev(node.getPrev());
        baru.setNext(node);
        node.setPrev(baru);
        return baru;
    }

    private String remove(ListNode node) {
        ListNode kiri = node.getPrev();
        ListNode kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        return node.getData();
    }

    public void addFirst(String data) {
        addBefore(data, head.getNext());
        size++;
    }

    public void addLast(String data) {
        addBefore(data, head);
        size++;
    }

    public String removeFirst() {
        String n = remove(head.getNext());
        size--;
        return n;
    }

    public String removeLast() {
        String n = remove(head.getPrev());
        size--;
        return n;
    }

    public ListNode searchData(String data) {
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.getNext();
            if (data == temp.getData()) {
                return temp;
            }
        }
        return null;
    }

//    public int searchIndex(String data) {
//        int index = -1;
//        ListNode node = head;
//        while (node.getNext() != head) {
//            node = node.getNext();
//            index++;
//            if (node.getData() == data) {
//                return index;
//            }
//        }
//        return index;
//    }

//    public int get(String index) {
//        int indexG = -1;
//        ListNode node = head;
//        while (node.getNext() != head) {
//            node = node.getNext();
//            indexG++;
//            if (index == indexG) {
//                return node.getData();
//            }
//        }
//        return -1;
//    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        ListNode node = head;
        String str = "";
        while (node.getNext() != head) {
            node = node.getNext();
            str = str + node.getData() + " ";
        }
        return str;
    }

}
