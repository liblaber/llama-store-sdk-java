package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaService.getLlamas();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
