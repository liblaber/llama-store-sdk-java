package localhost.localhost.http;

import java.util.List;
import localhost.localhost.exceptions.ApiException;

public interface LlamaClient {
  java.util.List<localhost.localhost.models.Llama> getLlamas() throws ApiException;
  localhost.localhost.models.Llama createLlama(localhost.localhost.models.LlamaCreate input)
    throws ApiException;
  localhost.localhost.models.Llama getLlamaById(Integer llamaId) throws ApiException;
  localhost.localhost.models.Llama updateLlama(
    localhost.localhost.models.LlamaCreate input,
    Integer llamaId
  ) throws ApiException;
  String deleteLlama(Integer llamaId) throws ApiException;
}
