package new_features;

@FunctionalInterface
public interface Contract {
	
	void add(); // Functional Method
	
	default void display() {
		System.out.println("Contract Display");
	}
	static void dis() {
		System.out.println("static");
	}

}
