package androidx.core.content;

import android.content.ComponentName;
import androidx.core.util.C0483g;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0413c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f409a;

    public /* synthetic */ C0413c(ComponentName componentName) {
        this.f409a = componentName;
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
        return this.f409a.equals((ComponentName) obj);
    }
}
