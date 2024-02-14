package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final TypeAdapterFactory f55909c = new TypeAdapterFactory() {
        /* renamed from: a */
        public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
            Type e = typeToken.mo64307e();
            if (!(e instanceof GenericArrayType) && (!(e instanceof Class) || !((Class) e).isArray())) {
                return null;
            }
            Type g = C$Gson$Types.m78407g(e);
            return new ArrayTypeAdapter(gson, gson.mo63978l(TypeToken.m78731b(g)), C$Gson$Types.m78411k(g));
        }
    };

    /* renamed from: a */
    private final Class<E> f55910a;

    /* renamed from: b */
    private final TypeAdapter<E> f55911b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f55911b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f55910a = cls;
    }

    /* renamed from: c */
    public Object mo40900c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f55911b.mo40900c(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f55910a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: e */
    public void mo40901e(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f55911b.mo40901e(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
