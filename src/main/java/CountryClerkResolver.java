import java.util.ArrayList;

class CountryClerkResolver extends ClerkResolver {

	public CountryClerkResolver() {
		int length = 3;
		parameters = new ParameterList(length);

		parameters.add(new StringParameter( "country",         "Denmark"   ));
		parameters.add(new StringParameter( "newStringParam",  "defaultVal"));
		parameters.add(new IntegerParameter("newIntegerParam", 9999        ));
	}

	private String country;
	private String newStringParam;
	private int    newIntegerParam;

	@Override
	String resolveClerk() {
		country         = parameters.getValueOfStringParameter("country");
		newStringParam  = parameters.getValueOfStringParameter("newStringParam");
		newIntegerParam = parameters.getValueOfIntegerParameter("newIntegerParam");

		// CountryClerkResolver specific code

		return country;
	}

}