package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15245x;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo71668d2 = {"Landroidx/paging/ChannelFlowCollector;", "T", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/x;", "channel", "Lkotlinx/coroutines/channels/x;", "getChannel", "()Lkotlinx/coroutines/channels/x;", "<init>", "(Lkotlinx/coroutines/channels/x;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: FlowExt.kt */
public final class ChannelFlowCollector<T> implements C15288g<T> {
    private final C15245x<T> channel;

    public ChannelFlowCollector(C15245x<? super T> xVar) {
        C13706o.m87929f(xVar, "channel");
        this.channel = xVar;
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        Object send = getChannel().send(t, dVar);
        return send == C13652d.m87832c() ? send : C13339u.f61331a;
    }

    public final C15245x<T> getChannel() {
        return this.channel;
    }
}
