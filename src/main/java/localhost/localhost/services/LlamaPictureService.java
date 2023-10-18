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

public class LlamaPictureService extends BaseService implements LlamaPictureClient {

  public LlamaPictureService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Get Llama Picture
   * @param {Integer} llamaId - The ID of the llama to get the picture for
   */
  public String getLlamaPictureByLlamaId(Integer llamaId) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("llama")
      .addPathParameter(String.valueOf(llamaId))
      .addPathParameter("picture")
      .build();
    Request request = new Request.Builder().url(url).get().build();
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
  public localhost.localhost.models.LlamaId createLlamaPicture(Integer llamaId)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("llama")
      .addPathParameter(String.valueOf(llamaId))
      .addPathParameter("picture")
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<localhost.localhost.models.LlamaId>() {}
    );
  }

  /**
   * @summary Update Llama Picture
   * @param {Integer} llamaId - The ID of the llama that this picture is for
   */
  public localhost.localhost.models.LlamaId updateLlamaPicture(Integer llamaId)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("llama")
      .addPathParameter(String.valueOf(llamaId))
      .addPathParameter("picture")
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).put(requestBody).build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<localhost.localhost.models.LlamaId>() {}
    );
  }

  /**
   * @summary Delete Llama Picture
   * @param {Integer} llamaId - The ID of the llama to delete the picture for
   */
  public String deleteLlamaPicture(Integer llamaId) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("llama")
      .addPathParameter(String.valueOf(llamaId))
      .addPathParameter("picture")
      .build();
    Request request = new Request.Builder().url(url).delete().build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
