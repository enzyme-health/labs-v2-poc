package com.wheel.labsv2.view.json;

import com.wheel.labsv2.view.TypedValueRep;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class VerboseTypedValueSerializer extends StdSerializer<TypedValueRep> {

    public VerboseTypedValueSerializer() {
        super(TypedValueRep.class);
    }

    @Override
    public void serialize(
        @Nullable final TypedValueRep value,
        @NotNull final JsonGenerator gen,
        @NotNull final SerializerProvider provider
    ) throws IOException {
        if (value == null) {
            gen.writeNull();
            return;
        }

        gen.writeStartObject();
        gen.writeFieldName("valueType");
        gen.writeString(
            value.getValueType()
                .name()
        );

        gen.writeFieldName("valueDouble");
        final Double asDouble = value.getValueAsDouble();
        if (asDouble != null) {
            gen.writeNumber(asDouble);
        } else {
            gen.writeNull();
        }

        gen.writeFieldName("valueString");
        final String asString = value.getValueAsString();
        if (asString != null) {
            gen.writeString(asString);
        } else {
            gen.writeNull();
        }

        gen.writeEndObject();
    }
}
