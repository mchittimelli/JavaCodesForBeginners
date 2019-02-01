package alg;

import java.util.Scanner;

public class StackStrRev {
    private int top;
    private int capacity;
    private char[] array;
 
    public StackStrRev(int capacity) {
        this.capacity = capacity;
        this.array = new char[capacity];
        this.top = -1;
    }
 
    public boolean isFull() {
        return this.top == this.capacity - 1;
    }
 
    public boolean isEmpty() {
        return this.top == -1;
    }
 
    public void push(char value) {
        if(!this.isFull()) {
            this.array[++this.top] = value;
        }
    }
 
    public char pop() {
        return this.isEmpty()?'\u0000':this.array[this.top--];
    }
 
    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        StackStrRev stack = new StackStrRev(size);
 
        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }
 
        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }
 
        return String.valueOf(charArr);
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string you want to reverse");
		String str = sc.nextLine();
        System.out.println(reverse(str));
        sc.close();
    }
}
