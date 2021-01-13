public abstract class Parameter<T> {

	private String name;

	public String getName() {
		return name;
	}

	public Parameter(String name) {
		this.name = name;
	}

	abstract public T getValue();

}
