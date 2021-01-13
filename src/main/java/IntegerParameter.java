public class IntegerParameter extends Parameter<Integer> {

	private int value;

	public IntegerParameter(String name, int value) {
		super(name);
		this.value = value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
