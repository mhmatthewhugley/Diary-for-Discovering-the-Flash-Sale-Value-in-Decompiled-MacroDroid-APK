package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0436w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ UriMatcher f441a;

    public /* synthetic */ C0436w(UriMatcher uriMatcher) {
        this.f441a = uriMatcher;
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
        return UriMatcherCompat.lambda$asPredicate$0(this.f441a, (Uri) obj);
    }
}
