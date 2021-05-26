package org.bolikov.lesson2.task1;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    public Link<T> first;
    public Link<T> last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T object) {
        Link<T> newLink = new Link<>(object);
        if (this.isEmpty()) last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void addLast(T object) {
        Link<T> newLink = new Link<>(object);
        if (this.isEmpty()) first = newLink;
        else last.next = newLink;
        last = newLink;
    }

    public T getLast() {
        Link<T> l = last;
        if (l == null) throw new NoSuchElementException();
        return l.getValue();
    }

    public void addFirst(T object) {
        Link<T> newLink = new Link<>(object);
        if (this.isEmpty()) last = newLink;
        else {
            Link<T> temp = first;
            if (first.next == null) {
                last = temp;
                newLink.next = last;
            } else {
                newLink.next = temp;
            }
            first = newLink;
        }
    }
    public T getFirst() {
        Link<T> f = first;
        if (f == null) throw new NoSuchElementException();
        return f.getValue();
    }

    public Link<T> delete() {
        if (isEmpty()) return null;
        Link<T> temp = first;
        if (first.next == null) last = null;
        first = first.next;
        return temp;
    }

    public void display() {
        Link<T> current = first;
        while (current != null) {
            System.out.println(current.getValue().toString());
            current = current.next;
        }
    }

}
