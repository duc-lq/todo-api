package com.ducle.springanddocker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TodoControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetTodos(){
        ResponseEntity<String> response = restTemplate.getForEntity("/todos", String.class);
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void testAddTodo(){
        String todo = "{\"task\" : \"Test CI/CD\"}";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(todo, headers);
        ResponseEntity<String> response = restTemplate.postForEntity("/todos", request, String.class);
        assertEquals(201, response.getStatusCode().value());
    }


}
