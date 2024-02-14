package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C15429a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, mo71668d2 = {"", "locked", "Lkotlinx/coroutines/sync/b;", "a", "Lkotlinx/coroutines/internal/a0;", "Lkotlinx/coroutines/internal/a0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lkotlinx/coroutines/sync/a;", "e", "Lkotlinx/coroutines/sync/a;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.sync.d */
/* compiled from: Mutex.kt */
public final class C15544d {

    /* renamed from: a */
    private static final C15429a0 f64794a = new C15429a0("LOCK_FAIL");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C15429a0 f64795b = new C15429a0("UNLOCK_FAIL");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C15429a0 f64796c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C15429a0 f64797d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C15535a f64798e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C15535a f64799f;

    static {
        C15429a0 a0Var = new C15429a0("LOCKED");
        f64796c = a0Var;
        C15429a0 a0Var2 = new C15429a0("UNLOCKED");
        f64797d = a0Var2;
        f64798e = new C15535a(a0Var);
        f64799f = new C15535a(a0Var2);
    }

    /* renamed from: a */
    public static final C15536b m94681a(boolean z) {
        return new C15537c(z);
    }

    /* renamed from: b */
    public static /* synthetic */ C15536b m94682b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m94681a(z);
    }
}
