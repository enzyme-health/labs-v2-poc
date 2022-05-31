package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerificationChallengeRep extends AbstractRedoxRep {

    @JsonProperty("challenge")
    private String _challenge;

    @JsonProperty("verification-token")
    private String _verificationToken;

    @JsonProperty("challenge")
    public String getChallenge() {
        return _challenge;
    }

    public void setChallenge(final String challenge) {
        _challenge = challenge;
    }

    @JsonProperty("verification-token")
    public String getVerificationToken() {
        return _verificationToken;
    }

    public void setVerificationToken(final String verificationToken) {
        _verificationToken = verificationToken;
    }

}
