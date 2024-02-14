package kotlinx.coroutines.internal;

import kotlin.Metadata;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u001c\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, mo71668d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "b", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/e;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.z */
/* compiled from: StackTraceRecovery.kt */
public final class C15472z {

    /* renamed from: a */
    private static final String f64697a;

    /* renamed from: b */
    private static final String f64698b;

    static {
        Object obj;
        Object obj2;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            obj = C13329n.m85676a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            obj = C13329n.m85676a(C13332o.m85684a(th));
        }
        if (C13329n.m85678c(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f64697a = (String) obj;
        try {
            C13329n.C13330a aVar3 = C13329n.f61327a;
            obj2 = C13329n.m85676a(C15472z.class.getCanonicalName());
        } catch (Throwable th2) {
            C13329n.C13330a aVar4 = C13329n.f61327a;
            obj2 = C13329n.m85676a(C13332o.m85684a(th2));
        }
        if (C13329n.m85678c(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f64698b = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m94488a(E e) {
        return e;
    }
}
