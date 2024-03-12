package com.liblab.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApiToken.Builder.class)
public class ApiToken extends com.liblab.models.BaseModel {


  @lombok.Getter
  @lombok.Setter
  @lombok.experimental.Accessors(chain = true)
  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(buildMethodName = "buildWithoutValidation", withPrefix = "set")
  public static class Builder extends com.liblab.models.BaseModel.Builder {
    static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

    static {
      java.lang.String[][] requiredFieldsGroups =
          new java.lang.String[][] {
            new java.lang.String[] {"accessToken"}
          };

      REQUIRED_FIELDS_GROUPS =
          java.util.Arrays.stream(requiredFieldsGroups)
              .map((group) -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
              .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("access_token") private java.lang.String accessToken;
    @com.fasterxml.jackson.annotation.JsonProperty("token_type") private java.lang.String tokenType;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public ApiToken build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.liblab.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public ApiToken buildWithoutValidation() {
      return new ApiToken(this);
    }

    @Override
    protected java.util.Set<String> getNonNullInstanceFieldNames() {
      // Introspect the class to get a list of all declared fields.
      return java.util.Arrays.stream(this.getClass().getDeclaredFields())
          .filter(
              (field) -> {
                try {
                  // Filter fields that are non-static and have values that are not null.
                  return !java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.get(this) != null;
                } catch (IllegalArgumentException | IllegalAccessException e) {
                  // This should never happen...

                  throw new com.liblab.exceptions.ApiException(
                      "Unexpected exception thrown while accessing instance fields.", e);
                }
              })
          .map(java.lang.reflect.Field::getName)
          .collect(java.util.stream.Collectors.toSet());
    }

    @Override
    protected java.util.Set<java.util.Set<String>> getRequiredFieldsGroups() {
      return REQUIRED_FIELDS_GROUPS;
    }
  }

  @com.fasterxml.jackson.annotation.JsonProperty("access_token") private final java.lang.String accessToken;
  @com.fasterxml.jackson.annotation.JsonProperty("token_type") private final java.lang.String tokenType;

  ApiToken(Builder builder) {
    super(builder);

    this.accessToken = builder.getAccessToken();
    this.tokenType = builder.getTokenType();
  }
}
