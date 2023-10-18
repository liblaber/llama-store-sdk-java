package localhost.localhost.http;

import java.util.List;
import localhost.localhost.exceptions.ApiException;

public interface UserClient {
  localhost.localhost.models.User getUserByEmail(String email) throws ApiException;
  localhost.localhost.models.User registerUser(localhost.localhost.models.UserRegistration input)
    throws ApiException;
}
