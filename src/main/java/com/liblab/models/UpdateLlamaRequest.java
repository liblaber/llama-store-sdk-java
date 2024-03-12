package com.liblab.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateLlamaRequest.Builder.class)
public class UpdateLlamaRequest extends com.liblab.models.BaseModel {


  @lombok.Getter
  @lombok.Setter
  @lombok.experimental.Accessors(chain = true)
  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(buildMethodName = "buildWithoutValidation", withPrefix = "set")
  public static class Builder extends com.liblab.models.BaseModel.Builder {
    static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

    static {
      java.lang.String[][] requiredFieldsGroups =
          new java.lang.String[][] {
            new java.lang.String[] {"age", "color", "name", "rating"}
          };

      REQUIRED_FIELDS_GROUPS =
          java.util.Arrays.stream(requiredFieldsGroups)
              .map((group) -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
              .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("age") private java.lang.Long age;
    @com.fasterxml.jackson.annotation.JsonProperty("color") private java.lang.String color;
    @com.fasterxml.jackson.annotation.JsonProperty("name") private java.lang.String name;
    @com.fasterxml.jackson.annotation.JsonProperty("rating") private java.lang.Long rating;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public UpdateLlamaRequest build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.liblab.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public UpdateLlamaRequest buildWithoutValidation() {
      return new UpdateLlamaRequest(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("age") private final java.lang.Long age;
  @com.fasterxml.jackson.annotation.JsonProperty("color") private final java.lang.String color;
  @com.fasterxml.jackson.annotation.JsonProperty("name") private final java.lang.String name;
  @com.fasterxml.jackson.annotation.JsonProperty("rating") private final java.lang.Long rating;

  UpdateLlamaRequest(Builder builder) {
    super(builder);

    this.age = builder.getAge();
    this.color = builder.getColor();
    this.name = builder.getName();
    this.rating = builder.getRating();
  }
}
