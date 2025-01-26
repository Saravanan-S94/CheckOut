package payilagam;

public class Brace {
	public static void main(String[] args) {
		char a = '{';
		char b = '}';
		for(int no = 1; no<=3; no++) {
			for(int i = 1; i<=no; i++) {
				System.out.print(a);
			}
			for(int i = 1; i<=no; i++) {
					System.out.print(b);
				}
			System.out.println(" ");
			}
		}
	}

