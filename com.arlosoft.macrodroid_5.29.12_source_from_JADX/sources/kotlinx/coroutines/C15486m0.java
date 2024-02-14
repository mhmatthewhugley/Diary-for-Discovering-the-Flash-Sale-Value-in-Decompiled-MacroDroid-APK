package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13639f;
import p289ic.C12514a;
import p289ic.C12515b;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo71668d2 = {"Lkotlinx/coroutines/m0;", "", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "receiver", "completion", "Lja/u;", "d", "(Lqa/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "", "e", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.m0 */
/* compiled from: CoroutineStart.kt */
public enum C15486m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.m0$a */
    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class C15487a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64708a = null;

        static {
            int[] iArr = new int[C15486m0.values().length];
            iArr[C15486m0.DEFAULT.ordinal()] = 1;
            iArr[C15486m0.ATOMIC.ordinal()] = 2;
            iArr[C15486m0.UNDISPATCHED.ordinal()] = 3;
            iArr[C15486m0.LAZY.ordinal()] = 4;
            f64708a = iArr;
        }
    }

    /* renamed from: d */
    public final <R, T> void mo74837d(C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar, R r, C13635d<? super T> dVar) {
        int i = C15487a.f64708a[ordinal()];
        if (i == 1) {
            C12514a.m83621d(pVar, r, dVar, (C16265l) null, 4, (Object) null);
        } else if (i == 2) {
            C13639f.m87819a(pVar, r, dVar);
        } else if (i == 3) {
            C12515b.m83622a(pVar, r, dVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public final boolean mo74838e() {
        return this == LAZY;
    }
}
