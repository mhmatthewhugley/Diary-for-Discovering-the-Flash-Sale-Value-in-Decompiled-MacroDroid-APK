package p382rd;

import p364pd.C16170a;
import p373qd.C16283b;

/* renamed from: rd.f */
/* compiled from: ParseSettings */
public class C16413f {

    /* renamed from: c */
    public static final C16413f f67036c = new C16413f(false, false);

    /* renamed from: d */
    public static final C16413f f67037d = new C16413f(true, true);

    /* renamed from: a */
    private final boolean f67038a;

    /* renamed from: b */
    private final boolean f67039b;

    public C16413f(boolean z, boolean z2) {
        this.f67038a = z;
        this.f67039b = z2;
    }

    /* renamed from: a */
    static String m98324a(String str) {
        return C16170a.m97068a(str.trim());
    }

    /* renamed from: b */
    public String mo79194b(String str) {
        String trim = str.trim();
        return !this.f67039b ? C16170a.m97068a(trim) : trim;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C16283b mo79195c(C16283b bVar) {
        if (bVar != null && !this.f67039b) {
            bVar.mo78789P();
        }
        return bVar;
    }

    /* renamed from: d */
    public String mo79196d(String str) {
        String trim = str.trim();
        return !this.f67038a ? C16170a.m97068a(trim) : trim;
    }

    /* renamed from: e */
    public boolean mo79197e() {
        return this.f67039b;
    }

    /* renamed from: f */
    public boolean mo79198f() {
        return this.f67038a;
    }
}
