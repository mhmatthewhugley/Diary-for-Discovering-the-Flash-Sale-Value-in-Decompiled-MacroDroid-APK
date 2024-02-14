package androidx.core.content;

import android.net.Uri;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0425o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f422a;

    public /* synthetic */ C0425o(String str) {
        this.f422a = str;
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
        return this.f422a.equals(((Uri) obj).getAuthority());
    }
}
