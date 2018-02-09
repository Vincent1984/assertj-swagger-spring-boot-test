package me.snikit.assertj.swagger.demo;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.robwin.swagger.test.SwaggerAssertions;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class AssertjSwaggerDocumentationDrivenTest {
	@Test
	public void validateThatImplementationMatchesDocumentationSpecification() throws IOException {
		String swaggerPath = new ClassPathResource("swagger-v1.yaml").getFile().getPath();
		SwaggerAssertions.assertThat("http://localhost:8080/v2/api-docs").isEqualTo(swaggerPath);
	}
}