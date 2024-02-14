package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a */
    private final ConstructorConstructor f55912a;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a */
        private final TypeAdapter<E> f55913a;

        /* renamed from: b */
        private final ObjectConstructor<? extends Collection<E>> f55914b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.f55913a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f55914b = objectConstructor;
        }

        /* renamed from: f */
        public Collection<E> mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.f55914b.mo64081a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f55913a.mo40900c(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: g */
        public void mo40901e(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e : collection) {
                this.f55913a.mo40901e(jsonWriter, e);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f55912a = constructorConstructor;
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
        Type e = typeToken.mo64307e();
        Class<? super T> c = typeToken.mo64306c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = C$Gson$Types.m78408h(e, c);
        return new Adapter(gson, h, gson.mo63978l(TypeToken.m78731b(h)), this.f55912a.mo64079a(typeToken));
    }
}
