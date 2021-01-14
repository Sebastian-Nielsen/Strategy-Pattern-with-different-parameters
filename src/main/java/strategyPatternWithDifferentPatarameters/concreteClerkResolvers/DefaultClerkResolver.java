package strategyPatternWithDifferentPatarameters.concreteClerkResolvers;

import strategyPatternWithDifferentPatarameters.ClerkResolver;
import strategyPatternWithDifferentPatarameters.ParameterList;
import strategyPatternWithDifferentPatarameters.concreteParameters.StringParameter;

public class DefaultClerkResolver extends ClerkResolver {

    public DefaultClerkResolver() {
        parameters = new ParameterList(1);
        parameters.add(new StringParameter("department", "someName"));
    }

    private String department;

    @Override
    public String resolveClerk() {
        department = parameters.getValueOfStringParameter("department");

		// framework.concreteClerkResolvers.DefaultClerkResolver specific code

        return department;
    }

}