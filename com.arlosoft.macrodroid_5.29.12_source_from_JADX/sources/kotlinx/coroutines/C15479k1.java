package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C15429a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007*\u001e\b\u0002\u0010\u000e\u001a\u0004\b\u0000\u0010\f\"\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u000f"}, mo71668d2 = {"", "timeMillis", "c", "Lkotlinx/coroutines/internal/a0;", "a", "Lkotlinx/coroutines/internal/a0;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "b", "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", "T", "Lkotlinx/coroutines/internal/q;", "Queue", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k1 */
/* compiled from: EventLoop.common.kt */
public final class C15479k1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C15429a0 f64701a = new C15429a0("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C15429a0 f64702b = new C15429a0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m94501c(long j) {
        if (j <= 0) {
            return 0;
        }
        return j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j;
    }
}
