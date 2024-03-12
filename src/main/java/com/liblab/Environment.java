package com.liblab;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Environment {
    DEFAULT("http://localhost:8080");

    private final String url;

    public String getUrl() {
        return this.url;
    }
}
