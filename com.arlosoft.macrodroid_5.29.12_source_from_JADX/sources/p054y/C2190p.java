package p054y;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p055z.C2205c;

/* renamed from: y.p */
/* compiled from: JsonUtils */
class C2190p {

    /* renamed from: a */
    private static final C2205c.C2206a f6804a = C2205c.C2206a.m9050a("x", "y");

    /* renamed from: y.p$a */
    /* compiled from: JsonUtils */
    static /* synthetic */ class C2191a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6805a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                z.c$b[] r0 = p055z.C2205c.C2207b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6805a = r0
                z.c$b r1 = p055z.C2205c.C2207b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6805a     // Catch:{ NoSuchFieldError -> 0x001d }
                z.c$b r1 = p055z.C2205c.C2207b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6805a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z.c$b r1 = p055z.C2205c.C2207b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p054y.C2190p.C2191a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static PointF m8998a(C2205c cVar, float f) throws IOException {
        cVar.mo24399c();
        float j = (float) cVar.mo24406j();
        float j2 = (float) cVar.mo24406j();
        while (cVar.mo24410s() != C2205c.C2207b.END_ARRAY) {
            cVar.mo24414x();
        }
        cVar.mo24401f();
        return new PointF(j * f, j2 * f);
    }

    /* renamed from: b */
    private static PointF m8999b(C2205c cVar, float f) throws IOException {
        float j = (float) cVar.mo24406j();
        float j2 = (float) cVar.mo24406j();
        while (cVar.mo24404h()) {
            cVar.mo24414x();
        }
        return new PointF(j * f, j2 * f);
    }

    /* renamed from: c */
    private static PointF m9000c(C2205c cVar, float f) throws IOException {
        cVar.mo24400e();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6804a);
            if (v == 0) {
                f2 = m9004g(cVar);
            } else if (v != 1) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                f3 = m9004g(cVar);
            }
        }
        cVar.mo24402g();
        return new PointF(f2 * f, f3 * f);
    }

    @ColorInt
    /* renamed from: d */
    static int m9001d(C2205c cVar) throws IOException {
        cVar.mo24399c();
        int j = (int) (cVar.mo24406j() * 255.0d);
        int j2 = (int) (cVar.mo24406j() * 255.0d);
        int j3 = (int) (cVar.mo24406j() * 255.0d);
        while (cVar.mo24404h()) {
            cVar.mo24414x();
        }
        cVar.mo24401f();
        return Color.argb(255, j, j2, j3);
    }

    /* renamed from: e */
    static PointF m9002e(C2205c cVar, float f) throws IOException {
        int i = C2191a.f6805a[cVar.mo24410s().ordinal()];
        if (i == 1) {
            return m8999b(cVar, f);
        }
        if (i == 2) {
            return m8998a(cVar, f);
        }
        if (i == 3) {
            return m9000c(cVar, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.mo24410s());
    }

    /* renamed from: f */
    static List<PointF> m9003f(C2205c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.mo24399c();
        while (cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY) {
            cVar.mo24399c();
            arrayList.add(m9002e(cVar, f));
            cVar.mo24401f();
        }
        cVar.mo24401f();
        return arrayList;
    }

    /* renamed from: g */
    static float m9004g(C2205c cVar) throws IOException {
        C2205c.C2207b s = cVar.mo24410s();
        int i = C2191a.f6805a[s.ordinal()];
        if (i == 1) {
            return (float) cVar.mo24406j();
        }
        if (i == 2) {
            cVar.mo24399c();
            float j = (float) cVar.mo24406j();
            while (cVar.mo24404h()) {
                cVar.mo24414x();
            }
            cVar.mo24401f();
            return j;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + s);
    }
}
