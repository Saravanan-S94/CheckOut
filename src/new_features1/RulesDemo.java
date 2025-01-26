package new_features1;

public class RulesDemo implements Rules, Rules1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RulesDemo rd = new RulesDemo();
		rd.test();

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Rules.super.test();
		Rules.super.test(); 
	}

}
