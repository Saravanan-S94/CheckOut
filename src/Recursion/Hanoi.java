package Recursion;

public class Hanoi {
	public static void main(String[] args) {
		Hanoi h = new Hanoi();
		h.towers_of_Hanoi(2,1,3,2);
	}
	void towers_of_Hanoi(int count, int start, int finish, int temp) {
		if(count > 0) {
			towers_of_Hanoi(count-1,start,temp,finish);
			System.out.println("Move a disk from "+start+" to "+finish);
			towers_of_Hanoi(count-1,start,finish,temp);
		}
	}

}
