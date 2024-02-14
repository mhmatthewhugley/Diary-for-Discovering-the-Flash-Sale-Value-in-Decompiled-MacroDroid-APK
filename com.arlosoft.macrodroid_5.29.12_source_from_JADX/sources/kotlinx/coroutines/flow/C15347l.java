package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15309g;
import kotlinx.coroutines.flow.internal.C15324n;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "a", "c", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.l */
/* compiled from: Context.kt */
final /* synthetic */ class C15347l {
    /* renamed from: a */
    public static final <T> C15285f<T> m94219a(C15285f<? extends T> fVar, int i, C15220e eVar) {
        C15220e eVar2;
        int i2;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && eVar != C15220e.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    eVar2 = C15220e.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    eVar2 = eVar;
                }
                if (fVar instanceof C15324n) {
                    return C15324n.C15325a.m94188a((C15324n) fVar, (C13640g) null, i2, eVar2, 1, (Object) null);
                }
                return new C15309g(fVar, (C13640g) null, i2, eVar2, 2, (C13695i) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(C13706o.m87936m("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i)).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C15285f m94220b(C15285f fVar, int i, C15220e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            eVar = C15220e.SUSPEND;
        }
        return C15290h.m94117c(fVar, i, eVar);
    }

    /* renamed from: c */
    public static final <T> C15285f<T> m94221c(C15285f<? extends T> fVar) {
        return m94220b(fVar, -1, (C15220e) null, 2, (Object) null);
    }
}
