package strategyPatternWithDifferentPatarameters;

public abstract class ClerkResolver {

	protected ParameterList parameters;

	public ParameterList getParameters() throws CloneNotSupportedException {
		return parameters.clone();
	}

	abstract public String resolveClerk();

}
