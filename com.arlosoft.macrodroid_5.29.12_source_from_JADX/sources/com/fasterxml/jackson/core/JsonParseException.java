package com.fasterxml.jackson.core;

public class JsonParseException extends JsonProcessingException {
    static final long serialVersionUID = 123;

    public JsonParseException(String str, C6801d dVar) {
        super(str, dVar);
    }

    public JsonParseException(String str, C6801d dVar, Throwable th) {
        super(str, dVar, th);
    }
}
