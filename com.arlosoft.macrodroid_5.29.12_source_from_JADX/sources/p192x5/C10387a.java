package p192x5;

import android.view.MotionEvent;
import p414v9.C16735i;
import p414v9.C16737j;
import p414v9.C16738k;

/* renamed from: x5.a */
/* compiled from: Swipe */
public class C10387a {

    /* renamed from: a */
    private final int f23609a;

    /* renamed from: b */
    private final int f23610b;

    /* renamed from: c */
    private C10391c f23611c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C16737j<C10390b> f23612d;

    /* renamed from: e */
    private float f23613e;

    /* renamed from: f */
    private float f23614f;

    /* renamed from: g */
    private float f23615g;

    /* renamed from: h */
    private float f23616h;

    /* renamed from: i */
    private float f23617i;

    /* renamed from: j */
    private float f23618j;

    /* renamed from: x5.a$a */
    /* compiled from: Swipe */
    class C10388a implements C16738k<C10390b> {
        C10388a() {
        }

        /* renamed from: a */
        public void mo16895a(C16737j<C10390b> jVar) throws Exception {
            C16737j unused = C10387a.this.f23612d = jVar;
        }
    }

    /* renamed from: x5.a$b */
    /* compiled from: Swipe */
    class C10389b implements C10391c {
        C10389b() {
        }

        /* renamed from: a */
        public void mo41069a(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPING_RIGHT);
        }

        /* renamed from: b */
        public void mo41070b(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPING_UP);
        }

        /* renamed from: c */
        public boolean mo41071c(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPED_LEFT);
            return false;
        }

        /* renamed from: d */
        public boolean mo41072d(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPED_DOWN);
            return false;
        }

        /* renamed from: e */
        public boolean mo41073e(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPED_UP);
            return false;
        }

        /* renamed from: f */
        public void mo41074f(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPING_DOWN);
        }

        /* renamed from: g */
        public void mo41075g(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPING_LEFT);
        }

        /* renamed from: h */
        public boolean mo41076h(MotionEvent motionEvent) {
            C10387a.this.m40727l(C10390b.SWIPED_RIGHT);
            return false;
        }
    }

    public C10387a(int i, int i2) {
        this.f23609a = i;
        this.f23610b = i2;
    }

    /* renamed from: c */
    private void m40722c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: d */
    private C10391c m40723d() {
        return new C10389b();
    }

    /* renamed from: i */
    private void m40724i(MotionEvent motionEvent) {
        this.f23613e = motionEvent.getX();
        this.f23615g = motionEvent.getY();
    }

    /* renamed from: j */
    private void m40725j(MotionEvent motionEvent) {
        this.f23617i = motionEvent.getX();
        this.f23618j = motionEvent.getY();
        boolean z = true;
        boolean z2 = Math.abs(this.f23617i - this.f23613e) > ((float) mo41067g());
        boolean z3 = Math.abs(this.f23618j - this.f23615g) > ((float) mo41067g());
        if (z2) {
            float f = this.f23617i;
            float f2 = this.f23613e;
            boolean z4 = f > f2;
            boolean z5 = f < f2;
            if (z4) {
                this.f23611c.mo41069a(motionEvent);
            }
            if (z5) {
                this.f23611c.mo41075g(motionEvent);
            }
        }
        if (z3) {
            float f3 = this.f23615g;
            float f4 = this.f23618j;
            boolean z6 = f3 < f4;
            if (f3 <= f4) {
                z = false;
            }
            if (z6) {
                this.f23611c.mo41074f(motionEvent);
            }
            if (z) {
                this.f23611c.mo41070b(motionEvent);
            }
        }
    }

    /* renamed from: k */
    private boolean m40726k(MotionEvent motionEvent) {
        boolean z;
        this.f23614f = motionEvent.getX();
        this.f23616h = motionEvent.getY();
        boolean z2 = true;
        boolean z3 = Math.abs(this.f23614f - this.f23613e) > ((float) mo41066f());
        boolean z4 = Math.abs(this.f23616h - this.f23615g) > ((float) mo41066f());
        if (z3) {
            float f = this.f23614f;
            float f2 = this.f23613e;
            boolean z5 = f > f2;
            boolean z6 = f < f2;
            z = z5 ? this.f23611c.mo41076h(motionEvent) : false;
            if (z6) {
                z |= this.f23611c.mo41071c(motionEvent);
            }
        } else {
            z = false;
        }
        if (!z4) {
            return z;
        }
        float f3 = this.f23615g;
        float f4 = this.f23616h;
        boolean z7 = f3 < f4;
        if (f3 <= f4) {
            z2 = false;
        }
        if (z7) {
            z |= this.f23611c.mo41072d(motionEvent);
        }
        return z2 ? z | this.f23611c.mo41073e(motionEvent) : z;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m40727l(C10390b bVar) {
        C16737j<C10390b> jVar = this.f23612d;
        if (jVar != null) {
            jVar.onNext(bVar);
        }
    }

    /* renamed from: e */
    public boolean mo41065e(MotionEvent motionEvent) {
        m40722c(motionEvent, "event == null");
        int action = motionEvent.getAction();
        if (action == 0) {
            m40724i(motionEvent);
        } else if (action == 1) {
            return m40726k(motionEvent);
        } else {
            if (action == 2) {
                m40725j(motionEvent);
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo41066f() {
        return this.f23610b;
    }

    /* renamed from: g */
    public int mo41067g() {
        return this.f23609a;
    }

    /* renamed from: h */
    public C16735i<C10390b> mo41068h() {
        this.f23611c = m40723d();
        return C16735i.m99352k(new C10388a());
    }
}
