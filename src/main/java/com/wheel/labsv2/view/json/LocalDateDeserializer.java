package com.wheel.labsv2.view.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    public LocalDateDeserializer() {
        this(null);
    }

    public LocalDateDeserializer(Class<LocalDate> t) {
        super(t);
    }

    @Override
    public LocalDate deserialize(
        JsonParser jp,
        DeserializationContext ctxt
    ) throws IOException {
        final JsonNode node = jp.getCodec()
            .readTree(jp);
        final String nodeText = node.asText();

        return LocalDate.parse(
            nodeText,
            DateTimeFormatter.ISO_LOCAL_DATE
        );
    }
}
