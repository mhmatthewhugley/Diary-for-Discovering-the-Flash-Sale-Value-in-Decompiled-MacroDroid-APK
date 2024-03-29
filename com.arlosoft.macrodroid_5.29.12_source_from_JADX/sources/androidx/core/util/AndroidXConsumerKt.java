package androidx.core.util;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0004"}, mo71668d2 = {"T", "Lkotlin/coroutines/d;", "Landroidx/core/util/Consumer;", "asAndroidXConsumer", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: AndroidXConsumer.kt */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(C13635d<? super T> dVar) {
        C13706o.m87929f(dVar, "<this>");
        return new AndroidXContinuationConsumer(dVar);
    }
}
