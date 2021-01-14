public abstract class ClerkResolver {

	protected ParameterList parameters;

	public ParameterList getParameters() throws CloneNotSupportedException {
		return parameters.clone();
	}

	abstract String resolveClerk();

}
