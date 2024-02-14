package androidx.core.util;

/* renamed from: androidx.core.util.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0478b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f492a;

    public /* synthetic */ C0478b(Predicate predicate) {
        this.f492a = predicate;
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
        return C0483g.m496e(this.f492a, obj);
    }
}
