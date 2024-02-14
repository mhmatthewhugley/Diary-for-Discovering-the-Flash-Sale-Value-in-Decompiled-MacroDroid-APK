package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo71668d2 = {"", "", "index", "I", "(Ljava/util/List;I)I", "J", "T", "", "H", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.z */
/* compiled from: ReversedViews.kt */
class C13626z extends C13624y {
    /* renamed from: H */
    public static <T> List<T> m87803H(List<T> list) {
        C13706o.m87929f(list, "<this>");
        return new C13621w0(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final int m87804I(List<?> list, int i) {
        if (new C16788e(0, C13614t.m87750l(list)).mo79775k(i)) {
            return C13614t.m87750l(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C16788e(0, C13614t.m87750l(list)) + "].");
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final int m87805J(List<?> list, int i) {
        if (new C16788e(0, list.size()).mo79775k(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C16788e(0, list.size()) + "].");
    }
}
