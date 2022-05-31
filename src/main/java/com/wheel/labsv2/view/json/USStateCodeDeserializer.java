package com.wheel.labsv2.view.json;

import com.wheel.labsv2.constants.USStateCode;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class USStateCodeDeserializer extends StdDeserializer<USStateCode> {

    public USStateCodeDeserializer() {
        this(null);
    }

    public USStateCodeDeserializer(Class<USStateCode> t) {
        super(t);
    }

    @Override
    public USStateCode deserialize(
        final JsonParser jp,
        final DeserializationContext ctxt
    ) throws IOException {
        final JsonNode node = jp.getCodec()
            .readTree(jp);
        final String nodeText = node.asText();

        final USStateCode usStateCode = USStateCode.parseState(nodeText);
        if (usStateCode == null) {
            throw new JsonParseException(
                jp,
                nodeText + " is not a known USStateCode"
            );
        }
        return usStateCode;
    }
}
