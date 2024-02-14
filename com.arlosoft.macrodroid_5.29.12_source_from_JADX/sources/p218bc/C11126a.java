package p218bc;

import java.util.ArrayList;

/* renamed from: bc.a */
/* compiled from: TypeSystemContext.kt */
public final class C11126a extends ArrayList<C11138m> implements C11137l {
    public C11126a(int i) {
        super(i);
    }

    /* renamed from: c */
    public /* bridge */ boolean mo62255c(C11138m mVar) {
        return super.contains(mVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11138m)) {
            return false;
        }
        return mo62255c((C11138m) obj);
    }

    /* renamed from: d */
    public /* bridge */ int mo62257d() {
        return super.size();
    }

    /* renamed from: f */
    public /* bridge */ int mo62258f(C11138m mVar) {
        return super.indexOf(mVar);
    }

    /* renamed from: h */
    public /* bridge */ int mo62259h(C11138m mVar) {
        return super.lastIndexOf(mVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C11138m)) {
            return -1;
        }
        return mo62258f((C11138m) obj);
    }

    /* renamed from: k */
    public /* bridge */ boolean mo62261k(C11138m mVar) {
        return super.remove(mVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C11138m)) {
            return -1;
        }
        return mo62259h((C11138m) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C11138m)) {
            return false;
        }
        return mo62261k((C11138m) obj);
    }

    public final /* bridge */ int size() {
        return mo62257d();
    }
}
