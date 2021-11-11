package com.github.jonki324.provider;

import io.quarkus.logging.Log;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DefaultExceptionMapper implements ExceptionMapper<Throwable> {

  @Override
  public Response toResponse(Throwable exception) {
    Log.error(exception.getMessage());
    return Response.serverError().build();
  }

}
