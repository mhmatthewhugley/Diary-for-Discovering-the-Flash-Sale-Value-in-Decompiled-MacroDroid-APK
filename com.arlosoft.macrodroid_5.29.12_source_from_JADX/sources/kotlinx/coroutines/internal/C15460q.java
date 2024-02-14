package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import org.apache.commons.p353io.FileUtils;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0017\u0013B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J3\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0011\u0010#\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, mo71668d2 = {"Lkotlinx/coroutines/internal/q;", "", "E", "", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/q;", "oldHead", "newHead", "k", "(II)Lkotlinx/coroutines/internal/q;", "", "h", "()J", "state", "c", "(J)Lkotlinx/coroutines/internal/q;", "b", "", "d", "()Z", "a", "(Ljava/lang/Object;)I", "j", "()Ljava/lang/Object;", "i", "()Lkotlinx/coroutines/internal/q;", "I", "capacity", "Z", "singleConsumer", "mask", "g", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.q */
/* compiled from: LockFreeTaskQueue.kt */
public final class C15460q<E> {

    /* renamed from: e */
    public static final C15461a f64680e = new C15461a((C13695i) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64681f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f64682g;

    /* renamed from: h */
    public static final C15429a0 f64683h = new C15429a0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f64684a;

    /* renamed from: b */
    private final boolean f64685b;

    /* renamed from: c */
    private final int f64686c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f64687d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005J\n\u0010\n\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006!"}, mo71668d2 = {"Lkotlinx/coroutines/internal/q$a;", "", "", "other", "d", "", "newHead", "b", "newTail", "c", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/a0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/a0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.q$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C15461a {
        private C15461a() {
        }

        public /* synthetic */ C15461a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final int mo74819a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo74820b(long j, int i) {
            return mo74822d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo74821c(long j, int i) {
            return mo74822d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo74822d(long j, long j2) {
            return j & (~j2);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo71668d2 = {"Lkotlinx/coroutines/internal/q$b;", "", "", "a", "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.q$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C15462b {

        /* renamed from: a */
        public final int f64688a;

        public C15462b(int i) {
            this.f64688a = i;
        }
    }

    static {
        Class<C15460q> cls = C15460q.class;
        f64681f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f64682g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C15460q(int i, boolean z) {
        this.f64684a = i;
        this.f64685b = z;
        int i2 = i - 1;
        this.f64686c = i2;
        this.f64687d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C15460q<E> m94447b(long j) {
        C15460q<E> qVar = new C15460q<>(this.f64684a * 2, this.f64685b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f64686c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f64687d.get(i3 & i);
                if (obj == null) {
                    obj = new C15462b(i);
                }
                qVar.f64687d.set(qVar.f64686c & i, obj);
                i++;
            } else {
                qVar._state = f64680e.mo74822d(j, FileUtils.ONE_EB);
                return qVar;
            }
        }
    }

    /* renamed from: c */
    private final C15460q<E> m94448c(long j) {
        while (true) {
            C15460q<E> qVar = (C15460q) this._next;
            if (qVar != null) {
                return qVar;
            }
            C0320a.m383a(f64681f, this, (Object) null, m94447b(j));
        }
    }

    /* renamed from: e */
    private final C15460q<E> m94449e(int i, E e) {
        Object obj = this.f64687d.get(this.f64686c & i);
        if (!(obj instanceof C15462b) || ((C15462b) obj).f64688a != i) {
            return null;
        }
        this.f64687d.set(i & this.f64686c, e);
        return this;
    }

    /* renamed from: h */
    private final long m94450h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & FileUtils.ONE_EB) != 0) {
                return j;
            }
            j2 = j | FileUtils.ONE_EB;
        } while (!f64682g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C15460q<E> m94451k(int i, int i2) {
        long j;
        C15461a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f64680e;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((FileUtils.ONE_EB & j) != 0) {
                return mo74817i();
            }
        } while (!f64682g.compareAndSet(this, j, aVar.mo74820b(j, i2)));
        this.f64687d.set(this.f64686c & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007b, LOOP_START, PHI: r0 
      PHI: (r0v7 kotlinx.coroutines.internal.q) = (r0v6 kotlinx.coroutines.internal.q), (r0v9 kotlinx.coroutines.internal.q) binds: [B:18:0x0061, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo74813a(E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.q$a r14 = f64680e
            int r14 = r14.mo74819a(r2)
            return r14
        L_0x0012:
            kotlinx.coroutines.internal.q$a r0 = f64680e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f64686c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f64685b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f64687d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f64684a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f64682g
            long r11 = r0.mo74821c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f64687d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            kotlinx.coroutines.internal.q r0 = r0.mo74817i()
            kotlinx.coroutines.internal.q r0 = r0.m94449e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C15460q.mo74813a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo74814d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((FileUtils.ONE_EB & j) != 0) {
                return false;
            }
        } while (!f64682g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo74815f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean mo74816g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C15460q<E> mo74817i() {
        return m94448c(m94450h());
    }

    /* renamed from: j */
    public final Object mo74818j() {
        while (true) {
            long j = this._state;
            if ((FileUtils.ONE_EB & j) != 0) {
                return f64683h;
            }
            C15461a aVar = f64680e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f64686c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f64687d.get(i3 & i);
            if (obj == null) {
                if (this.f64685b) {
                    return null;
                }
            } else if (obj instanceof C15462b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f64682g.compareAndSet(this, j, aVar.mo74820b(j, i4))) {
                    this.f64687d.set(this.f64686c & i, (Object) null);
                    return obj;
                } else if (this.f64685b) {
                    C15460q qVar = this;
                    do {
                        qVar = qVar.m94451k(i, i4);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }
}
