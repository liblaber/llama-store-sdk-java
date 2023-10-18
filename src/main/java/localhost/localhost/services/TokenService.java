package localhost.localhost.services;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import localhost.localhost.exceptions.ApiException;
import localhost.localhost.http.*;
import localhost.localhost.http.util.HttpHeaders;
import localhost.localhost.http.util.HttpUrl;
import localhost.localhost.models.BaseModel;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TokenService extends BaseService implements TokenClient {

  public TokenService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Create Api Token
   */
  public localhost.localhost.models.ApiToken createApiToken(
    localhost.localhost.models.ApiTokenRequest input
  ) throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("token").build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<localhost.localhost.models.ApiToken>() {}
    );
  }
}
