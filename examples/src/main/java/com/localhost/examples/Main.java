package com.liblab.examples;

import com.liblab.exceptions.ApiException;
import com.liblab.Llamastore;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
        Object response = client.llamaService.getLlamas();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}
