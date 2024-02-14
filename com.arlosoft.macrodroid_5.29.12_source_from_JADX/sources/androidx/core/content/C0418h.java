package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0418h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C0418h f414a = new C0418h();

    private /* synthetic */ C0418h() {
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
        return IntentSanitizer.Builder.lambda$new$0((String) obj);
    }
}
