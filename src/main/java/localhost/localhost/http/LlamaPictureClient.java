package localhost.localhost.http;

import java.util.List;
import localhost.localhost.exceptions.ApiException;

public interface LlamaPictureClient {
  String getLlamaPictureByLlamaId(Integer llamaId) throws ApiException;
  localhost.localhost.models.LlamaId createLlamaPicture(Integer llamaId) throws ApiException;
  localhost.localhost.models.LlamaId updateLlamaPicture(Integer llamaId) throws ApiException;
  String deleteLlamaPicture(Integer llamaId) throws ApiException;
}
