package p433xa;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"", "T", "Lxa/d;", "value", "a", "(Lxa/d;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: xa.e */
/* compiled from: KClasses.kt */
public final class C16876e {
    /* renamed from: a */
    public static final <T> T m99929a(C16875d<T> dVar, Object obj) {
        C13706o.m87929f(dVar, "<this>");
        if (dVar.mo71940d(obj)) {
            C13706o.m87927d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.mo71942g());
    }
}
