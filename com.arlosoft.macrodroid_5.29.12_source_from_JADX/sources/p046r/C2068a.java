package p046r;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1461c;
import java.util.ArrayList;
import java.util.List;
import p012b0.C1397a;
import p012b0.C1399c;

/* renamed from: r.a */
/* compiled from: BaseKeyframeAnimation */
public abstract class C2068a<K, A> {

    /* renamed from: a */
    final List<C2070b> f6424a = new ArrayList(1);

    /* renamed from: b */
    private boolean f6425b = false;

    /* renamed from: c */
    private final C2072d<K> f6426c;

    /* renamed from: d */
    protected float f6427d = 0.0f;
    @Nullable

    /* renamed from: e */
    protected C1399c<A> f6428e;
    @Nullable

    /* renamed from: f */
    private A f6429f = null;

    /* renamed from: g */
    private float f6430g = -1.0f;

    /* renamed from: h */
    private float f6431h = -1.0f;

    /* renamed from: r.a$b */
    /* compiled from: BaseKeyframeAnimation */
    public interface C2070b {
        /* renamed from: a */
        void mo24123a();
    }

    /* renamed from: r.a$c */
    /* compiled from: BaseKeyframeAnimation */
    private static final class C2071c<T> implements C2072d<T> {
        private C2071c() {
        }

        /* renamed from: a */
        public boolean mo24155a(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: b */
        public C1397a<T> mo24156b() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: c */
        public boolean mo24157c(float f) {
            return false;
        }

        /* renamed from: d */
        public float mo24158d() {
            return 0.0f;
        }

        /* renamed from: e */
        public float mo24159e() {
            return 1.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: r.a$d */
    /* compiled from: BaseKeyframeAnimation */
    private interface C2072d<T> {
        /* renamed from: a */
        boolean mo24155a(float f);

        /* renamed from: b */
        C1397a<T> mo24156b();

        /* renamed from: c */
        boolean mo24157c(float f);

        @FloatRange(from = 0.0d, mo592to = 1.0d)
        /* renamed from: d */
        float mo24158d();

        @FloatRange(from = 0.0d, mo592to = 1.0d)
        /* renamed from: e */
        float mo24159e();

        boolean isEmpty();
    }

    /* renamed from: r.a$e */
    /* compiled from: BaseKeyframeAnimation */
    private static final class C2073e<T> implements C2072d<T> {

        /* renamed from: a */
        private final List<? extends C1397a<T>> f6432a;
        @NonNull

        /* renamed from: b */
        private C1397a<T> f6433b;

        /* renamed from: c */
        private C1397a<T> f6434c = null;

        /* renamed from: d */
        private float f6435d = -1.0f;

        C2073e(List<? extends C1397a<T>> list) {
            this.f6432a = list;
            this.f6433b = m8570f(0.0f);
        }

        /* renamed from: f */
        private C1397a<T> m8570f(float f) {
            List<? extends C1397a<T>> list = this.f6432a;
            C1397a<T> aVar = (C1397a) list.get(list.size() - 1);
            if (f >= aVar.mo16812e()) {
                return aVar;
            }
            for (int size = this.f6432a.size() - 2; size >= 1; size--) {
                C1397a<T> aVar2 = (C1397a) this.f6432a.get(size);
                if (this.f6433b != aVar2 && aVar2.mo16808a(f)) {
                    return aVar2;
                }
            }
            return (C1397a) this.f6432a.get(0);
        }

        /* renamed from: a */
        public boolean mo24155a(float f) {
            C1397a<T> aVar = this.f6434c;
            C1397a<T> aVar2 = this.f6433b;
            if (aVar == aVar2 && this.f6435d == f) {
                return true;
            }
            this.f6434c = aVar2;
            this.f6435d = f;
            return false;
        }

        @NonNull
        /* renamed from: b */
        public C1397a<T> mo24156b() {
            return this.f6433b;
        }

        /* renamed from: c */
        public boolean mo24157c(float f) {
            if (this.f6433b.mo16808a(f)) {
                return !this.f6433b.mo16815h();
            }
            this.f6433b = m8570f(f);
            return true;
        }

        /* renamed from: d */
        public float mo24158d() {
            return ((C1397a) this.f6432a.get(0)).mo16812e();
        }

        /* renamed from: e */
        public float mo24159e() {
            List<? extends C1397a<T>> list = this.f6432a;
            return ((C1397a) list.get(list.size() - 1)).mo16809b();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: r.a$f */
    /* compiled from: BaseKeyframeAnimation */
    private static final class C2074f<T> implements C2072d<T> {
        @NonNull

        /* renamed from: a */
        private final C1397a<T> f6436a;

        /* renamed from: b */
        private float f6437b = -1.0f;

        C2074f(List<? extends C1397a<T>> list) {
            this.f6436a = (C1397a) list.get(0);
        }

        /* renamed from: a */
        public boolean mo24155a(float f) {
            if (this.f6437b == f) {
                return true;
            }
            this.f6437b = f;
            return false;
        }

        /* renamed from: b */
        public C1397a<T> mo24156b() {
            return this.f6436a;
        }

        /* renamed from: c */
        public boolean mo24157c(float f) {
            return !this.f6436a.mo16815h();
        }

        /* renamed from: d */
        public float mo24158d() {
            return this.f6436a.mo16812e();
        }

        /* renamed from: e */
        public float mo24159e() {
            return this.f6436a.mo16809b();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    C2068a(List<? extends C1397a<K>> list) {
        this.f6426c = m8545o(list);
    }

    @FloatRange(from = 0.0d, mo592to = 1.0d)
    /* renamed from: g */
    private float m8544g() {
        if (this.f6430g == -1.0f) {
            this.f6430g = this.f6426c.mo24158d();
        }
        return this.f6430g;
    }

    /* renamed from: o */
    private static <T> C2072d<T> m8545o(List<? extends C1397a<T>> list) {
        if (list.isEmpty()) {
            return new C2071c();
        }
        if (list.size() == 1) {
            return new C2074f(list);
        }
        return new C2073e(list);
    }

    /* renamed from: a */
    public void mo24142a(C2070b bVar) {
        this.f6424a.add(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1397a<K> mo24143b() {
        C1461c.m735a("BaseKeyframeAnimation#getCurrentKeyframe");
        C1397a<K> b = this.f6426c.mo24156b();
        C1461c.m736b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo592to = 1.0d)
    /* renamed from: c */
    public float mo24144c() {
        if (this.f6431h == -1.0f) {
            this.f6431h = this.f6426c.mo24159e();
        }
        return this.f6431h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo24145d() {
        C1397a b = mo24143b();
        if (b.mo16815h()) {
            return 0.0f;
        }
        return b.f717d.getInterpolation(mo24146e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo24146e() {
        if (this.f6425b) {
            return 0.0f;
        }
        C1397a b = mo24143b();
        if (b.mo16815h()) {
            return 0.0f;
        }
        return (this.f6427d - b.mo16812e()) / (b.mo16809b() - b.mo16812e());
    }

    /* renamed from: f */
    public float mo24147f() {
        return this.f6427d;
    }

    /* renamed from: h */
    public A mo24148h() {
        A a;
        float e = mo24146e();
        if (this.f6428e == null && this.f6426c.mo24155a(e)) {
            return this.f6429f;
        }
        C1397a b = mo24143b();
        Interpolator interpolator = b.f718e;
        if (interpolator == null || b.f719f == null) {
            a = mo24149i(b, mo24145d());
        } else {
            a = mo24150j(b, e, interpolator.getInterpolation(e), b.f719f.getInterpolation(e));
        }
        this.f6429f = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract A mo24149i(C1397a<K> aVar, float f);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public A mo24150j(C1397a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo24151k() {
        for (int i = 0; i < this.f6424a.size(); i++) {
            this.f6424a.get(i).mo24123a();
        }
    }

    /* renamed from: l */
    public void mo24152l() {
        this.f6425b = true;
    }

    /* renamed from: m */
    public void mo24153m(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        if (!this.f6426c.isEmpty()) {
            if (f < m8544g()) {
                f = m8544g();
            } else if (f > mo24144c()) {
                f = mo24144c();
            }
            if (f != this.f6427d) {
                this.f6427d = f;
                if (this.f6426c.mo24157c(f)) {
                    mo24151k();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo24154n(@Nullable C1399c<A> cVar) {
        C1399c<A> cVar2 = this.f6428e;
        if (cVar2 != null) {
            cVar2.mo16820c((C2068a<?, ?>) null);
        }
        this.f6428e = cVar;
        if (cVar != null) {
            cVar.mo16820c(this);
        }
    }
}
