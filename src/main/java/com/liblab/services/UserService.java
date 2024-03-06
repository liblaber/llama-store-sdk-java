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
public class UserService extends BaseService implements UserClient {
public UserService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get User By Email 
   * @param {String} email - The user's email address
   */
  public com.liblab.models.User getUserByEmail(String email) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("user")
.addPathParameter(String.valueOf(email))
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.User>() {});
}
  /**
   * @summary Register User 
   */
  public com.liblab.models.User registerUser(com.liblab.models.RegisterUserRequest input) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("user")
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(input)),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.post(requestBody)
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.User>() {});
}
}