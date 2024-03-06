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
public class LlamaService extends BaseService implements LlamaClient {
public LlamaService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get Llamas 
   */
  public java.util.List<com.liblab.models.Llama> getLlamas() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<com.liblab.models.Llama>>() {});
}
  /**
   * @summary Create Llama 
   */
  public com.liblab.models.Llama createLlama(com.liblab.models.CreateLlamaRequest input) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(input)),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.post(requestBody)
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.Llama>() {});
}
  /**
   * @summary Get Llama 
   * @param {Integer} llamaId - The llama's ID
   */
  public com.liblab.models.Llama getLlamaById(Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.Llama>() {});
}
  /**
   * @summary Update Llama 
   * @param {Integer} llamaId - The llama's ID
   */
  public com.liblab.models.Llama updateLlama(com.liblab.models.UpdateLlamaRequest input, Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(input)),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.put(requestBody)
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.Llama>() {});
}
  /**
   * @summary Delete Llama 
   * @param {Integer} llamaId - The llama's ID
   */
  public String deleteLlama(Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.build();
Request request = new Request.Builder().url(url)
.delete()
.build();
Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
}