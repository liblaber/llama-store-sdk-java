package com.liblab.http;

import java.util.List;

import com.liblab.exceptions.ApiException;

public interface LlamaClient {

   java.util.List<com.liblab.models.Llama> getLlamas() throws ApiException;
   com.liblab.models.Llama createLlama(com.liblab.models.CreateLlamaRequest input) throws ApiException;
   com.liblab.models.Llama getLlamaById(Integer llamaId) throws ApiException;
   com.liblab.models.Llama updateLlama(com.liblab.models.UpdateLlamaRequest input, Integer llamaId) throws ApiException;
   String deleteLlama(Integer llamaId) throws ApiException;


}