package p218bc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;

/* renamed from: bc.q */
/* compiled from: TypeSystemContext.kt */
public final class C11143q {

    /* renamed from: bc.q$a */
    /* compiled from: TypeSystemContext.kt */
    public /* synthetic */ class C11144a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54045a;

        static {
            int[] iArr = new int[C14970r1.values().length];
            iArr[C14970r1.INVARIANT.ordinal()] = 1;
            iArr[C14970r1.IN_VARIANCE.ordinal()] = 2;
            iArr[C14970r1.OUT_VARIANCE.ordinal()] = 3;
            f54045a = iArr;
        }
    }

    /* renamed from: a */
    public static final C11149u m74883a(C14970r1 r1Var) {
        C13706o.m87929f(r1Var, "<this>");
        int i = C11144a.f54045a[r1Var.ordinal()];
        if (i == 1) {
            return C11149u.INV;
        }
        if (i == 2) {
            return C11149u.IN;
        }
        if (i == 3) {
            return C11149u.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
