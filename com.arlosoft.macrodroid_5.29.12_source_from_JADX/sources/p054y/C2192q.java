package p054y;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p001a0.C0009g;
import p001a0.C0010h;
import p012b0.C1397a;
import p055z.C2205c;

/* renamed from: y.q */
/* compiled from: KeyframeParser */
class C2192q {

    /* renamed from: a */
    private static final Interpolator f6806a = new LinearInterpolator();

    /* renamed from: b */
    private static SparseArrayCompat<WeakReference<Interpolator>> f6807b;

    /* renamed from: c */
    static C2205c.C2206a f6808c = C2205c.C2206a.m9050a("t", "s", "e", "o", "i", "h", TypedValues.Transition.S_TO, "ti");

    /* renamed from: d */
    static C2205c.C2206a f6809d = C2205c.C2206a.m9050a("x", "y");

    C2192q() {
    }

    @Nullable
    /* renamed from: a */
    private static WeakReference<Interpolator> m9005a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C2192q.class) {
            weakReference = m9011g().get(i);
        }
        return weakReference;
    }

    /* renamed from: b */
    private static Interpolator m9006b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        pointF.x = C0009g.m60c(pointF.x, -1.0f, 1.0f);
        pointF.y = C0009g.m60c(pointF.y, -100.0f, 100.0f);
        pointF2.x = C0009g.m60c(pointF2.x, -1.0f, 1.0f);
        float c = C0009g.m60c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c;
        int i = C0010h.m79i(pointF.x, pointF.y, pointF2.x, c);
        WeakReference<Interpolator> a = m9005a(i);
        Interpolator interpolator2 = a != null ? (Interpolator) a.get() : null;
        if (a == null || interpolator2 == null) {
            try {
                interpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator = new LinearInterpolator();
                }
            }
            interpolator2 = interpolator;
            try {
                m9012h(i, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    /* renamed from: c */
    static <T> C1397a<T> m9007c(C2205c cVar, C1463d dVar, float f, C2184j0<T> j0Var, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m9009e(dVar, cVar, f, j0Var);
        }
        if (z) {
            return m9008d(dVar, cVar, f, j0Var);
        }
        return m9010f(cVar, f, j0Var);
    }

    /* renamed from: d */
    private static <T> C1397a<T> m9008d(C1463d dVar, C2205c cVar, float f, C2184j0<T> j0Var) throws IOException {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        cVar.mo24400e();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (cVar.mo24404h()) {
            switch (cVar.mo24412v(f6808c)) {
                case 0:
                    f2 = (float) cVar.mo24406j();
                    break;
                case 1:
                    t3 = j0Var.mo24389a(cVar, f);
                    break;
                case 2:
                    t2 = j0Var.mo24389a(cVar, f);
                    break;
                case 3:
                    pointF = C2190p.m9002e(cVar, 1.0f);
                    break;
                case 4:
                    pointF2 = C2190p.m9002e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.mo24407m() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = C2190p.m9002e(cVar, f);
                    break;
                case 7:
                    pointF4 = C2190p.m9002e(cVar, f);
                    break;
                default:
                    cVar.mo24414x();
                    break;
            }
        }
        cVar.mo24402g();
        if (z) {
            interpolator = f6806a;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator2 = f6806a;
            } else {
                interpolator2 = m9006b(pointF, pointF2);
            }
            interpolator = interpolator2;
            t = t2;
        }
        C1397a aVar = new C1397a(dVar, t3, t, interpolator, f2, (Float) null);
        aVar.f728o = pointF3;
        aVar.f729p = pointF4;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r14 = r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> p012b0.C1397a<T> m9009e(com.airbnb.lottie.C1463d r21, p055z.C2205c r22, float r23, p054y.C2184j0<T> r24) throws java.io.IOException {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.mo24400e()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.mo24404h()
            if (r17 == 0) goto L_0x01a8
            z.c$a r4 = f6808c
            int r4 = r0.mo24412v(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0191;
                case 2: goto L_0x0187;
                case 3: goto L_0x00f3;
                case 4: goto L_0x0044;
                case 5: goto L_0x003a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0030;
                default: goto L_0x0026;
            }
        L_0x0026:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo24414x()
            goto L_0x01a4
        L_0x0030:
            android.graphics.PointF r3 = p054y.C2190p.m9002e(r22, r23)
            goto L_0x0016
        L_0x0035:
            android.graphics.PointF r15 = p054y.C2190p.m9002e(r22, r23)
            goto L_0x0016
        L_0x003a:
            int r4 = r22.mo24407m()
            if (r4 != r5) goto L_0x0042
            r6 = 1
            goto L_0x0016
        L_0x0042:
            r6 = 0
            goto L_0x0016
        L_0x0044:
            z.c$b r4 = r22.mo24410s()
            z.c$b r5 = p055z.C2205c.C2207b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e8
            r22.mo24400e()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x0053:
            boolean r18 = r22.mo24404h()
            if (r18 == 0) goto L_0x00d2
            r18 = r15
            z.c$a r15 = f6809d
            int r15 = r0.mo24412v(r15)
            if (r15 == 0) goto L_0x00a5
            r19 = r3
            r3 = 1
            if (r15 == r3) goto L_0x0070
            r22.mo24414x()
        L_0x006b:
            r15 = r18
            r3 = r19
            goto L_0x0053
        L_0x0070:
            z.c$b r3 = r22.mo24410s()
            z.c$b r5 = p055z.C2205c.C2207b.NUMBER
            if (r3 != r5) goto L_0x0081
            r3 = r14
            double r13 = r22.mo24406j()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x006b
        L_0x0081:
            r3 = r14
            r22.mo24399c()
            double r13 = r22.mo24406j()
            float r13 = (float) r13
            z.c$b r14 = r22.mo24410s()
            if (r14 != r5) goto L_0x0096
            double r14 = r22.mo24406j()
            float r5 = (float) r14
            goto L_0x0097
        L_0x0096:
            r5 = r13
        L_0x0097:
            r22.mo24401f()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x0053
        L_0x00a5:
            r19 = r3
            r3 = r14
            z.c$b r4 = r22.mo24410s()
            z.c$b r12 = p055z.C2205c.C2207b.NUMBER
            if (r4 != r12) goto L_0x00b8
            double r14 = r22.mo24406j()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x006b
        L_0x00b8:
            r22.mo24399c()
            double r14 = r22.mo24406j()
            float r4 = (float) r14
            z.c$b r14 = r22.mo24410s()
            if (r14 != r12) goto L_0x00cc
            double r14 = r22.mo24406j()
            float r12 = (float) r14
            goto L_0x00cd
        L_0x00cc:
            r12 = r4
        L_0x00cd:
            r22.mo24401f()
            r14 = r3
            goto L_0x006b
        L_0x00d2:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.mo24402g()
            r13 = r4
            r12 = r14
            goto L_0x017d
        L_0x00e8:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = p054y.C2190p.m9002e(r22, r23)
            goto L_0x01a4
        L_0x00f3:
            r19 = r3
            r3 = r14
            r18 = r15
            z.c$b r4 = r22.mo24410s()
            z.c$b r5 = p055z.C2205c.C2207b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017f
            r22.mo24400e()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0107:
            boolean r14 = r22.mo24404h()
            if (r14 == 0) goto L_0x016c
            z.c$a r14 = f6809d
            int r14 = r0.mo24412v(r14)
            if (r14 == 0) goto L_0x0144
            r15 = 1
            if (r14 == r15) goto L_0x011c
            r22.mo24414x()
            goto L_0x0107
        L_0x011c:
            z.c$b r5 = r22.mo24410s()
            z.c$b r11 = p055z.C2205c.C2207b.NUMBER
            if (r5 != r11) goto L_0x012b
            double r14 = r22.mo24406j()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0107
        L_0x012b:
            r22.mo24399c()
            double r14 = r22.mo24406j()
            float r5 = (float) r14
            z.c$b r14 = r22.mo24410s()
            if (r14 != r11) goto L_0x013f
            double r14 = r22.mo24406j()
            float r11 = (float) r14
            goto L_0x0140
        L_0x013f:
            r11 = r5
        L_0x0140:
            r22.mo24401f()
            goto L_0x0107
        L_0x0144:
            z.c$b r4 = r22.mo24410s()
            z.c$b r9 = p055z.C2205c.C2207b.NUMBER
            if (r4 != r9) goto L_0x0153
            double r14 = r22.mo24406j()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0107
        L_0x0153:
            r22.mo24399c()
            double r14 = r22.mo24406j()
            float r4 = (float) r14
            z.c$b r14 = r22.mo24410s()
            if (r14 != r9) goto L_0x0167
            double r14 = r22.mo24406j()
            float r9 = (float) r14
            goto L_0x0168
        L_0x0167:
            r9 = r4
        L_0x0168:
            r22.mo24401f()
            goto L_0x0107
        L_0x016c:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.mo24402g()
            r11 = r4
            r9 = r14
            r15 = r18
        L_0x017d:
            r14 = r3
            goto L_0x01a4
        L_0x017f:
            android.graphics.PointF r7 = p054y.C2190p.m9002e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x01a4
        L_0x0187:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.mo24389a(r0, r1)
            goto L_0x01a4
        L_0x0191:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.mo24389a(r0, r1)
            goto L_0x01a4
        L_0x019b:
            r19 = r3
            r18 = r15
            double r3 = r22.mo24406j()
            float r14 = (float) r3
        L_0x01a4:
            r3 = r19
            goto L_0x0016
        L_0x01a8:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo24402g()
            if (r6 == 0) goto L_0x01b8
            android.view.animation.Interpolator r0 = f6806a
            r11 = r10
        L_0x01b5:
            r12 = 0
            r13 = 0
            goto L_0x01dc
        L_0x01b8:
            if (r7 == 0) goto L_0x01c1
            if (r8 == 0) goto L_0x01c1
            android.view.animation.Interpolator r0 = m9006b(r7, r8)
            goto L_0x01d9
        L_0x01c1:
            if (r9 == 0) goto L_0x01d7
            if (r11 == 0) goto L_0x01d7
            if (r12 == 0) goto L_0x01d7
            if (r13 == 0) goto L_0x01d7
            android.view.animation.Interpolator r0 = m9006b(r9, r12)
            android.view.animation.Interpolator r1 = m9006b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01dc
        L_0x01d7:
            android.view.animation.Interpolator r0 = f6806a
        L_0x01d9:
            r11 = r16
            goto L_0x01b5
        L_0x01dc:
            if (r12 == 0) goto L_0x01ed
            if (r13 == 0) goto L_0x01ed
            b0.a r0 = new b0.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r5 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01fb
        L_0x01ed:
            r5 = r18
            b0.a r1 = new b0.a
            r14 = 0
            r8 = r1
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r1
        L_0x01fb:
            r0.f728o = r5
            r3 = r19
            r0.f729p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054y.C2192q.m9009e(com.airbnb.lottie.d, z.c, float, y.j0):b0.a");
    }

    /* renamed from: f */
    private static <T> C1397a<T> m9010f(C2205c cVar, float f, C2184j0<T> j0Var) throws IOException {
        return new C1397a<>(j0Var.mo24389a(cVar, f));
    }

    /* renamed from: g */
    private static SparseArrayCompat<WeakReference<Interpolator>> m9011g() {
        if (f6807b == null) {
            f6807b = new SparseArrayCompat<>();
        }
        return f6807b;
    }

    /* renamed from: h */
    private static void m9012h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C2192q.class) {
            f6807b.put(i, weakReference);
        }
    }
}
