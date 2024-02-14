package p297ja;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, mo71668d2 = {"T", "Lkotlin/Function0;", "initializer", "Lja/g;", "b", "Lja/k;", "mode", "a", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/LazyKt")
/* renamed from: ja.i */
/* compiled from: LazyJVM.kt */
class C13323i {

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: ja.i$a */
    /* compiled from: LazyJVM.kt */
    public /* synthetic */ class C13324a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61322a;

        static {
            int[] iArr = new int[C13326k.values().length];
            iArr[C13326k.SYNCHRONIZED.ordinal()] = 1;
            iArr[C13326k.PUBLICATION.ordinal()] = 2;
            iArr[C13326k.f61325d.ordinal()] = 3;
            f61322a = iArr;
        }
    }

    /* renamed from: a */
    public static <T> C13321g<T> m85668a(C13326k kVar, C16254a<? extends T> aVar) {
        C13706o.m87929f(kVar, "mode");
        C13706o.m87929f(aVar, "initializer");
        int i = C13324a.f61322a[kVar.ordinal()];
        if (i == 1) {
            return new C13335q(aVar, (Object) null, 2, (C13695i) null);
        }
        if (i == 2) {
            return new C13333p(aVar);
        }
        if (i == 3) {
            return new C13340v(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static <T> C13321g<T> m85669b(C16254a<? extends T> aVar) {
        C13706o.m87929f(aVar, "initializer");
        return new C13335q(aVar, (Object) null, 2, (C13695i) null);
    }
}
