package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: a */
    private State f52571a = State.NOT_READY;

    /* renamed from: c */
    private T f52572c;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.AbstractIterator$1 */
    static /* synthetic */ class C108371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52573a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.api.client.repackaged.com.google.common.base.AbstractIterator$State[] r0 = com.google.api.client.repackaged.com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52573a = r0
                com.google.api.client.repackaged.com.google.common.base.AbstractIterator$State r1 = com.google.api.client.repackaged.com.google.common.base.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52573a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.api.client.repackaged.com.google.common.base.AbstractIterator$State r1 = com.google.api.client.repackaged.com.google.common.base.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.repackaged.com.google.common.base.AbstractIterator.C108371.<clinit>():void");
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
    private boolean m72388c() {
        this.f52571a = State.FAILED;
        this.f52572c = mo60564a();
        if (this.f52571a == State.DONE) {
            return false;
        }
        this.f52571a = State.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo60564a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo60565b() {
        this.f52571a = State.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.m72477j(this.f52571a != State.FAILED);
        int i = C108371.f52573a[this.f52571a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m72388c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f52571a = State.NOT_READY;
            T t = this.f52572c;
            this.f52572c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
