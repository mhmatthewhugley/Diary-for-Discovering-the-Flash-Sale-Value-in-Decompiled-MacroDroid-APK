package androidx.core.util;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, mo71668d2 = {"Lkotlin/coroutines/d;", "Lja/u;", "Ljava/lang/Runnable;", "asRunnable", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Runnable.kt */
public final class RunnableKt {
    public static final Runnable asRunnable(C13635d<? super C13339u> dVar) {
        C13706o.m87929f(dVar, "<this>");
        return new ContinuationRunnable(dVar);
    }
}
