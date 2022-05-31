package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationOutputRep extends AbstractRedoxRep {

    private String _accessToken;
    private String _expires;
    private String _refreshToken;

    public AuthenticationOutputRep() {}

    public String getAccessToken() {
        return _accessToken;
    }

    public void setAccessToken(final String accessToken) {
        _accessToken = accessToken;
    }

    public String getExpires() {
        return _expires;
    }

    public void setExpires(final String expires) {
        _expires = expires;
    }

    public String getRefreshToken() {
        return _refreshToken;
    }

    public void setRefreshToken(final String refreshToken) {
        _refreshToken = refreshToken;
    }
}
