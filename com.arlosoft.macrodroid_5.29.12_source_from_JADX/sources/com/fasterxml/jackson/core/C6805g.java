package com.fasterxml.jackson.core;

/* renamed from: com.fasterxml.jackson.core.g */
/* compiled from: JsonToken */
public enum C6805g {
    NOT_AVAILABLE((String) null),
    START_OBJECT("{"),
    END_OBJECT("}"),
    START_ARRAY("["),
    END_ARRAY("]"),
    FIELD_NAME((String) null),
    VALUE_EMBEDDED_OBJECT((String) null),
    VALUE_STRING((String) null),
    VALUE_NUMBER_INT((String) null),
    VALUE_NUMBER_FLOAT((String) null),
    VALUE_TRUE("true"),
    VALUE_FALSE("false"),
    VALUE_NULL("null");
    
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    private C6805g(String str) {
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
            return;
        }
        this._serialized = str;
        char[] charArray = str.toCharArray();
        this._serializedChars = charArray;
        int length = charArray.length;
        this._serializedBytes = new byte[length];
        for (int i = 0; i < length; i++) {
            this._serializedBytes[i] = (byte) this._serializedChars[i];
        }
    }

    /* renamed from: b */
    public String mo33884b() {
        return this._serialized;
    }
}
