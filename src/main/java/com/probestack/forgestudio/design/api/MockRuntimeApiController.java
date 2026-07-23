package com.probestack.forgestudio.design.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.MockRuntimeService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T10:25:40.019199831Z[GMT]")
@Controller
@RequestMapping("${openapi.forgeQMockServerService.base-path:}")
public class MockRuntimeApiController implements MockRuntimeApi {

    private static final Logger log = LoggerFactory.getLogger(MockRuntimeApiController.class);

    private final MockRuntimeService mockRuntimeService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public MockRuntimeApiController(MockRuntimeService mockRuntimeService, GeneratedRequestValidator generatedRequestValidator) {
        this.mockRuntimeService = mockRuntimeService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Void> mockMockUrlPathDelete(@PathVariable() String mockUrl, @PathVariable() String path) {
        log.info("Processing mockMockUrlPathDelete request");
        try {
            var response = mockRuntimeService.mockMockUrlPathDelete(mockUrl, path);
            log.info("mockMockUrlPathDelete completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mockMockUrlPathDelete: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> mockMockUrlPathGet(@PathVariable() String mockUrl, @PathVariable() String path) {
        log.info("Processing mockMockUrlPathGet request");
        try {
            var response = mockRuntimeService.mockMockUrlPathGet(mockUrl, path);
            log.info("mockMockUrlPathGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mockMockUrlPathGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> mockMockUrlPathPost(@PathVariable() String mockUrl, @PathVariable() String path) {
        log.info("Processing mockMockUrlPathPost request");
        try {
            var response = mockRuntimeService.mockMockUrlPathPost(mockUrl, path);
            log.info("mockMockUrlPathPost completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process mockMockUrlPathPost: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> mockMockUrlPathPut(@PathVariable() String mockUrl, @PathVariable() String path) {
        log.info("Processing mockMockUrlPathPut request");
        try {
            var response = mockRuntimeService.mockMockUrlPathPut(mockUrl, path);
            log.info("mockMockUrlPathPut completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mockMockUrlPathPut: {}", e.getMessage(), e);
            throw e;
        }
    }
}
