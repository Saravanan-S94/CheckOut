package payilagam;

public class TripleFor {
	public static void main(String[] args) {
	for(int row = 1; row<=3; row++) {
		for(int col = 1; col>row; col++) {
			System.out.print(col);
		}
		for(int col1=3; col1>=row; col1--) {
			System.out.print(row);
		}
		System.out.println();
	}
}
}