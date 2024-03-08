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
public class LlamaPictureService extends BaseService implements LlamaPictureClient {
public LlamaPictureService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get Llama Picture 
   * @param {Integer} llamaId - The ID of the llama to get the picture for
   */
  public String getLlamaPictureByLlamaId(Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.addPathParameter("picture")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
  /**
   * @summary Create Llama Picture 
   * @param {Integer} llamaId - The ID of the llama that this picture is for
   */
  public com.liblab.models.LlamaId createLlamaPicture(Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.addPathParameter("picture")
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.post(requestBody)
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.LlamaId>() {});
}
  /**
   * @summary Update Llama Picture 
   * @param {Integer} llamaId - The ID of the llama that this picture is for
   */
  public com.liblab.models.LlamaId updateLlamaPicture(Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.addPathParameter("picture")
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.put(requestBody)
.build();
Response response = this.execute(request);

    return ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<com.liblab.models.LlamaId>() {});
}
  /**
   * @summary Delete Llama Picture 
   * @param {Integer} llamaId - The ID of the llama to delete the picture for
   */
  public String deleteLlamaPicture(Integer llamaId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("llama")
.addPathParameter(String.valueOf(llamaId))
.addPathParameter("picture")
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