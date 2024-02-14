package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.channels.C15245x;
import p297ja.C13339u;
import p299jc.C13373a;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J!\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/SimpleProducerScope;", "T", "Lkotlinx/coroutines/k0;", "Lkotlinx/coroutines/channels/x;", "Lkotlin/Function0;", "Lja/u;", "block", "awaitClose", "(Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getChannel", "()Lkotlinx/coroutines/channels/x;", "channel", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SimpleChannelFlow.kt */
public interface SimpleProducerScope<T> extends C15478k0, C15245x<T> {

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: SimpleChannelFlow.kt */
    public static final class DefaultImpls {
        public static <T> boolean offer(SimpleProducerScope<T> simpleProducerScope, T t) {
            C13706o.m87929f(simpleProducerScope, "this");
            return C15245x.C15246a.m93925b(simpleProducerScope, t);
        }
    }

    Object awaitClose(C16254a<C13339u> aVar, C13635d<? super C13339u> dVar);

    /* synthetic */ boolean close(Throwable th);

    C15245x<T> getChannel();

    /* synthetic */ C13640g getCoroutineContext();

    /* synthetic */ C13373a getOnSend();

    /* synthetic */ void invokeOnClose(C16265l<? super Throwable, C13339u> lVar);

    /* synthetic */ boolean isClosedForSend();

    /* synthetic */ boolean offer(Object obj);

    /* synthetic */ Object send(Object obj, C13635d dVar);

    /* renamed from: trySend-JP2dKIU  reason: not valid java name */
    /* synthetic */ Object m101278trySendJP2dKIU(Object obj);
}
