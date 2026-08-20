package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * UpdateMockRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T11:06:32.467428401Z[GMT]")
@Document(collection = "forgeq_mock_server_service_mock_servers")
public class UpdateMockRequest {

    private String name;

    private Boolean isPrivate;

    private Integer delayMs;

    public UpdateMockRequest name(String name) {
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

    public UpdateMockRequest isPrivate(Boolean isPrivate) {
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

    public UpdateMockRequest delayMs(Integer delayMs) {
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
        UpdateMockRequest updateMockRequest = (UpdateMockRequest) o;
        return Objects.equals(this.name, updateMockRequest.name) && Objects.equals(this.isPrivate, updateMockRequest.isPrivate) && Objects.equals(this.delayMs, updateMockRequest.delayMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isPrivate, delayMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMockRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    @Id()
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
