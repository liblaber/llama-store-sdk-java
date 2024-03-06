package com.liblab.http;

import java.util.List;

import com.liblab.exceptions.ApiException;

public interface UserClient {

   com.liblab.models.User getUserByEmail(String email) throws ApiException;
   com.liblab.models.User registerUser(com.liblab.models.RegisterUserRequest input) throws ApiException;


}