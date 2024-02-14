package kotlinx.coroutines;

import androidx.concurrent.futures.C0320a;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15546t0;
import kotlinx.coroutines.internal.C15446h0;
import kotlinx.coroutines.internal.C15448i0;
import kotlinx.coroutines.internal.C15460q;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006<"}, mo71668d2 = {"Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/i1;", "Lkotlinx/coroutines/t0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "c0", "(Ljava/lang/Runnable;)Z", "W", "()Ljava/lang/Runnable;", "Lja/u;", "U", "()V", "Lkotlinx/coroutines/h1$c;", "p0", "(Lkotlinx/coroutines/h1$c;)Z", "", "now", "delayedTask", "", "k0", "(JLkotlinx/coroutines/h1$c;)I", "f0", "shutdown", "timeMillis", "Lkotlinx/coroutines/n;", "continuation", "f", "(JLkotlinx/coroutines/n;)V", "block", "Lkotlinx/coroutines/c1;", "l0", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/c1;", "K", "()J", "Lkotlin/coroutines/g;", "context", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "Z", "(Ljava/lang/Runnable;)V", "j0", "(JLkotlinx/coroutines/h1$c;)V", "h0", "value", "w", "()Z", "n0", "(Z)V", "isCompleted", "e0", "isEmpty", "D", "nextTime", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h1 */
/* compiled from: EventLoop.common.kt */
public abstract class C15418h1 extends C15426i1 implements C15546t0 {

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64622f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64623g;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo71668d2 = {"Lkotlinx/coroutines/h1$a;", "Lkotlinx/coroutines/h1$c;", "Lja/u;", "run", "", "toString", "Lkotlinx/coroutines/n;", "f", "Lkotlinx/coroutines/n;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/h1;JLkotlinx/coroutines/n;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h1$a */
    /* compiled from: EventLoop.common.kt */
    private final class C15419a extends C15421c {

        /* renamed from: f */
        private final C15492n<C13339u> f64624f;

        public C15419a(long j, C15492n<? super C13339u> nVar) {
            super(j);
            this.f64624f = nVar;
        }

        public void run() {
            this.f64624f.mo74847q(C15418h1.this, C13339u.f61331a);
        }

        public String toString() {
            return C13706o.m87936m(super.toString(), this.f64624f);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/h1$b;", "Lkotlinx/coroutines/h1$c;", "Lja/u;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "f", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h1$b */
    /* compiled from: EventLoop.common.kt */
    private static final class C15420b extends C15421c {

        /* renamed from: f */
        private final Runnable f64626f;

        public C15420b(long j, Runnable runnable) {
            super(j);
            this.f64626f = runnable;
        }

        public void run() {
            this.f64626f.run();
        }

        public String toString() {
            return C13706o.m87936m(super.toString(), this.f64626f);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010$2\f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010$8V@VX\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, mo71668d2 = {"Lkotlinx/coroutines/h1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/internal/i0;", "other", "", "g", "", "now", "", "k", "Lkotlinx/coroutines/h1$d;", "delayed", "Lkotlinx/coroutines/h1;", "eventLoop", "j", "Lja/u;", "dispose", "", "toString", "a", "J", "nanoTime", "", "c", "Ljava/lang/Object;", "_heap", "d", "I", "i", "()I", "f", "(I)V", "index", "Lkotlinx/coroutines/internal/h0;", "value", "e", "()Lkotlinx/coroutines/internal/h0;", "b", "(Lkotlinx/coroutines/internal/h0;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h1$c */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C15421c implements Runnable, Comparable<C15421c>, C15202c1, C15448i0 {

        /* renamed from: a */
        public long f64627a;

        /* renamed from: c */
        private Object f64628c;

        /* renamed from: d */
        private int f64629d = -1;

        public C15421c(long j) {
            this.f64627a = j;
        }

        /* renamed from: b */
        public void mo74740b(C15446h0<?> h0Var) {
            if (this.f64628c != C15479k1.f64701a) {
                this.f64628c = h0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final synchronized void dispose() {
            Object obj = this.f64628c;
            if (obj != C15479k1.f64701a) {
                C15422d dVar = obj instanceof C15422d ? (C15422d) obj : null;
                if (dVar != null) {
                    dVar.mo74788g(this);
                }
                this.f64628c = C15479k1.f64701a;
            }
        }

        /* renamed from: e */
        public C15446h0<?> mo74742e() {
            Object obj = this.f64628c;
            if (obj instanceof C15446h0) {
                return (C15446h0) obj;
            }
            return null;
        }

        /* renamed from: f */
        public void mo74743f(int i) {
            this.f64629d = i;
        }

        /* renamed from: g */
        public int compareTo(C15421c cVar) {
            int i = ((this.f64627a - cVar.f64627a) > 0 ? 1 : ((this.f64627a - cVar.f64627a) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: i */
        public int mo74745i() {
            return this.f64629d;
        }

        /* renamed from: j */
        public final synchronized int mo74746j(long j, C15422d dVar, C15418h1 h1Var) {
            if (this.f64628c == C15479k1.f64701a) {
                return 2;
            }
            synchronized (dVar) {
                C15421c cVar = (C15421c) dVar.mo74784b();
                if (h1Var.m94308w()) {
                    return 1;
                }
                if (cVar == null) {
                    dVar.f64630b = j;
                } else {
                    long j2 = cVar.f64627a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.f64630b > 0) {
                        dVar.f64630b = j;
                    }
                }
                long j3 = this.f64627a;
                long j4 = dVar.f64630b;
                if (j3 - j4 < 0) {
                    this.f64627a = j4;
                }
                dVar.mo74783a(this);
                return 0;
            }
        }

        /* renamed from: k */
        public final boolean mo74747k(long j) {
            return j - this.f64627a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f64627a + ']';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, mo71668d2 = {"Lkotlinx/coroutines/h1$d;", "Lkotlinx/coroutines/internal/h0;", "Lkotlinx/coroutines/h1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h1$d */
    /* compiled from: EventLoop.common.kt */
    public static final class C15422d extends C15446h0<C15421c> {

        /* renamed from: b */
        public long f64630b;

        public C15422d(long j) {
            this.f64630b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C15418h1> cls2 = C15418h1.class;
        f64622f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f64623g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: U */
    private final void m94301U() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C0320a.m383a(f64622f, this, (Object) null, C15479k1.f64702b)) {
                    return;
                }
            } else if (obj instanceof C15460q) {
                ((C15460q) obj).mo74814d();
                return;
            } else if (obj != C15479k1.f64702b) {
                C15460q qVar = new C15460q(8, true);
                qVar.mo74813a((Runnable) obj);
                if (C0320a.m383a(f64622f, this, obj, qVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: W */
    private final Runnable m94302W() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C15460q) {
                C15460q qVar = (C15460q) obj;
                Object j = qVar.mo74818j();
                if (j != C15460q.f64683h) {
                    return (Runnable) j;
                }
                C0320a.m383a(f64622f, this, obj, qVar.mo74817i());
            } else if (obj == C15479k1.f64702b) {
                return null;
            } else {
                if (C0320a.m383a(f64622f, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: c0 */
    private final boolean m94303c0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m94308w()) {
                return false;
            }
            if (obj == null) {
                if (C0320a.m383a(f64622f, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C15460q) {
                C15460q qVar = (C15460q) obj;
                int a = qVar.mo74813a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C0320a.m383a(f64622f, this, obj, qVar.mo74817i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C15479k1.f64702b) {
                return false;
            } else {
                C15460q qVar2 = new C15460q(8, true);
                qVar2.mo74813a((Runnable) obj);
                qVar2.mo74813a(runnable);
                if (C0320a.m383a(f64622f, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: f0 */
    private final void m94304f0() {
        C15200c.m93755a();
        long nanoTime = System.nanoTime();
        while (true) {
            C15422d dVar = (C15422d) this._delayed;
            C15421c cVar = dVar == null ? null : (C15421c) dVar.mo74790i();
            if (cVar != null) {
                mo74749O(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: k0 */
    private final int m94305k0(long j, C15421c cVar) {
        if (m94308w()) {
            return 1;
        }
        C15422d dVar = (C15422d) this._delayed;
        if (dVar == null) {
            C0320a.m383a(f64623g, this, (Object) null, new C15422d(j));
            Object obj = this._delayed;
            C13706o.m87926c(obj);
            dVar = (C15422d) obj;
        }
        return cVar.mo74746j(j, dVar, this);
    }

    /* renamed from: n0 */
    private final void m94306n0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: p0 */
    private final boolean m94307p0(C15421c cVar) {
        C15422d dVar = (C15422d) this._delayed;
        return (dVar == null ? null : (C15421c) dVar.mo74787e()) == cVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: w */
    public final boolean m94308w() {
        return this._isCompleted;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public long mo74720D() {
        if (super.mo74720D() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C15460q) {
                if (!((C15460q) obj).mo74816g()) {
                    return 0;
                }
            } else if (obj == C15479k1.f64702b) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            } else {
                return 0;
            }
        }
        C15422d dVar = (C15422d) this._delayed;
        C15421c cVar = dVar == null ? null : (C15421c) dVar.mo74787e();
        if (cVar == null) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        long j = cVar.f64627a;
        C15200c.m93755a();
        return C16792h.m99541c(j - System.nanoTime(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo74724K() {
        /*
            r9 = this;
            boolean r0 = r9.mo74725L()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.h1$d r0 = (kotlinx.coroutines.C15418h1.C15422d) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.mo74786d()
            if (r3 != 0) goto L_0x0045
            kotlinx.coroutines.C15200c.m93755a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.i0 r5 = r0.mo74784b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            kotlinx.coroutines.h1$c r5 = (kotlinx.coroutines.C15418h1.C15421c) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.mo74747k(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.m94303c0(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x003c
            kotlinx.coroutines.internal.i0 r5 = r0.mo74789h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
        L_0x003c:
            monitor-exit(r0)
        L_0x003d:
            kotlinx.coroutines.h1$c r6 = (kotlinx.coroutines.C15418h1.C15421c) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.m94302W()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo74720D()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15418h1.mo74724K():long");
    }

    /* renamed from: Z */
    public void mo74732Z(Runnable runnable) {
        if (m94303c0(runnable)) {
            mo74750Q();
        } else {
            C15502p0.f64721o.mo74732Z(runnable);
        }
    }

    public final void dispatch(C13640g gVar, Runnable runnable) {
        mo74732Z(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public boolean mo74733e0() {
        if (!mo74723J()) {
            return false;
        }
        C15422d dVar = (C15422d) this._delayed;
        if (dVar != null && !dVar.mo74786d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C15460q) {
                return ((C15460q) obj).mo74816g();
            }
            if (obj == C15479k1.f64702b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo74504f(long j, C15492n<? super C13339u> nVar) {
        long c = C15479k1.m94501c(j);
        if (c < 4611686018427387903L) {
            C15200c.m93755a();
            long nanoTime = System.nanoTime();
            C15419a aVar = new C15419a(c + nanoTime, nVar);
            C15505q.m94587a(nVar, aVar);
            mo74735j0(nanoTime, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public final void mo74734h0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: j */
    public C15202c1 mo74506j(long j, Runnable runnable, C13640g gVar) {
        return C15546t0.C15547a.m94691a(this, j, runnable, gVar);
    }

    /* renamed from: j0 */
    public final void mo74735j0(long j, C15421c cVar) {
        int k0 = m94305k0(j, cVar);
        if (k0 != 0) {
            if (k0 == 1) {
                mo74749O(j, cVar);
            } else if (k0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m94307p0(cVar)) {
            mo74750Q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final C15202c1 mo74736l0(long j, Runnable runnable) {
        long c = C15479k1.m94501c(j);
        if (c >= 4611686018427387903L) {
            return C15476j2.f64699a;
        }
        C15200c.m93755a();
        long nanoTime = System.nanoTime();
        C15420b bVar = new C15420b(c + nanoTime, runnable);
        mo74735j0(nanoTime, bVar);
        return bVar;
    }

    public void shutdown() {
        C15558v2.f64805a.mo74922c();
        m94306n0(true);
        m94301U();
        do {
        } while (mo74724K() <= 0);
        m94304f0();
    }
}
