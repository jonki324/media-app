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
public class CommentResourceTest {

  @Inject
  Flyway flyway;

  @BeforeEach
  public void beforeEach() {
    flyway.clean();
    flyway.migrate();
  }

  @Test
  public void testCreate() {
    var json = Map.of("body", "body1", "authorId", "1", "articleId", "1");
    RestAssured.given().contentType(ContentType.JSON).body(json).when().post("/api/media/comments")
        .then().statusCode(200).body("id",
            CoreMatchers.is(1));
  }

}
