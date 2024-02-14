package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C15452l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/h2;", "Lkotlinx/coroutines/h0;", "", "toString", "", "parallelism", "limitedParallelism", "s", "o", "()Lkotlinx/coroutines/h2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h2 */
/* compiled from: MainCoroutineDispatcher.kt */
public abstract class C15423h2 extends C15415h0 {
    public C15415h0 limitedParallelism(int i) {
        C15452l.m94416a(i);
        return this;
    }

    /* renamed from: o */
    public abstract C15423h2 mo74507o();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final String mo74748s() {
        C15423h2 h2Var;
        C15423h2 c = C15186a1.m93731c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            h2Var = c.mo74507o();
        } catch (UnsupportedOperationException unused) {
            h2Var = null;
        }
        if (this == h2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String s = mo74748s();
        if (s != null) {
            return s;
        }
        return C15498o0.m94571a(this) + '@' + C15498o0.m94572b(this);
    }
}
