package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13714w;
import kotlinx.coroutines.C15498o0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b0\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u0016\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010-\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0015\u0010/\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00063"}, mo71668d2 = {"Lkotlinx/coroutines/internal/o;", "", "Lkotlinx/coroutines/internal/w;", "B", "()Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/internal/Node;", "current", "q", "(Lkotlinx/coroutines/internal/o;)Lkotlinx/coroutines/internal/o;", "next", "Lja/u;", "r", "(Lkotlinx/coroutines/internal/o;)V", "Lkotlinx/coroutines/internal/v;", "op", "p", "(Lkotlinx/coroutines/internal/v;)Lkotlinx/coroutines/internal/o;", "node", "", "o", "(Lkotlinx/coroutines/internal/o;)Z", "k", "l", "(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;)Z", "Lkotlinx/coroutines/internal/o$a;", "condAdd", "", "C", "(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o$a;)I", "y", "()Z", "A", "()Lkotlinx/coroutines/internal/o;", "v", "()V", "w", "z", "", "toString", "()Ljava/lang/String;", "x", "isRemoved", "s", "()Ljava/lang/Object;", "t", "nextNode", "u", "prevNode", "<init>", "a", "b", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.o */
/* compiled from: LockFreeLinkedList.kt */
public class C15455o {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f64674a;

    /* renamed from: c */
    static final /* synthetic */ AtomicReferenceFieldUpdater f64675c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64676d;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, mo71668d2 = {"Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/c;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lja/u;", "h", "b", "Lkotlinx/coroutines/internal/o;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/o;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.o$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C15456a extends C15432c<C15455o> {

        /* renamed from: b */
        public final C15455o f64677b;

        /* renamed from: c */
        public C15455o f64678c;

        public C15456a(C15455o oVar) {
            this.f64677b = oVar;
        }

        /* renamed from: h */
        public void mo74757d(C15455o oVar, Object obj) {
            boolean z = obj == null;
            C15455o oVar2 = z ? this.f64677b : this.f64678c;
            if (oVar2 != null && C0320a.m383a(C15455o.f64674a, oVar, this, oVar2) && z) {
                C15455o oVar3 = this.f64677b;
                C15455o oVar4 = this.f64678c;
                C13706o.m87926c(oVar4);
                oVar3.m94427r(oVar4);
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo71668d2 = {"Lkotlinx/coroutines/internal/o$b;", "Lkotlinx/coroutines/internal/v;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.o$b */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C15457b extends C15468v {
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.internal.o$c */
    /* compiled from: LockFreeLinkedList.kt */
    /* synthetic */ class C15458c extends C13714w {
        C15458c(Object obj) {
            super(obj, C15498o0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C15498o0.m94571a(this.receiver);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C15455o> cls2 = C15455o.class;
        f64674a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f64675c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f64676d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: B */
    private final C15469w m94423B() {
        C15469w wVar = (C15469w) this._removedRef;
        if (wVar != null) {
            return wVar;
        }
        C15469w wVar2 = new C15469w(this);
        f64676d.lazySet(this, wVar2);
        return wVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (androidx.concurrent.futures.C0320a.m383a(f64674a, r3, r2, ((kotlinx.coroutines.internal.C15469w) r4).f64695a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C15455o m94425p(kotlinx.coroutines.internal.C15468v r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.o r0 = (kotlinx.coroutines.internal.C15455o) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f64675c
            boolean r0 = androidx.concurrent.futures.C0320a.m383a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo74796x()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C15468v
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.v r0 = (kotlinx.coroutines.internal.C15468v) r0
            boolean r0 = r8.mo74826b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.C15468v) r4
            r4.mo74756c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C15469w
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f64674a
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.C15469w) r4
            kotlinx.coroutines.internal.o r4 = r4.f64695a
            boolean r2 = androidx.concurrent.futures.C0320a.m383a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.o r2 = (kotlinx.coroutines.internal.C15455o) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.C15455o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C15455o.m94425p(kotlinx.coroutines.internal.v):kotlinx.coroutines.internal.o");
    }

    /* renamed from: q */
    private final C15455o m94426q(C15455o oVar) {
        while (oVar.mo74796x()) {
            oVar = (C15455o) oVar._prev;
        }
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m94427r(C15455o oVar) {
        C15455o oVar2;
        do {
            oVar2 = (C15455o) oVar._prev;
            if (mo74802s() != oVar) {
                return;
            }
        } while (!C0320a.m383a(f64675c, oVar, oVar2, this));
        if (mo74796x()) {
            oVar.m94425p((C15468v) null);
        }
    }

    /* renamed from: A */
    public final C15455o mo74797A() {
        Object s;
        C15455o oVar;
        do {
            s = mo74802s();
            if (s instanceof C15469w) {
                return ((C15469w) s).f64695a;
            }
            if (s == this) {
                return (C15455o) s;
            }
            oVar = (C15455o) s;
        } while (!C0320a.m383a(f64674a, this, s, oVar.m94423B()));
        oVar.m94425p((C15468v) null);
        return null;
    }

    /* renamed from: C */
    public final int mo74798C(C15455o oVar, C15455o oVar2, C15456a aVar) {
        f64675c.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64674a;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        aVar.f64678c = oVar2;
        if (!C0320a.m383a(atomicReferenceFieldUpdater, this, oVar2, aVar)) {
            return 0;
        }
        return aVar.mo74756c(this) == null ? 1 : 2;
    }

    /* renamed from: k */
    public final void mo74799k(C15455o oVar) {
        do {
        } while (!mo74804u().mo74800l(oVar, this));
    }

    /* renamed from: l */
    public final boolean mo74800l(C15455o oVar, C15455o oVar2) {
        f64675c.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64674a;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!C0320a.m383a(atomicReferenceFieldUpdater, this, oVar2, oVar)) {
            return false;
        }
        oVar.m94427r(oVar2);
        return true;
    }

    /* renamed from: o */
    public final boolean mo74801o(C15455o oVar) {
        f64675c.lazySet(oVar, this);
        f64674a.lazySet(oVar, this);
        while (mo74802s() == this) {
            if (C0320a.m383a(f64674a, this, this, oVar)) {
                oVar.m94427r(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final Object mo74802s() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C15468v)) {
                return obj;
            }
            ((C15468v) obj).mo74756c(this);
        }
    }

    /* renamed from: t */
    public final C15455o mo74803t() {
        return C15454n.m94422b(mo74802s());
    }

    public String toString() {
        return new C15458c(this) + '@' + C15498o0.m94572b(this);
    }

    /* renamed from: u */
    public final C15455o mo74804u() {
        C15455o p = m94425p((C15468v) null);
        return p == null ? m94426q((C15455o) this._prev) : p;
    }

    /* renamed from: v */
    public final void mo74805v() {
        ((C15469w) mo74802s()).f64695a.mo74806w();
    }

    /* renamed from: w */
    public final void mo74806w() {
        C15455o oVar = this;
        while (true) {
            Object s = oVar.mo74802s();
            if (!(s instanceof C15469w)) {
                oVar.m94425p((C15468v) null);
                return;
            }
            oVar = ((C15469w) s).f64695a;
        }
    }

    /* renamed from: x */
    public boolean mo74796x() {
        return mo74802s() instanceof C15469w;
    }

    /* renamed from: y */
    public boolean mo74594y() {
        return mo74797A() == null;
    }

    /* renamed from: z */
    public final C15455o mo74807z() {
        while (true) {
            C15455o oVar = (C15455o) mo74802s();
            if (oVar == this) {
                return null;
            }
            if (oVar.mo74594y()) {
                return oVar;
            }
            oVar.mo74805v();
        }
    }
}
