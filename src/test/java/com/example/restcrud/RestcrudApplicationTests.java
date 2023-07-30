package com.example.restcrud;

import com.example.restcrud.entity.Student;
import com.example.restcrud.rest.API_RestController;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class RestcrudApplicationTests {

	@Autowired
	private API_RestController restController;

	@Test
	void contextLoads() {
		assertThat(restController.getStudent(0).getFirstName()).isEqualTo("Azhy");
	}

}
