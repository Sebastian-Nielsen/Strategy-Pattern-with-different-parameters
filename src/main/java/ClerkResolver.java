public abstract class ClerkResolver {

	protected Parameter[] parameters;

	public Parameter[] getParameters() {
		return parameters.clone();
	}

	abstract String resolveClerk();

}
