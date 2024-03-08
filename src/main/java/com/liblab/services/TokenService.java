package com.liblab.services;

import java.util.Map;
import java.io.IOException;
import com.liblab.exceptions.ApiException;
import com.liblab.models.BaseModel;
import java.util.List;
import java.util.Objects;
import com.liblab.http.*;
import okhttp3.Headers;
import com.liblab.http.util.HttpUrl;
import com.liblab.http.util.HttpHeaders;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public class TokenService extends BaseService implements TokenClient {
public TokenService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Create Api Token 
   */
  public com.liblab.models.ApiToken createApiToken(com.liblab.models.CreateApiTokenRequest input) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("token")
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(input)),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.post(requestBody)
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.ApiToken>() {});
}
}