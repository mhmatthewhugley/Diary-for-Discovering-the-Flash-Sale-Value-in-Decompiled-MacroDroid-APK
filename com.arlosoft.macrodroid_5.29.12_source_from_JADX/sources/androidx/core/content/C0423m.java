package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0423m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Class f419a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f420b;

    public /* synthetic */ C0423m(Class cls, Predicate predicate) {
        this.f419a = cls;
        this.f420b = predicate;
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
        return IntentSanitizer.Builder.lambda$allowExtra$13(this.f419a, this.f420b, obj);
    }
}
