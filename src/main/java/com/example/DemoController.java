package com.example;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @Value("${test:LOCAL}")
    protected String vaultBackendKey;

    @Value("${encryption-key:LOCAL}")
    protected String vaultBackendKvVersion;

    @Value("${test-encryption-key:LOCAL}")
    protected String vaultBackendName;

    @Get("/test")
    Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("vault-backend-key-one", vaultBackendKey);
        response.put("vault-backend-kv-version", vaultBackendKvVersion);
        response.put("vault-backend-name", vaultBackendName);
        return response;
    }

}
