package com.wheel.labsv2.view.json;

import com.wheel.labsv2.constants.USStateCode;
import com.wheel.labsv2.utils.UpperString;
import com.wheel.labsv2.view.TypedValueRep;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WObjectMapperFactory {

    public static ObjectMapper getDataWarehouseObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        // ----------------------------------------------------------------
        // CUSTOM SERIALIZERS & DESERIALIZERS CAN BE REGISTERED HERE
        // ----------------------------------------------------------------
        final SimpleModule module = getBasicModule();
        mapper.registerModule(module);

        module.addSerializer(
            TypedValueRep.class,
            new VerboseTypedValueSerializer()
        );

        final SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter(
            "dataWarehouse",
            new DataWarehousePropertyFilter()
        );
        mapper.setFilterProvider(filterProvider);

        return mapper;
    }

    public static ObjectMapper getObjectMapper() {

        final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        // ----------------------------------------------------------------
        // CUSTOM SERIALIZERS & DESERIALIZERS CAN BE REGISTERED HERE
        // ----------------------------------------------------------------
        final SimpleModule module = getBasicModule();
        mapper.registerModule(module);

        final SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter(
            "dataWarehouse",
            SimpleBeanPropertyFilter.serializeAll()
        );
        mapper.setFilterProvider(filterProvider);

        return mapper;
    }

    private static @NotNull SimpleModule getBasicModule() {
        final SimpleModule module = new SimpleModule();

        // ----------------------------------------------------------------
        // DESERIALIZERS
        // ----------------------------------------------------------------
        module.addDeserializer(
            UpperString.class,
            new UpperStringDeserializer()
        );
        module.addDeserializer(
            USStateCode.class,
            new USStateCodeDeserializer()
        );
        module.addDeserializer(
            LocalTime.class,
            new LocalTimeDeserializer()
        );
        module.addDeserializer(
            LocalDate.class,
            new LocalDateDeserializer()
        );
        module.addDeserializer(
            LocalDateTime.class,
            new LocalDateTimeDeserializer()
        );
        module.addDeserializer(
            Instant.class,
            new InstantDeserializer()
        );

        // ----------------------------------------------------------------
        // SERIALIZERS
        // ----------------------------------------------------------------

        module.addSerializer(
            Instant.class,
            new InstantSerializer()
        );
        module.addSerializer(
            LocalDate.class,
            new LocalDateSerializer()
        );
        module.addSerializer(
            LocalDateTime.class,
            new LocalDateTimeSerializer()
        );
        module.addSerializer(
            LocalTime.class,
            new LocalTimeSerializer()
        );
        module.addSerializer(
            Instant.class,
            new InstantSerializer()
        );
        module.addSerializer(
            UpperString.class,
            new UpperStringSerializer()
        );
        module.addSerializer(
            USStateCode.class,
            new USStateCodeSerializer()
        );

        return module;
    }

    public static final class DataWarehousePropertyFilter extends SimpleBeanPropertyFilter {

        @Override
        protected boolean include(PropertyWriter writer) {
            return writer.getAnnotation(JSONFilterDataWarehouse.class) == null;
        }
    }
}
