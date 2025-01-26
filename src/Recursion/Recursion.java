package Recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recursion r = new Recursion();
		r.display(1);
	}

	void display(int no) {
		if(no <= 5) {
			System.out.println(no);
			no++;
			display(no);
		}
		
	}

}
