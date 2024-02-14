package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, mo71668d2 = {"", "Lja/u;", "a", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.l */
/* compiled from: LimitedDispatcher.kt */
public final class C15452l {
    /* renamed from: a */
    public static final void m94416a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C13706o.m87936m("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}
