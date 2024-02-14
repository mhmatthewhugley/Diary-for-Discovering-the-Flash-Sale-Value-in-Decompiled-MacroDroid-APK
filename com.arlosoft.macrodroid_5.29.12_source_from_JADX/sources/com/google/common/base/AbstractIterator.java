package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: a */
    private State f4089a = State.NOT_READY;

    /* renamed from: c */
    private T f4090c;

    /* renamed from: com.google.common.base.AbstractIterator$1 */
    static /* synthetic */ class C17401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4091a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4091a = r0
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4091a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator.C17401.<clinit>():void");
        }
    }

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    /* renamed from: c */
    private boolean m5141c() {
        this.f4089a = State.FAILED;
        this.f4090c = mo22086a();
        if (this.f4089a == State.DONE) {
            return false;
        }
        this.f4089a = State.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo22086a();

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo22087b() {
        this.f4089a = State.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.m5398y(this.f4089a != State.FAILED);
        int i = C17401.f4091a[this.f4089a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m5141c();
        }
        return true;
    }

    @ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.f4089a = State.NOT_READY;
            T a = NullnessCasts.m5348a(this.f4090c);
            this.f4090c = null;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
