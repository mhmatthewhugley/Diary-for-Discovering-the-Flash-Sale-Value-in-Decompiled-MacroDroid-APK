package p146p4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;
import p090f5.C7312g;
import p090f5.C7316k;

/* renamed from: p4.m */
/* compiled from: ModelCache */
public class C8102m<A, B> {

    /* renamed from: a */
    private final C7312g<C8104b<A>, B> f19701a;

    /* renamed from: p4.m$a */
    /* compiled from: ModelCache */
    class C8103a extends C7312g<C8104b<A>, B> {
        C8103a(long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo37257j(@NonNull C8104b<A> bVar, @Nullable B b) {
            bVar.mo38121c();
        }
    }

    @VisibleForTesting
    /* renamed from: p4.m$b */
    /* compiled from: ModelCache */
    static final class C8104b<A> {

        /* renamed from: d */
        private static final Queue<C8104b<?>> f19703d = C7316k.m30210e(0);

        /* renamed from: a */
        private int f19704a;

        /* renamed from: b */
        private int f19705b;

        /* renamed from: c */
        private A f19706c;

        private C8104b() {
        }

        /* renamed from: a */
        static <A> C8104b<A> m33717a(A a, int i, int i2) {
            C8104b<A> poll;
            Queue<C8104b<?>> queue = f19703d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C8104b<>();
            }
            poll.m33718b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m33718b(A a, int i, int i2) {
            this.f19706c = a;
            this.f19705b = i;
            this.f19704a = i2;
        }

        /* renamed from: c */
        public void mo38121c() {
            Queue<C8104b<?>> queue = f19703d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8104b)) {
                return false;
            }
            C8104b bVar = (C8104b) obj;
            if (this.f19705b == bVar.f19705b && this.f19704a == bVar.f19704a && this.f19706c.equals(bVar.f19706c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f19704a * 31) + this.f19705b) * 31) + this.f19706c.hashCode();
        }
    }

    public C8102m(long j) {
        this.f19701a = new C8103a(j);
    }

    @Nullable
    /* renamed from: a */
    public B mo38118a(A a, int i, int i2) {
        C8104b a2 = C8104b.m33717a(a, i, i2);
        B g = this.f19701a.mo37254g(a2);
        a2.mo38121c();
        return g;
    }

    /* renamed from: b */
    public void mo38119b(A a, int i, int i2, B b) {
        this.f19701a.mo37258k(C8104b.m33717a(a, i, i2), b);
    }
}
