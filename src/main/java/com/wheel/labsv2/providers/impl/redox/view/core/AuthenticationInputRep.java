package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationInputRep extends AbstractRedoxRep {

    private String _apiKey;
    private String _secret;

    public AuthenticationInputRep() {}

    public AuthenticationInputRep(
        final String apiKey,
        final String secret
    ) {
        _apiKey = apiKey;
        _secret = secret;
    }

    public String getApiKey() {
        return _apiKey;
    }

    public void setApiKey(final String apiKey) {
        _apiKey = apiKey;
    }

    public String getSecret() {
        return _secret;
    }

    public void setSecret(final String secret) {
        _secret = secret;
    }
}
