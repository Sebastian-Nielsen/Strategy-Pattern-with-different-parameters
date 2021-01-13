class CountryClerkResolver extends ClerkResolver {

	public CountryClerkResolver() {
		parameters = new Parameter[1];
		parameters[0] = new StringParameter("country", "Denmark"); // Default value is 'Denmark'
	}

	private String country;

	@Override
	String resolveClerk() {
		country = ((StringParameter) parameters[0]).getValue();

		// CountryClerkResolver specific code

		return country;
	}

}