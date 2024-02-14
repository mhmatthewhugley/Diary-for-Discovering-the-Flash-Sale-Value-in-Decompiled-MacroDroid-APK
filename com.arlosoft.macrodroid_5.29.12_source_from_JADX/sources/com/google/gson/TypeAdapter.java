package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public abstract class TypeAdapter<T> {
    /* renamed from: a */
    public final T mo64053a(JsonElement jsonElement) {
        try {
            return mo40900c(new JsonTreeReader(jsonElement));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: b */
    public final TypeAdapter<T> mo64054b() {
        return new TypeAdapter<T>() {
            /* renamed from: c */
            public T mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return TypeAdapter.this.mo40900c(jsonReader);
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: e */
            public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                } else {
                    TypeAdapter.this.mo40901e(jsonWriter, t);
                }
            }
        };
    }

    /* renamed from: c */
    public abstract T mo40900c(JsonReader jsonReader) throws IOException;

    /* renamed from: d */
    public final JsonElement mo64055d(T t) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            mo40901e(jsonTreeWriter, t);
            return jsonTreeWriter.mo64212b();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: e */
    public abstract void mo40901e(JsonWriter jsonWriter, T t) throws IOException;
}
