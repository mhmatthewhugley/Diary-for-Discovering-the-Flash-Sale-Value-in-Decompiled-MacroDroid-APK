package p292io.reactivex.internal.operators.observable;

import p292io.reactivex.internal.observers.C13019b;
import p414v9.C16735i;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.x */
/* compiled from: ObservableRange */
public final class C13152x extends C16735i<Integer> {

    /* renamed from: a */
    private final int f60988a;

    /* renamed from: c */
    private final long f60989c;

    /* renamed from: io.reactivex.internal.operators.observable.x$a */
    /* compiled from: ObservableRange */
    static final class C13153a extends C13019b<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final C16741n<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        C13153a(C16741n<? super Integer> nVar, long j, long j2) {
            this.downstream = nVar;
            this.index = j;
            this.end = j2;
        }

        /* renamed from: a */
        public Integer poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        public void dispose() {
            set(1);
        }

        public boolean isDisposed() {
            return get() != 0;
        }

        public boolean isEmpty() {
            return this.index == this.end;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.fused) {
                C16741n<? super Integer> nVar = this.downstream;
                long j = this.end;
                for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                    nVar.onNext(Integer.valueOf((int) j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    nVar.onComplete();
                }
            }
        }
    }

    public C13152x(int i, int i2) {
        this.f60988a = i;
        this.f60989c = ((long) i) + ((long) i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super Integer> nVar) {
        C13153a aVar = new C13153a(nVar, (long) this.f60988a, this.f60989c);
        nVar.onSubscribe(aVar);
        aVar.run();
    }
}
