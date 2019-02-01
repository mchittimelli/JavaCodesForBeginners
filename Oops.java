package alg;
interface first{
	
}
class Student1 {
	int rollno;
	String name="m";
public Student1(){
	System.out.println("In super class constructor");
}
	void Welcome() {
		System.out.println("Welcome " + name + " " + rollno);
	}

	void display() {
		System.out.println( name);
	}

	void rollnoadd(int s) {
		System.out.println(rollno + s);
	}
	}
public class Oops extends Student1 {
	void display(String a) {
		System.out.println( name+" "+a);
	}
	public Oops(){
		System.out.println("In class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops o= new Oops();
		o.display();
		o.display("class method");
	}

}
