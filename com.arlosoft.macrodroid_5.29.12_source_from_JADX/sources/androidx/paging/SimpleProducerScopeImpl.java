package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.channels.C15245x;
import p297ja.C13339u;
import p299jc.C13373a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tH\u0001J\u0015\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0001J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0005\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040$8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, mo71668d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", "T", "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/k0;", "Lkotlinx/coroutines/channels/x;", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "Lja/u;", "handler", "invokeOnClose", "cause", "close", "Lkotlinx/coroutines/channels/j;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "send", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "block", "awaitClose", "(Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "channel", "Lkotlinx/coroutines/channels/x;", "getChannel", "()Lkotlinx/coroutines/channels/x;", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "isClosedForSend", "()Z", "Ljc/a;", "getOnSend", "()Ljc/a;", "onSend", "scope", "<init>", "(Lkotlinx/coroutines/k0;Lkotlinx/coroutines/channels/x;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SimpleChannelFlow.kt */
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, C15478k0, C15245x<T> {
    private final /* synthetic */ C15478k0 $$delegate_0;
    private final C15245x<T> channel;

    public SimpleProducerScopeImpl(C15478k0 k0Var, C15245x<? super T> xVar) {
        C13706o.m87929f(k0Var, "scope");
        C13706o.m87929f(xVar, "channel");
        this.channel = xVar;
        this.$$delegate_0 = k0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object awaitClose(p370qa.C16254a<p297ja.C13339u> r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = (androidx.paging.SimpleProducerScopeImpl$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.w1 r6 = (kotlinx.coroutines.C15561w1) r6
            java.lang.Object r6 = r0.L$0
            qa.a r6 = (p370qa.C16254a) r6
            p297ja.C13332o.m85685b(r7)     // Catch:{ all -> 0x0086 }
            goto L_0x0074
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            p297ja.C13332o.m85685b(r7)
            kotlin.coroutines.g r7 = r5.getCoroutineContext()     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.w1$b r2 = kotlinx.coroutines.C15561w1.f64808x     // Catch:{ all -> 0x0086 }
            kotlin.coroutines.g$b r7 = r7.get(r2)     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x007a
            kotlinx.coroutines.w1 r7 = (kotlinx.coroutines.C15561w1) r7     // Catch:{ all -> 0x0086 }
            r0.L$0 = r6     // Catch:{ all -> 0x0086 }
            r0.L$1 = r7     // Catch:{ all -> 0x0086 }
            r0.label = r3     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.o r2 = new kotlinx.coroutines.o     // Catch:{ all -> 0x0086 }
            kotlin.coroutines.d r4 = kotlin.coroutines.intrinsics.C13649c.m87831b(r0)     // Catch:{ all -> 0x0086 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0086 }
            r2.mo74864z()     // Catch:{ all -> 0x0086 }
            androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1 r3 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1     // Catch:{ all -> 0x0086 }
            r3.<init>(r2)     // Catch:{ all -> 0x0086 }
            r7.mo74617p(r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r7 = r2.mo74862w()     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C13652d.m87832c()     // Catch:{ all -> 0x0086 }
            if (r7 != r2) goto L_0x0071
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r0)     // Catch:{ all -> 0x0086 }
        L_0x0071:
            if (r7 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r6.invoke()
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        L_0x007a:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0086 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0086 }
            r0.<init>(r7)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r7 = move-exception
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleProducerScopeImpl.awaitClose(qa.a, kotlin.coroutines.d):java.lang.Object");
    }

    public boolean close(Throwable th) {
        return this.channel.close(th);
    }

    public C15245x<T> getChannel() {
        return this.channel;
    }

    public C13640g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public C13373a<T, C15245x<T>> getOnSend() {
        return this.channel.getOnSend();
    }

    public void invokeOnClose(C16265l<? super Throwable, C13339u> lVar) {
        C13706o.m87929f(lVar, "handler");
        this.channel.invokeOnClose(lVar);
    }

    public boolean isClosedForSend() {
        return this.channel.isClosedForSend();
    }

    public boolean offer(T t) {
        return this.channel.offer(t);
    }

    public Object send(T t, C13635d<? super C13339u> dVar) {
        return this.channel.send(t, dVar);
    }

    /* renamed from: trySend-JP2dKIU  reason: not valid java name */
    public Object m101279trySendJP2dKIU(T t) {
        return this.channel.m101371trySendJP2dKIU(t);
    }
}
