package p160s0;

import com.google.gson.Gson;
import okhttp3.C16002z;
import p199z2.C10434a;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: s0.m1 */
/* compiled from: NetworkingModule_ProvidesTemplateStoreApiFactory */
public final class C10122m1 implements C12478a {

    /* renamed from: a */
    private final C12478a<C16002z> f23285a;

    /* renamed from: b */
    private final C12478a<Gson> f23286b;

    public C10122m1(C12478a<C16002z> aVar, C12478a<Gson> aVar2) {
        this.f23285a = aVar;
        this.f23286b = aVar2;
    }

    /* renamed from: a */
    public static C10122m1 m40066a(C12478a<C16002z> aVar, C12478a<Gson> aVar2) {
        return new C10122m1(aVar, aVar2);
    }

    /* renamed from: c */
    public static C10434a m40067c(C12478a<C16002z> aVar, C12478a<Gson> aVar2) {
        return m40068d(aVar.get(), aVar2.get());
    }

    /* renamed from: d */
    public static C10434a m40068d(C16002z zVar, Gson gson) {
        return (C10434a) C16779b.m99514b(C10087f1.m40028g(zVar, gson), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10434a get() {
        return m40067c(this.f23285a, this.f23286b);
    }
}
