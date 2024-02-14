package p314l7;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p304k7.C13396a;
import p304k7.C13408i;
import p323m7.C15700a;

/* renamed from: l7.e */
/* compiled from: ViewPropertyAnimatorPreHC */
class C15596e extends C15589b {

    /* renamed from: b */
    private final C15700a f64848b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<View> f64849c;

    /* renamed from: d */
    private long f64850d;

    /* renamed from: e */
    private boolean f64851e = false;

    /* renamed from: f */
    private long f64852f = 0;

    /* renamed from: g */
    private boolean f64853g = false;

    /* renamed from: h */
    private Interpolator f64854h;

    /* renamed from: i */
    private boolean f64855i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C13396a.C13397a f64856j = null;

    /* renamed from: k */
    private C15598b f64857k = new C15598b(this, (C15597a) null);

    /* renamed from: l */
    ArrayList<C15599c> f64858l = new ArrayList<>();

    /* renamed from: m */
    private Runnable f64859m = new C15597a();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public HashMap<C13396a, C15600d> f64860n = new HashMap<>();

    /* renamed from: l7.e$a */
    /* compiled from: ViewPropertyAnimatorPreHC */
    class C15597a implements Runnable {
        C15597a() {
        }

        public void run() {
            C15596e.this.m94808o();
        }
    }

    /* renamed from: l7.e$b */
    /* compiled from: ViewPropertyAnimatorPreHC */
    private class C15598b implements C13396a.C13397a, C13408i.C13415g {
        private C15598b() {
        }

        /* renamed from: a */
        public void mo70808a(C13396a aVar) {
            if (C15596e.this.f64856j != null) {
                C15596e.this.f64856j.mo70808a(aVar);
            }
        }

        /* renamed from: b */
        public void mo70809b(C13396a aVar) {
            if (C15596e.this.f64856j != null) {
                C15596e.this.f64856j.mo70809b(aVar);
            }
        }

        /* renamed from: c */
        public void mo70810c(C13396a aVar) {
            if (C15596e.this.f64856j != null) {
                C15596e.this.f64856j.mo70810c(aVar);
            }
            C15596e.this.f64860n.remove(aVar);
            if (C15596e.this.f64860n.isEmpty()) {
                C13396a.C13397a unused = C15596e.this.f64856j = null;
            }
        }

        /* renamed from: d */
        public void mo70864d(C13408i iVar) {
            View view;
            float x = iVar.mo70850x();
            C15600d dVar = (C15600d) C15596e.this.f64860n.get(iVar);
            if (!((dVar.f64866a & FrameMetricsAggregator.EVERY_DURATION) == 0 || (view = (View) C15596e.this.f64849c.get()) == null)) {
                view.invalidate();
            }
            ArrayList<C15599c> arrayList = dVar.f64867b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C15599c cVar = arrayList.get(i);
                    C15596e.this.m94807n(cVar.f64863a, cVar.f64864b + (cVar.f64865c * x));
                }
            }
            View view2 = (View) C15596e.this.f64849c.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        /* renamed from: e */
        public void mo70811e(C13396a aVar) {
            if (C15596e.this.f64856j != null) {
                C15596e.this.f64856j.mo70811e(aVar);
            }
        }

        /* synthetic */ C15598b(C15596e eVar, C15597a aVar) {
            this();
        }
    }

    /* renamed from: l7.e$c */
    /* compiled from: ViewPropertyAnimatorPreHC */
    private static class C15599c {

        /* renamed from: a */
        int f64863a;

        /* renamed from: b */
        float f64864b;

        /* renamed from: c */
        float f64865c;

        C15599c(int i, float f, float f2) {
            this.f64863a = i;
            this.f64864b = f;
            this.f64865c = f2;
        }
    }

    /* renamed from: l7.e$d */
    /* compiled from: ViewPropertyAnimatorPreHC */
    private static class C15600d {

        /* renamed from: a */
        int f64866a;

        /* renamed from: b */
        ArrayList<C15599c> f64867b;

        C15600d(int i, ArrayList<C15599c> arrayList) {
            this.f64866a = i;
            this.f64867b = arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo74942a(int i) {
            ArrayList<C15599c> arrayList;
            if (!((this.f64866a & i) == 0 || (arrayList = this.f64867b) == null)) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f64867b.get(i2).f64863a == i) {
                        this.f64867b.remove(i2);
                        this.f64866a = (~i) & this.f64866a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    C15596e(View view) {
        this.f64849c = new WeakReference<>(view);
        this.f64848b = C15700a.m94930C(view);
    }

    /* renamed from: k */
    private void m94804k(int i, float f) {
        float m = m94806m(i);
        m94805l(i, m, f - m);
    }

    /* renamed from: l */
    private void m94805l(int i, float f, float f2) {
        if (this.f64860n.size() > 0) {
            C13396a aVar = null;
            Iterator<C13396a> it = this.f64860n.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C13396a next = it.next();
                C15600d dVar = this.f64860n.get(next);
                if (dVar.mo74942a(i) && dVar.f64866a == 0) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                aVar.cancel();
            }
        }
        this.f64858l.add(new C15599c(i, f, f2));
        View view = (View) this.f64849c.get();
        if (view != null) {
            view.removeCallbacks(this.f64859m);
            view.post(this.f64859m);
        }
    }

    /* renamed from: m */
    private float m94806m(int i) {
        if (i == 1) {
            return this.f64848b.mo75099h();
        }
        if (i == 2) {
            return this.f64848b.mo75100k();
        }
        if (i == 4) {
            return this.f64848b.mo75097f();
        }
        if (i == 8) {
            return this.f64848b.mo75098g();
        }
        if (i == 16) {
            return this.f64848b.mo75094c();
        }
        if (i == 32) {
            return this.f64848b.mo75095d();
        }
        if (i == 64) {
            return this.f64848b.mo75096e();
        }
        if (i == 128) {
            return this.f64848b.mo75101l();
        }
        if (i == 256) {
            return this.f64848b.mo75102n();
        }
        if (i != 512) {
            return 0.0f;
        }
        return this.f64848b.mo75093b();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m94807n(int i, float f) {
        if (i == 1) {
            this.f64848b.mo75109x(f);
        } else if (i == 2) {
            this.f64848b.mo75110y(f);
        } else if (i == 4) {
            this.f64848b.mo75107u(f);
        } else if (i == 8) {
            this.f64848b.mo75108v(f);
        } else if (i == 16) {
            this.f64848b.mo75104r(f);
        } else if (i == 32) {
            this.f64848b.mo75105s(f);
        } else if (i == 64) {
            this.f64848b.mo75106t(f);
        } else if (i == 128) {
            this.f64848b.mo75111z(f);
        } else if (i == 256) {
            this.f64848b.mo75091A(f);
        } else if (i == 512) {
            this.f64848b.mo75103q(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m94808o() {
        C13408i A = C13408i.m85815A(1.0f);
        ArrayList arrayList = (ArrayList) this.f64858l.clone();
        this.f64858l.clear();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= ((C15599c) arrayList.get(i2)).f64863a;
        }
        this.f64860n.put(A, new C15600d(i, arrayList));
        A.mo70845q(this.f64857k);
        A.mo70804a(this.f64857k);
        if (this.f64853g) {
            A.mo70842G(this.f64852f);
        }
        if (this.f64851e) {
            A.mo70839C(this.f64850d);
        }
        if (this.f64855i) {
            A.mo70841E(this.f64854h);
        }
        A.mo70844J();
    }

    /* renamed from: b */
    public C15589b mo74936b(long j) {
        if (j >= 0) {
            this.f64851e = true;
            this.f64850d = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: c */
    public C15589b mo74937c(Interpolator interpolator) {
        this.f64855i = true;
        this.f64854h = interpolator;
        return this;
    }

    /* renamed from: d */
    public C15589b mo74938d(float f) {
        m94804k(2, f);
        return this;
    }
}
