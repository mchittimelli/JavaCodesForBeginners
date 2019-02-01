package alg;

import java.util.Scanner;

public class Swap {
	public static void main(String[]args){
int a;
int b;
Scanner sc = new Scanner(System.in);
System.out.println("enter value of a");
a=sc.nextInt();
System.out.println("enter value of b");
b=sc.nextInt();
System.out.println("before swap a="+a+" and b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swap a="+a+" and b="+b);
sc.close();
}}
