package org.bolikov.lesson2.task1;

public class Link<T> {
    private T link;
    public Link<T> next;

    public Link(T link) {
        this.link = link;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

    public Link<T> getNext() {
        return next;
    }

    public T getValue() {
        return link;
    }
}
