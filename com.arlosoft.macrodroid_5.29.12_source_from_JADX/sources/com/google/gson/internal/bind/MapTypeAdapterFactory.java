package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a */
    private final ConstructorConstructor f55929a;

    /* renamed from: c */
    final boolean f55930c;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a */
        private final TypeAdapter<K> f55931a;

        /* renamed from: b */
        private final TypeAdapter<V> f55932b;

        /* renamed from: c */
        private final ObjectConstructor<? extends Map<K, V>> f55933c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f55931a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f55932b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f55933c = objectConstructor;
        }

        /* renamed from: f */
        private String m78543f(JsonElement jsonElement) {
            if (jsonElement.mo64030o()) {
                JsonPrimitive i = jsonElement.mo64026i();
                if (i.mo64046u()) {
                    return String.valueOf(i.mo64044q());
                }
                if (i.mo64045s()) {
                    return Boolean.toString(i.mo64013c());
                }
                if (i.mo64047w()) {
                    return i.mo64019k();
                }
                throw new AssertionError();
            } else if (jsonElement.mo64028m()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        public Map<K, V> mo40900c(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.f55933c.mo64081a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K c = this.f55931a.mo40900c(jsonReader);
                    if (map.put(c, this.f55932b.mo40900c(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + c);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K c2 = this.f55931a.mo40900c(jsonReader);
                    if (map.put(c2, this.f55932b.mo40900c(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + c2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* renamed from: h */
        public void mo40901e(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!MapTypeAdapterFactory.this.f55930c) {
                jsonWriter.beginObject();
                for (Map.Entry next : map.entrySet()) {
                    jsonWriter.name(String.valueOf(next.getKey()));
                    this.f55932b.mo40901e(jsonWriter, next.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    JsonElement d = this.f55931a.mo64055d(next2.getKey());
                    arrayList.add(d);
                    arrayList2.add(next2.getValue());
                    z |= d.mo64027l() || d.mo64029n();
                }
                if (z) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        Streams.m78508b((JsonElement) arrayList.get(i), jsonWriter);
                        this.f55932b.mo40901e(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    jsonWriter.name(m78543f((JsonElement) arrayList.get(i)));
                    this.f55932b.mo40901e(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
        this.f55929a = constructorConstructor;
        this.f55930c = z;
    }

    /* renamed from: b */
    private TypeAdapter<?> m78541b(Gson gson, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.f56006f;
        }
        return gson.mo63978l(TypeToken.m78731b(type));
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
        Type e = typeToken.mo64307e();
        if (!Map.class.isAssignableFrom(typeToken.mo64306c())) {
            return null;
        }
        Type[] j = C$Gson$Types.m78410j(e, C$Gson$Types.m78411k(e));
        return new Adapter(gson, j[0], m78541b(gson, j[0]), j[1], gson.mo63978l(TypeToken.m78731b(j[1])), this.f55929a.mo64079a(typeToken));
    }
}
