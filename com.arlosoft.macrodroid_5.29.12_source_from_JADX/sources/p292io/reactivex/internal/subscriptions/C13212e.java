package p292io.reactivex.internal.subscriptions;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15739d;

/* renamed from: io.reactivex.internal.subscriptions.e */
/* compiled from: SubscriptionArbiter */
public class C13212e extends AtomicInteger implements C15739d {
    private static final long serialVersionUID = -2189523197179400958L;
    C15739d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<C15739d> missedSubscription = new AtomicReference<>();
    long requested;
    protected boolean unbounded;

    public C13212e(boolean z) {
        this.cancelOnReplace = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo70035b() {
        if (getAndIncrement() == 0) {
            mo70036d();
        }
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            mo70035b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo70036d() {
        int i = 1;
        C15739d dVar = null;
        long j = 0;
        do {
            C15739d dVar2 = this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = this.missedSubscription.getAndSet((Object) null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            C15739d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != LocationRequestCompat.PASSIVE_INTERVAL) {
                    j4 = C13218d.m85542b(j4, j2);
                    if (j4 != LocationRequestCompat.PASSIVE_INTERVAL) {
                        j4 -= j3;
                        if (j4 < 0) {
                            C13213f.m85526f(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j4 != 0) {
                        j = C13218d.m85542b(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = C13218d.m85542b(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.request(j);
        }
    }

    /* renamed from: e */
    public final void mo70037e(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13218d.m85541a(this.missedProduced, j);
                mo70035b();
                return;
            }
            long j2 = this.requested;
            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    C13213f.m85526f(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() != 0) {
                mo70036d();
            }
        }
    }

    /* renamed from: f */
    public final void mo70038f(C15739d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        C11984b.m82367d(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            C15739d andSet = this.missedSubscription.getAndSet(dVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            mo70035b();
            return;
        }
        C15739d dVar2 = this.actual;
        if (dVar2 != null && this.cancelOnReplace) {
            dVar2.cancel();
        }
        this.actual = dVar;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            mo70036d();
        }
        if (j != 0) {
            dVar.request(j);
        }
    }

    public final void request(long j) {
        if (C13213f.m85529j(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13218d.m85541a(this.missedRequested, j);
                mo70035b();
                return;
            }
            long j2 = this.requested;
            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                long b = C13218d.m85542b(j2, j);
                this.requested = b;
                if (b == LocationRequestCompat.PASSIVE_INTERVAL) {
                    this.unbounded = true;
                }
            }
            C15739d dVar = this.actual;
            if (decrementAndGet() != 0) {
                mo70036d();
            }
            if (dVar != null) {
                dVar.request(j);
            }
        }
    }
}
