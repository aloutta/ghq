package com.github.aloutta.ghq.persistence.service;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.aloutta.ghq.BaseTest;
import com.github.aloutta.ghq.persistence.model.Country;
import com.github.aloutta.ghq.persistence.repository.CountryRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CountryServiceTest extends BaseTest {

  private static final List<String> EXPECTED_ALPHA2_CODES = List.of("AF");

  @Autowired private CountryRepository countryRepository;

  @Test
  void getCountryByIdTest() {
    given()
        .when()
        .get("/countries/1")
        .then()
        .statusCode(200)
        .body("id", equalTo(1))
        .body("alpha2", equalTo("AF"))
        .body("alpha3", equalTo("AFG"));
  }

  @Test
  void getCountriesTest() {
    var responseBody =
        given()
            .when()
            .queryParam("page", 0)
            .queryParam("size", 1)
            .get("/countries")
            .then()
            .statusCode(200)
            .extract()
            .response()
            .body()
            .jsonPath();

    assertEquals(countryRepository.count(), responseBody.getLong("totalElements"));
    assertTrue(responseBody.getBoolean("first"));

    List<Country> countries = responseBody.getList("content", Country.class);
    assertTrue(
        countries.stream()
            .allMatch(country -> EXPECTED_ALPHA2_CODES.contains(country.getAlpha2())));
  }
}
