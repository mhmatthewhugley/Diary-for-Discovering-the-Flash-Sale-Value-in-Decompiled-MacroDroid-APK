package p045q;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.List;
import p001a0.C0009g;
import p012b0.C1399c;
import p046r.C2068a;
import p046r.C2088o;
import p048t.C2097e;
import p050v.C2129k;
import p051w.C2140a;

/* renamed from: q.p */
/* compiled from: RepeaterContent */
public class C2064p implements C2051e, C2060m, C2056j, C2068a.C2070b, C2057k {

    /* renamed from: a */
    private final Matrix f6395a = new Matrix();

    /* renamed from: b */
    private final Path f6396b = new Path();

    /* renamed from: c */
    private final C1472f f6397c;

    /* renamed from: d */
    private final C2140a f6398d;

    /* renamed from: e */
    private final String f6399e;

    /* renamed from: f */
    private final boolean f6400f;

    /* renamed from: g */
    private final C2068a<Float, Float> f6401g;

    /* renamed from: h */
    private final C2068a<Float, Float> f6402h;

    /* renamed from: i */
    private final C2088o f6403i;

    /* renamed from: j */
    private C2050d f6404j;

    public C2064p(C1472f fVar, C2140a aVar, C2129k kVar) {
        this.f6397c = fVar;
        this.f6398d = aVar;
        this.f6399e = kVar.mo24299c();
        this.f6400f = kVar.mo24302f();
        C2068a<Float, Float> a = kVar.mo24298b().mo24228a();
        this.f6401g = a;
        aVar.mo24347i(a);
        a.mo24142a(this);
        C2068a<Float, Float> a2 = kVar.mo24300d().mo24228a();
        this.f6402h = a2;
        aVar.mo24347i(a2);
        a2.mo24142a(this);
        C2088o b = kVar.mo24301e().mo24234b();
        this.f6403i = b;
        b.mo24186a(aVar);
        b.mo24187b(this);
    }

    /* renamed from: a */
    public void mo24123a() {
        this.f6397c.invalidateSelf();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        this.f6404j.mo24124b(list, list2);
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        if (!this.f6403i.mo24188c(t, cVar)) {
            if (t == C1492k.f1004s) {
                this.f6401g.mo24154n(cVar);
            } else if (t == C1492k.f1005t) {
                this.f6402h.mo24154n(cVar);
            }
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        this.f6404j.mo24127e(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24135f(java.util.ListIterator<p045q.C2049c> r9) {
        /*
            r8 = this;
            q.d r0 = r8.f6404j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            q.d r9 = new q.d
            com.airbnb.lottie.f r2 = r8.f6397c
            w.a r3 = r8.f6398d
            boolean r5 = r8.f6400f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f6404j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045q.C2064p.mo24135f(java.util.ListIterator):void");
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f6401g.mo24148h().floatValue();
        float floatValue2 = this.f6402h.mo24148h().floatValue();
        float floatValue3 = this.f6403i.mo24193i().mo24148h().floatValue() / 100.0f;
        float floatValue4 = this.f6403i.mo24189e().mo24148h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f6395a.set(matrix);
            float f = (float) i2;
            this.f6395a.preConcat(this.f6403i.mo24191g(f + floatValue2));
            this.f6404j.mo24128g(canvas, this.f6395a, (int) (((float) i) * C0009g.m68k(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public String getName() {
        return this.f6399e;
    }

    public Path getPath() {
        Path path = this.f6404j.getPath();
        this.f6396b.reset();
        float floatValue = this.f6401g.mo24148h().floatValue();
        float floatValue2 = this.f6402h.mo24148h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f6395a.set(this.f6403i.mo24191g(((float) i) + floatValue2));
            this.f6396b.addPath(path, this.f6395a);
        }
        return this.f6396b;
    }
}
