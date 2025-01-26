package new_features;

public class ContractDemo implements Contract {
	
public void add() {
	System.out.println(5+5);
}
public static void main(String[] args) {
	ContractDemo cd = new ContractDemo();
	cd.display();
	Contract.dis();
}
}
