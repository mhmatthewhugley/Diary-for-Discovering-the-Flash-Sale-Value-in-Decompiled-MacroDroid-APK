package p292io.reactivex.internal.queue;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p251ea.C12184h;
import p292io.reactivex.internal.util.C13229k;

/* renamed from: io.reactivex.internal.queue.a */
/* compiled from: SpscArrayQueue */
public final class C13177a<E> extends AtomicReferenceArray<E> implements C12184h<E> {

    /* renamed from: a */
    private static final Integer f61014a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex = new AtomicLong();
    final int lookAheadStep;
    final int mask = (length() - 1);
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    public C13177a(int i) {
        super(C13229k.m85567a(i));
        this.lookAheadStep = Math.min(i / 4, f61014a.intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo69985a(long j) {
        return this.mask & ((int) j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo69986b(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public E mo69987c(int i) {
        return get(i);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo69988e(long j) {
        this.consumerIndex.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo69989f(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo69990g(long j) {
        this.producerIndex.lazySet(j);
    }

    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        int i = this.mask;
        long j = this.producerIndex.get();
        int b = mo69986b(j, i);
        if (j >= this.producerLookAhead) {
            long j2 = ((long) this.lookAheadStep) + j;
            if (mo69987c(mo69986b(j2, i)) == null) {
                this.producerLookAhead = j2;
            } else if (mo69987c(b) != null) {
                return false;
            }
        }
        mo69989f(b, e);
        mo69990g(j + 1);
        return true;
    }

    public E poll() {
        long j = this.consumerIndex.get();
        int a = mo69985a(j);
        E c = mo69987c(a);
        if (c == null) {
            return null;
        }
        mo69988e(j + 1);
        mo69989f(a, (Object) null);
        return c;
    }
}
