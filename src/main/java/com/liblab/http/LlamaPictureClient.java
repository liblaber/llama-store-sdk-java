package com.liblab.http;

import java.util.List;

import com.liblab.exceptions.ApiException;

public interface LlamaPictureClient {

   String getLlamaPictureByLlamaId(Integer llamaId) throws ApiException;
   com.liblab.models.LlamaId createLlamaPicture(Integer llamaId) throws ApiException;
   com.liblab.models.LlamaId updateLlamaPicture(Integer llamaId) throws ApiException;
   String deleteLlamaPicture(Integer llamaId) throws ApiException;


}