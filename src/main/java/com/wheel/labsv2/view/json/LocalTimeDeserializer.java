package com.wheel.labsv2.view.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LocalTimeDeserializer extends StdDeserializer<LocalTime> {

    public static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().parseCaseInsensitive()
        .appendPattern("hh:mm a")
        .toFormatter();
    //public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("hh:mm A");

    public LocalTimeDeserializer() {
        this(null);
    }

    public LocalTimeDeserializer(Class<LocalTime> t) {
        super(t);
    }

    @Override
    public LocalTime deserialize(
        JsonParser jp,
        DeserializationContext ctxt
    ) throws IOException {
        final JsonNode node = jp.getCodec()
            .readTree(jp);
        final String nodeText = node.asText();

        return LocalTime.parse(
            nodeText,
            FORMATTER
        );
    }
}
