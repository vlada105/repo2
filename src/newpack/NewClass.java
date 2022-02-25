package newpack;

public class NewClass {
	
	private final String name;

	public NewClass(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "NewClass [name=" + name + "]";
	}

}
