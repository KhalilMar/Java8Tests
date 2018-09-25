package ma.beans.lambdas;

public class Developer {

	private String name;

	public Developer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + "]";
	}

}
