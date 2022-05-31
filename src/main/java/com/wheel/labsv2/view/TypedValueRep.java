package com.wheel.labsv2.view;

import com.wheel.labsv2.constants.DataValueType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class TypedValueRep extends AbstractRep {

    private Object _value;
    private DataValueType _valueType;

    public TypedValueRep() {}

    public TypedValueRep(
        final Object value,
        final DataValueType valueType
    ) {
        _value = value;
        _valueType = valueType;
    }

    public Object getValue() {
        return _value;
    }

    public void setValue(final Object value) {
        _value = value;
    }

    @JsonIgnore
    public Double getValueAsDouble() {
        return _valueType == DataValueType.DOUBLE ? (Double)_value : null;
    }

    @JsonIgnore
    public String getValueAsString() {
        return _valueType == DataValueType.STRING ? (String)_value : null;
    }

    public DataValueType getValueType() {
        return _valueType;
    }

    public void setValueType(final DataValueType valueType) {
        _valueType = valueType;
    }
}
