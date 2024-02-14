package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.internal.C15441f;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, mo71668d2 = {"Lkotlin/coroutines/d;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o0 */
/* compiled from: DebugStrings.kt */
public final class C15498o0 {
    /* renamed from: a */
    public static final String m94571a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m94572b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m94573c(C13635d<?> dVar) {
        Object obj;
        if (dVar instanceof C15441f) {
            return dVar.toString();
        }
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            obj = C13329n.m85676a(dVar + '@' + m94572b(dVar));
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            obj = C13329n.m85676a(C13332o.m85684a(th));
        }
        Throwable c = C13329n.m85678c(obj);
        String str = obj;
        if (c != null) {
            str = dVar.getClass().getName() + '@' + m94572b(dVar);
        }
        return (String) str;
    }
}
