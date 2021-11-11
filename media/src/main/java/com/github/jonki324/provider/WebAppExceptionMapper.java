package com.github.jonki324.provider;

import io.quarkus.logging.Log;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WebAppExceptionMapper implements ExceptionMapper<WebApplicationException> {

  @Override
  public Response toResponse(WebApplicationException exception) {
    Log.error(exception.getMessage());
    return exception.getResponse();
  }

}
