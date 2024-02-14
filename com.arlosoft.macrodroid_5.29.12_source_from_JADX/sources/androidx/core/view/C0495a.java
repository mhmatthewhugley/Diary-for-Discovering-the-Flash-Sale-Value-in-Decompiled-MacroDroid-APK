package androidx.core.view;

import android.content.ClipData;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.view.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0495a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ java.util.function.Predicate f499a;

    public /* synthetic */ C0495a(java.util.function.Predicate predicate) {
        this.f499a = predicate;
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
        return this.f499a.test((ClipData.Item) obj);
    }
}
