package p310kd;

/* renamed from: kd.d */
/* compiled from: Pdu */
public class C13557d {

    /* renamed from: a */
    private byte f61850a;

    /* renamed from: b */
    private int f61851b;

    /* renamed from: c */
    private int f61852c;

    /* renamed from: d */
    private int f61853d;

    /* renamed from: e */
    private byte[] f61854e;

    /* renamed from: e */
    public static C13557d m87371e(byte[] bArr, int i) {
        byte b;
        if (bArr.length - i >= 2 && (b = bArr[i]) > 0) {
            byte b2 = bArr[i + 1];
            int i2 = i + 2;
            if (i2 < bArr.length) {
                C13557d dVar = new C13557d();
                int i3 = i + b;
                dVar.f61853d = i3;
                if (i3 >= bArr.length) {
                    dVar.f61853d = bArr.length - 1;
                }
                dVar.f61850a = b2;
                dVar.f61851b = b;
                dVar.f61852c = i2;
                dVar.f61854e = bArr;
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int mo71659a() {
        return this.f61851b;
    }

    /* renamed from: b */
    public int mo71660b() {
        return this.f61853d;
    }

    /* renamed from: c */
    public int mo71661c() {
        return this.f61852c;
    }

    /* renamed from: d */
    public byte mo71662d() {
        return this.f61850a;
    }
}
