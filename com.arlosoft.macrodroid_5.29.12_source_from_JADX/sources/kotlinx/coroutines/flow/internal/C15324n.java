package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15285f;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/n;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.n */
/* compiled from: ChannelFlow.kt */
public interface C15324n<T> extends C15285f<T> {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.n$a */
    /* compiled from: ChannelFlow.kt */
    public static final class C15325a {
        /* renamed from: a */
        public static /* synthetic */ C15285f m94188a(C15324n nVar, C13640g gVar, int i, C15220e eVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    gVar = C13646h.f61899a;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    eVar = C15220e.SUSPEND;
                }
                return nVar.mo74651a(gVar, i, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: a */
    C15285f<T> mo74651a(C13640g gVar, int i, C15220e eVar);
}
