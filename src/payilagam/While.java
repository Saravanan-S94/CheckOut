package payilagam;

public class While {
	public static void main(String[] args) {
//		int count = 0;
//		int total = 0;
//		while(count <= 5) {
//			int mark = count;
//			total = total + mark;
//			count++;
//		}
//		System.out.println(total);
		
		int count = 0;
		int total = 0;
		do {
			int mark = count;
			total = total + mark;
			count++;
		}
	while(count < 5);
		System.out.println(total);
	}
}
