package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, mo71668d2 = {"Lkotlinx/coroutines/internal/m;", "Lkotlinx/coroutines/internal/o;", "", "E", "", "D", "()Z", "isEmpty", "x", "isRemoved", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.m */
/* compiled from: LockFreeLinkedList.kt */
public class C15453m extends C15455o {
    /* renamed from: D */
    public final boolean mo74794D() {
        return mo74802s() == this;
    }

    /* renamed from: E */
    public final Void mo74795E() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    /* renamed from: x */
    public boolean mo74796x() {
        return false;
    }

    /* renamed from: y */
    public /* bridge */ /* synthetic */ boolean mo74594y() {
        return ((Boolean) mo74795E()).booleanValue();
    }
}
