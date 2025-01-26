package new_features1;

public interface Rules {
	
	default void test() {
		System.out.println("Rules");
	}

}
