package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

public abstract class JsonElement {
    /* renamed from: c */
    public boolean mo64013c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public int mo64014d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public JsonArray mo64024f() {
        if (mo64027l()) {
            return (JsonArray) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: h */
    public JsonObject mo64025h() {
        if (mo64029n()) {
            return (JsonObject) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: i */
    public JsonPrimitive mo64026i() {
        if (mo64030o()) {
            return (JsonPrimitive) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: j */
    public long mo64018j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: k */
    public String mo64019k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: l */
    public boolean mo64027l() {
        return this instanceof JsonArray;
    }

    /* renamed from: m */
    public boolean mo64028m() {
        return this instanceof JsonNull;
    }

    /* renamed from: n */
    public boolean mo64029n() {
        return this instanceof JsonObject;
    }

    /* renamed from: o */
    public boolean mo64030o() {
        return this instanceof JsonPrimitive;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            Streams.m78508b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
