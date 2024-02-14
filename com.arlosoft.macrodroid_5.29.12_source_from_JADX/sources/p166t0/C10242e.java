package p166t0;

import com.arlosoft.macrodroid.macro.C4915a;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.e */
/* compiled from: ApplicationModule_ProvideActionBlockStoreFactory */
public final class C10242e implements C12478a {

    /* renamed from: a */
    private final C10241d f23376a;

    public C10242e(C10241d dVar) {
        this.f23376a = dVar;
    }

    /* renamed from: a */
    public static C10242e m40264a(C10241d dVar) {
        return new C10242e(dVar);
    }

    /* renamed from: c */
    public static C4915a m40265c(C10241d dVar) {
        return m40266d(dVar);
    }

    /* renamed from: d */
    public static C4915a m40266d(C10241d dVar) {
        return (C4915a) C16779b.m99514b(dVar.mo40850a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C4915a get() {
        return m40265c(this.f23376a);
    }
}
