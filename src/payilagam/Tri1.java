package payilagam;

public class Tri1 {
public static void main(String[] args) {
//	for(int r = 1; r<=3; r++) {				1
//		for(int s = 2; s>=r; s--) {			1 2 2
//			System.out.print("");			1 2 3 2 3
//		}
//		for(int n1=1; n1<=r; n1++) {
//			System.out.print(n1);
//		}
//		for(int n2=2; n2<=r; n2++) {
//			System.out.print(n2);
//		}
//		System.out.println();
//	}

	for(int r=1; r<=3; r++) {
		for(int t1 = 2; t1 >= r; t1--) {
			System.out.print("");
		}
		for(int t2 = 1; t2<=r; t2++) {
			System.out.print(t2);
		}
		for(int t3 = r; t3 > 1; t3--) {
			System.out.print(t3-1);
		}
		System.out.println();
	}
	
}	
}
