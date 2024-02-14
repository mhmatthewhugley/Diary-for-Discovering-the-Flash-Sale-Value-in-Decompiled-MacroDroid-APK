package p210ab;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14686e;
import p442yb.C17012n;

/* renamed from: ab.d */
/* compiled from: FunctionClassScope.kt */
public final class C11087d extends C14686e {

    /* renamed from: ab.d$a */
    /* compiled from: FunctionClassScope.kt */
    public /* synthetic */ class C11088a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54008a;

        static {
            int[] iArr = new int[C11084c.values().length];
            iArr[C11084c.Function.ordinal()] = 1;
            iArr[C11084c.SuspendFunction.ordinal()] = 2;
            f54008a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11087d(C17012n nVar, C11080b bVar) {
        super(nVar, bVar);
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(bVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public List<C14154y> mo62203i() {
        C13948e l = mo73817l();
        C13706o.m87927d(l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i = C11088a.f54008a[((C11080b) l).mo62156U0().ordinal()];
        if (i == 1) {
            return C13612s.m87736e(C11089e.f54009V.mo62208a((C11080b) mo73817l(), false));
        }
        if (i != 2) {
            return C13614t.m87748j();
        }
        return C13612s.m87736e(C11089e.f54009V.mo62208a((C11080b) mo73817l(), true));
    }
}
