package androidx.core.content;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0416f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C0416f f412a = new C0416f();

    private /* synthetic */ C0416f() {
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
        return IntentSanitizer.Builder.lambda$new$1((Uri) obj);
    }
}
