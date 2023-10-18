package localhost.localhost;

import java.util.Map;
import localhost.localhost.Environment;
import localhost.localhost.http.interceptors.BearerTokenInterceptor;
import localhost.localhost.http.interceptors.DefaultHeadersInterceptor;
import localhost.localhost.http.interceptors.RetryInterceptor;
import localhost.localhost.services.*;
import okhttp3.OkHttpClient;

public class Llamastore {

  public LlamaPictureService llamapictureService;
  public LlamaService llamaService;
  public TokenService tokenService;
  public UserService userService;

  private final BearerTokenInterceptor bearerTokenInterceptor = new BearerTokenInterceptor();

  public Llamastore() {
    final String serverUrl = Environment.DEFAULT.getUrl();
    final OkHttpClient httpClient = new OkHttpClient.Builder()
      .addInterceptor(new DefaultHeadersInterceptor())
      .addInterceptor(new RetryInterceptor())
      .addInterceptor(bearerTokenInterceptor)
      .build();

    this.llamapictureService = new LlamaPictureService(httpClient, serverUrl);
    this.llamaService = new LlamaService(httpClient, serverUrl);
    this.tokenService = new TokenService(httpClient, serverUrl);
    this.userService = new UserService(httpClient, serverUrl);
  }

  public Llamastore(String bearerToken) {
    this();
    setBearerToken(bearerToken);
  }

  public void setBaseUrl(String url) {
    this.llamapictureService.setBaseUrl(url);
    this.llamaService.setBaseUrl(url);
    this.tokenService.setBaseUrl(url);
    this.userService.setBaseUrl(url);
  }

  public void setBearerToken(String token) {
    this.bearerTokenInterceptor.setBearerToken(token);
  }
}
