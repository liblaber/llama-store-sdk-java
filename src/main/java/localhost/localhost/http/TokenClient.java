package localhost.localhost.http;

import java.util.List;
import localhost.localhost.exceptions.ApiException;

public interface TokenClient {
  localhost.localhost.models.ApiToken createApiToken(
    localhost.localhost.models.ApiTokenRequest input
  ) throws ApiException;
}
