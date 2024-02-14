package p369q9;

/* renamed from: q9.i */
/* compiled from: Settings */
public final class C16252i {

    /* renamed from: a */
    private int f66618a;

    /* renamed from: b */
    private int f66619b;

    /* renamed from: c */
    private int f66620c;

    /* renamed from: d */
    private final int[] f66621d = new int[10];

    /* renamed from: a */
    public int mo78766a(int i) {
        return this.f66621d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo78767b() {
        if ((this.f66618a & 2) != 0) {
            return this.f66621d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo78768c(int i) {
        return (this.f66618a & 32) != 0 ? this.f66621d[5] : i;
    }

    /* renamed from: d */
    public boolean mo78769d(int i) {
        return ((1 << i) & this.f66618a) != 0;
    }

    /* renamed from: e */
    public C16252i mo78770e(int i, int i2, int i3) {
        int[] iArr = this.f66621d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f66618a |= i4;
        if ((i2 & 1) != 0) {
            this.f66619b |= i4;
        } else {
            this.f66619b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f66620c |= i4;
        } else {
            this.f66620c &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo78771f() {
        return Integer.bitCount(this.f66618a);
    }
}
