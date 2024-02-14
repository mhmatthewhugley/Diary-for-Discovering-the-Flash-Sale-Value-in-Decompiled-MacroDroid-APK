package p001a0;

/* renamed from: a0.f */
/* compiled from: MeanCalculator */
public class C0008f {

    /* renamed from: a */
    private float f27a;

    /* renamed from: b */
    private int f28b;

    /* renamed from: a */
    public void mo60a(float f) {
        float f2 = this.f27a + f;
        this.f27a = f2;
        int i = this.f28b + 1;
        this.f28b = i;
        if (i == Integer.MAX_VALUE) {
            this.f27a = f2 / 2.0f;
            this.f28b = i / 2;
        }
    }
}
