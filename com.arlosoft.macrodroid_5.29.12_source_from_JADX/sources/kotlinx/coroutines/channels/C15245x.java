package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.internal.C15472z;
import p297ja.C13339u;
import p299jc.C13373a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u001e\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH'J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, mo71668d2 = {"Lkotlinx/coroutines/channels/x;", "E", "", "element", "Lja/u;", "send", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/j;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "cause", "", "close", "Lkotlin/Function1;", "handler", "invokeOnClose", "offer", "(Ljava/lang/Object;)Z", "isClosedForSend", "()Z", "isClosedForSend$annotations", "()V", "Ljc/a;", "getOnSend", "()Ljc/a;", "onSend", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.x */
/* compiled from: Channel.kt */
public interface C15245x<E> {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.channels.x$a */
    /* compiled from: Channel.kt */
    public static final class C15246a {
        /* renamed from: a */
        public static /* synthetic */ boolean m93924a(C15245x xVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return xVar.close(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        /* renamed from: b */
        public static <E> boolean m93925b(C15245x<? super E> xVar, E e) {
            Object r0 = xVar.m101371trySendJP2dKIU(e);
            if (C15226j.m93862j(r0)) {
                return true;
            }
            Throwable e2 = C15226j.m93857e(r0);
            if (e2 == null) {
                return false;
            }
            throw C15472z.m94488a(e2);
        }
    }

    boolean close(Throwable th);

    C13373a<E, C15245x<E>> getOnSend();

    void invokeOnClose(C16265l<? super Throwable, C13339u> lVar);

    boolean isClosedForSend();

    boolean offer(E e);

    Object send(E e, C13635d<? super C13339u> dVar);

    /* renamed from: trySend-JP2dKIU  reason: not valid java name */
    Object m101371trySendJP2dKIU(E e);
}
