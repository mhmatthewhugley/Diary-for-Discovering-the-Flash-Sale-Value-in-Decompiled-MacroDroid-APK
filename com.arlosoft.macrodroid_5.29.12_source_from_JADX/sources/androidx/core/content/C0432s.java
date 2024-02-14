package androidx.core.content;

import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0432s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f437a;

    public /* synthetic */ C0432s(String str) {
        this.f437a = str;
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
        return this.f437a.equals((String) obj);
    }
}
