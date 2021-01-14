import java.util.ArrayList;
import java.util.List;

public class ParameterList {

	private final List<Parameter> parameters;

	public ParameterList(int length) {
		this.parameters = new ArrayList<>(length);
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
	// The liability of ParameterList is that we have to write a lot of boilerplate getter methods.
	// However, because most parameter to any strategy class is a primitive type (or String), we don't
	// have to continiously add new methods; this is thus acceptable.

	// === A getter for each type of {@code Parameter} is needed ~~~~~~~~~~~~~~~~~~~~~~~~
	public StringParameter getStringParameterOf(String name) {
		return (StringParameter) getParameterOf(name);
	}

	public IntegerParameter getIntegerParameterOf(String name) {
		return (IntegerParameter) getParameterOf(name);
	}

	// === A value of each type of {@code Parameter} is needed ~~~~~~~~~~~~~~~~~~~~~~~~
	public String getValueOfStringParameter(String name) {
		return ((StringParameter) getParameterOf(name)).getValue();
	}

	public int getValueOfIntegerParameter(String name) {
		return ((IntegerParameter) getParameterOf(name)).getValue();
	}

	// =================================================== ~~~~~~~~~~~~~~~~~~~~~~~~


	public ParameterList clone() throws CloneNotSupportedException {
		return (ParameterList) super.clone();
	}
	
}
