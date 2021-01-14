import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	public StringParameter getStringParameterOf(String name) {
		return (StringParameter) getParameterOf(name);
	}

	public IntegerParameter getIntegerParameterOf(String name) {
		return (IntegerParameter) getParameterOf(name);
	}

	public String getValueOfStringParameter(String name) {
		return ((StringParameter) getParameterOf(name)).getValue();
	}
	
	public int getValueOfIntegerParameter(String name) {
		return ((IntegerParameter) getParameterOf(name)).getValue();
	}

	public ParameterList clone() throws CloneNotSupportedException {
		return (ParameterList) super.clone();
	}
	
}
