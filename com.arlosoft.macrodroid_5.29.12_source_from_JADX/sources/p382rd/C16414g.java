package p382rd;

import java.io.StringReader;
import p373qd.C16288f;

/* renamed from: rd.g */
/* compiled from: Parser */
public class C16414g {

    /* renamed from: a */
    private C16497l f67040a;

    /* renamed from: b */
    private C16412e f67041b;

    /* renamed from: c */
    private C16413f f67042c;

    /* renamed from: d */
    private boolean f67043d = false;

    public C16414g(C16497l lVar) {
        this.f67040a = lVar;
        this.f67042c = lVar.mo79151c();
        this.f67041b = C16412e.m98321f();
    }

    /* renamed from: b */
    public static C16414g m98330b() {
        return new C16414g(new C16383b());
    }

    /* renamed from: e */
    public static C16288f m98331e(String str, String str2) {
        C16383b bVar = new C16383b();
        return bVar.mo79301h(new StringReader(str), str2, new C16414g(bVar));
    }

    /* renamed from: a */
    public C16412e mo79199a() {
        return this.f67041b;
    }

    /* renamed from: c */
    public boolean mo79200c() {
        return this.f67041b.mo79193d() > 0;
    }

    /* renamed from: d */
    public boolean mo79201d() {
        return this.f67043d;
    }

    /* renamed from: f */
    public C16413f mo79202f() {
        return this.f67042c;
    }
}
