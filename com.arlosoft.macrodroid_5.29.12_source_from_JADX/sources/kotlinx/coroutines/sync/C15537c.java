package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15202c1;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15501p;
import kotlinx.coroutines.C15505q;
import kotlinx.coroutines.internal.C15432c;
import kotlinx.coroutines.internal.C15453m;
import kotlinx.coroutines.internal.C15455o;
import kotlinx.coroutines.internal.C15468v;
import p297ja.C13339u;
import p299jc.C13373a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\u000b\f\u0006\tB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo71668d2 = {"Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/sync/b;", "Ljc/a;", "", "owner", "Lja/u;", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "d", "(Ljava/lang/Object;)Z", "a", "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.sync.c */
/* compiled from: Mutex.kt */
public final class C15537c implements C15536b, C13373a<Object, C15536b> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f64786a = AtomicReferenceFieldUpdater.newUpdater(C15537c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/sync/c$a;", "Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/sync/c;", "", "F", "Lja/u;", "D", "", "toString", "Lkotlinx/coroutines/n;", "p", "Lkotlinx/coroutines/n;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Lkotlinx/coroutines/n;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$a */
    /* compiled from: Mutex.kt */
    private final class C15538a extends C15540b {

        /* renamed from: p */
        private final C15492n<C13339u> f64787p;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.sync.c$a$a */
        /* compiled from: Mutex.kt */
        static final class C15539a extends C13708q implements C16265l<Throwable, C13339u> {
            final /* synthetic */ C15537c this$0;
            final /* synthetic */ C15538a this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15539a(C15537c cVar, C15538a aVar) {
                super(1);
                this.this$0 = cVar;
                this.this$1 = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                this.this$0.mo74907b(this.this$1.f64790f);
            }
        }

        public C15538a(Object obj, C15492n<? super C13339u> nVar) {
            super(obj);
            this.f64787p = nVar;
        }

        /* renamed from: D */
        public void mo74910D() {
            this.f64787p.mo74841B(C15501p.f64720a);
        }

        /* renamed from: F */
        public boolean mo74911F() {
            if (mo74913E() && this.f64787p.mo74848t(C13339u.f61331a, (Object) null, new C15539a(C15537c.this, this)) != null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LockCont[" + this.f64790f + ", " + this.f64787p + "] for " + C15537c.this;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/c1;", "", "E", "()Z", "Lja/u;", "dispose", "()V", "F", "D", "", "f", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$b */
    /* compiled from: Mutex.kt */
    private abstract class C15540b extends C15455o implements C15202c1 {

        /* renamed from: o */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f64789o = AtomicIntegerFieldUpdater.newUpdater(C15540b.class, "isTaken");

        /* renamed from: f */
        public final Object f64790f;
        private volatile /* synthetic */ int isTaken = 0;

        public C15540b(Object obj) {
            this.f64790f = obj;
        }

        /* renamed from: D */
        public abstract void mo74910D();

        /* renamed from: E */
        public final boolean mo74913E() {
            return f64789o.compareAndSet(this, 0, 1);
        }

        /* renamed from: F */
        public abstract boolean mo74911F();

        public final void dispose() {
            mo74594y();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo71668d2 = {"Lkotlinx/coroutines/sync/c$c;", "Lkotlinx/coroutines/internal/m;", "", "toString", "", "f", "Ljava/lang/Object;", "owner", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$c */
    /* compiled from: Mutex.kt */
    private static final class C15541c extends C15453m {

        /* renamed from: f */
        public Object f64792f;

        public C15541c(Object obj) {
            this.f64792f = obj;
        }

        public String toString() {
            return "LockedQueue[" + this.f64792f + ']';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/sync/c$d;", "Lkotlinx/coroutines/internal/c;", "Lkotlinx/coroutines/sync/c;", "affected", "", "i", "failure", "Lja/u;", "h", "Lkotlinx/coroutines/sync/c$c;", "b", "Lkotlinx/coroutines/sync/c$c;", "queue", "<init>", "(Lkotlinx/coroutines/sync/c$c;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$d */
    /* compiled from: Mutex.kt */
    private static final class C15542d extends C15432c<C15537c> {

        /* renamed from: b */
        public final C15541c f64793b;

        public C15542d(C15541c cVar) {
            this.f64793b = cVar;
        }

        /* renamed from: h */
        public void mo74757d(C15537c cVar, Object obj) {
            C0320a.m383a(C15537c.f64786a, cVar, this, obj == null ? C15544d.f64799f : this.f64793b);
        }

        /* renamed from: i */
        public Object mo74551g(C15537c cVar) {
            if (this.f64793b.mo74794D()) {
                return null;
            }
            return C15544d.f64795b;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$e */
    /* compiled from: Mutex.kt */
    static final class C15543e extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ Object $owner;
        final /* synthetic */ C15537c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15543e(C15537c cVar, Object obj) {
            super(1);
            this.this$0 = cVar;
            this.$owner = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            this.this$0.mo74907b(this.$owner);
        }
    }

    public C15537c(boolean z) {
        this._state = z ? C15544d.f64798e : C15544d.f64799f;
    }

    /* renamed from: c */
    private final Object m94668c(Object obj, C13635d<? super C13339u> dVar) {
        C15497o b = C15505q.m94588b(C13649c.m87831b(dVar));
        C15538a aVar = new C15538a(obj, b);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C15535a) {
                C15535a aVar2 = (C15535a) obj2;
                if (aVar2.f64785a != C15544d.f64797d) {
                    C0320a.m383a(f64786a, this, obj2, new C15541c(aVar2.f64785a));
                } else {
                    if (C0320a.m383a(f64786a, this, obj2, obj == null ? C15544d.f64798e : new C15535a(obj))) {
                        b.mo74846l(C13339u.f61331a, new C15543e(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C15541c) {
                C15541c cVar = (C15541c) obj2;
                if (cVar.f64792f != obj) {
                    cVar.mo74799k(aVar);
                    if (this._state == obj2 || !aVar.mo74913E()) {
                        C15505q.m94589c(b, aVar);
                    } else {
                        aVar = new C15538a(obj, b);
                    }
                } else {
                    throw new IllegalStateException(C13706o.m87936m("Already locked by ", obj).toString());
                }
            } else if (obj2 instanceof C15468v) {
                ((C15468v) obj2).mo74756c(this);
            } else {
                throw new IllegalStateException(C13706o.m87936m("Illegal state ", obj2).toString());
            }
        }
        Object w = b.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : C13339u.f61331a;
    }

    /* renamed from: a */
    public Object mo74906a(Object obj, C13635d<? super C13339u> dVar) {
        if (mo74908d(obj)) {
            return C13339u.f61331a;
        }
        Object c = m94668c(obj, dVar);
        return c == C13652d.m87832c() ? c : C13339u.f61331a;
    }

    /* renamed from: b */
    public void mo74907b(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C15535a) {
                if (obj == null) {
                    if (((C15535a) obj2).f64785a == C15544d.f64797d) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C15535a aVar = (C15535a) obj2;
                    if (aVar.f64785a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar.f64785a + " but expected " + obj).toString());
                    }
                }
                if (C0320a.m383a(f64786a, this, obj2, C15544d.f64799f)) {
                    return;
                }
            } else if (obj2 instanceof C15468v) {
                ((C15468v) obj2).mo74756c(this);
            } else if (obj2 instanceof C15541c) {
                if (obj != null) {
                    C15541c cVar = (C15541c) obj2;
                    if (cVar.f64792f != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.f64792f + " but expected " + obj).toString());
                    }
                }
                C15541c cVar2 = (C15541c) obj2;
                C15455o z2 = cVar2.mo74807z();
                if (z2 == null) {
                    C15542d dVar = new C15542d(cVar2);
                    if (C0320a.m383a(f64786a, this, obj2, dVar) && dVar.mo74756c(this) == null) {
                        return;
                    }
                } else {
                    C15540b bVar = (C15540b) z2;
                    if (bVar.mo74911F()) {
                        Object obj3 = bVar.f64790f;
                        if (obj3 == null) {
                            obj3 = C15544d.f64796c;
                        }
                        cVar2.f64792f = obj3;
                        bVar.mo74910D();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(C13706o.m87936m("Illegal state ", obj2).toString());
            }
        }
    }

    /* renamed from: d */
    public boolean mo74908d(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C15535a) {
                if (((C15535a) obj2).f64785a != C15544d.f64797d) {
                    return false;
                }
                if (C0320a.m383a(f64786a, this, obj2, obj == null ? C15544d.f64798e : new C15535a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C15541c) {
                if (((C15541c) obj2).f64792f == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(C13706o.m87936m("Already locked by ", obj).toString());
            } else if (obj2 instanceof C15468v) {
                ((C15468v) obj2).mo74756c(this);
            } else {
                throw new IllegalStateException(C13706o.m87936m("Illegal state ", obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C15535a) {
                return "Mutex[" + ((C15535a) obj).f64785a + ']';
            } else if (obj instanceof C15468v) {
                ((C15468v) obj).mo74756c(this);
            } else if (obj instanceof C15541c) {
                return "Mutex[" + ((C15541c) obj).f64792f + ']';
            } else {
                throw new IllegalStateException(C13706o.m87936m("Illegal state ", obj).toString());
            }
        }
    }
}
