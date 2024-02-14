package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final JsonSerializer<T> f55959a;

    /* renamed from: b */
    private final JsonDeserializer<T> f55960b;

    /* renamed from: c */
    final Gson f55961c;

    /* renamed from: d */
    private final TypeToken<T> f55962d;

    /* renamed from: e */
    private final TypeAdapterFactory f55963e;

    /* renamed from: f */
    private final TreeTypeAdapter<T>.GsonContextImpl f55964f = new GsonContextImpl();

    /* renamed from: g */
    private TypeAdapter<T> f55965g;

    private final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        private GsonContextImpl() {
        }

        /* renamed from: a */
        public JsonElement mo64048a(Object obj, Type type) {
            return TreeTypeAdapter.this.f55961c.mo63991y(obj, type);
        }

        /* renamed from: b */
        public <R> R mo64023b(JsonElement jsonElement, Type type) throws JsonParseException {
            return TreeTypeAdapter.this.f55961c.mo63973g(jsonElement, type);
        }
    }

    private static final class SingleTypeFactory implements TypeAdapterFactory {

        /* renamed from: a */
        private final TypeToken<?> f55967a;

        /* renamed from: c */
        private final boolean f55968c;

        /* renamed from: d */
        private final Class<?> f55969d;

        /* renamed from: f */
        private final JsonSerializer<?> f55970f;

        /* renamed from: g */
        private final JsonDeserializer<?> f55971g;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            JsonDeserializer<?> jsonDeserializer = null;
            JsonSerializer<?> jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f55970f = jsonSerializer;
            jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : jsonDeserializer;
            this.f55971g = jsonDeserializer;
            C$Gson$Preconditions.m78399a((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.f55967a = typeToken;
            this.f55968c = z;
            this.f55969d = cls;
        }

        /* renamed from: a */
        public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
            boolean z;
            TypeToken<?> typeToken2 = this.f55967a;
            if (typeToken2 != null) {
                z = typeToken2.equals(typeToken) || (this.f55968c && this.f55967a.mo64307e() == typeToken.mo64306c());
            } else {
                z = this.f55969d.isAssignableFrom(typeToken.mo64306c());
            }
            if (z) {
                return new TreeTypeAdapter(this.f55970f, this.f55971g, gson, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.f55959a = jsonSerializer;
        this.f55960b = jsonDeserializer;
        this.f55961c = gson;
        this.f55962d = typeToken;
        this.f55963e = typeAdapterFactory;
    }

    /* renamed from: f */
    private TypeAdapter<T> m78575f() {
        TypeAdapter<T> typeAdapter = this.f55965g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> n = this.f55961c.mo63980n(this.f55963e, this.f55962d);
        this.f55965g = n;
        return n;
    }

    /* renamed from: g */
    public static TypeAdapterFactory m78576g(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.mo64307e() == typeToken.mo64306c(), (Class<?>) null);
    }

    /* renamed from: c */
    public T mo40900c(JsonReader jsonReader) throws IOException {
        if (this.f55960b == null) {
            return m78575f().mo40900c(jsonReader);
        }
        JsonElement a = Streams.m78507a(jsonReader);
        if (a.mo64028m()) {
            return null;
        }
        return this.f55960b.mo29657a(a, this.f55962d.mo64307e(), this.f55964f);
    }

    /* renamed from: e */
    public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
        JsonSerializer<T> jsonSerializer = this.f55959a;
        if (jsonSerializer == null) {
            m78575f().mo40901e(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            Streams.m78508b(jsonSerializer.mo40892b(t, this.f55962d.mo64307e(), this.f55964f), jsonWriter);
        }
    }
}
