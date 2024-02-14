package p050v;

import p001a0.C0004b;
import p001a0.C0009g;

/* renamed from: v.c */
/* compiled from: GradientColor */
public class C2118c {

    /* renamed from: a */
    private final float[] f6545a;

    /* renamed from: b */
    private final int[] f6546b;

    public C2118c(float[] fArr, int[] iArr) {
        this.f6545a = fArr;
        this.f6546b = iArr;
    }

    /* renamed from: a */
    public int[] mo24249a() {
        return this.f6546b;
    }

    /* renamed from: b */
    public float[] mo24250b() {
        return this.f6545a;
    }

    /* renamed from: c */
    public int mo24251c() {
        return this.f6546b.length;
    }

    /* renamed from: d */
    public void mo24252d(C2118c cVar, C2118c cVar2, float f) {
        if (cVar.f6546b.length == cVar2.f6546b.length) {
            for (int i = 0; i < cVar.f6546b.length; i++) {
                this.f6545a[i] = C0009g.m68k(cVar.f6545a[i], cVar2.f6545a[i], f);
                this.f6546b[i] = C0004b.m24c(f, cVar.f6546b[i], cVar2.f6546b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar.f6546b.length + " vs " + cVar2.f6546b.length + ")");
    }
}
