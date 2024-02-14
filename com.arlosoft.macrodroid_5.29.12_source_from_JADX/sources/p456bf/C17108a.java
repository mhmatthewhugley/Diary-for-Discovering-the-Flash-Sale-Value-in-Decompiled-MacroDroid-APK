package p456bf;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.C15907c0;
import okhttp3.C15919e0;
import retrofit2.C17246f;
import retrofit2.C17301t;

/* renamed from: bf.a */
/* compiled from: GsonConverterFactory */
public final class C17108a extends C17246f.C17247a {

    /* renamed from: a */
    private final Gson f68686a;

    private C17108a(Gson gson) {
        this.f68686a = gson;
    }

    /* renamed from: f */
    public static C17108a m100594f() {
        return m100595g(new Gson());
    }

    /* renamed from: g */
    public static C17108a m100595g(Gson gson) {
        Objects.requireNonNull(gson, "gson == null");
        return new C17108a(gson);
    }

    /* renamed from: c */
    public C17246f<?, C15907c0> mo80385c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C17301t tVar) {
        return new C17109b(this.f68686a, this.f68686a.mo63978l(TypeToken.m78731b(type)));
    }

    /* renamed from: d */
    public C17246f<C15919e0, ?> mo80386d(Type type, Annotation[] annotationArr, C17301t tVar) {
        return new C17110c(this.f68686a, this.f68686a.mo63978l(TypeToken.m78731b(type)));
    }
}
