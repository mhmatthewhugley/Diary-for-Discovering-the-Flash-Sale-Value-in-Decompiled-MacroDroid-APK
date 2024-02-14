package p360p9;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import java.io.IOException;
import p226cd.C11179b;
import p369q9.C16239c;

/* renamed from: p9.p */
/* compiled from: OutboundFlowController */
class C16142p {

    /* renamed from: a */
    private final C16124h f66264a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16239c f66265b;

    /* renamed from: c */
    private int f66266c = 65535;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16144b f66267d = new C16144b(0, 65535);

    /* renamed from: p9.p$c */
    /* compiled from: OutboundFlowController */
    private static final class C16145c {

        /* renamed from: a */
        int f66275a;

        private C16145c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo78539a() {
            return this.f66275a > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo78540b() {
            this.f66275a++;
        }
    }

    C16142p(C16124h hVar, C16239c cVar) {
        this.f66264a = (C16124h) Preconditions.m5393t(hVar, NotificationCompat.CATEGORY_TRANSPORT);
        this.f66265b = (C16239c) Preconditions.m5393t(cVar, "frameWriter");
    }

    /* renamed from: f */
    private C16144b m96944f(C16121g gVar) {
        C16144b bVar = (C16144b) gVar.mo78468L();
        if (bVar != null) {
            return bVar;
        }
        C16144b bVar2 = new C16144b(this, gVar, this.f66266c);
        gVar.mo78471O(bVar2);
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78522c(boolean z, int i, C11179b bVar, boolean z2) {
        Preconditions.m5393t(bVar, "source");
        C16121g Z = this.f66264a.mo78485Z(i);
        if (Z != null) {
            C16144b f = m96944f(Z);
            int j = f.mo78536j();
            boolean e = f.mo78531e();
            int D = (int) bVar.mo62399D();
            if (e || j < D) {
                if (!e && j > 0) {
                    f.mo78537k(bVar, j, false);
                }
                f.mo78530d(bVar, (int) bVar.mo62399D(), z);
            } else {
                f.mo78537k(bVar, D, z);
            }
            if (z2) {
                mo78523d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo78523d() {
        try {
            this.f66265b.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo78524e(int i) {
        if (i >= 0) {
            int i2 = i - this.f66266c;
            this.f66266c = i;
            for (C16121g gVar : this.f66264a.mo78481U()) {
                C16144b bVar = (C16144b) gVar.mo78468L();
                if (bVar == null) {
                    gVar.mo78471O(new C16144b(this, gVar, this.f66266c));
                } else {
                    bVar.mo78532f(i2);
                }
            }
            if (i2 > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Invalid initial window size: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo78525g(C16121g gVar, int i) {
        if (gVar == null) {
            int f = this.f66267d.mo78532f(i);
            mo78526h();
            return f;
        }
        C16144b f2 = m96944f(gVar);
        int f3 = f2.mo78532f(i);
        C16145c cVar = new C16145c();
        f2.mo78538l(f2.mo78536j(), cVar);
        if (cVar.mo78539a()) {
            mo78523d();
        }
        return f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo78526h() {
        int i;
        C16121g[] U = this.f66264a.mo78481U();
        int i2 = this.f66267d.mo78535i();
        int length = U.length;
        while (true) {
            i = 0;
            if (length <= 0 || i2 <= 0) {
                C16145c cVar = new C16145c();
                C16121g[] U2 = this.f66264a.mo78481U();
                int length2 = U2.length;
            } else {
                int ceil = (int) Math.ceil((double) (((float) i2) / ((float) length)));
                for (int i3 = 0; i3 < length && i2 > 0; i3++) {
                    C16121g gVar = U[i3];
                    C16144b f = m96944f(gVar);
                    int min = Math.min(i2, Math.min(f.mo78534h(), ceil));
                    if (min > 0) {
                        f.mo78527a(min);
                        i2 -= min;
                    }
                    if (f.mo78534h() > 0) {
                        U[i] = gVar;
                        i++;
                    }
                }
                length = i;
            }
        }
        C16145c cVar2 = new C16145c();
        C16121g[] U22 = this.f66264a.mo78481U();
        int length22 = U22.length;
        while (i < length22) {
            C16144b f2 = m96944f(U22[i]);
            f2.mo78538l(f2.mo78528b(), cVar2);
            f2.mo78529c();
            i++;
        }
        if (cVar2.mo78539a()) {
            mo78523d();
        }
    }

    /* renamed from: p9.p$b */
    /* compiled from: OutboundFlowController */
    private final class C16144b {

        /* renamed from: a */
        final C11179b f66268a;

        /* renamed from: b */
        final int f66269b;

        /* renamed from: c */
        int f66270c;

        /* renamed from: d */
        int f66271d;

        /* renamed from: e */
        C16121g f66272e;

        /* renamed from: f */
        boolean f66273f;

        C16144b(int i, int i2) {
            this.f66273f = false;
            this.f66269b = i;
            this.f66270c = i2;
            this.f66268a = new C11179b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78527a(int i) {
            this.f66271d += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo78528b() {
            return this.f66271d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo78529c() {
            this.f66271d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo78530d(C11179b bVar, int i, boolean z) {
            this.f66268a.mo62384X(bVar, (long) i);
            this.f66273f |= z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo78531e() {
            return this.f66268a.mo62399D() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo78532f(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.f66270c) {
                int i2 = this.f66270c + i;
                this.f66270c = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f66269b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo78533g() {
            return Math.max(0, Math.min(this.f66270c, (int) this.f66268a.mo62399D()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo78534h() {
            return mo78533g() - this.f66271d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo78535i() {
            return this.f66270c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo78536j() {
            return Math.min(this.f66270c, C16142p.this.f66267d.mo78535i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo78537k(C11179b bVar, int i, boolean z) {
            do {
                int min = Math.min(i, C16142p.this.f66265b.mo78446T0());
                int i2 = -min;
                C16142p.this.f66267d.mo78532f(i2);
                mo78532f(i2);
                try {
                    C16142p.this.f66265b.mo78447X0(bVar.mo62399D() == ((long) min) && z, this.f66269b, bVar, min);
                    this.f66272e.mo69154w().mo69255n(min);
                    i -= min;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo78538l(int i, C16145c cVar) {
            int min = Math.min(i, mo78536j());
            int i2 = 0;
            while (mo78531e() && min > 0) {
                if (((long) min) >= this.f66268a.mo62399D()) {
                    i2 += (int) this.f66268a.mo62399D();
                    C11179b bVar = this.f66268a;
                    mo78537k(bVar, (int) bVar.mo62399D(), this.f66273f);
                } else {
                    i2 += min;
                    mo78537k(this.f66268a, min, false);
                }
                cVar.mo78540b();
                min = Math.min(i - i2, mo78536j());
            }
            return i2;
        }

        C16144b(C16142p pVar, C16121g gVar, int i) {
            this(gVar.mo78470N(), i);
            this.f66272e = gVar;
        }
    }
}
