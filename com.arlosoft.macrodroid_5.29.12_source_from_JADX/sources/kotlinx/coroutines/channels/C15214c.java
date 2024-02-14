package kotlinx.coroutines.channels;

import androidx.concurrent.futures.C0320a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.C15501p;
import kotlinx.coroutines.C15505q;
import kotlinx.coroutines.channels.C15245x;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15449j;
import kotlinx.coroutines.internal.C15453m;
import kotlinx.coroutines.internal.C15454n;
import kotlinx.coroutines.internal.C15455o;
import kotlinx.coroutines.internal.C15466u;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p299jc.C13373a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001VB)\u0012 \u0010T\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010+j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`S¢\u0006\u0004\bU\u0010/J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0$2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010\u0019J\u0019\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u001aH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020!2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\t2\u0018\u0010-\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0+j\u0002`,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\t2\u0006\u0010\u0004\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u001a\u0010=\u001a\u0002088\u0004X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u0002058BX\u0004¢\u0006\u0006\u001a\u0004\bA\u00107R\u0014\u0010D\u001a\u00020!8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0014\u0010F\u001a\u00020!8$X¤\u0004¢\u0006\u0006\u001a\u0004\bE\u0010?R\u001a\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010L\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bL\u0010?R#\u0010P\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u0002058TX\u0004¢\u0006\u0006\u001a\u0004\bQ\u00107\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006W"}, mo71668d2 = {"Lkotlinx/coroutines/channels/c;", "E", "Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/channels/m;", "closed", "", "m", "(Lkotlinx/coroutines/channels/m;)Ljava/lang/Throwable;", "element", "Lja/u;", "x", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "p", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lkotlinx/coroutines/channels/m;)V", "cause", "q", "(Ljava/lang/Throwable;)V", "l", "(Lkotlinx/coroutines/channels/m;)V", "", "d", "()I", "", "u", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/w;", "z", "()Lkotlinx/coroutines/channels/w;", "Lkotlinx/coroutines/channels/u;", "w", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/u;", "send", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/j;", "trySend-JP2dKIU", "trySend", "e", "(Lkotlinx/coroutines/channels/w;)Ljava/lang/Object;", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lqa/l;)V", "Lkotlinx/coroutines/internal/o;", "v", "(Lkotlinx/coroutines/internal/o;)V", "y", "()Lkotlinx/coroutines/channels/u;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/m;", "c", "Lkotlinx/coroutines/internal/m;", "j", "()Lkotlinx/coroutines/internal/m;", "queue", "t", "()Z", "isFullImpl", "k", "queueDebugStateString", "r", "isBufferAlwaysFull", "s", "isBufferFull", "i", "()Lkotlinx/coroutines/channels/m;", "closedForSend", "h", "closedForReceive", "isClosedForSend", "Ljc/a;", "getOnSend", "()Ljc/a;", "onSend", "g", "bufferDebugString", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.c */
/* compiled from: AbstractChannel.kt */
public abstract class C15214c<E> implements C15245x<E> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64428d = AtomicReferenceFieldUpdater.newUpdater(C15214c.class, Object.class, "onCloseHandler");

    /* renamed from: a */
    protected final C16265l<E, C13339u> f64429a;

    /* renamed from: c */
    private final C15453m f64430c = new C15453m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0012¨\u0006\u0016"}, mo71668d2 = {"Lkotlinx/coroutines/channels/c$a;", "E", "Lkotlinx/coroutines/channels/w;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/a0;", "G", "Lja/u;", "D", "Lkotlinx/coroutines/channels/m;", "closed", "F", "", "toString", "f", "Ljava/lang/Object;", "element", "", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.c$a */
    /* compiled from: AbstractChannel.kt */
    public static final class C15215a<E> extends C15244w {

        /* renamed from: f */
        public final E f64431f;

        public C15215a(E e) {
            this.f64431f = e;
        }

        /* renamed from: D */
        public void mo74565D() {
        }

        /* renamed from: E */
        public Object mo74566E() {
            return this.f64431f;
        }

        /* renamed from: F */
        public void mo74567F(C15232m<?> mVar) {
        }

        /* renamed from: G */
        public C15429a0 mo74568G(C15455o.C15457b bVar) {
            return C15501p.f64720a;
        }

        public String toString() {
            return "SendBuffered@" + C15498o0.m94572b(this) + '(' + this.f64431f + ')';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/channels/c$b", "Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "i", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.c$b */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C15216b extends C15455o.C15456a {

        /* renamed from: d */
        final /* synthetic */ C15455o f64432d;

        /* renamed from: e */
        final /* synthetic */ C15214c f64433e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15216b(C15455o oVar, C15214c cVar) {
            super(oVar);
            this.f64432d = oVar;
            this.f64433e = cVar;
        }

        /* renamed from: i */
        public Object mo74551g(C15455o oVar) {
            if (this.f64433e.mo74559s()) {
                return null;
            }
            return C15454n.m94421a();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, mo71668d2 = {"kotlinx/coroutines/channels/c$c", "Ljc/a;", "Lkotlinx/coroutines/channels/x;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.c$c */
    /* compiled from: AbstractChannel.kt */
    public static final class C15217c implements C13373a<E, C15245x<? super E>> {

        /* renamed from: a */
        final /* synthetic */ C15214c<E> f64434a;

        C15217c(C15214c<E> cVar) {
            this.f64434a = cVar;
        }
    }

    public C15214c(C16265l<? super E, C13339u> lVar) {
        this.f64429a = lVar;
    }

    /* renamed from: d */
    private final int m93799d() {
        C15453m mVar = this.f64430c;
        int i = 0;
        for (C15455o oVar = (C15455o) mVar.mo74802s(); !C13706o.m87924a(oVar, mVar); oVar = oVar.mo74803t()) {
            if (oVar instanceof C15455o) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    private final String m93800k() {
        String str;
        C15455o t = this.f64430c.mo74803t();
        if (t == this.f64430c) {
            return "EmptyQueue";
        }
        if (t instanceof C15232m) {
            str = t.toString();
        } else if (t instanceof C15240s) {
            str = "ReceiveQueued";
        } else if (t instanceof C15244w) {
            str = "SendQueued";
        } else {
            str = C13706o.m87936m("UNEXPECTED:", t);
        }
        C15455o u = this.f64430c.mo74804u();
        if (u == t) {
            return str;
        }
        String str2 = str + ",queueSize=" + m93799d();
        if (!(u instanceof C15232m)) {
            return str2;
        }
        return str2 + ",closedForSend=" + u;
    }

    /* renamed from: l */
    private final void m93801l(C15232m<?> mVar) {
        Object b = C15449j.m94408b((Object) null, 1, (C13695i) null);
        while (true) {
            C15455o u = mVar.mo74804u();
            C15240s sVar = u instanceof C15240s ? (C15240s) u : null;
            if (sVar == null) {
                break;
            } else if (!sVar.mo74594y()) {
                sVar.mo74805v();
            } else {
                b = C15449j.m94409c(b, sVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((C15240s) b).mo74544F(mVar);
            } else {
                ArrayList arrayList = (ArrayList) b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((C15240s) arrayList.get(size)).mo74544F(mVar);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            }
        }
        mo74562v(mVar);
    }

    /* renamed from: m */
    private final Throwable m93802m(C15232m<?> mVar) {
        m93801l(mVar);
        return mVar.mo74587L();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m93803p(C13635d<?> dVar, E e, C15232m<?> mVar) {
        UndeliveredElementException d;
        m93801l(mVar);
        Throwable L = mVar.mo74587L();
        C16265l<E, C13339u> lVar = this.f64429a;
        if (lVar == null || (d = C15466u.m94477d(lVar, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            C13329n.C13330a aVar = C13329n.f61327a;
            dVar.resumeWith(C13329n.m85676a(C13332o.m85684a(L)));
            return;
        }
        C13315b.m85661a(d, L);
        C13329n.C13330a aVar2 = C13329n.f61327a;
        dVar.resumeWith(C13329n.m85676a(C13332o.m85684a(d)));
    }

    /* renamed from: q */
    private final void m93804q(Throwable th) {
        C15429a0 a0Var;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (a0Var = C15213b.f64427f) && C0320a.m383a(f64428d, this, obj, a0Var)) {
            ((C16265l) C13698j0.m87907g(obj, 1)).invoke(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final boolean m93805t() {
        return !(this.f64430c.mo74803t() instanceof C15242u) && mo74559s();
    }

    /* renamed from: x */
    private final Object m93806x(E e, C13635d<? super C13339u> dVar) {
        C15244w wVar;
        C15497o b = C15505q.m94588b(C13649c.m87831b(dVar));
        while (true) {
            if (m93805t()) {
                if (this.f64429a == null) {
                    wVar = new C15247y(e, b);
                } else {
                    wVar = new C15248z(e, b, this.f64429a);
                }
                Object e2 = mo74553e(wVar);
                if (e2 == null) {
                    C15505q.m94589c(b, wVar);
                    break;
                } else if (e2 instanceof C15232m) {
                    m93803p(b, e, (C15232m) e2);
                    break;
                } else if (e2 != C15213b.f64426e && !(e2 instanceof C15240s)) {
                    throw new IllegalStateException(C13706o.m87936m("enqueueSend returned ", e2).toString());
                }
            }
            Object u = mo74561u(e);
            if (u == C15213b.f64423b) {
                C13329n.C13330a aVar = C13329n.f61327a;
                b.resumeWith(C13329n.m85676a(C13339u.f61331a));
                break;
            } else if (u != C15213b.f64424c) {
                if (u instanceof C15232m) {
                    m93803p(b, e, (C15232m) u);
                } else {
                    throw new IllegalStateException(C13706o.m87936m("offerInternal returned ", u).toString());
                }
            }
        }
        Object w = b.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : C13339u.f61331a;
    }

    public boolean close(Throwable th) {
        boolean z;
        C15232m mVar = new C15232m(th);
        C15453m mVar2 = this.f64430c;
        while (true) {
            C15455o u = mVar2.mo74804u();
            z = true;
            if (!(u instanceof C15232m)) {
                if (u.mo74800l(mVar, mVar2)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            mVar = (C15232m) this.f64430c.mo74804u();
        }
        m93801l(mVar);
        if (z) {
            m93804q(th);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo74553e(C15244w wVar) {
        boolean z;
        C15455o u;
        if (mo74558r()) {
            C15453m mVar = this.f64430c;
            do {
                u = mVar.mo74804u();
                if (u instanceof C15242u) {
                    return u;
                }
            } while (!u.mo74800l(wVar, mVar));
            return null;
        }
        C15453m mVar2 = this.f64430c;
        C15216b bVar = new C15216b(wVar, this);
        while (true) {
            C15455o u2 = mVar2.mo74804u();
            if (!(u2 instanceof C15242u)) {
                int C = u2.mo74798C(wVar, mVar2, bVar);
                z = true;
                if (C != 1) {
                    if (C == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return u2;
            }
        }
        if (!z) {
            return C15213b.f64426e;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo74554g() {
        return "";
    }

    public final C13373a<E, C15245x<E>> getOnSend() {
        return new C15217c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C15232m<?> mo74555h() {
        C15455o t = this.f64430c.mo74803t();
        C15232m<?> mVar = t instanceof C15232m ? (C15232m) t : null;
        if (mVar == null) {
            return null;
        }
        m93801l(mVar);
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C15232m<?> mo74556i() {
        C15455o u = this.f64430c.mo74804u();
        C15232m<?> mVar = u instanceof C15232m ? (C15232m) u : null;
        if (mVar == null) {
            return null;
        }
        m93801l(mVar);
        return mVar;
    }

    public void invokeOnClose(C16265l<? super Throwable, C13339u> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64428d;
        if (!C0320a.m383a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == C15213b.f64427f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(C13706o.m87936m("Another handler was already registered: ", obj));
        }
        C15232m<?> i = mo74556i();
        if (i != null && C0320a.m383a(atomicReferenceFieldUpdater, this, lVar, C15213b.f64427f)) {
            lVar.invoke(i.f64453f);
        }
    }

    public final boolean isClosedForSend() {
        return mo74556i() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C15453m mo74557j() {
        return this.f64430c;
    }

    public boolean offer(E e) {
        UndeliveredElementException d;
        try {
            return C15245x.C15246a.m93925b(this, e);
        } catch (Throwable th) {
            C16265l<E, C13339u> lVar = this.f64429a;
            if (lVar == null || (d = C15466u.m94477d(lVar, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
                throw th;
            }
            C13315b.m85661a(d, th);
            throw d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo74558r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo74559s();

    public final Object send(E e, C13635d<? super C13339u> dVar) {
        if (mo74561u(e) == C15213b.f64423b) {
            return C13339u.f61331a;
        }
        Object x = m93806x(e, dVar);
        return x == C13652d.m87832c() ? x : C13339u.f61331a;
    }

    public String toString() {
        return C15498o0.m94571a(this) + '@' + C15498o0.m94572b(this) + '{' + m93800k() + '}' + mo74554g();
    }

    /* renamed from: trySend-JP2dKIU  reason: not valid java name */
    public final Object m101369trySendJP2dKIU(E e) {
        Object u = mo74561u(e);
        if (u == C15213b.f64423b) {
            return C15226j.f64449b.mo74583c(C13339u.f61331a);
        }
        if (u == C15213b.f64424c) {
            C15232m<?> i = mo74556i();
            if (i == null) {
                return C15226j.f64449b.mo74582b();
            }
            return C15226j.f64449b.mo74581a(m93802m(i));
        } else if (u instanceof C15232m) {
            return C15226j.f64449b.mo74581a(m93802m((C15232m) u));
        } else {
            throw new IllegalStateException(C13706o.m87936m("trySend returned ", u).toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo74561u(E e) {
        C15242u y;
        do {
            y = mo74539y();
            if (y == null) {
                return C15213b.f64424c;
            }
        } while (y.mo74547h(e, (C15455o.C15457b) null) == null);
        y.mo74546g(e);
        return y.mo74588a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo74562v(C15455o oVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C15242u<?> mo74563w(E e) {
        C15455o u;
        C15453m mVar = this.f64430c;
        C15215a aVar = new C15215a(e);
        do {
            u = mVar.mo74804u();
            if (u instanceof C15242u) {
                return (C15242u) u;
            }
        } while (!u.mo74800l(aVar, mVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C15242u<E> mo74539y() {
        C15455o oVar;
        C15455o A;
        C15453m mVar = this.f64430c;
        while (true) {
            oVar = (C15455o) mVar.mo74802s();
            if (oVar != mVar && (oVar instanceof C15242u)) {
                if (((((C15242u) oVar) instanceof C15232m) && !oVar.mo74796x()) || (A = oVar.mo74797A()) == null) {
                    break;
                }
                A.mo74806w();
            }
        }
        oVar = null;
        return (C15242u) oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C15244w mo74564z() {
        C15455o oVar;
        C15455o A;
        C15453m mVar = this.f64430c;
        while (true) {
            oVar = (C15455o) mVar.mo74802s();
            if (oVar != mVar && (oVar instanceof C15244w)) {
                if (((((C15244w) oVar) instanceof C15232m) && !oVar.mo74796x()) || (A = oVar.mo74797A()) == null) {
                    break;
                }
                A.mo74806w();
            }
        }
        oVar = null;
        return (C15244w) oVar;
    }
}
