package com.google.gson;

import java.lang.reflect.Type;

public interface JsonSerializer<T> {
    /* renamed from: b */
    JsonElement mo40892b(T t, Type type, JsonSerializationContext jsonSerializationContext);
}
