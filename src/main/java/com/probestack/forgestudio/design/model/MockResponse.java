package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MockResponse
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T10:25:40.019199831Z[GMT]")public class MockResponse {

  private UUID id;

  private UUID workspaceId;

  private UUID collectionId;

  private String name;

  private String mockUrl;

  private Boolean isPrivate;

  private Integer delayMs;

  private Integer requestCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public MockResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid   @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MockResponse workspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * Get workspaceId
   * @return workspaceId
  */
  @Valid   @Schema(name = "workspaceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspaceId")
  public UUID getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
  }

  public MockResponse collectionId(UUID collectionId) {
    this.collectionId = collectionId;
    return this;
  }

  /**
   * Get collectionId
   * @return collectionId
  */
  @Valid   @Schema(name = "collectionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collectionId")
  public UUID getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(UUID collectionId) {
    this.collectionId = collectionId;
  }

  public MockResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MockResponse mockUrl(String mockUrl) {
    this.mockUrl = mockUrl;
    return this;
  }

  /**
   * Get mockUrl
   * @return mockUrl
  */
    @Schema(name = "mockUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mockUrl")
  public String getMockUrl() {
    return mockUrl;
  }

  public void setMockUrl(String mockUrl) {
    this.mockUrl = mockUrl;
  }

  public MockResponse isPrivate(Boolean isPrivate) {
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

  public MockResponse delayMs(Integer delayMs) {
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

  public MockResponse requestCount(Integer requestCount) {
    this.requestCount = requestCount;
    return this;
  }

  /**
   * Get requestCount
   * @return requestCount
  */
    @Schema(name = "requestCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestCount")
  public Integer getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Integer requestCount) {
    this.requestCount = requestCount;
  }

  public MockResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MockResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockResponse mockResponse = (MockResponse) o;
    return Objects.equals(this.id, mockResponse.id) &&
        Objects.equals(this.workspaceId, mockResponse.workspaceId) &&
        Objects.equals(this.collectionId, mockResponse.collectionId) &&
        Objects.equals(this.name, mockResponse.name) &&
        Objects.equals(this.mockUrl, mockResponse.mockUrl) &&
        Objects.equals(this.isPrivate, mockResponse.isPrivate) &&
        Objects.equals(this.delayMs, mockResponse.delayMs) &&
        Objects.equals(this.requestCount, mockResponse.requestCount) &&
        Objects.equals(this.createdAt, mockResponse.createdAt) &&
        Objects.equals(this.updatedAt, mockResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workspaceId, collectionId, name, mockUrl, isPrivate, delayMs, requestCount, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mockUrl: ").append(toIndentedString(mockUrl)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    delayMs: ").append(toIndentedString(delayMs)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

