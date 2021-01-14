package strategyPatternWithDifferentPatarameters;

import strategyPatternWithDifferentPatarameters.concreteParameters.IntegerParameter;
import strategyPatternWithDifferentPatarameters.concreteParameters.StringParameter;

import java.util.ArrayList;
import java.util.List;

public class ParameterList {

	private final List<Parameter> parameters;

	public ParameterList(int length) {
		this.parameters = new ArrayList<>(length);
	}

	private ParameterList(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	public void add(Parameter p) {
		parameters.add(p);
	}
	
	private Parameter getParameterOf(String name) {
		return parameters.stream()
							.filter(p -> p.getName().equals(name))
							.findFirst()
							.orElse(null);
	}



	// =================================================== ~~~~~~~~~~~~~~~~~~~~~~~~
	// The liability of framework.ParameterList is that we have to write a lot of boilerplate getter methods.
	// However, because most parameter to any strategy class is a primitive type (or String), we don't
	// have to continiously add new methods; this is thus acceptable.

	// === A getter for each type of {@code framework.Parameter} is needed ~~~~~~~~~~~~~~~~~~~~~~~~
	public StringParameter getStringParameterOf(String name) {
		return (StringParameter) getParameterOf(name);
	}

	public IntegerParameter getIntegerParameterOf(String name) {
		return (IntegerParameter) getParameterOf(name);
	}

	// === A value of each type of {@code framework.Parameter} is needed ~~~~~~~~~~~~~~~~~~~~~~~~
	public String getValueOfStringParameter(String name) {
		return ((StringParameter) getParameterOf(name)).getValue();
	}

	public int getValueOfIntegerParameter(String name) {
		return ((IntegerParameter) getParameterOf(name)).getValue();
	}

	// =================================================== ~~~~~~~~~~~~~~~~~~~~~~~~


	public ParameterList clone() {
		return new ParameterList(parameters);
	}
	
}
