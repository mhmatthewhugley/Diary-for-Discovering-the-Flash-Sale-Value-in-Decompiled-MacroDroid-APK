package p369q9;

import p226cd.C11188e;

/* renamed from: q9.d */
/* compiled from: Header */
public final class C16240d {

    /* renamed from: d */
    public static final C11188e f66554d = C11188e.m75103f(":status");

    /* renamed from: e */
    public static final C11188e f66555e = C11188e.m75103f(":method");

    /* renamed from: f */
    public static final C11188e f66556f = C11188e.m75103f(":path");

    /* renamed from: g */
    public static final C11188e f66557g = C11188e.m75103f(":scheme");

    /* renamed from: h */
    public static final C11188e f66558h = C11188e.m75103f(":authority");

    /* renamed from: i */
    public static final C11188e f66559i = C11188e.m75103f(":host");

    /* renamed from: j */
    public static final C11188e f66560j = C11188e.m75103f(":version");

    /* renamed from: a */
    public final C11188e f66561a;

    /* renamed from: b */
    public final C11188e f66562b;

    /* renamed from: c */
    final int f66563c;

    public C16240d(String str, String str2) {
        this(C11188e.m75103f(str), C11188e.m75103f(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C16240d)) {
            return false;
        }
        C16240d dVar = (C16240d) obj;
        if (!this.f66561a.equals(dVar.f66561a) || !this.f66562b.equals(dVar.f66562b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f66561a.hashCode()) * 31) + this.f66562b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f66561a.mo62489H(), this.f66562b.mo62489H()});
    }

    public C16240d(C11188e eVar, String str) {
        this(eVar, C11188e.m75103f(str));
    }

    public C16240d(C11188e eVar, C11188e eVar2) {
        this.f66561a = eVar;
        this.f66562b = eVar2;
        this.f66563c = eVar.mo62485C() + 32 + eVar2.mo62485C();
    }
}
