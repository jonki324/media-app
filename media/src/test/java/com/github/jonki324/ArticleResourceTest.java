package com.github.jonki324;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.Map;
import javax.inject.Inject;
import org.flywaydb.core.Flyway;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ArticleResourceTest {

  @Inject
  Flyway flyway;

  @BeforeEach
  public void beforeEach() {
    flyway.clean();
    flyway.migrate();
  }

  @Test
  public void testGetAll() {
    RestAssured.given().contentType(ContentType.JSON).when().get("/api/media/articles").then()
        .statusCode(200).body("size()",
            CoreMatchers.is(3));
  }

  @Test
  public void testGetById() {
    RestAssured.given().contentType(ContentType.JSON).when().get("/api/media/articles/2").then()
        .statusCode(200).body("id", CoreMatchers.is(2));
  }

  @Test
  public void testCreate() {
    var json = Map.of("title", "title4", "body", "body4", "authorId", "1");
    RestAssured.given().contentType(ContentType.JSON).body(json).when().post("/api/media/articles").then()
        .statusCode(200).body("id", CoreMatchers.is(4));
  }

  @Test
  public void testUpdate() {
    var json = Map.of("id", "2", "title", "title2 update", "body", "body2 update", "authorId", "1", "version", "0");
    RestAssured.given().contentType(ContentType.JSON).body(json).when().put("/api/media/articles/2").then()
        .statusCode(200).body("title", CoreMatchers.equalTo("title2 update"));
  }

  @Test
  public void testDelete() {
    var json = Map.of("id", "2", "title", "title2", "body", "body2", "authorId", "1", "version", "0");
    RestAssured.given().contentType(ContentType.JSON).body(json).when().delete("/api/media/articles/2")
        .then()
        .statusCode(204);
  }

}
