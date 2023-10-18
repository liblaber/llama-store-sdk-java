

# Llamastore Java SDK 0.0.1
A Java SDK for Llamastore. 

The llama store API! Get details on all your favorite llamas.  ## To use this API  - You will need to register a user, once done you can request an API token. - You can then use your API token to get details about the llamas.  ## User registration  To register a user, send a POST request to `/user` with the following body:      ```json {      email :  <your email> ,      password :  <your password>  } ``` This API has a maximum of 1000 current users. Once this is exceeded, older users will be deleted. If your user is deleted, you will need to register again. ## Get an API token  To get an API token, send a POST request to `/user/apitoken` with the following body:      ```json {      email :  <your email> ,      password :  <your password>  } ```  This will return a token that you can use to authenticate with the API:  ```json {    access_token :  <your new token> ,    token_type :  bearer  } ```  ## Use the API token  To use the API token, add it to the `Authorization` header of your request:  ``` Authorization: Bearer <your token> ```   

- API version: 0.0.1
- SDK version: 0.0.1

## Table of Contents
- [Requirements](#requirements)
- [Installation](#installation)
    - [Dependencies](#dependencies)
- [Authentication](#authentication)
  - [Bearer Authentication](#bearer-authentication)
- [API Endpoint Services](#api-endpoint-services)
- [API Models](#api-models)
- [Testing](#testing)
- [Configuration](#configuration)
- [Sample Usage](#sample-usage)
- [License](#license)

## Requirements

- Java 8
- Maven

## Installation

If you use Maven, place the following within the <dependencies> tag in your pom.xml file:

```XML
<dependency>
  <groupId>localhost.localhost</groupId>
  <artifactId>llamastore</artifactId>
  <version>0.0.1</version>
</dependency>
```

If you use Gradle, paste the next line inside the dependencies block of your build.gradle file:

```Gradle
implementation group: "localhost.localhost", name: "Llamastore", version: "0.0.1"
```

## Authentication

To see whether an endpoint needs a specific type of authentication check the endpoint's documentation.

### Bearer Authentication
The Llamastore API uses bearer tokens as a form of authentication. You can set the bearer token when initializing the SDK through the constructor:
```Java
Llamastore sdk = new Llamastore("YOUR_BEARER_TOKEN");
```

Or through the `setBearerToken` method:
```Java
Llamastore sdk = new Llamastore();
sdk.setBearerToken("YOUR_BEARER_TOKEN");
```


## API Endpoint Services

All URIs are relative to http://localhost:8000.

Click the service name for a full list of the service methods.

| Service |
| :------ |
|[LlamaPictureService](src/main/java/localhost/localhost/services/README.md#llamapictureservice)|
|[LlamaService](src/main/java/localhost/localhost/services/README.md#llamaservice)|
|[TokenService](src/main/java/localhost/localhost/services/README.md#tokenservice)|
|[UserService](src/main/java/localhost/localhost/services/README.md#userservice)|

## API Models
[A list documenting all API models for this SDK](src/main/java/localhost/localhost//models/README.md#llamastore-models).

## Testing

Unit tests aren't available yet. When they are, you'll be able to run them with this command:

```Bash
mvn clean test
```

## Configuration

Your SDK may require some configuration changes.


This API is configured to use a security token for authorization. You should edit `examples/src/main/java/localhost/localhost/examples/Main.java` and paste your own token in place of `LLAMASTORE_BEARER_TOKEN`.


## Sample Usage

```Java
package localhost.localhost.examples;

import localhost.localhost.exceptions.ApiException;
import localhost.localhost.Llamastore;

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

```

Inside this directory is `examples/src/main/java/localhost/localhost/examples/Main.java`. It's a simple, "hello, world" level program to demonstate this SDK. Run `install.sh` to prepare the SDK for use. 

To see what other functions this SDK is capable of, look inside `src/main/java/localhost/localhost/http/*Client.java`.

## License

License: MIT. See license in LICENSE.

