package androidx.core.content;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0415e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C0415e f411a = new C0415e();

    private /* synthetic */ C0415e() {
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
        return IntentSanitizer.Builder.lambda$new$6((Uri) obj);
    }
}
