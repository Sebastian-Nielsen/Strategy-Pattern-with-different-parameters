package strategyPatternWithDifferentPatarameters;

import strategyPatternWithDifferentPatarameters.concreteClerkResolvers.CountryClerkResolver;

public class Client {
	public static void main(String... args) throws CloneNotSupportedException {  // Role: client
		ClerkResolver clerk_1 = new CountryClerkResolver();

		ParameterList parameters = clerk_1.getParameters();

		parameters.getStringParameterOf( "country"        ).setValue("USA");
		parameters.getStringParameterOf( "newStringParam" ).setValue("someValue");
		parameters.getIntegerParameterOf("newIntegerParam").setValue(1234);

		clerk_1.resolveClerk();
	}


}



//public class framework.Client {
//	public static void main(String... args) {  // Role: client
//		framework.ClerkResolver clerk_1 = new framework.concreteClerkResolvers.CountryClerkResolver();
//
//		test.framework.Parameter[] parameters = clerk_1.getParameters();
//
//		framework.Parameter.StringParameter country = (framework.Parameter.StringParameter) parameters[0];
//		country.setValue("USA"); // Overwriting default value
//
//		clerk_1.resolveClerk();
//	}
//
//

//}
//public class framework.Client {
//	public static void main(String... args) {  // Role: client
//		framework.ClerkResolver clerk_1 = new framework.concreteClerkResolvers.CountryClerkResolver();
//
//		test.framework.Parameter[] parameters = clerk_1.getParameters();
//
//		framework.Parameter.StringParameter country = (framework.Parameter.StringParameter) parameters[0];
//		country.setValue("USA"); // Overwriting default value
//
//		clerk_1.resolveClerk();
//	}

//}


