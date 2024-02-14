package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final Gson f55972a;

    /* renamed from: b */
    private final TypeAdapter<T> f55973b;

    /* renamed from: c */
    private final Type f55974c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f55972a = gson;
        this.f55973b = typeAdapter;
        this.f55974c = type;
    }

    /* renamed from: f */
    private Type m78582f(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    /* renamed from: c */
    public T mo40900c(JsonReader jsonReader) throws IOException {
        return this.f55973b.mo40900c(jsonReader);
    }

    /* renamed from: e */
    public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> typeAdapter = this.f55973b;
        Type f = m78582f(this.f55974c, t);
        if (f != this.f55974c) {
            typeAdapter = this.f55972a.mo63978l(TypeToken.m78731b(f));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f55973b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.mo40901e(jsonWriter, t);
    }
}
