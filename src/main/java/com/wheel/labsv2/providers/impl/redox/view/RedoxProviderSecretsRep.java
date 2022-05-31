package com.wheel.labsv2.providers.impl.redox.view;

import com.wheel.labsv2.view.AbstractRep;
import io.swagger.annotations.ApiModel;

public class RedoxProviderSecretsRep extends AbstractRep {

    private String _destinationVerificationToken;
    private String _sourceApiKey;
    private String _sourceSecret;

    public RedoxProviderSecretsRep() {}

    public RedoxProviderSecretsRep(
        final String sourceApiKey,
        final String destinationVerificationToken,
        final String sourceSecret
    ) {
        _sourceApiKey = sourceApiKey;
        _destinationVerificationToken = destinationVerificationToken;
        _sourceSecret = sourceSecret;
    }

    public String getDestinationVerificationToken() {
        return _destinationVerificationToken;
    }

    public void setDestinationVerificationToken(final String destinationVerificationToken) {
        _destinationVerificationToken = destinationVerificationToken;
    }

    public String getSourceApiKey() {
        return _sourceApiKey;
    }

    public void setSourceApiKey(final String sourceApiKey) {
        _sourceApiKey = sourceApiKey;
    }

    public String getSourceSecret() {
        return _sourceSecret;
    }

    public void setSourceSecret(final String sourceSecret) {
        _sourceSecret = sourceSecret;
    }
}
