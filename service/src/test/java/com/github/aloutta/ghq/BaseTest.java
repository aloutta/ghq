package com.github.aloutta.ghq;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.PostgreSQLContainer;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {

  static PostgreSQLContainer<?> container =
      new PostgreSQLContainer<>("postgres:16.4")
          .withDatabaseName("testdb")
          .withUsername("test")
          .withPassword("test");

  static {
    container.start();
    System.setProperty("spring.datasource.url", container.getJdbcUrl());
    System.setProperty("spring.datasource.username", container.getUsername());
    System.setProperty("spring.datasource.password", container.getPassword());
  }

  @LocalServerPort private int port;

  @BeforeAll
  void setUp() {
    RestAssured.port = port;
    RestAssured.basePath = "/api/v1";
  }
}
