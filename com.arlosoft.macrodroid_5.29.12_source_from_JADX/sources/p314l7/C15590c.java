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

/* renamed from: l7.c */
/* compiled from: ViewPropertyAnimatorHC */
class C15590c extends C15589b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WeakReference<View> f64828b;

    /* renamed from: c */
    private long f64829c;

    /* renamed from: d */
    private boolean f64830d = false;

    /* renamed from: e */
    private long f64831e = 0;

    /* renamed from: f */
    private boolean f64832f = false;

    /* renamed from: g */
    private Interpolator f64833g;

    /* renamed from: h */
    private boolean f64834h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C13396a.C13397a f64835i = null;

    /* renamed from: j */
    private C15592b f64836j = new C15592b(this, (C15591a) null);

    /* renamed from: k */
    ArrayList<C15593c> f64837k = new ArrayList<>();

    /* renamed from: l */
    private Runnable f64838l = new C15591a();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public HashMap<C13396a, C15594d> f64839m = new HashMap<>();

    /* renamed from: l7.c$a */
    /* compiled from: ViewPropertyAnimatorHC */
    class C15591a implements Runnable {
        C15591a() {
        }

        public void run() {
            C15590c.this.m94785o();
        }
    }

    /* renamed from: l7.c$b */
    /* compiled from: ViewPropertyAnimatorHC */
    private class C15592b implements C13396a.C13397a, C13408i.C13415g {
        private C15592b() {
        }

        /* renamed from: a */
        public void mo70808a(C13396a aVar) {
            if (C15590c.this.f64835i != null) {
                C15590c.this.f64835i.mo70808a(aVar);
            }
        }

        /* renamed from: b */
        public void mo70809b(C13396a aVar) {
            if (C15590c.this.f64835i != null) {
                C15590c.this.f64835i.mo70809b(aVar);
            }
        }

        /* renamed from: c */
        public void mo70810c(C13396a aVar) {
            if (C15590c.this.f64835i != null) {
                C15590c.this.f64835i.mo70810c(aVar);
            }
            C15590c.this.f64839m.remove(aVar);
            if (C15590c.this.f64839m.isEmpty()) {
                C13396a.C13397a unused = C15590c.this.f64835i = null;
            }
        }

        /* renamed from: d */
        public void mo70864d(C13408i iVar) {
            View view;
            float x = iVar.mo70850x();
            C15594d dVar = (C15594d) C15590c.this.f64839m.get(iVar);
            if (!((dVar.f64845a & FrameMetricsAggregator.EVERY_DURATION) == 0 || (view = (View) C15590c.this.f64828b.get()) == null)) {
                view.invalidate();
            }
            ArrayList<C15593c> arrayList = dVar.f64846b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C15593c cVar = arrayList.get(i);
                    C15590c.this.m94784n(cVar.f64842a, cVar.f64843b + (cVar.f64844c * x));
                }
            }
            View view2 = (View) C15590c.this.f64828b.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        /* renamed from: e */
        public void mo70811e(C13396a aVar) {
            if (C15590c.this.f64835i != null) {
                C15590c.this.f64835i.mo70811e(aVar);
            }
        }

        /* synthetic */ C15592b(C15590c cVar, C15591a aVar) {
            this();
        }
    }

    /* renamed from: l7.c$c */
    /* compiled from: ViewPropertyAnimatorHC */
    private static class C15593c {

        /* renamed from: a */
        int f64842a;

        /* renamed from: b */
        float f64843b;

        /* renamed from: c */
        float f64844c;

        C15593c(int i, float f, float f2) {
            this.f64842a = i;
            this.f64843b = f;
            this.f64844c = f2;
        }
    }

    /* renamed from: l7.c$d */
    /* compiled from: ViewPropertyAnimatorHC */
    private static class C15594d {

        /* renamed from: a */
        int f64845a;

        /* renamed from: b */
        ArrayList<C15593c> f64846b;

        C15594d(int i, ArrayList<C15593c> arrayList) {
            this.f64845a = i;
            this.f64846b = arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo74940a(int i) {
            ArrayList<C15593c> arrayList;
            if (!((this.f64845a & i) == 0 || (arrayList = this.f64846b) == null)) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f64846b.get(i2).f64842a == i) {
                        this.f64846b.remove(i2);
                        this.f64845a = (~i) & this.f64845a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    C15590c(View view) {
        this.f64828b = new WeakReference<>(view);
    }

    /* renamed from: k */
    private void m94781k(int i, float f) {
        float m = m94783m(i);
        m94782l(i, m, f - m);
    }

    /* renamed from: l */
    private void m94782l(int i, float f, float f2) {
        if (this.f64839m.size() > 0) {
            C13396a aVar = null;
            Iterator<C13396a> it = this.f64839m.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C13396a next = it.next();
                C15594d dVar = this.f64839m.get(next);
                if (dVar.mo74940a(i) && dVar.f64845a == 0) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                aVar.cancel();
            }
        }
        this.f64837k.add(new C15593c(i, f, f2));
        View view = (View) this.f64828b.get();
        if (view != null) {
            view.removeCallbacks(this.f64838l);
            view.post(this.f64838l);
        }
    }

    /* renamed from: m */
    private float m94783m(int i) {
        View view = (View) this.f64828b.get();
        if (view == null) {
            return 0.0f;
        }
        if (i == 1) {
            return view.getTranslationX();
        }
        if (i == 2) {
            return view.getTranslationY();
        }
        if (i == 4) {
            return view.getScaleX();
        }
        if (i == 8) {
            return view.getScaleY();
        }
        if (i == 16) {
            return view.getRotation();
        }
        if (i == 32) {
            return view.getRotationX();
        }
        if (i == 64) {
            return view.getRotationY();
        }
        if (i == 128) {
            return view.getX();
        }
        if (i == 256) {
            return view.getY();
        }
        if (i != 512) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m94784n(int i, float f) {
        View view = (View) this.f64828b.get();
        if (view == null) {
            return;
        }
        if (i == 1) {
            view.setTranslationX(f);
        } else if (i == 2) {
            view.setTranslationY(f);
        } else if (i == 4) {
            view.setScaleX(f);
        } else if (i == 8) {
            view.setScaleY(f);
        } else if (i == 16) {
            view.setRotation(f);
        } else if (i == 32) {
            view.setRotationX(f);
        } else if (i == 64) {
            view.setRotationY(f);
        } else if (i == 128) {
            view.setX(f);
        } else if (i == 256) {
            view.setY(f);
        } else if (i == 512) {
            view.setAlpha(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m94785o() {
        C13408i A = C13408i.m85815A(1.0f);
        ArrayList arrayList = (ArrayList) this.f64837k.clone();
        this.f64837k.clear();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= ((C15593c) arrayList.get(i2)).f64842a;
        }
        this.f64839m.put(A, new C15594d(i, arrayList));
        A.mo70845q(this.f64836j);
        A.mo70804a(this.f64836j);
        if (this.f64832f) {
            A.mo70842G(this.f64831e);
        }
        if (this.f64830d) {
            A.mo70839C(this.f64829c);
        }
        if (this.f64834h) {
            A.mo70841E(this.f64833g);
        }
        A.mo70844J();
    }

    /* renamed from: b */
    public C15589b mo74936b(long j) {
        if (j >= 0) {
            this.f64830d = true;
            this.f64829c = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: c */
    public C15589b mo74937c(Interpolator interpolator) {
        this.f64834h = true;
        this.f64833g = interpolator;
        return this;
    }

    /* renamed from: d */
    public C15589b mo74938d(float f) {
        m94781k(2, f);
        return this;
    }
}
