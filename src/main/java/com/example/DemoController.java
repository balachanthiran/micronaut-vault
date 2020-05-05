package com.example;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @Value("${test:LOCAL}")
    protected String vaultKey;

    @Get("/test")
    Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("vault-key-test", vaultKey);
        return response;
    }

}
