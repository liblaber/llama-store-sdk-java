# Llamastore Services
A list of all services and services methods.
- Services

    - [LlamaPicture](#llamapicture)

    - [Llama](#llama)

    - [Token](#token)

    - [User](#user)
- [All Methods](#all-methods)


## LlamaPicture

| Method    | Description|
| :-------- | :----------| 
| [createLlamaPicture](#createllamapicture) | Create Llama Picture |
| [getLlamaPictureByLlamaId](#getllamapicturebyllamaid) | Get Llama Picture |
| [deleteLlamaPicture](#deletellamapicture) | Delete Llama Picture |
| [updateLlamaPicture](#updatellamapicture) | Update Llama Picture |


## Llama

| Method    | Description|
| :-------- | :----------| 
| [createLlama](#createllama) | Create Llama |
| [getLlamas](#getllamas) | Get Llamas |
| [getLlamaById](#getllamabyid) | Get Llama |
| [deleteLlama](#deletellama) | Delete Llama |
| [updateLlama](#updatellama) | Update Llama |


## Token

| Method    | Description|
| :-------- | :----------| 
| [createApiToken](#createapitoken) | Create Api Token |


## User

| Method    | Description|
| :-------- | :----------| 
| [getUserByEmail](#getuserbyemail) | Get User By Email |
| [registerUser](#registeruser) | Register User |


## All Methods


### **createLlamaPicture**
Create Llama Picture
- HTTP Method: POST
- Endpoint: /llama/{llama_id}/picture


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The ID of the llama that this picture is for |
| input | Object | Optional | Request body. |

**Return Type**

[LlamaId](/src/main/java/io/llamastore/models/README.md#llamaid) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaPictureService.createLlamaPicture(727836013);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getLlamaPictureByLlamaId**
Get Llama Picture
- HTTP Method: GET
- Endpoint: /llama/{llama_id}/picture


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The ID of the llama to get the picture for |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaPictureService.getLlamaPictureByLlamaId(963652236);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **deleteLlamaPicture**
Delete Llama Picture
- HTTP Method: DELETE
- Endpoint: /llama/{llama_id}/picture


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The ID of the llama to delete the picture for |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaPictureService.deleteLlamaPicture(342678448);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **updateLlamaPicture**
Update Llama Picture
- HTTP Method: PUT
- Endpoint: /llama/{llama_id}/picture


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The ID of the llama that this picture is for |
| input | Object | Optional | Request body. |

**Return Type**

[LlamaId](/src/main/java/io/llamastore/models/README.md#llamaid) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaPictureService.updateLlamaPicture(226097017);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **createLlama**
Create Llama
- HTTP Method: POST
- Endpoint: /llama


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

[Llama](/src/main/java/io/llamastore/models/README.md#llama) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaService.createLlama();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **getLlamas**
Get Llamas
- HTTP Method: GET
- Endpoint: /llama


**Parameters**

This method has no parameters.

**Return Type**

[GetLlamasResponse](/src/main/java/io/llamastore/models/README.md#getllamasresponse) 

**Example Usage Code Snippet**
```Java
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

```

### **getLlamaById**
Get Llama
- HTTP Method: GET
- Endpoint: /llama/{llama_id}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The llama's ID |

**Return Type**

[Llama](/src/main/java/io/llamastore/models/README.md#llama) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaService.getLlamaById(612308085);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **deleteLlama**
Delete Llama
- HTTP Method: DELETE
- Endpoint: /llama/{llama_id}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The llama's ID |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaService.deleteLlama(697578534);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **updateLlama**
Update Llama
- HTTP Method: PUT
- Endpoint: /llama/{llama_id}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| llamaId | Integer | Required | The llama's ID |
| input | Object | Required | Request body. |

**Return Type**

[Llama](/src/main/java/io/llamastore/models/README.md#llama) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.llamaService.updateLlama(178887299);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **createApiToken**
Create Api Token
- HTTP Method: POST
- Endpoint: /token


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

[ApiToken](/src/main/java/io/llamastore/models/README.md#apitoken) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.tokenService.createApiToken();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



### **getUserByEmail**
Get User By Email
- HTTP Method: GET
- Endpoint: /user/{email}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| email | String | Required | The user's email address |

**Return Type**

[User](/src/main/java/io/llamastore/models/README.md#user) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.userService.getUserByEmail("emailSampleValue");
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```

### **registerUser**
Register User
- HTTP Method: POST
- Endpoint: /user


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| input | Object | Required | Request body. |

**Return Type**

[User](/src/main/java/io/llamastore/models/README.md#user) 

**Example Usage Code Snippet**
```Java
package localhost.localhost.examples;

import localhost.localhost.Llamastore;
import localhost.localhost.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Llamastore client = new Llamastore(System.getenv("LLAMASTORE_BEARER_TOKEN"));
    try {
      Object response = client.userService.registerUser();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}

```



