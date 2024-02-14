package p160s0;

import android.content.Context;
import com.google.gson.Gson;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: s0.h1 */
/* compiled from: NetworkingModule_ProvideGsonFactory */
public final class C10098h1 implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f23284a;

    public C10098h1(C12478a<Context> aVar) {
        this.f23284a = aVar;
    }

    /* renamed from: a */
    public static C10098h1 m40038a(C12478a<Context> aVar) {
        return new C10098h1(aVar);
    }

    /* renamed from: c */
    public static Gson m40039c(C12478a<Context> aVar) {
        return m40040d(aVar.get());
    }

    /* renamed from: d */
    public static Gson m40040d(Context context) {
        return (Gson) C16779b.m99514b(C10087f1.m40023b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Gson get() {
        return m40039c(this.f23284a);
    }
}
