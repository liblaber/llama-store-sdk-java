package com.liblab;

import java.util.Map;
import com.liblab.services.*;
import com.liblab.Environment;
import okhttp3.OkHttpClient;
import com.liblab.http.interceptors.DefaultHeadersInterceptor;
import com.liblab.http.interceptors.BearerTokenInterceptor;
import com.liblab.http.interceptors.RetryInterceptor;

public class Llamastore {
    public LlamaService llamaService;
public LlamaPictureService llamapictureService;
public TokenService tokenService;
public UserService userService;

    private final BearerTokenInterceptor bearerTokenInterceptor = new BearerTokenInterceptor();

    
    public Llamastore() {
final String serverUrl = Environment.DEFAULT.getUrl();
final OkHttpClient httpClient = new OkHttpClient.Builder()
.addInterceptor(new DefaultHeadersInterceptor())
.addInterceptor(new RetryInterceptor())
.addInterceptor(bearerTokenInterceptor)
.build();

this.llamaService = new LlamaService(httpClient, serverUrl);
this.llamapictureService = new LlamaPictureService(httpClient, serverUrl);
this.tokenService = new TokenService(httpClient, serverUrl);
this.userService = new UserService(httpClient, serverUrl);
}

public Llamastore(String bearerToken) {
this();
setBearerToken(bearerToken);
}


    public void setBaseUrl(String url) {
this.llamaService.setBaseUrl(url);
this.llamapictureService.setBaseUrl(url);
this.tokenService.setBaseUrl(url);
this.userService.setBaseUrl(url);
}



        
    public void setBearerToken(String token) {
        this.bearerTokenInterceptor.setBearerToken(token);
    }


}

// c029837e0e474b76bc487506e8799df5e3335891efe4fb02bda7a1441840310c
