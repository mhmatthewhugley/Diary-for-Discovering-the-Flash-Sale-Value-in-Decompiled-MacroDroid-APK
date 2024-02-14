package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C15429a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0017\u0012\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, mo71668d2 = {"", "g", "h", "Lkotlinx/coroutines/internal/a0;", "a", "Lkotlinx/coroutines/internal/a0;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "e", "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/f1;", "f", "Lkotlinx/coroutines/f1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e2 */
/* compiled from: JobSupport.kt */
public final class C15262e2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C15429a0 f64474a = new C15429a0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C15429a0 f64475b = new C15429a0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C15429a0 f64476c = new C15429a0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C15429a0 f64477d = new C15429a0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C15429a0 f64478e = new C15429a0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C15266f1 f64479f = new C15266f1(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C15266f1 f64480g = new C15266f1(true);

    /* renamed from: g */
    public static final Object m94030g(Object obj) {
        return obj instanceof C15511r1 ? new C15515s1((C15511r1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m94031h(Object obj) {
        C15511r1 r1Var;
        C15515s1 s1Var = obj instanceof C15515s1 ? (C15515s1) obj : null;
        return (s1Var == null || (r1Var = s1Var.f64731a) == null) ? obj : r1Var;
    }
}
