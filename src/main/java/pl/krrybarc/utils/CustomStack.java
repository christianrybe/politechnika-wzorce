package pl.krrybarc.utils;

import pl.krrybarc.exception.EmptyStackException;
import pl.krrybarc.exception.FullStackException;

public class CustomStack<E> {

    private final int maxSize;
    private E[] elements;
    private int top = 0;

    public CustomStack(int size) {
        maxSize = size;
        elements = (E[]) new Object[size];
    }

    public void push(E element) throws FullStackException {
        if (top < maxSize) {
            elements[top++] = element;
        } else {
            throw new FullStackException("My stack is full already.");
        }
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            E element = elements[--top];
            elements[top] = null; //to allow Garbage Collector remove this object
            return element;
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {
        CustomStack<Integer> numbers = new CustomStack<>(3);
        try {
            numbers.push(10);
            System.out.println(numbers.pop());
        } catch (FullStackException | EmptyStackException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
