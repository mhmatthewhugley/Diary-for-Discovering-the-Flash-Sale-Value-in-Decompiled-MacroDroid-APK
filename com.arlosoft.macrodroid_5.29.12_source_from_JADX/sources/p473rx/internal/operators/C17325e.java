package p473rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p459ef.C17153c;
import p459ef.C17157e;
import p459ef.C17158f;
import p459ef.C17162h;
import p464jf.C17176a;
import p466lf.C17188b;
import p468nf.C17195c;
import p473rx.exceptions.MissingBackpressureException;
import p473rx.internal.util.C17380d;
import p473rx.internal.util.unsafe.C17410s;
import p473rx.internal.util.unsafe.C17417z;

/* renamed from: rx.internal.operators.e */
/* compiled from: OperatorObserveOn */
public final class C17325e<T> implements C17153c.C17155b<T, T> {

    /* renamed from: a */
    private final C17158f f68992a;

    /* renamed from: b */
    private final boolean f68993b;

    /* renamed from: c */
    private final int f68994c;

    /* renamed from: rx.internal.operators.e$a */
    /* compiled from: OperatorObserveOn */
    static final class C17326a<T> extends C17162h<T> implements C17176a {

        /* renamed from: A */
        final int f68995A;

        /* renamed from: B */
        volatile boolean f68996B;

        /* renamed from: C */
        final AtomicLong f68997C = new AtomicLong();

        /* renamed from: D */
        final AtomicLong f68998D = new AtomicLong();

        /* renamed from: E */
        Throwable f68999E;

        /* renamed from: F */
        long f69000F;

        /* renamed from: g */
        final C17162h<? super T> f69001g;

        /* renamed from: o */
        final C17158f.C17159a f69002o;

        /* renamed from: p */
        final C17318b<T> f69003p;

        /* renamed from: s */
        final boolean f69004s;

        /* renamed from: z */
        final Queue<Object> f69005z;

        /* renamed from: rx.internal.operators.e$a$a */
        /* compiled from: OperatorObserveOn */
        class C17327a implements C17157e {
            C17327a() {
            }

            public void request(long j) {
                if (j > 0) {
                    C17317a.m101037b(C17326a.this.f68997C, j);
                    C17326a.this.mo80660j();
                }
            }
        }

        public C17326a(C17158f fVar, C17162h<? super T> hVar, boolean z, int i) {
            this.f69001g = hVar;
            this.f69002o = fVar.mo80445a();
            this.f69004s = z;
            this.f69003p = C17318b.m101039e();
            i = i <= 0 ? C17380d.f69134c : i;
            this.f68995A = i - (i >> 2);
            if (C17417z.m101181b()) {
                this.f69005z = new C17410s(i);
            } else {
                this.f69005z = new C17188b(i);
            }
            mo80452f((long) i);
        }

        public void call() {
            int i;
            long j = this.f69000F;
            Queue<Object> queue = this.f69005z;
            C17162h<? super T> hVar = this.f69001g;
            C17318b<T> bVar = this.f69003p;
            long j2 = 1;
            do {
                long j3 = this.f68997C.get();
                while (true) {
                    i = (j3 > j ? 1 : (j3 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f68996B;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!mo80658h(z, z2, hVar, queue)) {
                        if (z2) {
                            break;
                        }
                        hVar.onNext(bVar.mo80648d(poll));
                        j++;
                        if (j == ((long) this.f68995A)) {
                            j3 = C17317a.m101038c(this.f68997C, j);
                            mo80452f(j);
                            j = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (i != 0 || !mo80658h(this.f68996B, queue.isEmpty(), hVar, queue)) {
                    this.f69000F = j;
                    j2 = this.f68998D.addAndGet(-j2);
                } else {
                    return;
                }
            } while (j2 != 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo80658h(boolean z, boolean z2, C17162h<? super T> hVar, Queue<Object> queue) {
            if (hVar.mo80449b()) {
                queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f69004s) {
                    Throwable th = this.f68999E;
                    if (th != null) {
                        queue.clear();
                        try {
                            hVar.onError(th);
                            return true;
                        } finally {
                            this.f69002o.mo80450d();
                        }
                    } else if (!z2) {
                        return false;
                    } else {
                        try {
                            hVar.onCompleted();
                            return true;
                        } finally {
                            this.f69002o.mo80450d();
                        }
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f68999E;
                    if (th2 != null) {
                        try {
                            hVar.onError(th2);
                        } catch (Throwable th3) {
                            this.f69002o.mo80450d();
                            throw th3;
                        }
                    } else {
                        hVar.onCompleted();
                    }
                    this.f69002o.mo80450d();
                    return false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo80659i() {
            C17162h<? super T> hVar = this.f69001g;
            hVar.mo80453g(new C17327a());
            hVar.mo80448a(this.f69002o);
            hVar.mo80448a(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo80660j() {
            if (this.f68998D.getAndIncrement() == 0) {
                this.f69002o.mo80446a(this);
            }
        }

        public void onCompleted() {
            if (!mo80449b() && !this.f68996B) {
                this.f68996B = true;
                mo80660j();
            }
        }

        public void onError(Throwable th) {
            if (mo80449b() || this.f68996B) {
                C17195c.m100723g(th);
                return;
            }
            this.f68999E = th;
            this.f68996B = true;
            mo80660j();
        }

        public void onNext(T t) {
            if (!mo80449b() && !this.f68996B) {
                if (!this.f69005z.offer(this.f69003p.mo80649f(t))) {
                    onError(new MissingBackpressureException());
                } else {
                    mo80660j();
                }
            }
        }
    }

    public C17325e(C17158f fVar, boolean z, int i) {
        this.f68992a = fVar;
        this.f68993b = z;
        this.f68994c = i <= 0 ? C17380d.f69134c : i;
    }

    /* renamed from: b */
    public C17162h<? super T> mo80454a(C17162h<? super T> hVar) {
        C17326a aVar = new C17326a(this.f68992a, hVar, this.f68993b, this.f68994c);
        aVar.mo80659i();
        return aVar;
    }
}
