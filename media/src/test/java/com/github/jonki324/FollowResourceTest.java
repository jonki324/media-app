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
public class FollowResourceTest {

  @Inject
  Flyway flyway;

  @BeforeEach
  public void beforeEach() {
    flyway.clean();
    flyway.migrate();
  }

  @Test
  public void testFollow() {
    var json = Map.of("userId", "1", "followedUserId", "3");
    RestAssured.given().contentType(ContentType.JSON).body(json).post("/api/media/follows").then()
        .statusCode(200).body("id",
            CoreMatchers.is(2));
  }

  @Test
  public void testUnfollow() {
    var json = Map.of("userId", "1", "followedUserId", "2", "version", "0");
    RestAssured.given().contentType(ContentType.JSON).body(json).delete("/api/media/follows").then()
        .statusCode(204);
  }

}
