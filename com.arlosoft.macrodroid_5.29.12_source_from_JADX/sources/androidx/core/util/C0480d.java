package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0480d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f495a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f496b;

    public /* synthetic */ C0480d(Predicate predicate, Predicate predicate2) {
        this.f495a = predicate;
        this.f496b = predicate2;
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
        return C0483g.m497f(this.f495a, this.f496b, obj);
    }
}
