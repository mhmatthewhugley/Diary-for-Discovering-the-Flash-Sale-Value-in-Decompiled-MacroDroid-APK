package kotlinx.coroutines.channels;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u000b"}, mo71668d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlin/Function1;", "Lja/u;", "onUndeliveredElement", "Lkotlinx/coroutines/channels/f;", "b", "a", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.i */
/* compiled from: Channel.kt */
public final class C15225i {
    /* renamed from: b */
    public static final <E> C15221f<E> m93850b(int i, C15220e eVar, C16265l<? super E, C13339u> lVar) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == C15220e.SUSPEND) {
                i2 = C15221f.f64445y.mo74570a();
            }
            return new C15218d(i2, eVar, lVar);
        } else if (i == -1) {
            if (eVar != C15220e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C15233n(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new C15234o(lVar);
            }
            if (i == 1 && eVar == C15220e.DROP_OLDEST) {
                return new C15233n(lVar);
            }
            return new C15218d(i, eVar, lVar);
        } else if (eVar == C15220e.SUSPEND) {
            return new C15243v(lVar);
        } else {
            return new C15218d(1, eVar, lVar);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ C15221f m93851c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m93852d(i, (C15220e) null, (C16265l) null, 6, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C15221f m93852d(int i, C15220e eVar, C16265l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = C15220e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m93850b(i, eVar, lVar);
    }
}
