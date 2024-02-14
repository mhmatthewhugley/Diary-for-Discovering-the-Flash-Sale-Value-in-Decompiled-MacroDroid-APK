package androidx.core.util;

/* renamed from: androidx.core.util.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0481e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Object f497a;

    public /* synthetic */ C0481e(Object obj) {
        this.f497a = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return C0483g.m492a(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        return C0483g.m493b(this);
    }

    /* renamed from: or */
    public /* synthetic */ Predicate mo6771or(Predicate predicate) {
        return C0483g.m494c(this, predicate);
    }

    public final boolean test(Object obj) {
        return this.f497a.equals(obj);
    }
}
