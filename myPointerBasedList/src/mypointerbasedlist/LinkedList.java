/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypointerbasedlist;

/**
 *
 * @author aspa
 */
public class LinkedList {

    private Node head;
    private int listeBoyutu;

    // LinkedList sınıfının constructor'ı
    public LinkedList() {
		// head'a başlangıcta null degeri atadık
        // listeBoyutu başlangıçtaki degeri  0
        head = new Node(null);
        listeBoyutu = 0;
    }

    public void add(Object data) // listeye ekleme yapıyor
    {
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        listeBoyutu++;
    }

    public void add(Object data, int index) // listede istenilen yere ekleme yapıyor
    {
        Node temp = new Node(data);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listeBoyutu++;
    }

    public Object get(int index) // listede istenilen elemanı dönderiyor.
    {
        // index degeri 0'dan kücükse null dönder
        if (index <= 0) {
            return null;
        }

        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return null;
            }

            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index) // lListede girilen indis degerini siliyor
    {
        // index degeri 1'den kücük ve boyutunu aşarsa
        if (index < 1 || index > size()) {
            return false;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return false;
            }

            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listeBoyutu--; // liste elaman sayısını bir azalt
        return true;
    }

    public int size() // listenin boyutunu dönderiyor.
    {
        return listeBoyutu;
    }

    public String yaz() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]"+ " ";
            current = current.getNext();
        }
        return output;
    }

    //////////////////////////////////    NODE SINIFI     ///////////////////////////////////////////
    private class Node {

        Node next;
        Object data;

        // Node sınıfının constructor'ı
        public Node(Object _data) {
            next = null;
            data = _data;
        }

        // Node sınıfının constructor'ı
        public Node(Object _data, Node _next) {
            next = _next;
            data = _data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object _data) {
            data = _data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node _next) {
            next = _next;
        }
    }

}
