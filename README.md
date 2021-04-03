Minimal project that demonstrates an issue that arises when upgrading from Spring Boot 2.4.1 to 2.4.2.

Running the test with Spring Boot 2.4.2 fails with a ConverterNotFoundException
"No converter found capable of converting from type [java.lang.String] to type [java.time.Duration]".

Reverting to Spring Boot 2.4.1 resolves the issue.