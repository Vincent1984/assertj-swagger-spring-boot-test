# assertj-swagger-spring-boot-test



assertj-swagger : https://github.com/RobWin/assertj-swagger

Overview
assertj-swagger is a assertj library which compares a contract-first Swagger YAML/JSON file with a code-first Swagger JSON output (e.g. from springfox or JAX-RS Swagger). assertj-swagger allows to validate that the API implementation is in compliance with a contract specification for two test patterns: Documentation Driven Contracts and Consumer Driven Contracts.

The Documentation Driven Contracts test pattern, useful for public APIs, validates using #isEqualTo and will validate that the design first documentation contract matches the implementation in its entirety.

The Consumer Driven Contracts test pattern, useful for internal microservice APIs, validates using #satisfiesContract and will validate that the implementation provides, at minimum, the requirements of the design first consumer contract. This pattern allows for extension points in the API resources, resource methods, and models.

The library supports the Swagger v2.0 specification. assertj-swagger compares Swagger objects like Paths, Parameters and Definitions. It does not compare unimportant Swagger objects like info, descriptions or summaries.

Usage :

for sample test cases see :

**AssertjSwaggerDocumentationDrivenTest**
https://github.com/snikit/assertj-swagger-spring-boot-test/blob/master/src/test/java/me/snikit/assertj/swagger/demo/AssertjSwaggerDocumentationDrivenTest.java

**AssertjSwaggerConsumerDrivenTest**
https://github.com/snikit/assertj-swagger-spring-boot-test/blob/master/src/test/java/me/snikit/assertj/swagger/demo/AssertjSwaggerConsumerDrivenTest.java
