package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a */
    private final ConstructorConstructor f55938a;

    /* renamed from: c */
    private final FieldNamingStrategy f55939c;

    /* renamed from: d */
    private final Excluder f55940d;

    /* renamed from: f */
    private final JsonAdapterAnnotationTypeAdapterFactory f55941f;

    /* renamed from: g */
    private final ReflectionAccessor f55942g = ReflectionAccessor.m78724a();

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private final ObjectConstructor<T> f55950a;

        /* renamed from: b */
        private final Map<String, BoundField> f55951b;

        Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.f55950a = objectConstructor;
            this.f55951b = map;
        }

        /* renamed from: c */
        public T mo40900c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a = this.f55950a.mo64081a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = this.f55951b.get(jsonReader.nextName());
                    if (boundField != null) {
                        if (boundField.f55954c) {
                            boundField.mo64233a(jsonReader, a);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: e */
        public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (BoundField next : this.f55951b.values()) {
                    if (next.mo64235c(t)) {
                        jsonWriter.name(next.f55952a);
                        next.mo64234b(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    static abstract class BoundField {

        /* renamed from: a */
        final String f55952a;

        /* renamed from: b */
        final boolean f55953b;

        /* renamed from: c */
        final boolean f55954c;

        protected BoundField(String str, boolean z, boolean z2) {
            this.f55952a = str;
            this.f55953b = z;
            this.f55954c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo64233a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo64234b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo64235c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f55938a = constructorConstructor;
        this.f55939c = fieldNamingStrategy;
        this.f55940d = excluder;
        this.f55941f = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: b */
    private BoundField m78551b(Gson gson, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        Gson gson2 = gson;
        TypeToken<?> typeToken2 = typeToken;
        final boolean a = Primitives.m78505a(typeToken.mo64306c());
        Field field2 = field;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> b = jsonAdapter != null ? this.f55941f.mo64191b(this.f55938a, gson, typeToken2, jsonAdapter) : null;
        final boolean z3 = b != null;
        if (b == null) {
            b = gson.mo63978l(typeToken2);
        }
        final TypeAdapter<?> typeAdapter = b;
        final Field field3 = field;
        final Gson gson3 = gson;
        final TypeToken<?> typeToken3 = typeToken;
        return new BoundField(str, z, z2) {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo64233a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
                Object c = typeAdapter.mo40900c(jsonReader);
                if (c != null || !a) {
                    field3.set(obj, c);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo64234b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
                TypeAdapter typeAdapter;
                Object obj2 = field3.get(obj);
                if (z3) {
                    typeAdapter = typeAdapter;
                } else {
                    typeAdapter = new TypeAdapterRuntimeTypeWrapper(gson3, typeAdapter, typeToken3.mo64307e());
                }
                typeAdapter.mo40901e(jsonWriter, obj2);
            }

            /* renamed from: c */
            public boolean mo64235c(Object obj) throws IOException, IllegalAccessException {
                if (this.f55953b && field3.get(obj) != obj) {
                    return true;
                }
                return false;
            }
        };
    }

    /* renamed from: d */
    static boolean m78552d(Field field, boolean z, Excluder excluder) {
        return !excluder.mo64083c(field.getType(), z) && !excluder.mo64085f(field, z);
    }

    /* renamed from: e */
    private Map<String, BoundField> m78553e(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e = typeToken.mo64307e();
        TypeToken<?> typeToken2 = typeToken;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c = mo64232c(field, true);
                boolean c2 = mo64232c(field, z);
                if (c || c2) {
                    this.f55942g.mo64304b(field);
                    Type p = C$Gson$Types.m78416p(typeToken2.mo64307e(), cls2, field.getGenericType());
                    List<String> f = m78554f(field);
                    int size = f.size();
                    BoundField boundField = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c;
                        String str2 = str;
                        int i3 = i2;
                        BoundField boundField2 = boundField;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        boundField = boundField2 == null ? (BoundField) linkedHashMap.put(str2, m78551b(gson, field, str2, TypeToken.m78731b(p), z2, c2)) : boundField2;
                        i2 = i3 + 1;
                        c = z2;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    BoundField boundField3 = boundField;
                    if (boundField3 != null) {
                        throw new IllegalArgumentException(e + " declares multiple JSON fields named " + boundField3.f55952a);
                    }
                }
                i++;
                z = false;
            }
            typeToken2 = TypeToken.m78731b(C$Gson$Types.m78416p(typeToken2.mo64307e(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.mo64306c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m78554f(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f55939c.mo63972b(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> c = typeToken.mo64306c();
        if (!Object.class.isAssignableFrom(c)) {
            return null;
        }
        return new Adapter(this.f55938a.mo64079a(typeToken), m78553e(gson, typeToken, c));
    }

    /* renamed from: c */
    public boolean mo64232c(Field field, boolean z) {
        return m78552d(field, z, this.f55940d);
    }
}
