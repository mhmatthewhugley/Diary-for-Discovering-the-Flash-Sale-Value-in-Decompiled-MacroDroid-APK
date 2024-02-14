package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15259e;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.C15501p;
import kotlinx.coroutines.C15505q;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15449j;
import kotlinx.coroutines.internal.C15453m;
import kotlinx.coroutines.internal.C15454n;
import kotlinx.coroutines.internal.C15455o;
import kotlinx.coroutines.internal.C15466u;
import kotlinx.coroutines.internal.C15472z;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005;<\u001c=>B)\u0012 \u00108\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u000106j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`7¢\u0006\u0004\b9\u0010:J!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J \u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0013\u0010\u0013\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0001\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000bH\u0014J/\u0010'\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0002J\u0010\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010+H\u0014J\b\u0010-\u001a\u00020\u000fH\u0014J\b\u0010.\u001a\u00020\u000fH\u0014R\u0014\u00101\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b4\u00100\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006?"}, mo71668d2 = {"Lkotlinx/coroutines/channels/a;", "E", "Lkotlinx/coroutines/channels/c;", "Lkotlinx/coroutines/channels/f;", "R", "", "receiveMode", "N", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/s;", "receive", "", "D", "Lkotlinx/coroutines/n;", "cont", "Lja/u;", "O", "", "M", "o", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/j;", "n", "f", "()Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "", "C", "(Ljava/lang/Throwable;)Z", "wasClosed", "I", "Lkotlinx/coroutines/internal/j;", "Lkotlinx/coroutines/channels/w;", "list", "Lkotlinx/coroutines/channels/m;", "closed", "J", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/m;)V", "Lkotlinx/coroutines/channels/h;", "iterator", "Lkotlinx/coroutines/channels/u;", "y", "L", "K", "F", "()Z", "isBufferAlwaysEmpty", "G", "isBufferEmpty", "H", "isClosedForReceive", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lqa/l;)V", "a", "b", "d", "e", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.a */
/* compiled from: AbstractChannel.kt */
public abstract class C15205a<E> extends C15214c<E> implements C15221f<E> {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005HBø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo71668d2 = {"Lkotlinx/coroutines/channels/a$a;", "E", "Lkotlinx/coroutines/channels/h;", "", "result", "", "c", "d", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "next", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", "Lkotlinx/coroutines/channels/a;", "channel", "b", "Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "<init>", "(Lkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$a */
    /* compiled from: AbstractChannel.kt */
    private static final class C15206a<E> implements C15224h<E> {

        /* renamed from: a */
        public final C15205a<E> f64411a;

        /* renamed from: b */
        private Object f64412b = C15213b.f64425d;

        public C15206a(C15205a<E> aVar) {
            this.f64411a = aVar;
        }

        /* renamed from: c */
        private final boolean m93780c(Object obj) {
            if (!(obj instanceof C15232m)) {
                return true;
            }
            C15232m mVar = (C15232m) obj;
            if (mVar.f64453f == null) {
                return false;
            }
            throw C15472z.m94488a(mVar.mo74586K());
        }

        /* renamed from: d */
        private final Object m93781d(C13635d<? super Boolean> dVar) {
            C15497o b = C15505q.m94588b(C13649c.m87831b(dVar));
            C15209d dVar2 = new C15209d(this, b);
            while (true) {
                if (this.f64411a.m93762D(dVar2)) {
                    this.f64411a.m93764O(b, dVar2);
                    break;
                }
                Object M = this.f64411a.mo74533M();
                mo74542e(M);
                if (M instanceof C15232m) {
                    C15232m mVar = (C15232m) M;
                    if (mVar.f64453f == null) {
                        C13329n.C13330a aVar = C13329n.f61327a;
                        b.resumeWith(C13329n.m85676a(C13654b.m87833a(false)));
                    } else {
                        C13329n.C13330a aVar2 = C13329n.f61327a;
                        b.resumeWith(C13329n.m85676a(C13332o.m85684a(mVar.mo74586K())));
                    }
                } else if (M != C15213b.f64425d) {
                    Boolean a = C13654b.m87833a(true);
                    C16265l<E, C13339u> lVar = this.f64411a.f64429a;
                    b.mo74846l(a, lVar == null ? null : C15466u.m94474a(lVar, M, b.getContext()));
                }
            }
            Object w = b.mo74862w();
            if (w == C13652d.m87832c()) {
                C13660h.m87847c(dVar);
            }
            return w;
        }

        /* renamed from: a */
        public Object mo74540a(C13635d<? super Boolean> dVar) {
            Object b = mo74541b();
            C15429a0 a0Var = C15213b.f64425d;
            if (b != a0Var) {
                return C13654b.m87833a(m93780c(mo74541b()));
            }
            mo74542e(this.f64411a.mo74533M());
            if (mo74541b() != a0Var) {
                return C13654b.m87833a(m93780c(mo74541b()));
            }
            return m93781d(dVar);
        }

        /* renamed from: b */
        public final Object mo74541b() {
            return this.f64412b;
        }

        /* renamed from: e */
        public final void mo74542e(Object obj) {
            this.f64412b = obj;
        }

        public E next() {
            E e = this.f64412b;
            if (!(e instanceof C15232m)) {
                E e2 = C15213b.f64425d;
                if (e != e2) {
                    this.f64412b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C15472z.m94488a(((C15232m) e).mo74586K());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001d"}, mo71668d2 = {"Lkotlinx/coroutines/channels/a$b;", "E", "Lkotlinx/coroutines/channels/s;", "value", "", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/a0;", "h", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/a0;", "Lja/u;", "g", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/m;", "closed", "F", "", "toString", "Lkotlinx/coroutines/n;", "f", "Lkotlinx/coroutines/n;", "cont", "", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/n;I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$b */
    /* compiled from: AbstractChannel.kt */
    private static class C15207b<E> extends C15240s<E> {

        /* renamed from: f */
        public final C15492n<Object> f64413f;

        /* renamed from: g */
        public final int f64414g;

        public C15207b(C15492n<Object> nVar, int i) {
            this.f64413f = nVar;
            this.f64414g = i;
        }

        /* renamed from: F */
        public void mo74544F(C15232m<?> mVar) {
            if (this.f64414g == 1) {
                C15492n<Object> nVar = this.f64413f;
                C13329n.C13330a aVar = C13329n.f61327a;
                nVar.resumeWith(C13329n.m85676a(C15226j.m93854b(C15226j.f64449b.mo74581a(mVar.f64453f))));
                return;
            }
            C15492n<Object> nVar2 = this.f64413f;
            C13329n.C13330a aVar2 = C13329n.f61327a;
            nVar2.resumeWith(C13329n.m85676a(C13332o.m85684a(mVar.mo74586K())));
        }

        /* renamed from: G */
        public final Object mo74545G(E e) {
            return this.f64414g == 1 ? C15226j.m93854b(C15226j.f64449b.mo74583c(e)) : e;
        }

        /* renamed from: g */
        public void mo74546g(E e) {
            this.f64413f.mo74841B(C15501p.f64720a);
        }

        /* renamed from: h */
        public C15429a0 mo74547h(E e, C15455o.C15457b bVar) {
            if (this.f64413f.mo74848t(mo74545G(e), (Object) null, mo74548E(e)) == null) {
                return null;
            }
            return C15501p.f64720a;
        }

        public String toString() {
            return "ReceiveElement@" + C15498o0.m94572b(this) + "[receiveMode=" + this.f64414g + ']';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0001\u0010\u0007¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/channels/a$c;", "E", "Lkotlinx/coroutines/channels/a$b;", "value", "Lkotlin/Function1;", "", "Lja/u;", "(Ljava/lang/Object;)Lqa/l;", "Lkotlinx/coroutines/n;", "", "cont", "", "receiveMode", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlinx/coroutines/n;ILqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$c */
    /* compiled from: AbstractChannel.kt */
    private static final class C15208c<E> extends C15207b<E> {

        /* renamed from: o */
        public final C16265l<E, C13339u> f64415o;

        public C15208c(C15492n<Object> nVar, int i, C16265l<? super E, C13339u> lVar) {
            super(nVar, i);
            this.f64415o = lVar;
        }

        /* renamed from: E */
        public C16265l<Throwable, C13339u> mo74548E(E e) {
            return C15466u.m94474a(this.f64415o, e, this.f64413f.getContext());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0001\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001e"}, mo71668d2 = {"Lkotlinx/coroutines/channels/a$d;", "E", "Lkotlinx/coroutines/channels/s;", "value", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/a0;", "h", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/a0;", "Lja/u;", "g", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/m;", "closed", "F", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lqa/l;", "", "toString", "Lkotlinx/coroutines/channels/a$a;", "f", "Lkotlinx/coroutines/channels/a$a;", "iterator", "Lkotlinx/coroutines/n;", "", "Lkotlinx/coroutines/n;", "cont", "<init>", "(Lkotlinx/coroutines/channels/a$a;Lkotlinx/coroutines/n;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$d */
    /* compiled from: AbstractChannel.kt */
    private static class C15209d<E> extends C15240s<E> {

        /* renamed from: f */
        public final C15206a<E> f64416f;

        /* renamed from: g */
        public final C15492n<Boolean> f64417g;

        public C15209d(C15206a<E> aVar, C15492n<? super Boolean> nVar) {
            this.f64416f = aVar;
            this.f64417g = nVar;
        }

        /* renamed from: E */
        public C16265l<Throwable, C13339u> mo74548E(E e) {
            C16265l<E, C13339u> lVar = this.f64416f.f64411a.f64429a;
            if (lVar == null) {
                return null;
            }
            return C15466u.m94474a(lVar, e, this.f64417g.getContext());
        }

        /* renamed from: F */
        public void mo74544F(C15232m<?> mVar) {
            Object obj;
            if (mVar.f64453f == null) {
                obj = C15492n.C15493a.m94523b(this.f64417g, Boolean.FALSE, (Object) null, 2, (Object) null);
            } else {
                obj = this.f64417g.mo74844j(mVar.mo74586K());
            }
            if (obj != null) {
                this.f64416f.mo74542e(mVar);
                this.f64417g.mo74841B(obj);
            }
        }

        /* renamed from: g */
        public void mo74546g(E e) {
            this.f64416f.mo74542e(e);
            this.f64417g.mo74841B(C15501p.f64720a);
        }

        /* renamed from: h */
        public C15429a0 mo74547h(E e, C15455o.C15457b bVar) {
            if (this.f64417g.mo74848t(Boolean.TRUE, (Object) null, mo74548E(e)) == null) {
                return null;
            }
            return C15501p.f64720a;
        }

        public String toString() {
            return C13706o.m87936m("ReceiveHasNext@", C15498o0.m94572b(this));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/channels/a$e;", "Lkotlinx/coroutines/e;", "", "cause", "Lja/u;", "a", "", "toString", "Lkotlinx/coroutines/channels/s;", "Lkotlinx/coroutines/channels/s;", "receive", "<init>", "(Lkotlinx/coroutines/channels/a;Lkotlinx/coroutines/channels/s;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$e */
    /* compiled from: AbstractChannel.kt */
    private final class C15210e extends C15259e {

        /* renamed from: a */
        private final C15240s<?> f64418a;

        public C15210e(C15240s<?> sVar) {
            this.f64418a = sVar;
        }

        /* renamed from: a */
        public void mo74549a(Throwable th) {
            if (this.f64418a.mo74594y()) {
                C15205a.this.mo74531K();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74549a((Throwable) obj);
            return C13339u.f61331a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f64418a + ']';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/channels/a$f", "Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "i", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$f */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C15211f extends C15455o.C15456a {

        /* renamed from: d */
        final /* synthetic */ C15455o f64420d;

        /* renamed from: e */
        final /* synthetic */ C15205a f64421e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15211f(C15455o oVar, C15205a aVar) {
            super(oVar);
            this.f64420d = oVar;
            this.f64421e = aVar;
        }

        /* renamed from: i */
        public Object mo74551g(C15455o oVar) {
            if (this.f64421e.mo74527G()) {
                return null;
            }
            return C15454n.m94421a();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.channels.AbstractChannel", mo71894f = "AbstractChannel.kt", mo71895l = {633}, mo71896m = "receiveCatching-JP2dKIU")
    /* renamed from: kotlinx.coroutines.channels.a$g */
    /* compiled from: AbstractChannel.kt */
    static final class C15212g extends C13656d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C15205a<E> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15212g(C15205a<E> aVar, C13635d<? super C15212g> dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object n = this.this$0.mo74537n(this);
            return n == C13652d.m87832c() ? n : C15226j.m93854b(n);
        }
    }

    public C15205a(C16265l<? super E, C13339u> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final boolean m93762D(C15240s<? super E> sVar) {
        boolean E = mo74525E(sVar);
        if (E) {
            mo74532L();
        }
        return E;
    }

    /* renamed from: N */
    private final <R> Object m93763N(int i, C13635d<? super R> dVar) {
        C15207b bVar;
        C15497o b = C15505q.m94588b(C13649c.m87831b(dVar));
        if (this.f64429a == null) {
            bVar = new C15207b(b, i);
        } else {
            bVar = new C15208c(b, i, this.f64429a);
        }
        while (true) {
            if (!m93762D(bVar)) {
                Object M = mo74533M();
                if (!(M instanceof C15232m)) {
                    if (M != C15213b.f64425d) {
                        b.mo74846l(bVar.mo74545G(M), bVar.mo74548E(M));
                        break;
                    }
                } else {
                    bVar.mo74544F((C15232m) M);
                    break;
                }
            } else {
                m93764O(b, bVar);
                break;
            }
        }
        Object w = b.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m93764O(C15492n<?> nVar, C15240s<?> sVar) {
        nVar.mo74843d(new C15210e(sVar));
    }

    /* renamed from: C */
    public final boolean mo74524C(Throwable th) {
        boolean close = close(th);
        mo74529I(close);
        return close;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo74525E(C15240s<? super E> sVar) {
        int C;
        C15455o u;
        if (mo74526F()) {
            C15453m j = mo74557j();
            do {
                u = j.mo74804u();
                if (!(!(u instanceof C15244w))) {
                    return false;
                }
            } while (!u.mo74800l(sVar, j));
        } else {
            C15453m j2 = mo74557j();
            C15211f fVar = new C15211f(sVar, this);
            do {
                C15455o u2 = j2.mo74804u();
                if (!(!(u2 instanceof C15244w))) {
                    return false;
                }
                C = u2.mo74798C(sVar, j2, fVar);
                if (C != 1) {
                }
            } while (C != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract boolean mo74526F();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract boolean mo74527G();

    /* renamed from: H */
    public boolean mo74528H() {
        return mo74555h() != null && mo74527G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo74529I(boolean z) {
        C15232m<?> i = mo74556i();
        if (i != null) {
            Object b = C15449j.m94408b((Object) null, 1, (C13695i) null);
            while (true) {
                C15455o u = i.mo74804u();
                if (u instanceof C15453m) {
                    mo74530J(b, i);
                    return;
                } else if (!u.mo74594y()) {
                    u.mo74805v();
                } else {
                    b = C15449j.m94409c(b, (C15244w) u);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo74530J(Object obj, C15232m<?> mVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((C15244w) obj).mo74567F(mVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((C15244w) arrayList.get(size)).mo74567F(mVar);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo74531K() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo74532L() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public Object mo74533M() {
        while (true) {
            C15244w z = mo74564z();
            if (z == null) {
                return C15213b.f64425d;
            }
            if (z.mo74568G((C15455o.C15457b) null) != null) {
                z.mo74565D();
                return z.mo74566E();
            }
            z.mo74593H();
        }
    }

    /* renamed from: c */
    public final void mo74534c(CancellationException cancellationException) {
        if (!mo74528H()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(C13706o.m87936m(C15498o0.m94571a(this), " was cancelled"));
            }
            mo74524C(cancellationException);
        }
    }

    /* renamed from: f */
    public final Object mo74535f() {
        Object M = mo74533M();
        if (M == C15213b.f64425d) {
            return C15226j.f64449b.mo74582b();
        }
        if (M instanceof C15232m) {
            return C15226j.f64449b.mo74581a(((C15232m) M).f64453f);
        }
        return C15226j.f64449b.mo74583c(M);
    }

    public final C15224h<E> iterator() {
        return new C15206a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74537n(kotlin.coroutines.C13635d<? super kotlinx.coroutines.channels.C15226j<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.C15205a.C15212g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.a$g r0 = (kotlinx.coroutines.channels.C15205a.C15212g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.a$g r0 = new kotlinx.coroutines.channels.a$g
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p297ja.C13332o.m85685b(r5)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p297ja.C13332o.m85685b(r5)
            java.lang.Object r5 = r4.mo74533M()
            kotlinx.coroutines.internal.a0 r2 = kotlinx.coroutines.channels.C15213b.f64425d
            if (r5 == r2) goto L_0x0052
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.C15232m
            if (r0 == 0) goto L_0x004b
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.C15226j.f64449b
            kotlinx.coroutines.channels.m r5 = (kotlinx.coroutines.channels.C15232m) r5
            java.lang.Throwable r5 = r5.f64453f
            java.lang.Object r5 = r0.mo74581a(r5)
            goto L_0x0051
        L_0x004b:
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.C15226j.f64449b
            java.lang.Object r5 = r0.mo74583c(r5)
        L_0x0051:
            return r5
        L_0x0052:
            r0.label = r3
            java.lang.Object r5 = r4.m93763N(r3, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.C15226j) r5
            java.lang.Object r5 = r5.mo74576l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C15205a.mo74537n(kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: o */
    public final Object mo74538o(C13635d<? super E> dVar) {
        Object M = mo74533M();
        if (M == C15213b.f64425d || (M instanceof C15232m)) {
            return m93763N(0, dVar);
        }
        return M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C15242u<E> mo74539y() {
        C15242u<E> y = super.mo74539y();
        if (y != null && !(y instanceof C15232m)) {
            mo74531K();
        }
        return y;
    }
}
