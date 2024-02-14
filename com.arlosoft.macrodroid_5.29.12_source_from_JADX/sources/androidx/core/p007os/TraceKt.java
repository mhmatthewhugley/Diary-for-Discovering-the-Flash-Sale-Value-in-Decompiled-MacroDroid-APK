package androidx.core.p007os;

import kotlin.Metadata;
import kotlin.jvm.internal.C13705n;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, mo71668d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lqa/a;)Ljava/lang/Object;", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.TraceKt */
/* compiled from: Trace.kt */
public final class TraceKt {
    public static final <T> T trace(String str, C16254a<? extends T> aVar) {
        C13706o.m87929f(str, "sectionName");
        C13706o.m87929f(aVar, "block");
        TraceCompat.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            C13705n.m87922b(1);
            TraceCompat.endSection();
            C13705n.m87921a(1);
        }
    }
}
