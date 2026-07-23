package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateMockRequest;
import com.probestack.forgestudio.design.model.MockResponse;
import java.util.UUID;
import com.probestack.forgestudio.design.model.UpdateMockRequest;
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
import com.probestack.forgestudio.design.service.MockServersService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T10:25:40.019199831Z[GMT]")
@Controller
@RequestMapping("${openapi.forgeQMockServerService.base-path:}")
public class MockServersApiController implements MockServersApi {

    private static final Logger log = LoggerFactory.getLogger(MockServersApiController.class);

    private final MockServersService mockServersService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public MockServersApiController(MockServersService mockServersService, GeneratedRequestValidator generatedRequestValidator) {
        this.mockServersService = mockServersService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Void> mocksMockIdDelete(@PathVariable() UUID mockId) {
        log.info("Processing mocksMockIdDelete request");
        try {
            var response = mockServersService.mocksMockIdDelete(mockId);
            log.info("mocksMockIdDelete completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mocksMockIdDelete: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<MockResponse> mocksMockIdGet(@PathVariable() UUID mockId) {
        log.info("Processing mocksMockIdGet request");
        try {
            var response = mockServersService.mocksMockIdGet(mockId);
            log.info("mocksMockIdGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mocksMockIdGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> mocksMockIdPut(@PathVariable() UUID mockId, @RequestBody() UpdateMockRequest updateMockRequest) {
        log.info("Processing mocksMockIdPut request");
        try {
            generatedRequestValidator.validate("mocksMockIdPut", updateMockRequest);
            var response = mockServersService.mocksMockIdPut(mockId, updateMockRequest);
            log.info("mocksMockIdPut completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mocksMockIdPut: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> mocksMockIdTogglePatch(@PathVariable() UUID mockId) {
        log.info("Processing mocksMockIdTogglePatch request");
        try {
            var response = mockServersService.mocksMockIdTogglePatch(mockId);
            log.info("mocksMockIdTogglePatch completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process mocksMockIdTogglePatch: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<MockResponse>> workspacesWorkspaceIdMocksGet(@PathVariable() UUID workspaceId) {
        log.info("Processing workspacesWorkspaceIdMocksGet request");
        try {
            var response = mockServersService.workspacesWorkspaceIdMocksGet(workspaceId);
            log.info("workspacesWorkspaceIdMocksGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process workspacesWorkspaceIdMocksGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<MockResponse> workspacesWorkspaceIdMocksPost(@PathVariable() UUID workspaceId, @RequestBody() CreateMockRequest createMockRequest) {
        log.info("Processing workspacesWorkspaceIdMocksPost request");
        try {
            generatedRequestValidator.validate("workspacesWorkspaceIdMocksPost", createMockRequest);
            var response = mockServersService.workspacesWorkspaceIdMocksPost(workspaceId, createMockRequest);
            log.info("workspacesWorkspaceIdMocksPost completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process workspacesWorkspaceIdMocksPost: {}", e.getMessage(), e);
            throw e;
        }
    }
}
