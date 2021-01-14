package strategyPatternWithDifferentPatarameters.concreteParameters;

import strategyPatternWithDifferentPatarameters.Parameter;

public class IntegerParameter extends Parameter {

	private int value;

	public IntegerParameter(String name, int value) {
		super(name);
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
