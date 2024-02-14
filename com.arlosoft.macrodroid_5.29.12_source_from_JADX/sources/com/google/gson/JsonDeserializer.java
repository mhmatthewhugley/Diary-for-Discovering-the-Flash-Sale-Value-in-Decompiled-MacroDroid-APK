package com.google.gson;

import java.lang.reflect.Type;

public interface JsonDeserializer<T> {
    /* renamed from: a */
    T mo29657a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException;
}
