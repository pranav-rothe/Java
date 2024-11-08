package casting;

public interface WebD {
	
	void web();
	void chrome();
	void fire();
	
	default void xyz() {
		System.out.println("xyz");
	}

}
