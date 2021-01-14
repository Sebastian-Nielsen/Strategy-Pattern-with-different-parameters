public class StringParameter extends Parameter {

	private String value;

	public StringParameter(String name, String value) {
		super(name);
		this.value = value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
