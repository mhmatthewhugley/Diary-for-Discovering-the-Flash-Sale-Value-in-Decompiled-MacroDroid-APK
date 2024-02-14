package p172u1;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: u1.d */
/* compiled from: RuntimeTypeAdapterFactory */
public final class C10285d<T> implements TypeAdapterFactory {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Class<?> f23436a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f23437c;

    /* renamed from: d */
    private final Map<String, Class<?>> f23438d = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<Class<?>, String> f23439f = new LinkedHashMap();

    /* renamed from: u1.d$a */
    /* compiled from: RuntimeTypeAdapterFactory */
    class C10286a extends TypeAdapter<R> {

        /* renamed from: a */
        final /* synthetic */ Map f23440a;

        /* renamed from: b */
        final /* synthetic */ Map f23441b;

        C10286a(Map map, Map map2) {
            this.f23440a = map;
            this.f23441b = map2;
        }

        /* renamed from: c */
        public R mo40900c(JsonReader jsonReader) throws IOException {
            JsonElement a = Streams.m78507a(jsonReader);
            JsonElement t = a.mo64025h().mo64040t(C10285d.this.f23437c);
            if (t != null) {
                String k = t.mo64019k();
                TypeAdapter typeAdapter = (TypeAdapter) this.f23440a.get(k);
                if (typeAdapter != null) {
                    return typeAdapter.mo64053a(a);
                }
                throw new JsonParseException("cannot deserialize " + C10285d.this.f23436a + " subtype named " + k + "; did you forget to register a subtype?");
            }
            throw new JsonParseException("cannot deserialize " + C10285d.this.f23436a + " because it does not define a field named " + C10285d.this.f23437c);
        }

        /* renamed from: e */
        public void mo40901e(JsonWriter jsonWriter, R r) throws IOException {
            Class<?> cls = r.getClass();
            String str = (String) C10285d.this.f23439f.get(cls);
            TypeAdapter typeAdapter = (TypeAdapter) this.f23441b.get(cls);
            if (typeAdapter != null) {
                JsonObject h = typeAdapter.mo64055d(r).mo64025h();
                if (!h.mo64039s(C10285d.this.f23437c)) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.mo64037p(C10285d.this.f23437c, new JsonPrimitive(str));
                    for (Map.Entry next : h.entrySet()) {
                        jsonObject.mo64037p((String) next.getKey(), (JsonElement) next.getValue());
                    }
                    Streams.m78508b(jsonObject, jsonWriter);
                    return;
                }
                throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + C10285d.this.f23437c);
            }
            throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
        }
    }

    private C10285d(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.f23436a = cls;
        this.f23437c = str;
    }

    /* renamed from: e */
    public static <T> C10285d<T> m40420e(Class<T> cls) {
        return new C10285d<>(cls, "type");
    }

    /* renamed from: f */
    public static <T> C10285d<T> m40421f(Class<T> cls, String str) {
        return new C10285d<>(cls, str);
    }

    /* renamed from: a */
    public <R> TypeAdapter<R> mo40897a(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.mo64306c() != this.f23436a) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.f23438d.entrySet()) {
            TypeAdapter n = gson.mo63980n(this, TypeToken.m78730a((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), n);
            linkedHashMap2.put((Class) next.getValue(), n);
        }
        return new C10286a(linkedHashMap, linkedHashMap2).mo64054b();
    }

    /* renamed from: g */
    public C10285d<T> mo40898g(Class<? extends T> cls) {
        return mo40899h(cls, cls.getSimpleName());
    }

    /* renamed from: h */
    public C10285d<T> mo40899h(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.f23439f.containsKey(cls) || this.f23438d.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.f23438d.put(str, cls);
            this.f23439f.put(cls, str);
            return this;
        }
    }
}
