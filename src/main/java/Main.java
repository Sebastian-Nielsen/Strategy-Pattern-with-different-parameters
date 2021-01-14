


public class Main {
	public static void main(String... args) throws CloneNotSupportedException {  // Role: client
		ClerkResolver clerk_1 = new CountryClerkResolver();

		ParameterList parameters = clerk_1.getParameters();

		parameters.getStringParameterOf( "country"        ).setValue("USA");
		parameters.getStringParameterOf( "newStringParam" ).setValue("someValue");
		parameters.getIntegerParameterOf("newIntegerParam").setValue(1234);

		clerk_1.resolveClerk();
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


