/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//package net.datastructures;

/**
 * Implementation of the stack ADT using a fixed-length array.  All
 * operations are performed in constant time. An exception is thrown
 * if a push operation is attempted when the size of the stack is
 * equal to the length of the array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class ArrayStack<E> implements Stack<E> {
    /** Default array capacity. */
    public static final int CAPACITY=1000;   // default array capacity
  
    /** Generic array used for storage of stack elements. */
    private E[] data;                        // generic array used for storage
  
    /** Index of the top element of the stack in the array. */
    private int t = -1;                      // index of the top element in stack
  
    /** Constructs an empty stack using the default array capacity. */
    public ArrayStack() { this(CAPACITY); }  // constructs stack with default capacity
  
    /**
     * Constructs and empty stack with the given array capacity.
     * @param capacity length of the underlying array
     */
    @SuppressWarnings({"unchecked"})
    public ArrayStack(int capacity) {        // constructs stack with given capacity
      data = (E[]) new Object[capacity];     // safe cast; compiler may give warning
    }
  
    /**
     * Returns the number of elements in the stack.
     * @return number of elements in the stack
     */
    @Override
    public int size() { return (t + 1); }
  
    /**
     * Tests whether the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() { return (t == -1); }
  
    /**
     * Inserts an element at the top of the stack.
     * @param e   the element to be inserted
     * @throws IllegalStateException if the array storing the elements is full
     */
    @Override
    public void push(E e) throws IllegalStateException {
      if (size() == data.length) throw new IllegalStateException("Stack is full");
      data[++t] = e;                           // increment t before storing new item
    }
  
    /**
     * Returns, but does not remove, the element at the top of the stack.
     * @return top element in the stack (or null if empty)
     */
    @Override
    public E top() {
      if (isEmpty()) 
          return null;
      return data[t];
    }
  
    /**
     * Removes and returns the top element from the stack.
     * @return element removed (or null if empty)
     */
    @Override
    public E pop() {
      if (isEmpty()) return null;
      E answer = data[t];
      data[t] = null;                        // dereference to help garbage collection
      t--;
      return answer;
    }
  
    /**
     * Produces a string representation of the contents of the stack.
     * (ordered from top to bottom). This exists for debugging purposes only.
     *
     * @return textual representation of the stack
     */
    public String toString() {
      StringBuilder sb = new StringBuilder("(");
      for (int j = t; j >= 0; j--) {
        sb.append(data[j]);
        if (j > 0) sb.append(", ");
      }
      sb.append(")");
      return sb.toString();
    }

    public static Stack<Integer> joinStacks(Stack<Integer> s, Stack<Integer> t){
      // join stacks
      Stack<Integer> tempS = new ArrayStack<>();  // contents: ()
      Stack<Integer> tempT = new ArrayStack<>();  // contents: ()
      Stack<Integer> newStack = new ArrayStack<>();  // contents: ()
      
      while(!t.isEmpty()){
        tempT.push(t.top());
        t.pop();
      }

      while(!s.isEmpty()){
        tempS.push(s.top());
        s.pop();
      }

      while(!tempT.isEmpty()){
        newStack.push(tempT.top());
        t.push(tempT.top());
        tempT.pop();
      }

      while(!tempS.isEmpty()){
        newStack.push(tempS.top());
        s.push(tempS.top());
        tempS.pop();
      }
      return newStack; // if empty, will return empty stack
    }
  
    /** Demonstrates sample usage of a stack. */
    public static void main(String[] args) {
      
      Stack<String> S = new ArrayStack<String>();  // contents: ()
      // Stack<Integer> T = new ArrayStack<>();

      // // S stack (10,8)
      // // S.push(8);
      // // S.push(10);
      // System.out.println("Stack of S: "+S);
      // System.out.println("Top of Stack S: "+S.top());
     
      // // T Stack (7,12,1)
      // // T.push(1);
      // // T.push(12);
      // // T.push(7);
      // System.out.println();

      // System.out.println("Stack of T: "+T);
      // System.out.println("Top of Stack T: "+T.top());
      // Stack<Integer> newStack = joinStacks(S, T);
      // System.out.println("New Merged Stack: "+newStack);
      // System.out.println("Top of NewStack: "+newStack.top());
      S.push("Monday");
      S.push("Tuesday");
      S.push("Wednesady");
      String today = S.pop();
      S.pop();
      S.push("Thursday");
      S.pop();
      S.push("Friday");
      S.push("Saturday");
      S.pop();
      String yesterday = S.pop();
      S.push("Sunday");

      System.out.println("Stack Size: " +S.size());
      System.out.println("Top Stack: " +S.top());
      System.out.println(yesterday);








    }

 
    

  
  }