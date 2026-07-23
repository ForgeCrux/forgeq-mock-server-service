package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateMockRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T10:25:40.019199831Z[GMT]")public class CreateMockRequest {

  private String name;

  private UUID collectionId;

  private Boolean isPrivate;

  private Integer delayMs;

  public CreateMockRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateMockRequest(String name, UUID collectionId) {
    this.name = name;
    this.collectionId = collectionId;
  }

  public CreateMockRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull   @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateMockRequest collectionId(UUID collectionId) {
    this.collectionId = collectionId;
    return this;
  }

  /**
   * Get collectionId
   * @return collectionId
  */
  @NotNull @Valid   @Schema(name = "collectionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("collectionId")
  public UUID getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(UUID collectionId) {
    this.collectionId = collectionId;
  }

  public CreateMockRequest isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

  /**
   * Get isPrivate
   * @return isPrivate
  */
    @Schema(name = "isPrivate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPrivate")
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public CreateMockRequest delayMs(Integer delayMs) {
    this.delayMs = delayMs;
    return this;
  }

  /**
   * Get delayMs
   * @return delayMs
  */
    @Schema(name = "delayMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delayMs")
  public Integer getDelayMs() {
    return delayMs;
  }

  public void setDelayMs(Integer delayMs) {
    this.delayMs = delayMs;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMockRequest createMockRequest = (CreateMockRequest) o;
    return Objects.equals(this.name, createMockRequest.name) &&
        Objects.equals(this.collectionId, createMockRequest.collectionId) &&
        Objects.equals(this.isPrivate, createMockRequest.isPrivate) &&
        Objects.equals(this.delayMs, createMockRequest.delayMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, collectionId, isPrivate, delayMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMockRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    delayMs: ").append(toIndentedString(delayMs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

