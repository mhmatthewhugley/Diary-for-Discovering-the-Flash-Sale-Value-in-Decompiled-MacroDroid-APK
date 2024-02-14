package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {

    /* renamed from: v */
    private static final TypeToken<?> f55768v = TypeToken.m78730a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> f55769a;

    /* renamed from: b */
    private final Map<TypeToken<?>, TypeAdapter<?>> f55770b;

    /* renamed from: c */
    private final ConstructorConstructor f55771c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f55772d;

    /* renamed from: e */
    final List<TypeAdapterFactory> f55773e;

    /* renamed from: f */
    final Excluder f55774f;

    /* renamed from: g */
    final FieldNamingStrategy f55775g;

    /* renamed from: h */
    final Map<Type, InstanceCreator<?>> f55776h;

    /* renamed from: i */
    final boolean f55777i;

    /* renamed from: j */
    final boolean f55778j;

    /* renamed from: k */
    final boolean f55779k;

    /* renamed from: l */
    final boolean f55780l;

    /* renamed from: m */
    final boolean f55781m;

    /* renamed from: n */
    final boolean f55782n;

    /* renamed from: o */
    final boolean f55783o;

    /* renamed from: p */
    final String f55784p;

    /* renamed from: q */
    final int f55785q;

    /* renamed from: r */
    final int f55786r;

    /* renamed from: s */
    final LongSerializationPolicy f55787s;

    /* renamed from: t */
    final List<TypeAdapterFactory> f55788t;

    /* renamed from: u */
    final List<TypeAdapterFactory> f55789u;

    static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private TypeAdapter<T> f55794a;

        FutureTypeAdapter() {
        }

        /* renamed from: c */
        public T mo40900c(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.f55794a;
            if (typeAdapter != null) {
                return typeAdapter.mo40900c(jsonReader);
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.f55794a;
            if (typeAdapter != null) {
                typeAdapter.mo40901e(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: f */
        public void mo64002f(TypeAdapter<T> typeAdapter) {
            if (this.f55794a == null) {
                this.f55794a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }
    }

    public Gson() {
        this(Excluder.f55847p, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m78296a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static TypeAdapter<AtomicLong> m78297b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() {
            /* renamed from: f */
            public AtomicLong mo40900c(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.mo40900c(jsonReader)).longValue());
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.mo40901e(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.mo64054b();
    }

    /* renamed from: c */
    private static TypeAdapter<AtomicLongArray> m78298c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() {
            /* renamed from: f */
            public AtomicLongArray mo40900c(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.mo40900c(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    TypeAdapter.this.mo40901e(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }
        }.mo64054b();
    }

    /* renamed from: d */
    static void m78299d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private TypeAdapter<Number> m78300e(boolean z) {
        if (z) {
            return TypeAdapters.f56022v;
        }
        return new TypeAdapter<Number>() {
            /* renamed from: f */
            public Double mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.m78299d(number.doubleValue());
                jsonWriter.value(number);
            }
        };
    }

    /* renamed from: f */
    private TypeAdapter<Number> m78301f(boolean z) {
        if (z) {
            return TypeAdapters.f56021u;
        }
        return new TypeAdapter<Number>() {
            /* renamed from: f */
            public Float mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.m78299d((double) number.floatValue());
                jsonWriter.value(number);
            }
        };
    }

    /* renamed from: o */
    private static TypeAdapter<Number> m78302o(LongSerializationPolicy longSerializationPolicy) {
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            return TypeAdapters.f56020t;
        }
        return new TypeAdapter<Number>() {
            /* renamed from: f */
            public Number mo40900c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            /* renamed from: g */
            public void mo40901e(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    /* renamed from: g */
    public <T> T mo63973g(JsonElement jsonElement, Type type) throws JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return mo63974h(new JsonTreeReader(jsonElement), type);
    }

    /* renamed from: h */
    public <T> T mo63974h(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            T c = mo63978l(TypeToken.m78731b(type)).mo40900c(jsonReader);
            jsonReader.setLenient(isLenient);
            return c;
        } catch (EOFException e) {
            if (1 != 0) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: i */
    public <T> T mo63975i(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader p = mo63981p(reader);
        T h = mo63974h(p, type);
        m78296a(h, p);
        return h;
    }

    /* renamed from: j */
    public <T> T mo63976j(String str, Class<T> cls) throws JsonSyntaxException {
        return Primitives.m78506b(cls).cast(mo63977k(str, cls));
    }

    /* renamed from: k */
    public <T> T mo63977k(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return mo63975i(new StringReader(str), type);
    }

    /* renamed from: l */
    public <T> TypeAdapter<T> mo63978l(TypeToken<T> typeToken) {
        TypeAdapter<T> typeAdapter = this.f55770b.get(typeToken == null ? f55768v : typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = this.f55769a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f55769a.set(map);
            z = true;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter2);
            for (TypeAdapterFactory a : this.f55773e) {
                TypeAdapter<T> a2 = a.mo40897a(this, typeToken);
                if (a2 != null) {
                    futureTypeAdapter2.mo64002f(a2);
                    this.f55770b.put(typeToken, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z) {
                this.f55769a.remove();
            }
        }
    }

    /* renamed from: m */
    public <T> TypeAdapter<T> mo63979m(Class<T> cls) {
        return mo63978l(TypeToken.m78730a(cls));
    }

    /* renamed from: n */
    public <T> TypeAdapter<T> mo63980n(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        if (!this.f55773e.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f55772d;
        }
        boolean z = false;
        for (TypeAdapterFactory next : this.f55773e) {
            if (z) {
                TypeAdapter<T> a = next.mo40897a(this, typeToken);
                if (a != null) {
                    return a;
                }
            } else if (next == typeAdapterFactory) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    /* renamed from: p */
    public JsonReader mo63981p(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f55782n);
        return jsonReader;
    }

    /* renamed from: q */
    public JsonWriter mo63982q(Writer writer) throws IOException {
        if (this.f55779k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f55781m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f55777i);
        return jsonWriter;
    }

    /* renamed from: r */
    public String mo63983r(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        mo63988v(jsonElement, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public String mo63984s(Object obj) {
        if (obj == null) {
            return mo63983r(JsonNull.f55812a);
        }
        return mo63985t(obj, obj.getClass());
    }

    /* renamed from: t */
    public String mo63985t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo63990x(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f55777i + ",factories:" + this.f55773e + ",instanceCreators:" + this.f55771c + "}";
    }

    /* renamed from: u */
    public void mo63987u(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f55780l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f55777i);
        try {
            Streams.m78508b(jsonElement, jsonWriter);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    /* renamed from: v */
    public void mo63988v(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
        try {
            mo63987u(jsonElement, mo63982q(Streams.m78509c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: w */
    public void mo63989w(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter<?> l = mo63978l(TypeToken.m78731b(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f55780l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f55777i);
        try {
            l.mo40901e(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    /* renamed from: x */
    public void mo63990x(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            mo63989w(obj, type, mo63982q(Streams.m78509c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: y */
    public JsonElement mo63991y(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        mo63989w(obj, type, jsonTreeWriter);
        return jsonTreeWriter.mo64212b();
    }

    Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        boolean z8 = z2;
        boolean z9 = z7;
        this.f55769a = new ThreadLocal<>();
        this.f55770b = new ConcurrentHashMap();
        this.f55774f = excluder;
        this.f55775g = fieldNamingStrategy;
        this.f55776h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map);
        this.f55771c = constructorConstructor;
        this.f55777i = z;
        this.f55778j = z8;
        this.f55779k = z3;
        this.f55780l = z4;
        this.f55781m = z5;
        this.f55782n = z6;
        this.f55783o = z9;
        this.f55787s = longSerializationPolicy;
        this.f55784p = str;
        this.f55785q = i;
        this.f55786r = i2;
        this.f55788t = list;
        this.f55789u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f55999Y);
        arrayList.add(ObjectTypeAdapter.f55935b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f55978D);
        arrayList.add(TypeAdapters.f56013m);
        arrayList.add(TypeAdapters.f56007g);
        arrayList.add(TypeAdapters.f56009i);
        arrayList.add(TypeAdapters.f56011k);
        TypeAdapter<Number> o = m78302o(longSerializationPolicy);
        arrayList.add(TypeAdapters.m78587c(Long.TYPE, Long.class, o));
        arrayList.add(TypeAdapters.m78587c(Double.TYPE, Double.class, m78300e(z9)));
        arrayList.add(TypeAdapters.m78587c(Float.TYPE, Float.class, m78301f(z9)));
        arrayList.add(TypeAdapters.f56024x);
        arrayList.add(TypeAdapters.f56015o);
        arrayList.add(TypeAdapters.f56017q);
        arrayList.add(TypeAdapters.m78586b(AtomicLong.class, m78297b(o)));
        arrayList.add(TypeAdapters.m78586b(AtomicLongArray.class, m78298c(o)));
        arrayList.add(TypeAdapters.f56019s);
        arrayList.add(TypeAdapters.f56026z);
        arrayList.add(TypeAdapters.f55980F);
        arrayList.add(TypeAdapters.f55982H);
        arrayList.add(TypeAdapters.m78586b(BigDecimal.class, TypeAdapters.f55976B));
        arrayList.add(TypeAdapters.m78586b(BigInteger.class, TypeAdapters.f55977C));
        arrayList.add(TypeAdapters.f55984J);
        arrayList.add(TypeAdapters.f55986L);
        arrayList.add(TypeAdapters.f55990P);
        arrayList.add(TypeAdapters.f55992R);
        arrayList.add(TypeAdapters.f55997W);
        arrayList.add(TypeAdapters.f55988N);
        arrayList.add(TypeAdapters.f56004d);
        arrayList.add(DateTypeAdapter.f55915b);
        arrayList.add(TypeAdapters.f55995U);
        arrayList.add(TimeTypeAdapter.f55957b);
        arrayList.add(SqlDateTypeAdapter.f55955b);
        arrayList.add(TypeAdapters.f55993S);
        arrayList.add(ArrayTypeAdapter.f55909c);
        arrayList.add(TypeAdapters.f56002b);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z8));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f55772d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f56000Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f55773e = Collections.unmodifiableList(arrayList);
    }
}
