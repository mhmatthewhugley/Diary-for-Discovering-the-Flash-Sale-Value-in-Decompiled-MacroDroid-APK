package p431x8;

/* renamed from: x8.l */
/* compiled from: Subscription */
final class C16869l {

    /* renamed from: a */
    final Object f68113a;

    /* renamed from: b */
    final C16867j f68114b;

    /* renamed from: c */
    final int f68115c;

    /* renamed from: d */
    volatile boolean f68116d = true;

    C16869l(Object obj, C16867j jVar, int i) {
        this.f68113a = obj;
        this.f68114b = jVar;
        this.f68115c = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C16869l)) {
            return false;
        }
        C16869l lVar = (C16869l) obj;
        if (this.f68113a != lVar.f68113a || !this.f68114b.equals(lVar.f68114b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f68113a.hashCode() + this.f68114b.f68110d.hashCode();
    }
}
