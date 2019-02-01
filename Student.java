package alg;

class Student {
	int rollno;
	String name;

	void Welcome() {
		System.out.println("Welcome " + name + " " + rollno);
	}

	void display() {
		System.out.println(rollno + "  " + name);
	}

	void rollnoadd(int s) {
		System.out.println(rollno + s);
	}

	void recur() {
		System.out.println("In recursion");
		rollno--;
		if (rollno == 123)
			System.out.println("end");
		else
			recur();

	}
}
