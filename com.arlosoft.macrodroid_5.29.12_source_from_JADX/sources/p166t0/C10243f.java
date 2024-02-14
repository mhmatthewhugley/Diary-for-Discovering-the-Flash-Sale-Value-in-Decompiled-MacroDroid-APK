package p166t0;

import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.f */
/* compiled from: ApplicationModule_ProvideRoomDatabaseFactory */
public final class C10243f implements C12478a {

    /* renamed from: a */
    private final C10241d f23377a;

    public C10243f(C10241d dVar) {
        this.f23377a = dVar;
    }

    /* renamed from: a */
    public static C10243f m40268a(C10241d dVar) {
        return new C10243f(dVar);
    }

    /* renamed from: c */
    public static MacroDroidRoomDatabase m40269c(C10241d dVar) {
        return m40270d(dVar);
    }

    /* renamed from: d */
    public static MacroDroidRoomDatabase m40270d(C10241d dVar) {
        return (MacroDroidRoomDatabase) C16779b.m99514b(dVar.mo40851b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public MacroDroidRoomDatabase get() {
        return m40269c(this.f23377a);
    }
}
