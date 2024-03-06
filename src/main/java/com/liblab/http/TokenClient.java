package com.liblab.http;

import java.util.List;

import com.liblab.exceptions.ApiException;

public interface TokenClient {

   com.liblab.models.ApiToken createApiToken(com.liblab.models.CreateApiTokenRequest input) throws ApiException;


}