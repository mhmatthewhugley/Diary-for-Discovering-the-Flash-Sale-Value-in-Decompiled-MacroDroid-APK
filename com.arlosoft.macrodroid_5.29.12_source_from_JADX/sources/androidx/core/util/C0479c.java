package androidx.core.util;

/* renamed from: androidx.core.util.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0479c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f493a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f494b;

    public /* synthetic */ C0479c(Predicate predicate, Predicate predicate2) {
        this.f493a = predicate;
        this.f494b = predicate2;
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
        return C0483g.m495d(this.f493a, this.f494b, obj);
    }
}
