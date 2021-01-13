class DefaultClerkResolver extends ClerkResolver {

    public DefaultClerkResolver() {
        parameters = new Parameter[1];
        parameters[0] = new StringParameter("department", "someName");
    }

    private String department;

    @Override
    public String resolveClerk() {
        department = ((StringParameter) parameters[0]).getValue();

		// DefaultClerkResolver specific code

        return department;
    }

}