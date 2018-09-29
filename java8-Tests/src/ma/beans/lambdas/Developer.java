package ma.beans.lambdas;

public class Developer {

	private String name;
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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
