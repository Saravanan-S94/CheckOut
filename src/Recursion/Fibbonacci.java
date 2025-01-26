package Recursion;

public class Fibbonacci {
	public static void main(String[] args) {
		for(int no=0; no<10; no++) {
			System.out.print(find_fibo(no)+" ");
		}
	}

	private static int find_fibo(int no) {
		// TODO Auto-generated method stub
		if(no == 0) {
		return 0;
		}
		if(no == 1) {
			return 1;
		}
		return find_fibo(no-1)+find_fibo(no-2);
	}

}
