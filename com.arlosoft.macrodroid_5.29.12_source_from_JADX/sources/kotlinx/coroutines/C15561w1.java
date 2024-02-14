package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0019J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\u0013\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H&J6\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H'R\u0014\u0010\u001b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo71668d2 = {"Lkotlinx/coroutines/w1;", "Lkotlin/coroutines/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "g", "", "start", "cause", "Lja/u;", "c", "Lkotlinx/coroutines/v;", "child", "Lkotlinx/coroutines/t;", "A", "x", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/c1;", "p", "onCancelling", "invokeImmediately", "y", "b", "()Z", "isActive", "w", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.w1 */
/* compiled from: Job.kt */
public interface C15561w1 extends C13640g.C13643b {

    /* renamed from: x */
    public static final C15563b f64808x = C15563b.f64809a;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.w1$a */
    /* compiled from: Job.kt */
    public static final class C15562a {
        /* renamed from: a */
        public static /* synthetic */ void m94723a(C15561w1 w1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                w1Var.mo74534c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m94724b(C15561w1 w1Var, R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
            return C13640g.C13643b.C13644a.m87822a(w1Var, r, pVar);
        }

        /* renamed from: c */
        public static <E extends C13640g.C13643b> E m94725c(C15561w1 w1Var, C13640g.C13645c<E> cVar) {
            return C13640g.C13643b.C13644a.m87823b(w1Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C15202c1 m94726d(C15561w1 w1Var, boolean z, boolean z2, C16265l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return w1Var.mo74627y(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C13640g m94727e(C15561w1 w1Var, C13640g.C13645c<?> cVar) {
            return C13640g.C13643b.C13644a.m87824c(w1Var, cVar);
        }

        /* renamed from: f */
        public static C13640g m94728f(C15561w1 w1Var, C13640g gVar) {
            return C13640g.C13643b.C13644a.m87825d(w1Var, gVar);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"Lkotlinx/coroutines/w1$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/w1;", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.w1$b */
    /* compiled from: Job.kt */
    public static final class C15563b implements C13640g.C13645c<C15561w1> {

        /* renamed from: a */
        static final /* synthetic */ C15563b f64809a = new C15563b();

        private C15563b() {
        }
    }

    /* renamed from: A */
    C15545t mo74598A(C15555v vVar);

    /* renamed from: b */
    boolean mo74487b();

    /* renamed from: c */
    void mo74534c(CancellationException cancellationException);

    /* renamed from: g */
    CancellationException mo74612g();

    boolean isCancelled();

    /* renamed from: p */
    C15202c1 mo74617p(C16265l<? super Throwable, C13339u> lVar);

    boolean start();

    /* renamed from: w */
    boolean mo74625w();

    /* renamed from: x */
    Object mo74626x(C13635d<? super C13339u> dVar);

    /* renamed from: y */
    C15202c1 mo74627y(boolean z, boolean z2, C16265l<? super Throwable, C13339u> lVar);
}
