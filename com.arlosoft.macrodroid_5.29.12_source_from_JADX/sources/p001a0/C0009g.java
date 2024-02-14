package p001a0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.List;
import p045q.C2057k;
import p048t.C2092a;
import p048t.C2097e;
import p050v.C2130l;

/* renamed from: a0.g */
/* compiled from: MiscUtils */
public class C0009g {

    /* renamed from: a */
    private static PointF f29a = new PointF();

    /* renamed from: a */
    public static PointF m58a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m59b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m60c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m61d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m62e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: f */
    private static int m63f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: g */
    static int m64g(float f, float f2) {
        return m65h((int) f, (int) f2);
    }

    /* renamed from: h */
    private static int m65h(int i, int i2) {
        return i - (i2 * m63f(i, i2));
    }

    /* renamed from: i */
    public static void m66i(C2130l lVar, Path path) {
        path.reset();
        PointF b = lVar.mo24304b();
        path.moveTo(b.x, b.y);
        f29a.set(b.x, b.y);
        for (int i = 0; i < lVar.mo24303a().size(); i++) {
            C2092a aVar = lVar.mo24303a().get(i);
            PointF a = aVar.mo24200a();
            PointF b2 = aVar.mo24201b();
            PointF c = aVar.mo24202c();
            if (!a.equals(f29a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f29a.set(c.x, c.y);
        }
        if (lVar.mo24306d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m67j(double d, double d2, @FloatRange(from = 0.0d, mo592to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m68k(float f, float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m69l(int i, int i2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: m */
    public static void m70m(C2097e eVar, int i, List<C2097e> list, C2097e eVar2, C2057k kVar) {
        if (eVar.mo24214c(kVar.getName(), i)) {
            list.add(eVar2.mo24213a(kVar.getName()).mo24219i(kVar));
        }
    }
}
