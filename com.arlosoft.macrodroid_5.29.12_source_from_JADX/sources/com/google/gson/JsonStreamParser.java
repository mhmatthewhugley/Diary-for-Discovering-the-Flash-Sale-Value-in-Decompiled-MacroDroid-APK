package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser implements Iterator<JsonElement> {

    /* renamed from: a */
    private final JsonReader f55815a;

    /* renamed from: c */
    private final Object f55816c;

    /* renamed from: a */
    public JsonElement next() throws JsonParseException {
        if (hasNext()) {
            try {
                return Streams.m78507a(this.f55815a);
            } catch (StackOverflowError e) {
                throw new JsonParseException("Failed parsing JSON source to Json", e);
            } catch (OutOfMemoryError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            } catch (JsonParseException e3) {
                e = e3;
                if (e.getCause() instanceof EOFException) {
                    e = new NoSuchElementException();
                }
                throw e;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        boolean z;
        synchronized (this.f55816c) {
            try {
                z = this.f55815a.peek() != JsonToken.END_DOCUMENT;
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
