package payilagam;

public class MaxWhile {
	public static void main(String[] args) {
		int[] no = {3,7,5};
		int i = 0;
		int max = no[i];
		while(i < no.length) {
			if(no[i] > max) {
				max = no[i];
			}
			i++;
		}
		System.out.println(max);
	}

}
