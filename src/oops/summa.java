package oops;

class summa implements Cloneable {
	int rollno;
	String name;

	summa(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			summa s1 = new summa(101, "amit");

			summa s2 = (summa) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			s1.name = "yuki";
			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}