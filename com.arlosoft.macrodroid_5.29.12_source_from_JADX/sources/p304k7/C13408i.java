package p304k7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p304k7.C13396a;

/* renamed from: k7.i */
/* compiled from: ValueAnimator */
public class C13408i extends C13396a {

    /* renamed from: L */
    private static ThreadLocal<C13414f> f61464L = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static final ThreadLocal<ArrayList<C13408i>> f61465M = new C13409a();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final ThreadLocal<ArrayList<C13408i>> f61466N = new C13410b();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public static final ThreadLocal<ArrayList<C13408i>> f61467O = new C13411c();
    /* access modifiers changed from: private */

    /* renamed from: P */
    public static final ThreadLocal<ArrayList<C13408i>> f61468P = new C13412d();
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final ThreadLocal<ArrayList<C13408i>> f61469Q = new C13413e();

    /* renamed from: R */
    private static final Interpolator f61470R = new AccelerateDecelerateInterpolator();

    /* renamed from: S */
    private static final C13407h f61471S = new C13400d();

    /* renamed from: T */
    private static final C13407h f61472T = new C13398b();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static long f61473U = 10;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f61474A = false;

    /* renamed from: B */
    private boolean f61475B = false;

    /* renamed from: C */
    boolean f61476C = false;

    /* renamed from: D */
    private long f61477D = 300;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f61478E = 0;

    /* renamed from: F */
    private int f61479F = 0;

    /* renamed from: G */
    private int f61480G = 1;

    /* renamed from: H */
    private Interpolator f61481H = f61470R;

    /* renamed from: I */
    private ArrayList<C13415g> f61482I = null;

    /* renamed from: J */
    C13404g[] f61483J;

    /* renamed from: K */
    HashMap<String, C13404g> f61484K;

    /* renamed from: c */
    long f61485c;

    /* renamed from: d */
    long f61486d = -1;

    /* renamed from: f */
    private boolean f61487f = false;

    /* renamed from: g */
    private int f61488g = 0;

    /* renamed from: o */
    private float f61489o = 0.0f;

    /* renamed from: p */
    private boolean f61490p = false;

    /* renamed from: s */
    private long f61491s;

    /* renamed from: z */
    int f61492z = 0;

    /* renamed from: k7.i$a */
    /* compiled from: ValueAnimator */
    static class C13409a extends ThreadLocal<ArrayList<C13408i>> {
        C13409a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C13408i> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: k7.i$b */
    /* compiled from: ValueAnimator */
    static class C13410b extends ThreadLocal<ArrayList<C13408i>> {
        C13410b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C13408i> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: k7.i$c */
    /* compiled from: ValueAnimator */
    static class C13411c extends ThreadLocal<ArrayList<C13408i>> {
        C13411c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C13408i> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: k7.i$d */
    /* compiled from: ValueAnimator */
    static class C13412d extends ThreadLocal<ArrayList<C13408i>> {
        C13412d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C13408i> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: k7.i$e */
    /* compiled from: ValueAnimator */
    static class C13413e extends ThreadLocal<ArrayList<C13408i>> {
        C13413e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C13408i> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: k7.i$f */
    /* compiled from: ValueAnimator */
    private static class C13414f extends Handler {
        private C13414f() {
        }

        public void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) C13408i.f61465M.get();
            ArrayList arrayList2 = (ArrayList) C13408i.f61467O.get();
            int i = message.what;
            if (i == 0) {
                ArrayList arrayList3 = (ArrayList) C13408i.f61466N.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C13408i iVar = (C13408i) arrayList4.get(i2);
                        if (iVar.f61478E == 0) {
                            iVar.m85817L();
                        } else {
                            arrayList2.add(iVar);
                        }
                    }
                }
            } else if (i == 1) {
                z = true;
            } else {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) C13408i.f61469Q.get();
            ArrayList arrayList6 = (ArrayList) C13408i.f61468P.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C13408i iVar2 = (C13408i) arrayList2.get(i3);
                if (iVar2.m85829u(currentAnimationTimeMillis)) {
                    arrayList5.add(iVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    C13408i iVar3 = (C13408i) arrayList5.get(i4);
                    iVar3.m85817L();
                    boolean unused = iVar3.f61474A = true;
                    arrayList2.remove(iVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                C13408i iVar4 = (C13408i) arrayList.get(i5);
                if (iVar4.mo70847s(currentAnimationTimeMillis)) {
                    arrayList6.add(iVar4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(iVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    ((C13408i) arrayList6.get(i6)).m85830v();
                }
                arrayList6.clear();
            }
            if (!z) {
                return;
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0, C13408i.f61473U - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }

        /* synthetic */ C13414f(C13409a aVar) {
            this();
        }
    }

    /* renamed from: k7.i$g */
    /* compiled from: ValueAnimator */
    public interface C13415g {
        /* renamed from: d */
        void mo70864d(C13408i iVar);
    }

    /* renamed from: A */
    public static C13408i m85815A(float... fArr) {
        C13408i iVar = new C13408i();
        iVar.mo70840D(fArr);
        return iVar;
    }

    /* renamed from: K */
    private void m85816K(boolean z) {
        if (Looper.myLooper() != null) {
            this.f61487f = z;
            this.f61488g = 0;
            this.f61492z = 0;
            this.f61475B = true;
            this.f61490p = false;
            f61466N.get().add(this);
            if (this.f61478E == 0) {
                mo70838B(mo70851y());
                this.f61492z = 0;
                this.f61474A = true;
                ArrayList<C13396a.C13397a> arrayList = this.f61430a;
                if (arrayList != null) {
                    ArrayList arrayList2 = (ArrayList) arrayList.clone();
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((C13396a.C13397a) arrayList2.get(i)).mo70808a(this);
                    }
                }
            }
            C13414f fVar = f61464L.get();
            if (fVar == null) {
                fVar = new C13414f((C13409a) null);
                f61464L.set(fVar);
            }
            fVar.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m85817L() {
        ArrayList<C13396a.C13397a> arrayList;
        mo70852z();
        f61465M.get().add(this);
        if (this.f61478E > 0 && (arrayList = this.f61430a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((C13396a.C13397a) arrayList2.get(i)).mo70808a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean m85829u(long j) {
        if (!this.f61490p) {
            this.f61490p = true;
            this.f61491s = j;
            return false;
        }
        long j2 = j - this.f61491s;
        long j3 = this.f61478E;
        if (j2 <= j3) {
            return false;
        }
        this.f61485c = j - (j2 - j3);
        this.f61492z = 1;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m85830v() {
        ArrayList<C13396a.C13397a> arrayList;
        f61465M.get().remove(this);
        f61466N.get().remove(this);
        f61467O.get().remove(this);
        this.f61492z = 0;
        if (this.f61474A && (arrayList = this.f61430a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((C13396a.C13397a) arrayList2.get(i)).mo70810c(this);
            }
        }
        this.f61474A = false;
        this.f61475B = false;
    }

    /* renamed from: B */
    public void mo70838B(long j) {
        mo70852z();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f61492z != 1) {
            this.f61486d = j;
            this.f61492z = 2;
        }
        this.f61485c = currentAnimationTimeMillis - j;
        mo70847s(currentAnimationTimeMillis);
    }

    /* renamed from: C */
    public C13408i mo70839C(long j) {
        if (j >= 0) {
            this.f61477D = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: D */
    public void mo70840D(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            C13404g[] gVarArr = this.f61483J;
            if (gVarArr == null || gVarArr.length == 0) {
                mo70843H(C13404g.m85805e("", fArr));
            } else {
                gVarArr[0].mo70835f(fArr);
            }
            this.f61476C = false;
        }
    }

    /* renamed from: E */
    public void mo70841E(Interpolator interpolator) {
        if (interpolator != null) {
            this.f61481H = interpolator;
        } else {
            this.f61481H = new LinearInterpolator();
        }
    }

    /* renamed from: G */
    public void mo70842G(long j) {
        this.f61478E = j;
    }

    /* renamed from: H */
    public void mo70843H(C13404g... gVarArr) {
        this.f61483J = gVarArr;
        this.f61484K = new HashMap<>(r0);
        for (C13404g gVar : gVarArr) {
            this.f61484K.put(gVar.mo70832c(), gVar);
        }
        this.f61476C = false;
    }

    /* renamed from: J */
    public void mo70844J() {
        m85816K(false);
    }

    public void cancel() {
        ArrayList<C13396a.C13397a> arrayList;
        if (this.f61492z != 0 || f61466N.get().contains(this) || f61467O.get().contains(this)) {
            if (this.f61474A && (arrayList = this.f61430a) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((C13396a.C13397a) it.next()).mo70809b(this);
                }
            }
            m85830v();
        }
    }

    /* renamed from: q */
    public void mo70845q(C13415g gVar) {
        if (this.f61482I == null) {
            this.f61482I = new ArrayList<>();
        }
        this.f61482I.add(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo70846r(float f) {
        float interpolation = this.f61481H.getInterpolation(f);
        this.f61489o = interpolation;
        for (C13404g a : this.f61483J) {
            a.mo70830a(interpolation);
        }
        ArrayList<C13415g> arrayList = this.f61482I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f61482I.get(i).mo70864d(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo70847s(long r10) {
        /*
            r9 = this;
            int r0 = r9.f61492z
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001a
            r9.f61492z = r3
            long r4 = r9.f61486d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r9.f61485c = r10
            goto L_0x001a
        L_0x0012:
            long r4 = r10 - r4
            r9.f61485c = r4
            r4 = -1
            r9.f61486d = r4
        L_0x001a:
            int r0 = r9.f61492z
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L_0x0023
            if (r0 == r4) goto L_0x0023
            goto L_0x0082
        L_0x0023:
            long r6 = r9.f61477D
            r0 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0032
            long r1 = r9.f61485c
            long r10 = r10 - r1
            float r10 = (float) r10
            float r11 = (float) r6
            float r10 = r10 / r11
            goto L_0x0034
        L_0x0032:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0034:
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0077
            int r11 = r9.f61488g
            int r1 = r9.f61479F
            if (r11 < r1) goto L_0x0047
            r11 = -1
            if (r1 != r11) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            float r10 = java.lang.Math.min(r10, r0)
            goto L_0x0078
        L_0x0047:
            java.util.ArrayList<k7.a$a> r11 = r9.f61430a
            if (r11 == 0) goto L_0x0060
            int r11 = r11.size()
            r1 = 0
        L_0x0050:
            if (r1 >= r11) goto L_0x0060
            java.util.ArrayList<k7.a$a> r2 = r9.f61430a
            java.lang.Object r2 = r2.get(r1)
            k7.a$a r2 = (p304k7.C13396a.C13397a) r2
            r2.mo70811e(r9)
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0060:
            int r11 = r9.f61480G
            if (r11 != r4) goto L_0x0069
            boolean r11 = r9.f61487f
            r11 = r11 ^ r3
            r9.f61487f = r11
        L_0x0069:
            int r11 = r9.f61488g
            int r1 = (int) r10
            int r11 = r11 + r1
            r9.f61488g = r11
            float r10 = r10 % r0
            long r1 = r9.f61485c
            long r3 = r9.f61477D
            long r1 = r1 + r3
            r9.f61485c = r1
        L_0x0077:
            r3 = 0
        L_0x0078:
            boolean r11 = r9.f61487f
            if (r11 == 0) goto L_0x007e
            float r10 = r0 - r10
        L_0x007e:
            r9.mo70846r(r10)
            r5 = r3
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p304k7.C13408i.mo70847s(long):boolean");
    }

    /* renamed from: t */
    public C13408i clone() {
        C13408i iVar = (C13408i) super.clone();
        ArrayList<C13415g> arrayList = this.f61482I;
        if (arrayList != null) {
            iVar.f61482I = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iVar.f61482I.add(arrayList.get(i));
            }
        }
        iVar.f61486d = -1;
        iVar.f61487f = false;
        iVar.f61488g = 0;
        iVar.f61476C = false;
        iVar.f61492z = 0;
        iVar.f61490p = false;
        C13404g[] gVarArr = this.f61483J;
        if (gVarArr != null) {
            int length = gVarArr.length;
            iVar.f61483J = new C13404g[length];
            iVar.f61484K = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                C13404g b = gVarArr[i2].clone();
                iVar.f61483J[i2] = b;
                iVar.f61484K.put(b.mo70832c(), b);
            }
        }
        return iVar;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f61483J != null) {
            for (int i = 0; i < this.f61483J.length; i++) {
                str = str + "\n    " + this.f61483J[i].toString();
            }
        }
        return str;
    }

    /* renamed from: x */
    public float mo70850x() {
        return this.f61489o;
    }

    /* renamed from: y */
    public long mo70851y() {
        if (!this.f61476C || this.f61492z == 0) {
            return 0;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f61485c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo70852z() {
        if (!this.f61476C) {
            for (C13404g d : this.f61483J) {
                d.mo70834d();
            }
            this.f61476C = true;
        }
    }
}
