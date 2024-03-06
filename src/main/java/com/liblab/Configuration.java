package com.liblab;

public class Configuration {

    public static final String USER_AGENT = "Llamastore/0.0.3 Java/" + getJavaVersion();

    public static final String DEFAULT_API_KEY_HEADER = "X-API-KEY";

    private static String getJavaVersion() {
        return System.getProperty("java.version");
    }
}
