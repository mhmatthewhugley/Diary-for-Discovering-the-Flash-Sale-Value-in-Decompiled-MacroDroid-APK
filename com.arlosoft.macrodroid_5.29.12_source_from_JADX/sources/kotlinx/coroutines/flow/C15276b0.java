package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15309g;
import kotlinx.coroutines.internal.C15429a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, mo71668d2 = {"T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/u;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lja/u;", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/z;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/flow/f;", "e", "Lkotlinx/coroutines/internal/a0;", "Lkotlinx/coroutines/internal/a0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.b0 */
/* compiled from: SharedFlow.kt */
public final class C15276b0 {

    /* renamed from: a */
    public static final C15429a0 f64499a = new C15429a0("NO_VALUE");

    /* renamed from: a */
    public static final <T> C15401u<T> m94086a(int i, int i2, C15220e eVar) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && eVar != C15220e.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new C15270a0(i, i3, eVar);
                }
                throw new IllegalArgumentException(C13706o.m87936m("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", eVar).toString());
            }
            throw new IllegalArgumentException(C13706o.m87936m("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i2)).toString());
        }
        throw new IllegalArgumentException(C13706o.m87936m("replay cannot be negative, but was ", Integer.valueOf(i)).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C15401u m94087b(int i, int i2, C15220e eVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            eVar = C15220e.SUSPEND;
        }
        return m94086a(i, i2, eVar);
    }

    /* renamed from: e */
    public static final <T> C15285f<T> m94090e(C15406z<? extends T> zVar, C13640g gVar, int i, C15220e eVar) {
        if ((i == 0 || i == -3) && eVar == C15220e.SUSPEND) {
            return zVar;
        }
        return new C15309g(zVar, gVar, i, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m94091f(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m94092g(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
