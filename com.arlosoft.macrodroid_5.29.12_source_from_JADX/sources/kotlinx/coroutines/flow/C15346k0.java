package kotlinx.coroutines.flow;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15328q;
import kotlinx.coroutines.internal.C15429a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, mo71668d2 = {"T", "value", "Lkotlinx/coroutines/flow/v;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/v;", "Lkotlinx/coroutines/flow/i0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/f;", "d", "Lkotlinx/coroutines/internal/a0;", "Lkotlinx/coroutines/internal/a0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.k0 */
/* compiled from: StateFlow.kt */
public final class C15346k0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C15429a0 f64563a = new C15429a0(KeyPropertiesCompact.DIGEST_NONE);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C15429a0 f64564b = new C15429a0("PENDING");

    /* renamed from: a */
    public static final <T> C15402v<T> m94215a(T t) {
        if (t == null) {
            t = C15328q.f64550a;
        }
        return new C15342j0(t);
    }

    /* renamed from: d */
    public static final <T> C15285f<T> m94218d(C15299i0<? extends T> i0Var, C13640g gVar, int i, C15220e eVar) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && eVar == C15220e.DROP_OLDEST) {
            return i0Var;
        }
        return C15276b0.m94090e(i0Var, gVar, i, eVar);
    }
}
