Minimal project that demonstrates an issue that arises when upgrading from Spring Boot 2.4.1 to 2.4.2.
Scott Frederick narrowed this down to the update of Spring Data BOM 2020.0.2 to 2020.0.3 
(see https://github.com/spring-projects/spring-boot/issues/25878). I have found
that updating Spring Data JDBC from 2.1.2 to 2.1.3 causes the issue.

Running the test with Spring Data JDBC 2.1.3 fails with a ConverterNotFoundException
"No converter found capable of converting from type [java.lang.String] to type [java.time.Duration]".

Reverting to Spring Data JDBC 2.1.2 resolves the issue.