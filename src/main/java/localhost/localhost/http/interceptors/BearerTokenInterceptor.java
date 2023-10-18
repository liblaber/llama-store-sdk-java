package localhost.localhost.http.interceptors;

import java.io.IOException;
import lombok.Getter;
import lombok.Setter;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class BearerTokenInterceptor implements Interceptor {

  @Getter
  @Setter
  private String bearerToken;

  @Override
  public Response intercept(Chain chain) throws IOException {
    return chain.proceed(addBearerTokenToRequest(chain.request()));
  }

  private Request addBearerTokenToRequest(Request request) {
    return this.bearerToken != null && !this.bearerToken.isEmpty()
      ? request.newBuilder().addHeader("Authorization", "Bearer " + this.bearerToken).build()
      : request;
  }
}
