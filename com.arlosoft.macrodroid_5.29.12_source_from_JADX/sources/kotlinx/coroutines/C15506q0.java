package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C15431b0;
import kotlinx.coroutines.internal.C15464s;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\t"}, mo71668d2 = {"Lkotlinx/coroutines/t0;", "b", "", "a", "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/t0;", "()Lkotlinx/coroutines/t0;", "DefaultDelay", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.q0 */
/* compiled from: DefaultExecutor.kt */
public final class C15506q0 {

    /* renamed from: a */
    private static final boolean f64726a = C15431b0.m94343e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final C15546t0 f64727b = m94591b();

    /* renamed from: a */
    public static final C15546t0 m94590a() {
        return f64727b;
    }

    /* renamed from: b */
    private static final C15546t0 m94591b() {
        if (!f64726a) {
            return C15502p0.f64721o;
        }
        C15423h2 c = C15186a1.m93731c();
        return (C15464s.m94465c(c) || !(c instanceof C15546t0)) ? C15502p0.f64721o : (C15546t0) c;
    }
}
