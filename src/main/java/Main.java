public class Main {
	public static void main(String... args) {  // Role: client
		ClerkResolver clerk_1 = new CountryClerkResolver();

		Parameter[] parameters = clerk_1.getParameters();

		((StringParameter) getParameterWithName("country", parameters)).setValue("USA"); // Overwriting default value

		clerk_1.resolveClerk();
	}

	private static Parameter getParameterWithName(String paramName, Parameter[] parameters) {
		for (Parameter param : parameters)
			if (param.getName().equals(paramName))
				return param;
		throw new RuntimeException();
	}

}



//public class Main {
//	public static void main(String... args) {  // Role: client
//		ClerkResolver clerk_1 = new CountryClerkResolver();
//
//		test.Parameter[] parameters = clerk_1.getParameters();
//
//		StringParameter country = (StringParameter) parameters[0];
//		country.setValue("USA"); // Overwriting default value
//
//		clerk_1.resolveClerk();
//	}
//
//

//}
//public class Main {
//	public static void main(String... args) {  // Role: client
//		ClerkResolver clerk_1 = new CountryClerkResolver();
//
//		test.Parameter[] parameters = clerk_1.getParameters();
//
//		StringParameter country = (StringParameter) parameters[0];
//		country.setValue("USA"); // Overwriting default value
//
//		clerk_1.resolveClerk();
//	}

//}


